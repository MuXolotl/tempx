package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* JADX INFO: renamed from: lّٖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12647l extends AbstractC12216l {
    public final /* synthetic */ AbstractC11801l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C12647l(AbstractC11801l abstractC11801l, int i) {
        this.yandex = i;
        this.loadAd = abstractC11801l;
    }

    @Override // defpackage.AbstractC12216l
    public final void amazon(String str) {
        int i = this.yandex;
        AbstractC11801l abstractC11801l = this.loadAd;
        switch (i) {
            case 0:
                C18014l c18014l = (C18014l) abstractC11801l;
                c18014l.f35203l.setValue(null);
                c18014l.m4458instanceof();
                if (AbstractC8576l.yandex(c18014l.m4456finally(), C10126l.yandex)) {
                    c18014l.m4461try(new C6077l());
                }
                break;
            default:
                C7044l c7044l = (C7044l) abstractC11801l;
                c7044l.f14759l.setValue(null);
                C7504l c7504l = c7044l.f14765l;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                c7044l.f14765l = null;
                if (AbstractC8576l.yandex((InterfaceC6844l) c7044l.f14766l.getValue(), C15228l.yandex)) {
                    c7044l.m2160finally(new C12939l(5));
                }
                break;
        }
    }

    @Override // defpackage.AbstractC12216l
    public final void crashlytics(String str, C15053l c15053l) {
        int i;
        int i2 = this.yandex;
        AbstractC11801l abstractC11801l = this.loadAd;
        switch (i2) {
            case 0:
                C18014l c18014l = (C18014l) abstractC11801l;
                int i3 = ((Status) c15053l.f29576l).f584l;
                if (i3 == 0) {
                    c18014l.f35203l.setValue(str);
                    C1062l c1062lM4459public = c18014l.m4459public();
                    c1062lM4459public.firebase.crashlytics(c1062lM4459public, "advertising");
                    break;
                } else {
                    C9022l c9022l = C9022l.yandex;
                    if (i3 == 13) {
                        c18014l.m4461try(c9022l);
                        break;
                    } else if (i3 == 8004) {
                        c18014l.m4461try(c9022l);
                        break;
                    }
                }
                break;
            default:
                C7044l c7044l = (C7044l) abstractC11801l;
                int i4 = ((Status) c15053l.f29576l).f584l;
                if (i4 == 0) {
                    c7044l.f14759l.setValue(str);
                    C1062l c1062lM2163public = c7044l.m2163public();
                    c1062lM2163public.firebase.crashlytics(c1062lM2163public, "discovery").purchase(new C9912l(18, c1062lM2163public));
                    String str2 = C14025l.f27330l;
                    C8688l c8688l = AbstractC0085l.yandex;
                    C14025l c14025lAds = C6162l.ads(AbstractC8182l.loadAd().loadAd());
                    C12382l c12382l = AbstractC5921l.f12465l;
                    C18402l c18402lMo694private = c12382l.mo694private(c14025lAds);
                    long j = 0;
                    if (c18402lMo694private == null || !c18402lMo694private.loadAd) {
                        i = 0;
                    } else {
                        C12588l c12588l = new C12588l(AbstractC17587l.firebase(AbstractC17587l.startapp(c12382l.mo693package(c14025lAds), new C2176l(1, c12382l, AbstractC5921l.class, "metadataOrNull", "metadataOrNull(Lokio/Path;)Lokio/FileMetadata;", 0, 0, 22)), C10831l.f21891l));
                        i = 0;
                        long jLongValue = 0;
                        while (c12588l.hasNext()) {
                            i++;
                            Long l = ((C18402l) c12588l.next()).amazon;
                            jLongValue += l != null ? l.longValue() : 0L;
                        }
                        j = jLongValue;
                    }
                    c7044l.f14758l.subs(0);
                    c7044l.f14767l.subs(i);
                    C2895l c2895l = new C2895l(i, j);
                    C9385l c9385l = AbstractC2617l.yandex;
                    c9385l.getClass();
                    byte[] bArrLoadAd = c9385l.loadAd(InterfaceC17709l.Companion.serializer(), c2895l);
                    C6490l c6490l = C10815l.subs;
                    c7044l.m2163public().admob(str, new C10815l(UUID.randomUUID().getLeastSignificantBits(), 1, bArrLoadAd, null, null));
                    break;
                } else {
                    C0632l c0632l = C0632l.yandex;
                    if (i4 == 13) {
                        c7044l.m2160finally(c0632l);
                        break;
                    } else if (i4 == 8004) {
                        c7044l.m2160finally(c0632l);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.AbstractC12216l
    public final void loadAd(String str, C3713l c3713l) {
        int i = this.yandex;
        AbstractC11801l abstractC11801l = this.loadAd;
        switch (i) {
            case 0:
                ((C18014l) abstractC11801l).f35205l.setValue(new C8195l(str, c3713l));
                break;
            default:
                C7044l c7044l = (C7044l) abstractC11801l;
                c7044l.f14760l.setValue(new C8195l(str, c3713l));
                c7044l.m2160finally(C14214l.yandex);
                break;
        }
    }
}
