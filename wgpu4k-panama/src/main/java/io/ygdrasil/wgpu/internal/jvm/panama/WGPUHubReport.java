// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.*;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct WGPUHubReport {
 *     WGPURegistryReport adapters;
 *     WGPURegistryReport devices;
 *     WGPURegistryReport queues;
 *     WGPURegistryReport pipelineLayouts;
 *     WGPURegistryReport shaderModules;
 *     WGPURegistryReport bindGroupLayouts;
 *     WGPURegistryReport bindGroups;
 *     WGPURegistryReport commandBuffers;
 *     WGPURegistryReport renderBundles;
 *     WGPURegistryReport renderPipelines;
 *     WGPURegistryReport computePipelines;
 *     WGPURegistryReport querySets;
 *     WGPURegistryReport buffers;
 *     WGPURegistryReport textures;
 *     WGPURegistryReport textureViews;
 *     WGPURegistryReport samplers;
 * }
 * }
 */
public class WGPUHubReport {

    WGPUHubReport() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        WGPURegistryReport.layout().withName("adapters"),
        WGPURegistryReport.layout().withName("devices"),
        WGPURegistryReport.layout().withName("queues"),
        WGPURegistryReport.layout().withName("pipelineLayouts"),
        WGPURegistryReport.layout().withName("shaderModules"),
        WGPURegistryReport.layout().withName("bindGroupLayouts"),
        WGPURegistryReport.layout().withName("bindGroups"),
        WGPURegistryReport.layout().withName("commandBuffers"),
        WGPURegistryReport.layout().withName("renderBundles"),
        WGPURegistryReport.layout().withName("renderPipelines"),
        WGPURegistryReport.layout().withName("computePipelines"),
        WGPURegistryReport.layout().withName("querySets"),
        WGPURegistryReport.layout().withName("buffers"),
        WGPURegistryReport.layout().withName("textures"),
        WGPURegistryReport.layout().withName("textureViews"),
        WGPURegistryReport.layout().withName("samplers")
    ).withName("WGPUHubReport");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout adapters$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("adapters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport adapters
     * }
     */
    public static final GroupLayout adapters$layout() {
        return adapters$LAYOUT;
    }

    private static final long adapters$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport adapters
     * }
     */
    public static final long adapters$offset() {
        return adapters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport adapters
     * }
     */
    public static MemorySegment adapters(MemorySegment struct) {
        return struct.asSlice(adapters$OFFSET, adapters$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport adapters
     * }
     */
    public static void adapters(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, adapters$OFFSET, adapters$LAYOUT.byteSize());
    }

    private static final GroupLayout devices$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("devices"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport devices
     * }
     */
    public static final GroupLayout devices$layout() {
        return devices$LAYOUT;
    }

    private static final long devices$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport devices
     * }
     */
    public static final long devices$offset() {
        return devices$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport devices
     * }
     */
    public static MemorySegment devices(MemorySegment struct) {
        return struct.asSlice(devices$OFFSET, devices$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport devices
     * }
     */
    public static void devices(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, devices$OFFSET, devices$LAYOUT.byteSize());
    }

    private static final GroupLayout queues$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("queues"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport queues
     * }
     */
    public static final GroupLayout queues$layout() {
        return queues$LAYOUT;
    }

    private static final long queues$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport queues
     * }
     */
    public static final long queues$offset() {
        return queues$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport queues
     * }
     */
    public static MemorySegment queues(MemorySegment struct) {
        return struct.asSlice(queues$OFFSET, queues$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport queues
     * }
     */
    public static void queues(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, queues$OFFSET, queues$LAYOUT.byteSize());
    }

    private static final GroupLayout pipelineLayouts$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pipelineLayouts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport pipelineLayouts
     * }
     */
    public static final GroupLayout pipelineLayouts$layout() {
        return pipelineLayouts$LAYOUT;
    }

    private static final long pipelineLayouts$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport pipelineLayouts
     * }
     */
    public static final long pipelineLayouts$offset() {
        return pipelineLayouts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport pipelineLayouts
     * }
     */
    public static MemorySegment pipelineLayouts(MemorySegment struct) {
        return struct.asSlice(pipelineLayouts$OFFSET, pipelineLayouts$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport pipelineLayouts
     * }
     */
    public static void pipelineLayouts(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pipelineLayouts$OFFSET, pipelineLayouts$LAYOUT.byteSize());
    }

    private static final GroupLayout shaderModules$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("shaderModules"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport shaderModules
     * }
     */
    public static final GroupLayout shaderModules$layout() {
        return shaderModules$LAYOUT;
    }

    private static final long shaderModules$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport shaderModules
     * }
     */
    public static final long shaderModules$offset() {
        return shaderModules$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport shaderModules
     * }
     */
    public static MemorySegment shaderModules(MemorySegment struct) {
        return struct.asSlice(shaderModules$OFFSET, shaderModules$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport shaderModules
     * }
     */
    public static void shaderModules(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, shaderModules$OFFSET, shaderModules$LAYOUT.byteSize());
    }

    private static final GroupLayout bindGroupLayouts$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bindGroupLayouts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroupLayouts
     * }
     */
    public static final GroupLayout bindGroupLayouts$layout() {
        return bindGroupLayouts$LAYOUT;
    }

    private static final long bindGroupLayouts$OFFSET = 200;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroupLayouts
     * }
     */
    public static final long bindGroupLayouts$offset() {
        return bindGroupLayouts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroupLayouts
     * }
     */
    public static MemorySegment bindGroupLayouts(MemorySegment struct) {
        return struct.asSlice(bindGroupLayouts$OFFSET, bindGroupLayouts$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroupLayouts
     * }
     */
    public static void bindGroupLayouts(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bindGroupLayouts$OFFSET, bindGroupLayouts$LAYOUT.byteSize());
    }

    private static final GroupLayout bindGroups$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("bindGroups"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroups
     * }
     */
    public static final GroupLayout bindGroups$layout() {
        return bindGroups$LAYOUT;
    }

    private static final long bindGroups$OFFSET = 240;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroups
     * }
     */
    public static final long bindGroups$offset() {
        return bindGroups$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroups
     * }
     */
    public static MemorySegment bindGroups(MemorySegment struct) {
        return struct.asSlice(bindGroups$OFFSET, bindGroups$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport bindGroups
     * }
     */
    public static void bindGroups(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bindGroups$OFFSET, bindGroups$LAYOUT.byteSize());
    }

    private static final GroupLayout commandBuffers$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("commandBuffers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport commandBuffers
     * }
     */
    public static final GroupLayout commandBuffers$layout() {
        return commandBuffers$LAYOUT;
    }

    private static final long commandBuffers$OFFSET = 280;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport commandBuffers
     * }
     */
    public static final long commandBuffers$offset() {
        return commandBuffers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport commandBuffers
     * }
     */
    public static MemorySegment commandBuffers(MemorySegment struct) {
        return struct.asSlice(commandBuffers$OFFSET, commandBuffers$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport commandBuffers
     * }
     */
    public static void commandBuffers(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, commandBuffers$OFFSET, commandBuffers$LAYOUT.byteSize());
    }

    private static final GroupLayout renderBundles$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("renderBundles"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderBundles
     * }
     */
    public static final GroupLayout renderBundles$layout() {
        return renderBundles$LAYOUT;
    }

    private static final long renderBundles$OFFSET = 320;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderBundles
     * }
     */
    public static final long renderBundles$offset() {
        return renderBundles$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderBundles
     * }
     */
    public static MemorySegment renderBundles(MemorySegment struct) {
        return struct.asSlice(renderBundles$OFFSET, renderBundles$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderBundles
     * }
     */
    public static void renderBundles(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, renderBundles$OFFSET, renderBundles$LAYOUT.byteSize());
    }

    private static final GroupLayout renderPipelines$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("renderPipelines"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderPipelines
     * }
     */
    public static final GroupLayout renderPipelines$layout() {
        return renderPipelines$LAYOUT;
    }

    private static final long renderPipelines$OFFSET = 360;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderPipelines
     * }
     */
    public static final long renderPipelines$offset() {
        return renderPipelines$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderPipelines
     * }
     */
    public static MemorySegment renderPipelines(MemorySegment struct) {
        return struct.asSlice(renderPipelines$OFFSET, renderPipelines$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport renderPipelines
     * }
     */
    public static void renderPipelines(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, renderPipelines$OFFSET, renderPipelines$LAYOUT.byteSize());
    }

    private static final GroupLayout computePipelines$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("computePipelines"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport computePipelines
     * }
     */
    public static final GroupLayout computePipelines$layout() {
        return computePipelines$LAYOUT;
    }

    private static final long computePipelines$OFFSET = 400;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport computePipelines
     * }
     */
    public static final long computePipelines$offset() {
        return computePipelines$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport computePipelines
     * }
     */
    public static MemorySegment computePipelines(MemorySegment struct) {
        return struct.asSlice(computePipelines$OFFSET, computePipelines$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport computePipelines
     * }
     */
    public static void computePipelines(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, computePipelines$OFFSET, computePipelines$LAYOUT.byteSize());
    }

    private static final GroupLayout querySets$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("querySets"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport querySets
     * }
     */
    public static final GroupLayout querySets$layout() {
        return querySets$LAYOUT;
    }

    private static final long querySets$OFFSET = 440;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport querySets
     * }
     */
    public static final long querySets$offset() {
        return querySets$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport querySets
     * }
     */
    public static MemorySegment querySets(MemorySegment struct) {
        return struct.asSlice(querySets$OFFSET, querySets$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport querySets
     * }
     */
    public static void querySets(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, querySets$OFFSET, querySets$LAYOUT.byteSize());
    }

    private static final GroupLayout buffers$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("buffers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport buffers
     * }
     */
    public static final GroupLayout buffers$layout() {
        return buffers$LAYOUT;
    }

    private static final long buffers$OFFSET = 480;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport buffers
     * }
     */
    public static final long buffers$offset() {
        return buffers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport buffers
     * }
     */
    public static MemorySegment buffers(MemorySegment struct) {
        return struct.asSlice(buffers$OFFSET, buffers$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport buffers
     * }
     */
    public static void buffers(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, buffers$OFFSET, buffers$LAYOUT.byteSize());
    }

    private static final GroupLayout textures$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("textures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport textures
     * }
     */
    public static final GroupLayout textures$layout() {
        return textures$LAYOUT;
    }

    private static final long textures$OFFSET = 520;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport textures
     * }
     */
    public static final long textures$offset() {
        return textures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport textures
     * }
     */
    public static MemorySegment textures(MemorySegment struct) {
        return struct.asSlice(textures$OFFSET, textures$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport textures
     * }
     */
    public static void textures(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, textures$OFFSET, textures$LAYOUT.byteSize());
    }

    private static final GroupLayout textureViews$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("textureViews"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport textureViews
     * }
     */
    public static final GroupLayout textureViews$layout() {
        return textureViews$LAYOUT;
    }

    private static final long textureViews$OFFSET = 560;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport textureViews
     * }
     */
    public static final long textureViews$offset() {
        return textureViews$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport textureViews
     * }
     */
    public static MemorySegment textureViews(MemorySegment struct) {
        return struct.asSlice(textureViews$OFFSET, textureViews$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport textureViews
     * }
     */
    public static void textureViews(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, textureViews$OFFSET, textureViews$LAYOUT.byteSize());
    }

    private static final GroupLayout samplers$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("samplers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WGPURegistryReport samplers
     * }
     */
    public static final GroupLayout samplers$layout() {
        return samplers$LAYOUT;
    }

    private static final long samplers$OFFSET = 600;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WGPURegistryReport samplers
     * }
     */
    public static final long samplers$offset() {
        return samplers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WGPURegistryReport samplers
     * }
     */
    public static MemorySegment samplers(MemorySegment struct) {
        return struct.asSlice(samplers$OFFSET, samplers$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WGPURegistryReport samplers
     * }
     */
    public static void samplers(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, samplers$OFFSET, samplers$LAYOUT.byteSize());
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

