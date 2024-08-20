// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang = c:
 * struct WGPUSurfaceConfiguration {
 *     const WGPUChainedStruct *nextInChain;
 *     WGPUDevice device;
 *     WGPUTextureFormat format;
 *     WGPUTextureUsageFlags usage;
 *     size_t viewFormatCount;
 *     const WGPUTextureFormat *viewFormats;
 *     WGPUCompositeAlphaMode alphaMode;
 *     uint32_t width;
 *     uint32_t height;
 *     WGPUPresentMode presentMode;
 * }
 *}
 */
public class WGPUSurfaceConfiguration {

    WGPUSurfaceConfiguration() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_POINTER.withName("nextInChain"),
            wgpu_h.C_POINTER.withName("device"),
            wgpu_h.C_INT.withName("format"),
            wgpu_h.C_INT.withName("usage"),
            wgpu_h.C_LONG.withName("viewFormatCount"),
            wgpu_h.C_POINTER.withName("viewFormats"),
            wgpu_h.C_INT.withName("alphaMode"),
            wgpu_h.C_INT.withName("width"),
            wgpu_h.C_INT.withName("height"),
            wgpu_h.C_INT.withName("presentMode")
    ).withName("WGPUSurfaceConfiguration");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout nextInChain$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("nextInChain"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static final AddressLayout nextInChain$layout() {
        return nextInChain$LAYOUT;
    }

    private static final long nextInChain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static final long nextInChain$offset() {
        return nextInChain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static MemorySegment nextInChain(MemorySegment struct) {
        return struct.get(nextInChain$LAYOUT, nextInChain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * const WGPUChainedStruct *nextInChain
     *}
     */
    public static void nextInChain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(nextInChain$LAYOUT, nextInChain$OFFSET, fieldValue);
    }

    private static final AddressLayout device$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("device"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUDevice device
     *}
     */
    public static final AddressLayout device$layout() {
        return device$LAYOUT;
    }

    private static final long device$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUDevice device
     *}
     */
    public static final long device$offset() {
        return device$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUDevice device
     *}
     */
    public static MemorySegment device(MemorySegment struct) {
        return struct.get(device$LAYOUT, device$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUDevice device
     *}
     */
    public static void device(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(device$LAYOUT, device$OFFSET, fieldValue);
    }

    private static final OfInt format$LAYOUT = (OfInt) $LAYOUT.select(groupElement("format"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUTextureFormat format
     *}
     */
    public static final OfInt format$layout() {
        return format$LAYOUT;
    }

    private static final long format$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUTextureFormat format
     *}
     */
    public static final long format$offset() {
        return format$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUTextureFormat format
     *}
     */
    public static int format(MemorySegment struct) {
        return struct.get(format$LAYOUT, format$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUTextureFormat format
     *}
     */
    public static void format(MemorySegment struct, int fieldValue) {
        struct.set(format$LAYOUT, format$OFFSET, fieldValue);
    }

    private static final OfInt usage$LAYOUT = (OfInt) $LAYOUT.select(groupElement("usage"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUTextureUsageFlags usage
     *}
     */
    public static final OfInt usage$layout() {
        return usage$LAYOUT;
    }

    private static final long usage$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUTextureUsageFlags usage
     *}
     */
    public static final long usage$offset() {
        return usage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUTextureUsageFlags usage
     *}
     */
    public static int usage(MemorySegment struct) {
        return struct.get(usage$LAYOUT, usage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUTextureUsageFlags usage
     *}
     */
    public static void usage(MemorySegment struct, int fieldValue) {
        struct.set(usage$LAYOUT, usage$OFFSET, fieldValue);
    }

    private static final OfLong viewFormatCount$LAYOUT = (OfLong) $LAYOUT.select(groupElement("viewFormatCount"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * size_t viewFormatCount
     *}
     */
    public static final OfLong viewFormatCount$layout() {
        return viewFormatCount$LAYOUT;
    }

    private static final long viewFormatCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * size_t viewFormatCount
     *}
     */
    public static final long viewFormatCount$offset() {
        return viewFormatCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * size_t viewFormatCount
     *}
     */
    public static long viewFormatCount(MemorySegment struct) {
        return struct.get(viewFormatCount$LAYOUT, viewFormatCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * size_t viewFormatCount
     *}
     */
    public static void viewFormatCount(MemorySegment struct, long fieldValue) {
        struct.set(viewFormatCount$LAYOUT, viewFormatCount$OFFSET, fieldValue);
    }

    private static final AddressLayout viewFormats$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("viewFormats"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * const WGPUTextureFormat *viewFormats
     *}
     */
    public static final AddressLayout viewFormats$layout() {
        return viewFormats$LAYOUT;
    }

    private static final long viewFormats$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * const WGPUTextureFormat *viewFormats
     *}
     */
    public static final long viewFormats$offset() {
        return viewFormats$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * const WGPUTextureFormat *viewFormats
     *}
     */
    public static MemorySegment viewFormats(MemorySegment struct) {
        return struct.get(viewFormats$LAYOUT, viewFormats$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * const WGPUTextureFormat *viewFormats
     *}
     */
    public static void viewFormats(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(viewFormats$LAYOUT, viewFormats$OFFSET, fieldValue);
    }

    private static final OfInt alphaMode$LAYOUT = (OfInt) $LAYOUT.select(groupElement("alphaMode"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUCompositeAlphaMode alphaMode
     *}
     */
    public static final OfInt alphaMode$layout() {
        return alphaMode$LAYOUT;
    }

    private static final long alphaMode$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUCompositeAlphaMode alphaMode
     *}
     */
    public static final long alphaMode$offset() {
        return alphaMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUCompositeAlphaMode alphaMode
     *}
     */
    public static int alphaMode(MemorySegment struct) {
        return struct.get(alphaMode$LAYOUT, alphaMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUCompositeAlphaMode alphaMode
     *}
     */
    public static void alphaMode(MemorySegment struct, int fieldValue) {
        struct.set(alphaMode$LAYOUT, alphaMode$OFFSET, fieldValue);
    }

    private static final OfInt width$LAYOUT = (OfInt) $LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t width
     *}
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t width
     *}
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t width
     *}
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t width
     *}
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt) $LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t height
     *}
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t height
     *}
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t height
     *}
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t height
     *}
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt presentMode$LAYOUT = (OfInt) $LAYOUT.select(groupElement("presentMode"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUPresentMode presentMode
     *}
     */
    public static final OfInt presentMode$layout() {
        return presentMode$LAYOUT;
    }

    private static final long presentMode$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUPresentMode presentMode
     *}
     */
    public static final long presentMode$offset() {
        return presentMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUPresentMode presentMode
     *}
     */
    public static int presentMode(MemorySegment struct) {
        return struct.get(presentMode$LAYOUT, presentMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUPresentMode presentMode
     *}
     */
    public static void presentMode(MemorySegment struct, int fieldValue) {
        struct.set(presentMode$LAYOUT, presentMode$OFFSET, fieldValue);
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
    public static long sizeof() {
        return layout().byteSize();
    }

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

