// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang = c:
 * struct WGPUTextureDescriptor {
 *     const WGPUChainedStruct *nextInChain;
 *     const char *label;
 *     WGPUTextureUsageFlags usage;
 *     WGPUTextureDimension dimension;
 *     WGPUExtent3D size;
 *     WGPUTextureFormat format;
 *     uint32_t mipLevelCount;
 *     uint32_t sampleCount;
 *     size_t viewFormatCount;
 *     const WGPUTextureFormat *viewFormats;
 * }
 *}
 */
public class WGPUTextureDescriptor {

    WGPUTextureDescriptor() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wgpu_h.C_POINTER.withName("nextInChain"),
            wgpu_h.C_POINTER.withName("label"),
            wgpu_h.C_INT.withName("usage"),
            wgpu_h.C_INT.withName("dimension"),
            WGPUExtent3D.layout().withName("size"),
            wgpu_h.C_INT.withName("format"),
            wgpu_h.C_INT.withName("mipLevelCount"),
            wgpu_h.C_INT.withName("sampleCount"),
            wgpu_h.C_LONG.withName("viewFormatCount"),
            wgpu_h.C_POINTER.withName("viewFormats")
    ).withName("WGPUTextureDescriptor");

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

    private static final AddressLayout label$LAYOUT = (AddressLayout) $LAYOUT.select(groupElement("label"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static final AddressLayout label$layout() {
        return label$LAYOUT;
    }

    private static final long label$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static final long label$offset() {
        return label$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static MemorySegment label(MemorySegment struct) {
        return struct.get(label$LAYOUT, label$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * const char *label
     *}
     */
    public static void label(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(label$LAYOUT, label$OFFSET, fieldValue);
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

    private static final long usage$OFFSET = 16;

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

    private static final OfInt dimension$LAYOUT = (OfInt) $LAYOUT.select(groupElement("dimension"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUTextureDimension dimension
     *}
     */
    public static final OfInt dimension$layout() {
        return dimension$LAYOUT;
    }

    private static final long dimension$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUTextureDimension dimension
     *}
     */
    public static final long dimension$offset() {
        return dimension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUTextureDimension dimension
     *}
     */
    public static int dimension(MemorySegment struct) {
        return struct.get(dimension$LAYOUT, dimension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUTextureDimension dimension
     *}
     */
    public static void dimension(MemorySegment struct, int fieldValue) {
        struct.set(dimension$LAYOUT, dimension$OFFSET, fieldValue);
    }

    private static final GroupLayout size$LAYOUT = (GroupLayout) $LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * WGPUExtent3D size
     *}
     */
    public static final GroupLayout size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * WGPUExtent3D size
     *}
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * WGPUExtent3D size
     *}
     */
    public static MemorySegment size(MemorySegment struct) {
        return struct.asSlice(size$OFFSET, size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * WGPUExtent3D size
     *}
     */
    public static void size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, size$OFFSET, size$LAYOUT.byteSize());
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

    private static final long format$OFFSET = 36;

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

    private static final OfInt mipLevelCount$LAYOUT = (OfInt) $LAYOUT.select(groupElement("mipLevelCount"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t mipLevelCount
     *}
     */
    public static final OfInt mipLevelCount$layout() {
        return mipLevelCount$LAYOUT;
    }

    private static final long mipLevelCount$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t mipLevelCount
     *}
     */
    public static final long mipLevelCount$offset() {
        return mipLevelCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t mipLevelCount
     *}
     */
    public static int mipLevelCount(MemorySegment struct) {
        return struct.get(mipLevelCount$LAYOUT, mipLevelCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t mipLevelCount
     *}
     */
    public static void mipLevelCount(MemorySegment struct, int fieldValue) {
        struct.set(mipLevelCount$LAYOUT, mipLevelCount$OFFSET, fieldValue);
    }

    private static final OfInt sampleCount$LAYOUT = (OfInt) $LAYOUT.select(groupElement("sampleCount"));

    /**
     * Layout for field:
     * {@snippet lang = c:
     * uint32_t sampleCount
     *}
     */
    public static final OfInt sampleCount$layout() {
        return sampleCount$LAYOUT;
    }

    private static final long sampleCount$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang = c:
     * uint32_t sampleCount
     *}
     */
    public static final long sampleCount$offset() {
        return sampleCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang = c:
     * uint32_t sampleCount
     *}
     */
    public static int sampleCount(MemorySegment struct) {
        return struct.get(sampleCount$LAYOUT, sampleCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang = c:
     * uint32_t sampleCount
     *}
     */
    public static void sampleCount(MemorySegment struct, int fieldValue) {
        struct.set(sampleCount$LAYOUT, sampleCount$OFFSET, fieldValue);
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

    private static final long viewFormatCount$OFFSET = 48;

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

    private static final long viewFormats$OFFSET = 56;

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

