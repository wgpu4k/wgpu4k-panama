// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang=c :
 * struct WGPUSurfaceConfigurationExtras {
 *     WGPUChainedStruct chain;
 *     WGPUBool desiredMaximumFrameLatency;
 * }
 * }
 */
public class WGPUSurfaceConfigurationExtras {

    WGPUSurfaceConfigurationExtras() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        WGPUChainedStruct.layout().withName("chain"),
        wgpu_h.C_INT.withName("desiredMaximumFrameLatency"),
        MemoryLayout.paddingLayout(4)
    ).withName("WGPUSurfaceConfigurationExtras");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout chain$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("chain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static final GroupLayout chain$layout() {
        return chain$LAYOUT;
    }

    private static final long chain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static final long chain$offset() {
        return chain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static MemorySegment chain(MemorySegment struct) {
        return struct.asSlice(chain$OFFSET, chain$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUChainedStruct chain
     * }
     */
    public static void chain(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, chain$OFFSET, chain$LAYOUT.byteSize());
    }

    private static final OfInt desiredMaximumFrameLatency$LAYOUT = (OfInt)$LAYOUT.select(groupElement("desiredMaximumFrameLatency"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPUBool desiredMaximumFrameLatency
     * }
     */
    public static final OfInt desiredMaximumFrameLatency$layout() {
        return desiredMaximumFrameLatency$LAYOUT;
    }

    private static final long desiredMaximumFrameLatency$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPUBool desiredMaximumFrameLatency
     * }
     */
    public static final long desiredMaximumFrameLatency$offset() {
        return desiredMaximumFrameLatency$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPUBool desiredMaximumFrameLatency
     * }
     */
    public static int desiredMaximumFrameLatency(MemorySegment struct) {
        return struct.get(desiredMaximumFrameLatency$LAYOUT, desiredMaximumFrameLatency$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPUBool desiredMaximumFrameLatency
     * }
     */
    public static void desiredMaximumFrameLatency(MemorySegment struct, int fieldValue) {
        struct.set(desiredMaximumFrameLatency$LAYOUT, desiredMaximumFrameLatency$OFFSET, fieldValue);
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
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

