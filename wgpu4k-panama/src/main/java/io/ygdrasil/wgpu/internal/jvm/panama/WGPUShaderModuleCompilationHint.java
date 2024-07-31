// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct WGPUShaderModuleCompilationHint {
 *     const WGPUChainedStruct *nextInChain;
 *     const char *entryPoint;
 *     WGPUPipelineLayout layout;
 * }
 * }
 */
public class WGPUShaderModuleCompilationHint {

    WGPUShaderModuleCompilationHint() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgpu_h.C_POINTER.withName("nextInChain"),
        wgpu_h.C_POINTER.withName("entryPoint"),
        wgpu_h.C_POINTER.withName("layout")
    ).withName("WGPUShaderModuleCompilationHint");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout nextInChain$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("nextInChain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static final AddressLayout nextInChain$layout() {
        return nextInChain$LAYOUT;
    }

    private static final long nextInChain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static final long nextInChain$offset() {
        return nextInChain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static MemorySegment nextInChain(MemorySegment struct) {
        return struct.get(nextInChain$LAYOUT, nextInChain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const WGPUChainedStruct *nextInChain
     * }
     */
    public static void nextInChain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nextInChain$LAYOUT, nextInChain$OFFSET, fieldValue);
    }

    private static final AddressLayout entryPoint$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("entryPoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const char *entryPoint
     * }
     */
    public static final AddressLayout entryPoint$layout() {
        return entryPoint$LAYOUT;
    }

    private static final long entryPoint$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const char *entryPoint
     * }
     */
    public static final long entryPoint$offset() {
        return entryPoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const char *entryPoint
     * }
     */
    public static MemorySegment entryPoint(MemorySegment struct) {
        return struct.get(entryPoint$LAYOUT, entryPoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const char *entryPoint
     * }
     */
    public static void entryPoint(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(entryPoint$LAYOUT, entryPoint$OFFSET, fieldValue);
    }

    private static final AddressLayout layout$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("layout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUPipelineLayout layout
     * }
     */
    public static final AddressLayout layout$layout() {
        return layout$LAYOUT;
    }

    private static final long layout$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUPipelineLayout layout
     * }
     */
    public static final long layout$offset() {
        return layout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUPipelineLayout layout
     * }
     */
    public static MemorySegment layout(MemorySegment struct) {
        return struct.get(layout$LAYOUT, layout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUPipelineLayout layout
     * }
     */
    public static void layout(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(layout$LAYOUT, layout$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

