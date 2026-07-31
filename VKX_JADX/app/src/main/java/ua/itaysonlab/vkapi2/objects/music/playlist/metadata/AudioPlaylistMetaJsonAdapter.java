package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioPlaylistMetaJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("view");

    public AudioPlaylistMetaJsonAdapter(C12952l c12952l) {
        this.loadAd = c12952l.loadAd(String.class, C5746l.f12138l, "view");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        c3631l.mopub();
        c3631l.isVip("view");
        this.loadAd.billing(c3631l, ((AudioPlaylistMeta) obj).yandex);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Object objLoadAd = null;
        byte b = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                objLoadAd = this.loadAd.loadAd(c0396l);
                b = -2;
            }
        }
        c0396l.ads();
        String str = (String) objLoadAd;
        if (b == -2) {
            return new AudioPlaylistMeta(str);
        }
        return new AudioPlaylistMeta((b & 1) == 0 ? str : null);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioPlaylistMeta)";
    }
}
