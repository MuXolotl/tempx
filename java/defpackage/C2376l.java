package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2376l {
    public final Function1 loadAd;
    public final String yandex;

    static {
        InterfaceC13012l interfaceC13012lYandex;
        int i = C8572l.f17682l;
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C7472l.class);
        try {
            interfaceC13012lYandex = AbstractC18202l.yandex(C7472l.class);
        } catch (Throwable unused) {
            interfaceC13012lYandex = null;
        }
        new C11911l("shutdown.url", new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex));
    }

    public C2376l(String str, C1698l c1698l, Function1 function1) {
        this.yandex = str;
        this.loadAd = function1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object yandex(InterfaceC9955l interfaceC9955l, AbstractC0283l abstractC0283l) throws Throwable {
        C2637l c2637l;
        Throwable th;
        C9426l c9426l;
        InterfaceC13012l interfaceC13012lYandex;
        if (abstractC0283l instanceof C2637l) {
            c2637l = (C2637l) abstractC0283l;
            int i = c2637l.f5742l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2637l.f5742l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2637l = new C2637l(this, abstractC0283l);
            }
        } else {
            c2637l = new C2637l(this, abstractC0283l);
        }
        Object obj = c2637l.f5743l;
        int i2 = c2637l.f5742l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9426l = c2637l.f5744l;
            try {
                AbstractC2829l.crashlytics(obj);
                c9426l.ads(null);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                c9426l.ads(null);
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        C14187l c14187lMo1553throw = interfaceC9955l.mo1553throw();
        C10038l c10038l = c14187lMo1553throw.f14095l;
        InterfaceC6272l interfaceC6272l = (InterfaceC6272l) c10038l.f20462l;
        interfaceC6272l.remoteconfig("Shutdown URL was called: server is going down");
        C9426l c9426l2 = new C9426l();
        AbstractC10999l.mopub(AbstractC11990l.yandex(AbstractC11463l.yandex), null, 0, new C1914l(c9426l2, c14187lMo1553throw, c10038l, this, interfaceC9955l, interfaceC6272l, null), 3);
        try {
            Object obj2 = C2759l.f5978l;
            try {
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C2759l.class);
                try {
                    interfaceC13012lYandex = AbstractC18202l.yandex(C2759l.class);
                } catch (Throwable unused) {
                    interfaceC13012lYandex = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
                c2637l.f5744l = c9426l2;
                c2637l.f5742l = 1;
                Object objMo1554while = interfaceC9955l.mo1554while(obj2, c11310l, c2637l);
                Object obj3 = EnumC9342l.f19165l;
                if (objMo1554while == obj3) {
                    return obj3;
                }
                c9426l = c9426l2;
                c9426l.ads(null);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                th = th3;
                c9426l = c9426l2;
                c9426l.ads(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
