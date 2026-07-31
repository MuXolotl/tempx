package ua.itaysonlab.vkapi2.objects.music.playlist;

import defpackage.AbstractC12589l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioPlaylistPermissionsJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("save_as_copy", "follow", "delete", "edit", "share", "play");

    public AudioPlaylistPermissionsJsonAdapter(C12952l c12952l) {
        this.loadAd = c12952l.loadAd(Boolean.TYPE, C5746l.f12138l, "canClone");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioPlaylistPermissions audioPlaylistPermissions = (AudioPlaylistPermissions) obj;
        c3631l.mopub();
        c3631l.isVip("save_as_copy");
        boolean z = audioPlaylistPermissions.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        AbstractC12589l.m3428volatile(z, abstractC7188l, c3631l, "follow");
        AbstractC12589l.m3428volatile(audioPlaylistPermissions.loadAd, abstractC7188l, c3631l, "delete");
        AbstractC12589l.m3428volatile(audioPlaylistPermissions.crashlytics, abstractC7188l, c3631l, "edit");
        AbstractC12589l.m3428volatile(audioPlaylistPermissions.amazon, abstractC7188l, c3631l, "share");
        AbstractC12589l.m3428volatile(audioPlaylistPermissions.purchase, abstractC7188l, c3631l, "play");
        abstractC7188l.billing(c3631l, Boolean.valueOf(audioPlaylistPermissions.billing));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        int i = -1;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        boolean zBooleanValue6 = false;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    break;
                case 0:
                    Object objLoadAd = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd == null) {
                        setIsVip = AbstractC2812l.isVip("canClone", "save_as_copy", c0396l, setIsVip);
                    } else {
                        zBooleanValue = ((Boolean) objLoadAd).booleanValue();
                    }
                    i &= -2;
                    break;
                case 1:
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setIsVip = AbstractC2812l.isVip("canFollow", "follow", c0396l, setIsVip);
                    } else {
                        zBooleanValue2 = ((Boolean) objLoadAd2).booleanValue();
                    }
                    i &= -3;
                    break;
                case 2:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setIsVip = AbstractC2812l.isVip("canDelete", "delete", c0396l, setIsVip);
                    } else {
                        zBooleanValue3 = ((Boolean) objLoadAd3).booleanValue();
                    }
                    i &= -5;
                    break;
                case 3:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setIsVip = AbstractC2812l.isVip("canEdit", "edit", c0396l, setIsVip);
                    } else {
                        zBooleanValue4 = ((Boolean) objLoadAd4).booleanValue();
                    }
                    i &= -9;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setIsVip = AbstractC2812l.isVip("canShare", "share", c0396l, setIsVip);
                    } else {
                        zBooleanValue5 = ((Boolean) objLoadAd5).booleanValue();
                    }
                    i &= -17;
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setIsVip = AbstractC2812l.isVip("canPlay", "play", c0396l, setIsVip);
                    } else {
                        zBooleanValue6 = ((Boolean) objLoadAd6).booleanValue();
                    }
                    i &= -33;
                    break;
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        if (i == -64) {
            return new AudioPlaylistPermissions(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6);
        }
        boolean z = (i & 1) != 0 ? false : zBooleanValue;
        if ((i & 2) != 0) {
            zBooleanValue2 = true;
        }
        return new AudioPlaylistPermissions(z, zBooleanValue2, (i & 4) != 0 ? false : zBooleanValue3, (i & 8) != 0 ? false : zBooleanValue4, (i & 16) != 0 ? false : zBooleanValue5, (i & 32) != 0 ? false : zBooleanValue6);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioPlaylistPermissions)";
    }
}
