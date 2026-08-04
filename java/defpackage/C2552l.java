package defpackage;

import android.view.Choreographer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lِٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2552l implements InterfaceC13854l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f5556l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f5557l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f5558l;

    public C2552l(InterfaceC13854l interfaceC13854l) {
        this.f5558l = 2;
        this.f5557l = interfaceC13854l;
        this.f5556l = new C11919l((byte) 0, 5);
    }

    private final Object yandex(Function1 function1, InterfaceC14029l interfaceC14029l) {
        C13896l c13896l = (C13896l) this.f5556l;
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        ChoreographerFrameCallbackC15676l choreographerFrameCallbackC15676l = new ChoreographerFrameCallbackC15676l(c2397l, this, function1);
        if (AbstractC8576l.yandex(c13896l.f27163l, (Choreographer) this.f5557l)) {
            synchronized (c13896l.f27167l) {
                try {
                    c13896l.f27164l.add(choreographerFrameCallbackC15676l);
                    if (!c13896l.f27166l) {
                        c13896l.f27166l = true;
                        c13896l.f27163l.postFrameCallback(c13896l.f27172l);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2397l.ad(new C2977l(c13896l, choreographerFrameCallbackC15676l, 3));
        } else {
            ((Choreographer) this.f5557l).postFrameCallback(choreographerFrameCallbackC15676l);
            c2397l.ad(new C2977l(this, choreographerFrameCallbackC15676l, 4));
        }
        return c2397l.Signature();
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        switch (this.f5558l) {
            case 0:
                break;
            case 1:
                break;
        }
        return C11140l.f22361l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        switch (this.f5558l) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        switch (this.f5558l) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        switch (this.f5558l) {
            case 0:
                break;
            case 1:
                break;
        }
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        switch (this.f5558l) {
            case 0:
                break;
            case 1:
                break;
        }
        return function2.invoke(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    @Override // defpackage.InterfaceC13854l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final Object mo1226super(Function1 function1, InterfaceC14029l interfaceC14029l) {
        C15631l c15631l;
        Object objSignature;
        switch (this.f5558l) {
            case 0:
                return yandex(function1, interfaceC14029l);
            case 1:
                C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
                c2397l.license();
                C11644l c11644l = (C11644l) this.f5556l;
                C12895l c12895l = new C12895l();
                c12895l.yandex = c2397l;
                c12895l.loadAd = function1;
                c2397l.ad(new C6238l(8, c11644l.m3156l(c12895l, (Function0) this.f5557l)));
                return c2397l.Signature();
            default:
                if (interfaceC14029l instanceof C15631l) {
                    c15631l = (C15631l) interfaceC14029l;
                    int i = c15631l.f30565l;
                    if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15631l.f30565l = i - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c15631l = new C15631l(this, interfaceC14029l);
                    }
                } else {
                    c15631l = new C15631l(this, interfaceC14029l);
                }
                Object obj = c15631l.f30566l;
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                int i2 = c15631l.f30565l;
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11919l c11919l = (C11919l) this.f5556l;
                    c15631l.f30567l = function1;
                    c15631l.f30565l = 1;
                    if (c11919l.smaato()) {
                        objSignature = Unit.INSTANCE;
                    } else {
                        C2397l c2397l2 = new C2397l(1, AbstractC17082l.billing(c15631l));
                        c2397l2.license();
                        synchronized (c11919l.f23763l) {
                            ((ArrayList) c11919l.f23767l).add(c2397l2);
                        }
                        c2397l2.ad(new C3768l(c11919l, c2397l2, 12));
                        objSignature = c2397l2.Signature();
                        if (objSignature != enumC9342l) {
                            objSignature = Unit.INSTANCE;
                        }
                    }
                    if (objSignature != enumC9342l) {
                    }
                    return enumC9342l;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function1 = c15631l.f30567l;
                AbstractC2829l.crashlytics(obj);
                InterfaceC13854l interfaceC13854l = (InterfaceC13854l) this.f5557l;
                c15631l.f30567l = null;
                c15631l.f30565l = 2;
                Object objMo1226super = interfaceC13854l.mo1226super(function1, c15631l);
                if (objMo1226super != enumC9342l) {
                    return objMo1226super;
                }
                return enumC9342l;
        }
    }

    public C2552l(Choreographer choreographer, C13896l c13896l) {
        this.f5558l = 0;
        this.f5557l = choreographer;
        this.f5556l = c13896l;
    }

    public C2552l(Function0 function0) {
        this.f5558l = 1;
        this.f5557l = function0;
        this.f5556l = new C11644l(5);
    }
}
