package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؘؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1657l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0483l f4000l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4001l;

    public /* synthetic */ C1657l(C0483l c0483l, int i) {
        this.f4001l = i;
        this.f4000l = c0483l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f4001l;
        EnumC6302l enumC6302l = EnumC6302l.f13255l;
        C0483l c0483l = this.f4000l;
        switch (i) {
            case 0:
                c0483l.yandex.yandex.applovin();
                break;
            case 1:
                c0483l.loadAd.setValue(enumC6302l);
                break;
            case 2:
                c0483l.loadAd.setValue(enumC6302l);
                break;
            case 3:
                c0483l.remoteconfig();
                break;
            case 4:
                c0483l.remoteconfig();
                break;
            case 5:
                C9879l c9879l = c0483l.yandex;
                C12362l c12362l = c9879l.ads;
                AppActivity appActivity = c9879l.yandex;
                if (c12362l.yandex() instanceof C16016l) {
                    new C18534l((C16016l) c12362l.yandex(), null).Signature(appActivity);
                } else {
                    new C11249l(c9879l.isPro().loadAd, c12362l.yandex()).Signature(appActivity);
                }
                break;
            default:
                new C14472l(new C5636l(0), 6).Signature(c0483l.yandex.yandex);
                break;
        }
        return Unit.INSTANCE;
    }
}
