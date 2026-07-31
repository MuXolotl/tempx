package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.billing;
import defpackage.C0743l;
import defpackage.C12565l;
import defpackage.C15858l;
import defpackage.C17221l;
import defpackage.InterfaceC16460l;
import defpackage.RunnableC7762l;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final C15858l mBundle;
    private final C12565l mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<InterfaceC16460l, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, C15858l c15858l, boolean z, T t, C12565l c12565l) {
        Objects.requireNonNull(c12565l);
        this.mHostDispatcher = c12565l;
        this.mResultType = i;
        this.mBundle = c15858l;
        this.mIsSingleShot = z;
        Objects.requireNonNull(t);
        this.mUnsupportedValue = t;
    }

    private T convertAndRecast(C15858l c15858l) {
        return (T) c15858l.yandex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z, C15858l c15858l) {
        notifyResults(z, c15858l);
        return null;
    }

    private void notifyResults(boolean z, C15858l c15858l) {
        T tConvertAndRecast = z ? convertAndRecast(c15858l) : this.mUnsupportedValue;
        for (Map.Entry<InterfaceC16460l, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new RunnableC7762l(entry, tConvertAndRecast, 20));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, InterfaceC16460l interfaceC16460l) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(interfaceC16460l);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, boolean z, C15858l c15858l, IBinder iBinder) {
        billing.crashlytics(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new C17221l(this, z, c15858l));
    }

    public boolean removeListener(InterfaceC16460l interfaceC16460l) {
        Map<InterfaceC16460l, Executor> map = this.mListeners;
        Objects.requireNonNull(interfaceC16460l);
        map.remove(interfaceC16460l);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        C12565l c12565l = this.mHostDispatcher;
        int i = this.mResultType;
        C15858l c15858l = this.mBundle;
        c12565l.getClass();
        billing.amazon("unsubscribeCarHardwareResult", new C0743l(c12565l, i, c15858l));
        return true;
    }
}
