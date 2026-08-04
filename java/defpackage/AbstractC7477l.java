package defpackage;

import android.view.View;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚۘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7477l {
    public static C12014l loadAd;
    public static C6148l yandex;

    public static C12014l amazon() {
        C12014l c12014l;
        C12014l c12014l2 = loadAd;
        if (c12014l2 != null) {
            return c12014l2;
        }
        Object obj = null;
        try {
            c12014l = new C12014l(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
        } catch (NoSuchMethodException unused) {
            c12014l = new C12014l(obj, obj, obj, obj, 16);
        }
        loadAd = c12014l;
        return c12014l;
    }

    public static InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, float f, float f2, float f3, float f4, float f5, InterfaceC6347l interfaceC6347l, boolean z, int i) {
        float f6 = (i & 1) != 0 ? 1.0f : f;
        float f7 = (i & 2) != 0 ? 1.0f : f2;
        float f8 = (i & 4) != 0 ? 1.0f : f3;
        float f9 = (i & 32) != 0 ? 0.0f : f4;
        float f10 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0.0f : f5;
        long j = C1723l.loadAd;
        InterfaceC6347l interfaceC6347l2 = (i & 2048) != 0 ? AbstractC16837l.yandex : interfaceC6347l;
        boolean z2 = (i & 4096) != 0 ? false : z;
        long j2 = AbstractC4239l.yandex;
        return interfaceC17242l.premium(new C4929l(f6, f7, f8, f9, f10, j, interfaceC6347l2, z2, j2, j2, (i & 65536) == 0 ? 1 : 0, C2068l.yandex));
    }

    public static final InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C2306l(function1));
    }

    public static final C5434l purchase(C5501l c5501l, InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper, boolean z, boolean z2) {
        return new C5434l(c5501l, interfaceC7832l, AbstractC16417l.yandex(AbstractC18202l.yandex.loadAd(String.class)), longPointerWrapper, z, z2);
    }

    public static final ViewOnAttachStateChangeListenerC5635l yandex(View view) {
        ViewOnAttachStateChangeListenerC5635l viewOnAttachStateChangeListenerC5635l;
        Object tag = view.getTag(R.id.coil3_request_manager);
        ViewOnAttachStateChangeListenerC5635l viewOnAttachStateChangeListenerC5635l2 = tag instanceof ViewOnAttachStateChangeListenerC5635l ? (ViewOnAttachStateChangeListenerC5635l) tag : null;
        if (viewOnAttachStateChangeListenerC5635l2 != null) {
            return viewOnAttachStateChangeListenerC5635l2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                viewOnAttachStateChangeListenerC5635l = tag2 instanceof ViewOnAttachStateChangeListenerC5635l ? (ViewOnAttachStateChangeListenerC5635l) tag2 : null;
                if (viewOnAttachStateChangeListenerC5635l == null) {
                    viewOnAttachStateChangeListenerC5635l = new ViewOnAttachStateChangeListenerC5635l();
                    view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC5635l);
                    view.setTag(R.id.coil3_request_manager, viewOnAttachStateChangeListenerC5635l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewOnAttachStateChangeListenerC5635l;
    }
}
