// Generated by jextract

package io.ygdrasil.wgpu.internal.jvm.panama;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

/**
 * {@snippet lang=c :
 * typedef void (*WGPUProcDeviceCreateRenderPipelineAsync)(WGPUDevice, const WGPURenderPipelineDescriptor *, WGPUCreateRenderPipelineAsyncCallback, void *)
 * }
 */
public class WGPUProcDeviceCreateRenderPipelineAsync {

    WGPUProcDeviceCreateRenderPipelineAsync() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(MemorySegment device, MemorySegment descriptor, MemorySegment callback, MemorySegment userdata);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        wgpu_h.C_POINTER,
        wgpu_h.C_POINTER,
        wgpu_h.C_POINTER,
        wgpu_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = wgpu_h.upcallHandle(WGPUProcDeviceCreateRenderPipelineAsync.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(WGPUProcDeviceCreateRenderPipelineAsync.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,MemorySegment device, MemorySegment descriptor, MemorySegment callback, MemorySegment userdata) {
        try {
             DOWN$MH.invokeExact(funcPtr, device, descriptor, callback, userdata);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

