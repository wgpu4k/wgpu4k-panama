// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;
import static java.lang.foreign.ValueLayout.OfLong;

/**
 * {@snippet lang=c :
 * struct WGPUBindGroupEntryExtras {
 *     WGPUChainedStruct chain;
 *     const WGPUBuffer *buffers;
 *     size_t bufferCount;
 *     const WGPUSampler *samplers;
 *     size_t samplerCount;
 *     const WGPUTextureView *textureViews;
 *     size_t textureViewCount;
 * }
 * }
 */
public class WGPUBindGroupEntryExtras {

    WGPUBindGroupEntryExtras() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        WGPUChainedStruct.layout().withName("chain"),
        wgpu_h.C_POINTER.withName("buffers"),
        wgpu_h.C_LONG.withName("bufferCount"),
        wgpu_h.C_POINTER.withName("samplers"),
        wgpu_h.C_LONG.withName("samplerCount"),
        wgpu_h.C_POINTER.withName("textureViews"),
        wgpu_h.C_LONG.withName("textureViewCount")
    ).withName("WGPUBindGroupEntryExtras");

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

    private static final AddressLayout buffers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const WGPUBuffer *buffers
     * }
     */
    public static final AddressLayout buffers$layout() {
        return buffers$LAYOUT;
    }

    private static final long buffers$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const WGPUBuffer *buffers
     * }
     */
    public static final long buffers$offset() {
        return buffers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const WGPUBuffer *buffers
     * }
     */
    public static MemorySegment buffers(MemorySegment struct) {
        return struct.get(buffers$LAYOUT, buffers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const WGPUBuffer *buffers
     * }
     */
    public static void buffers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffers$LAYOUT, buffers$OFFSET, fieldValue);
    }

    private static final OfLong bufferCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("bufferCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t bufferCount
     * }
     */
    public static final OfLong bufferCount$layout() {
        return bufferCount$LAYOUT;
    }

    private static final long bufferCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t bufferCount
     * }
     */
    public static final long bufferCount$offset() {
        return bufferCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t bufferCount
     * }
     */
    public static long bufferCount(MemorySegment struct) {
        return struct.get(bufferCount$LAYOUT, bufferCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t bufferCount
     * }
     */
    public static void bufferCount(MemorySegment struct, long fieldValue) {
        struct.set(bufferCount$LAYOUT, bufferCount$OFFSET, fieldValue);
    }

    private static final AddressLayout samplers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("samplers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const WGPUSampler *samplers
     * }
     */
    public static final AddressLayout samplers$layout() {
        return samplers$LAYOUT;
    }

    private static final long samplers$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const WGPUSampler *samplers
     * }
     */
    public static final long samplers$offset() {
        return samplers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const WGPUSampler *samplers
     * }
     */
    public static MemorySegment samplers(MemorySegment struct) {
        return struct.get(samplers$LAYOUT, samplers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const WGPUSampler *samplers
     * }
     */
    public static void samplers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(samplers$LAYOUT, samplers$OFFSET, fieldValue);
    }

    private static final OfLong samplerCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("samplerCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t samplerCount
     * }
     */
    public static final OfLong samplerCount$layout() {
        return samplerCount$LAYOUT;
    }

    private static final long samplerCount$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t samplerCount
     * }
     */
    public static final long samplerCount$offset() {
        return samplerCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t samplerCount
     * }
     */
    public static long samplerCount(MemorySegment struct) {
        return struct.get(samplerCount$LAYOUT, samplerCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t samplerCount
     * }
     */
    public static void samplerCount(MemorySegment struct, long fieldValue) {
        struct.set(samplerCount$LAYOUT, samplerCount$OFFSET, fieldValue);
    }

    private static final AddressLayout textureViews$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("textureViews"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const WGPUTextureView *textureViews
     * }
     */
    public static final AddressLayout textureViews$layout() {
        return textureViews$LAYOUT;
    }

    private static final long textureViews$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const WGPUTextureView *textureViews
     * }
     */
    public static final long textureViews$offset() {
        return textureViews$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const WGPUTextureView *textureViews
     * }
     */
    public static MemorySegment textureViews(MemorySegment struct) {
        return struct.get(textureViews$LAYOUT, textureViews$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const WGPUTextureView *textureViews
     * }
     */
    public static void textureViews(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(textureViews$LAYOUT, textureViews$OFFSET, fieldValue);
    }

    private static final OfLong textureViewCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("textureViewCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t textureViewCount
     * }
     */
    public static final OfLong textureViewCount$layout() {
        return textureViewCount$LAYOUT;
    }

    private static final long textureViewCount$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t textureViewCount
     * }
     */
    public static final long textureViewCount$offset() {
        return textureViewCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t textureViewCount
     * }
     */
    public static long textureViewCount(MemorySegment struct) {
        return struct.get(textureViewCount$LAYOUT, textureViewCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t textureViewCount
     * }
     */
    public static void textureViewCount(MemorySegment struct, long fieldValue) {
        struct.set(textureViewCount$LAYOUT, textureViewCount$OFFSET, fieldValue);
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

