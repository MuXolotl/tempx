package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُ۠ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11376l {
    public final C11610l yandex;

    public /* synthetic */ C11376l(C11610l c11610l) {
        this.yandex = c11610l;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object yandex(C11610l c11610l, C7139l c7139l, Function2 function2, AbstractC0283l abstractC0283l) {
        C6894l c6894l;
        Function2 function3;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        if (abstractC0283l instanceof C6894l) {
            c6894l = (C6894l) abstractC0283l;
            int i = c6894l.f14431l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6894l.f14431l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6894l = new C6894l(abstractC0283l);
            }
        } else {
            c6894l = new C6894l(abstractC0283l);
        }
        Object objLoadAd = c6894l.f14434l;
        int i2 = c6894l.f14431l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            c6894l.f14433l = function2;
            c6894l.f14432l = c11610l;
            c6894l.f14431l = 1;
            objLoadAd = AbstractC12442l.loadAd(c7139l, c6894l);
            if (objLoadAd != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable2 = (Closeable) c6894l.f14433l;
                try {
                    AbstractC2829l.crashlytics(objLoadAd);
                    AbstractC7876l.loadAd(closeable2, null);
                    return objLoadAd;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        AbstractC7876l.loadAd(closeable2, th);
                        throw th3;
                    }
                }
            }
            function3 = (Function2) c6894l.f14433l;
            AbstractC2829l.crashlytics(objLoadAd);
            closeable = (Closeable) objLoadAd;
            try {
                C5507l c5507lYandex = AbstractC12442l.yandex((C18389l) closeable);
                c6894l.f14433l = closeable;
                c6894l.f14431l = 3;
                objLoadAd = function3.invoke(c5507lYandex, c6894l);
                if (objLoadAd != enumC9342l) {
                    closeable2 = closeable;
                    AbstractC7876l.loadAd(closeable2, null);
                    return objLoadAd;
                }
                return enumC9342l;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        c11610l = c6894l.f14432l;
        function2 = (Function2) c6894l.f14433l;
        AbstractC2829l.crashlytics(objLoadAd);
        C17778l c17778lYandex = c11610l.yandex((C17032l) objLoadAd);
        c6894l.f14433l = function2;
        c6894l.f14432l = null;
        c6894l.f14431l = 2;
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c6894l));
        c2397l.license();
        c2397l.ad(new C4193l(c17778lYandex, 0));
        c17778lYandex.purchase(new C14965l(c2397l));
        objLoadAd = c2397l.Signature();
        if (objLoadAd != enumC9342l) {
            function3 = function2;
            closeable = (Closeable) objLoadAd;
            C5507l c5507lYandex2 = AbstractC12442l.yandex((C18389l) closeable);
            c6894l.f14433l = closeable;
            c6894l.f14431l = 3;
            objLoadAd = function3.invoke(c5507lYandex2, c6894l);
            if (objLoadAd != enumC9342l) {
                closeable2 = closeable;
                AbstractC7876l.loadAd(closeable2, null);
                return objLoadAd;
            }
        }
        return enumC9342l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11376l) {
            return AbstractC8576l.yandex(this.yandex, ((C11376l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.yandex + ")";
    }
}
