package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lُؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2157l extends AbstractC16111l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final InterfaceC9069l f4793l;

    public C2157l(InterfaceC9069l interfaceC9069l) {
        this.f4793l = interfaceC9069l;
    }

    public final void ad(C8316l c8316l, C6956l c6956l, int i) {
        c6956l.m2133new(571439452);
        int i2 = (c6956l.billing(c8316l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(594486711, new C15800l(c8316l, this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15800l(this, c8316l, i);
        }
    }

    public final String advert() {
        InterfaceC9069l interfaceC9069l = this.f4793l;
        if (interfaceC9069l instanceof C9080l) {
            C16499l c16499l = C16499l.f32230l;
            AudioPlaylist audioPlaylist = ((C9080l) interfaceC9069l).yandex;
            c16499l.getClass();
            return "https://" + AbstractC9549l.purchase + "/music/playlist/" + AbstractC14770l.remoteconfig(audioPlaylist);
        }
        if (!(interfaceC9069l instanceof C0399l)) {
            if (!(interfaceC9069l instanceof C15268l)) {
                C18725l.billing();
                return null;
            }
            C16499l c16499l2 = C16499l.f32230l;
            CatalogArtist catalogArtist = ((C15268l) interfaceC9069l).yandex;
            c16499l2.getClass();
            return C16499l.amazon(catalogArtist);
        }
        C16499l c16499l3 = C16499l.f32230l;
        AudioTrack audioTrack = ((C0399l) interfaceC9069l).yandex;
        c16499l3.getClass();
        return "https://" + AbstractC9549l.purchase + "/audio" + AbstractC16676l.billing(audioTrack);
    }

    @Override // defpackage.AbstractC16111l
    public final /* bridge */ /* synthetic */ void license(Object obj, C6956l c6956l) {
        ad((C8316l) obj, c6956l, 0);
    }

    @Override // defpackage.AbstractC16111l
    public final Object pro(C16793l c16793l) {
        return new C8316l(c16793l, new C3151l(1, this, C2157l.class, "onTargetPicked", "onTargetPicked(Lbruhcollective/itaysonlab/vkx/decompose/components/share/ShareTarget;)V", 0, 0, 4), new C10832l(0, this, C2157l.class, "dismiss", "dismiss()V", 0, 0, 12));
    }
}
