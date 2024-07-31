// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;

/**
 * {@snippet lang=c :
 * struct WGPUExtent3D {
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t depthOrArrayLayers;
 * }
 * }
 */
public class WGPUExtent3D {

    WGPUExtent3D() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wgpu_h.C_INT.withName("width"),
        wgpu_h.C_INT.withName("height"),
        wgpu_h.C_INT.withName("depthOrArrayLayers")
    ).withName("WGPUExtent3D");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt depthOrArrayLayers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("depthOrArrayLayers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t depthOrArrayLayers
     * }
     */
    public static final OfInt depthOrArrayLayers$layout() {
        return depthOrArrayLayers$LAYOUT;
    }

    private static final long depthOrArrayLayers$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t depthOrArrayLayers
     * }
     */
    public static final long depthOrArrayLayers$offset() {
        return depthOrArrayLayers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t depthOrArrayLayers
     * }
     */
    public static int depthOrArrayLayers(MemorySegment struct) {
        return struct.get(depthOrArrayLayers$LAYOUT, depthOrArrayLayers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t depthOrArrayLayers
     * }
     */
    public static void depthOrArrayLayers(MemorySegment struct, int fieldValue) {
        struct.set(depthOrArrayLayers$LAYOUT, depthOrArrayLayers$OFFSET, fieldValue);
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

