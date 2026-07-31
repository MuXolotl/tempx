package defpackage;

import android.os.Build;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٗۤۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17524l extends AbstractC16915l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC13840l f34143l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34144l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17524l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, int i) {
        super(0);
        this.f34144l = i;
        this.f34143l = viewTreeObserverOnGlobalLayoutListenerC13840l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f34144l) {
            case 0:
                Boolean bool = (Boolean) this.f34143l.f27043l.getValue();
                bool.getClass();
                return bool;
            case 1:
                C8697l androidViewsHandler = this.f34143l.getAndroidViewsHandler();
                if (androidViewsHandler != null) {
                    int childCount = androidViewsHandler.getChildCount();
                    while (i < childCount) {
                        View childAt = androidViewsHandler.getChildAt(i);
                        AbstractC0290l abstractC0290l = childAt instanceof AbstractC0290l ? (AbstractC0290l) childAt : null;
                        if (abstractC0290l != null && abstractC0290l.isLayoutRequested()) {
                            abstractC0290l.layout(abstractC0290l.getLeft(), abstractC0290l.getTop(), abstractC0290l.getRight(), abstractC0290l.getBottom());
                        }
                        i++;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C2462l c2462lAdmob = AbstractC4047l.admob(this.f34143l.getConfiguration());
                if (c2462lAdmob.yandex.isEmpty()) {
                    c2462lAdmob = Build.VERSION.SDK_INT >= 24 ? new C2462l(new C15621l(AbstractC11965l.firebase())) : C2462l.yandex(Locale.getDefault());
                }
                InterfaceC17227l interfaceC17227l = c2462lAdmob.yandex;
                int size = interfaceC17227l.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    arrayList.add(new C9293l(interfaceC17227l.get(i)));
                    i++;
                }
                return new C10537l(arrayList);
            case 3:
                C15718l c15718l = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26995l;
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f34143l;
                if (Build.VERSION.SDK_INT > 28 && viewTreeObserverOnGlobalLayoutListenerC13840l.isAttachedToWindow()) {
                    if (ViewTreeObserverOnGlobalLayoutListenerC13840l.f26996l == null) {
                        RunnableC15875l runnableC15875l = new RunnableC15875l(1);
                        ViewTreeObserverOnGlobalLayoutListenerC13840l.f26996l = runnableC15875l;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (ViewTreeObserverOnGlobalLayoutListenerC13840l.f26992l == null) {
                                ViewTreeObserverOnGlobalLayoutListenerC13840l.f26992l = Class.forName("android.os.SystemProperties");
                            }
                            if (ViewTreeObserverOnGlobalLayoutListenerC13840l.f26993l == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26992l;
                                ViewTreeObserverOnGlobalLayoutListenerC13840l.f26993l = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                            }
                            Method method = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26993l;
                            if (method != null) {
                                method.invoke(null, runnableC15875l);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    C12463l c12463l = ViewTreeObserverOnGlobalLayoutListenerC13840l.f26990l;
                    synchronized (c12463l) {
                        c12463l.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l2 = this.f34143l;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC13840l2.f27000l;
                if (motionEvent != null) {
                    boolean zContains = AbstractC14055l.remoteconfig(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = viewTreeObserverOnGlobalLayoutListenerC13840l2.f27000l;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i = 1;
                    }
                    if (zContains && i != 0) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l2.f27057l = SystemClock.uptimeMillis();
                        viewTreeObserverOnGlobalLayoutListenerC13840l2.post(viewTreeObserverOnGlobalLayoutListenerC13840l2.f27073l);
                    }
                }
                viewTreeObserverOnGlobalLayoutListenerC13840l2.f27068l.invoke();
                return Unit.INSTANCE;
        }
    }
}
