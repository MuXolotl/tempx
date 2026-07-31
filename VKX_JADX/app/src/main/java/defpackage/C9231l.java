package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٌۨۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9231l extends AbstractC16111l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final List f18987l;

    public C9231l(AudioTrack audioTrack) {
        this(Collections.singletonList(audioTrack));
    }

    public final void ad(C6956l c6956l, int i) {
        c6956l.m2133new(-28814386);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            int i4 = AbstractC15548l.yandex;
            C10707l c10707l = AbstractC16964l.yandex;
            C15087l c15087lYandex = AbstractC15548l.yandex(0L, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, 0L, c6956l, 505);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C9636l(2, this);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC5006l.purchase, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, AbstractC5006l.billing, null, c15087lYandex, c6956l, 24582, 428);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15707l(this, i, i3);
        }
    }

    public final void advert(C0324l c0324l, C6956l c6956l, int i) {
        c6956l.m2133new(1410426926);
        int i2 = (c6956l.billing(c0324l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(c0324l.billing, c6956l, 0);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(162200042, new C18525l(c0324l, AbstractC9637l.purchase(c0324l.admob, c6956l, 0), i3), c6956l), null, null, null, 0, 0L, 0L, AbstractC14760l.loadAd(0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l), 7), AbstractC14566l.amazon(1327559423, new C18383l(this, AbstractC9637l.purchase(c0324l.subs, c6956l, 0), c0324l, AbstractC9637l.purchase(c0324l.mopub, c6956l, 0), interfaceC8714lPurchase), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Cpublic(this, c0324l, i, 3);
        }
    }

    @Override // defpackage.AbstractC16111l
    public final /* bridge */ /* synthetic */ void license(Object obj, C6956l c6956l) {
        advert((C0324l) obj, c6956l, 0);
    }

    @Override // defpackage.AbstractC16111l
    public final Object pro(C16793l c16793l) {
        return new C0324l(c16793l, true, new C4508l(0, this), new Cconst(0, this, C9231l.class, "dismiss", "dismiss()V", 0, 0, 20));
    }

    public C9231l(List list) {
        this.f18987l = list;
    }
}
