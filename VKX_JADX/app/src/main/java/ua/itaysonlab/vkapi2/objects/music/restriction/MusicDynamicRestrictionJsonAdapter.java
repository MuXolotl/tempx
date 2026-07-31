package ua.itaysonlab.vkapi2.objects.music.restriction;

import defpackage.AbstractC15639l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class MusicDynamicRestrictionJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("title", "text", "icons");

    public MusicDynamicRestrictionJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "title");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "icons");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        MusicDynamicRestriction musicDynamicRestriction = (MusicDynamicRestriction) obj;
        c3631l.mopub();
        c3631l.isVip("title");
        String str = musicDynamicRestriction.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("text");
        abstractC7188l.billing(c3631l, musicDynamicRestriction.loadAd);
        c3631l.isVip("icons");
        this.crashlytics.billing(c3631l, musicDynamicRestriction.crashlytics);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        String str = null;
        String str2 = null;
        List list = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    str = (String) abstractC7188l.loadAd(c0396l);
                } else if (iM503l == 1) {
                    str2 = (String) abstractC7188l.loadAd(c0396l);
                } else if (iM503l == 2) {
                    list = (List) this.crashlytics.loadAd(c0396l);
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        return new MusicDynamicRestriction(str, str2, list);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(MusicDynamicRestriction)";
    }
}
