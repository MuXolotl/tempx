package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lَؑ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0614l {
    public final C7549l crashlytics;
    public final C1008l loadAd;
    public final C13047l yandex = AbstractC9549l.yandex(new C8578l(2));

    public C0614l() {
        C1008l c1008lYandex = AbstractC11190l.yandex(C17801l.yandex);
        this.loadAd = c1008lYandex;
        this.crashlytics = AbstractC0622l.yandex(c1008lYandex);
        new C15564l(new C5834l(0, this, C0614l.class, "getCertificatesFromState", "getCertificatesFromState()Ljava/util/List;", 0, 0, 0));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C4068l c4068l;
        Object c18435l;
        C13785l c13785l;
        C13785l c13785l2;
        Object c18435l2;
        C14468l c14468l;
        Object c18435l3;
        C0614l c0614l;
        if (abstractC0283l instanceof C4068l) {
            c4068l = (C4068l) abstractC0283l;
            int i = c4068l.f8367l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4068l.f8367l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4068l = new C4068l(this, abstractC0283l);
            }
        } else {
            c4068l = new C4068l(this, abstractC0283l);
        }
        Object objLoadAd = c4068l.f8370l;
        int i2 = c4068l.f8367l;
        C1008l c1008l = this.loadAd;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(objLoadAd);
                    c1008l.getClass();
                    c1008l.remoteconfig(null, C17801l.yandex);
                    C18404l c18404l = C18404l.yandex;
                    c4068l.f8369l = this;
                    c4068l.f8367l = 1;
                    objLoadAd = c18404l.loadAd("config_network_proxy", c4068l);
                    if (objLoadAd != enumC9342l) {
                        c0614l = this;
                    }
                    return enumC9342l;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = c4068l.f8368l;
                    c13785l2 = (C13785l) c4068l.f8369l;
                    try {
                        AbstractC2829l.crashlytics(objLoadAd);
                        C13047l c13047l = this.yandex;
                        c13047l.getClass();
                        c18435l2 = (C2388l) c13047l.loadAd(C2388l.Companion.serializer(), (String) objLoadAd);
                    } catch (Throwable th) {
                        th = th;
                        c18435l2 = new C18435l(th);
                    }
                    if (c18435l2 instanceof C18435l) {
                        c18435l2 = null;
                    }
                    C2388l c2388l = (C2388l) c18435l2;
                    c14468l = C14468l.yandex;
                    if (c13785l2 != null || c2388l == null) {
                        c1008l.getClass();
                        c1008l.remoteconfig(null, c14468l);
                        return Unit.INSTANCE;
                    }
                    try {
                        C4803l c4803l = c13785l2.crashlytics;
                        C17279l c17279l = new C17279l(c4803l.yandex, c4803l.loadAd, c4803l.crashlytics, AbstractC0019l.yandex(c2388l.crashlytics));
                        c1008l.getClass();
                        c1008l.remoteconfig(null, c17279l);
                        c18435l3 = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        c18435l3 = new C18435l(th2);
                    }
                    if (C1171l.yandex(c18435l3) != null) {
                        c1008l.getClass();
                        c1008l.remoteconfig(null, c14468l);
                    }
                    return Unit.INSTANCE;
                }
                c0614l = (C0614l) c4068l.f8369l;
                AbstractC2829l.crashlytics(objLoadAd);
                C18404l c18404l2 = C18404l.yandex;
                c4068l.f8369l = c13785l;
                c4068l.f8368l = this;
                c4068l.f8367l = 2;
                Object objLoadAd2 = c18404l2.loadAd("config_network_proxy_certs", c4068l);
                if (objLoadAd2 != enumC9342l) {
                    c13785l2 = c13785l;
                    objLoadAd = objLoadAd2;
                    C13047l c13047l2 = this.yandex;
                    c13047l2.getClass();
                    c18435l2 = (C2388l) c13047l2.loadAd(C2388l.Companion.serializer(), (String) objLoadAd);
                    if (c18435l2 instanceof C18435l) {
                        c18435l2 = null;
                    }
                    C2388l c2388l2 = (C2388l) c18435l2;
                    c14468l = C14468l.yandex;
                    if (c13785l2 != null) {
                    }
                    c1008l.getClass();
                    c1008l.remoteconfig(null, c14468l);
                    return Unit.INSTANCE;
                }
                return enumC9342l;
            } catch (Throwable th3) {
                th = th3;
                c13785l2 = c13785l;
                c18435l2 = new C18435l(th);
            }
            C13047l c13047l3 = c0614l.yandex;
            c13047l3.getClass();
            c18435l = (C13785l) c13047l3.loadAd(C13785l.Companion.serializer(), (String) objLoadAd);
        } catch (Throwable th4) {
            c18435l = new C18435l(th4);
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
        c13785l = (C13785l) c18435l;
    }
}
