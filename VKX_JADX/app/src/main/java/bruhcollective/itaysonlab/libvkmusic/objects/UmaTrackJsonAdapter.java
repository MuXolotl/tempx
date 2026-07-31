package bruhcollective.itaysonlab.libvkmusic.objects;

import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC12589l;
import defpackage.AbstractC15639l;
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
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class UmaTrackJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l admob;
    public final AbstractC7188l amazon;
    public final AbstractC7188l billing;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l firebase;
    public final AbstractC7188l isPro;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l mopub;
    public final AbstractC7188l purchase;
    public final AbstractC7188l subs;
    public final C0458l yandex = C0458l.m547strictfp("apiId", "name", "artistDisplayName", "cover", "file", "album", "artist", "artists", "isLegal", "isRadioCapable", "isAdded", "isLiked", "isDisliked", "isRestricted", "isExplicit", "shareHash", "duration", "size", "permissions", "vkAudioId", "liked", "disliked");

    public UmaTrackJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "apiId");
        this.crashlytics = c12952l.loadAd(UmaCover.class, c5746l, "cover");
        this.amazon = c12952l.loadAd(UmaAlbum.class, c5746l, "album");
        this.purchase = c12952l.loadAd(UmaArtist.class, c5746l, "artist");
        this.billing = c12952l.loadAd(AbstractC15639l.mopub(List.class, UmaArtist.class), c5746l, "artists");
        this.mopub = c12952l.loadAd(Boolean.TYPE, c5746l, "isLegal");
        this.admob = c12952l.loadAd(Integer.TYPE, c5746l, "duration");
        this.subs = c12952l.loadAd(Long.TYPE, c5746l, "size");
        this.isPro = c12952l.loadAd(UmaPermissions.class, c5746l, "permissions");
        this.firebase = c12952l.loadAd(String.class, c5746l, "vkAudioId");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        UmaTrack umaTrack = (UmaTrack) obj;
        c3631l.mopub();
        c3631l.isVip("apiId");
        String str = umaTrack.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("name");
        abstractC7188l.billing(c3631l, umaTrack.loadAd);
        c3631l.isVip("artistDisplayName");
        abstractC7188l.billing(c3631l, umaTrack.crashlytics);
        c3631l.isVip("cover");
        this.crashlytics.billing(c3631l, umaTrack.amazon);
        c3631l.isVip("file");
        abstractC7188l.billing(c3631l, umaTrack.purchase);
        c3631l.isVip("album");
        this.amazon.billing(c3631l, umaTrack.billing);
        c3631l.isVip("artist");
        this.purchase.billing(c3631l, umaTrack.mopub);
        c3631l.isVip("artists");
        this.billing.billing(c3631l, umaTrack.admob);
        c3631l.isVip("isLegal");
        boolean z = umaTrack.subs;
        AbstractC7188l abstractC7188l2 = this.mopub;
        AbstractC12589l.m3428volatile(z, abstractC7188l2, c3631l, "isRadioCapable");
        AbstractC12589l.m3428volatile(umaTrack.isPro, abstractC7188l2, c3631l, "isAdded");
        AbstractC12589l.m3428volatile(umaTrack.firebase, abstractC7188l2, c3631l, "isLiked");
        AbstractC12589l.m3428volatile(umaTrack.smaato, abstractC7188l2, c3631l, "isDisliked");
        AbstractC12589l.m3428volatile(umaTrack.remoteconfig, abstractC7188l2, c3631l, "isRestricted");
        AbstractC12589l.m3428volatile(umaTrack.vip, abstractC7188l2, c3631l, "isExplicit");
        AbstractC12589l.m3428volatile(umaTrack.metrica, abstractC7188l2, c3631l, "shareHash");
        abstractC7188l.billing(c3631l, umaTrack.startapp);
        c3631l.isVip("duration");
        AbstractC12589l.inmobi(umaTrack.adcel, this.admob, c3631l, "size");
        AbstractC12589l.m3427throws(umaTrack.ads, this.subs, c3631l, "permissions");
        this.isPro.billing(c3631l, umaTrack.subscription);
        c3631l.isVip("vkAudioId");
        this.firebase.billing(c3631l, umaTrack.tapsense);
        c3631l.isVip("liked");
        AbstractC12589l.m3428volatile(umaTrack.smaato, abstractC7188l2, c3631l, "disliked");
        abstractC7188l2.billing(c3631l, Boolean.valueOf(umaTrack.remoteconfig));
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        UmaTrack umaTrack;
        String str;
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        byte b = -1;
        boolean z = false;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        boolean z3 = false;
        String str4 = null;
        boolean z4 = false;
        UmaCover umaCover = null;
        boolean z5 = false;
        String str5 = null;
        boolean z6 = false;
        Boolean bool = null;
        boolean z7 = false;
        Boolean bool2 = null;
        boolean z8 = false;
        Boolean bool3 = null;
        boolean z9 = false;
        Boolean bool4 = null;
        boolean z10 = false;
        Boolean bool5 = null;
        boolean z11 = false;
        Boolean bool6 = null;
        boolean z12 = false;
        Boolean bool7 = null;
        boolean z13 = false;
        String str6 = null;
        boolean z14 = false;
        Integer num = null;
        boolean z15 = false;
        Long l = null;
        boolean z16 = false;
        UmaPermissions umaPermissions = null;
        UmaAlbum umaAlbum = null;
        UmaArtist umaArtist = null;
        List list = null;
        Object objLoadAd = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        while (true) {
            boolean z17 = z;
            z2 = z2;
            String str7 = str2;
            String str8 = str3;
            boolean z18 = z3;
            String str9 = str4;
            boolean z19 = z4;
            UmaCover umaCover2 = umaCover;
            boolean z20 = z5;
            String str10 = str5;
            byte b2 = b;
            if (!c0396l.m504package()) {
                c0396l.ads();
                if ((!z17) & (str7 == null)) {
                    setLicense = AbstractC2812l.license("apiId", "apiId", c0396l, setLicense);
                }
                if ((!z2) & (str8 == null)) {
                    setLicense = AbstractC2812l.license("name", "name", c0396l, setLicense);
                }
                if ((!z18) & (str9 == null)) {
                    setLicense = AbstractC2812l.license("artistDisplayName", "artistDisplayName", c0396l, setLicense);
                }
                if ((!z19) & (umaCover2 == null)) {
                    setLicense = AbstractC2812l.license("cover", "cover", c0396l, setLicense);
                }
                if ((!z20) & (str10 == null)) {
                    setLicense = AbstractC2812l.license("file_", "file", c0396l, setLicense);
                }
                if ((!z6) & (bool == null)) {
                    setLicense = AbstractC2812l.license("isLegal", "isLegal", c0396l, setLicense);
                }
                if ((!z7) & (bool2 == null)) {
                    setLicense = AbstractC2812l.license("isRadioCapable", "isRadioCapable", c0396l, setLicense);
                }
                if ((!z8) & (bool3 == null)) {
                    setLicense = AbstractC2812l.license("isAdded", "isAdded", c0396l, setLicense);
                }
                if ((!z9) & (bool4 == null)) {
                    setLicense = AbstractC2812l.license("isLiked", "isLiked", c0396l, setLicense);
                }
                if ((!z10) & (bool5 == null)) {
                    setLicense = AbstractC2812l.license("isDisliked", "isDisliked", c0396l, setLicense);
                }
                if ((!z11) & (bool6 == null)) {
                    setLicense = AbstractC2812l.license("isRestricted", "isRestricted", c0396l, setLicense);
                }
                if ((!z12) & (bool7 == null)) {
                    setLicense = AbstractC2812l.license("isExplicit", "isExplicit", c0396l, setLicense);
                }
                if ((!z13) & (str6 == null)) {
                    setLicense = AbstractC2812l.license("shareHash", "shareHash", c0396l, setLicense);
                }
                if ((!z14) & (num == null)) {
                    setLicense = AbstractC2812l.license("duration", "duration", c0396l, setLicense);
                }
                if ((!z15) & (l == null)) {
                    setLicense = AbstractC2812l.license("size", "size", c0396l, setLicense);
                }
                if ((!z16) & (umaPermissions == null)) {
                    setLicense = AbstractC2812l.license("permissions", "permissions", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                if (b2 == -524289) {
                    umaTrack = new UmaTrack(str7, str8, str9, umaCover2, str10, umaAlbum, umaArtist, list, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), str6, num.intValue(), l.longValue(), umaPermissions, (String) objLoadAd);
                } else {
                    umaTrack = new UmaTrack(str7, str8, str9, umaCover2, str10, umaAlbum, umaArtist, list, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), str6, num.intValue(), l.longValue(), umaPermissions, (524288 & b2) != 0 ? null : (String) objLoadAd);
                }
                if (bool8 != null) {
                    umaTrack.crashlytics(bool8.booleanValue());
                }
                if (bool9 != null) {
                    umaTrack.subs(bool9.booleanValue());
                }
                return umaTrack;
            }
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.loadAd;
            AbstractC7188l abstractC7188l2 = this.mopub;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 0:
                    Object objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd2 == null) {
                        setLicense = AbstractC2812l.isVip("apiId", "apiId", c0396l, setLicense);
                        str2 = str7;
                        z = true;
                    } else {
                        str2 = (String) objLoadAd2;
                        z = z17;
                    }
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 1:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("name", "name", c0396l, setLicense);
                        str3 = str8;
                        z2 = true;
                    } else {
                        str3 = (String) objLoadAd3;
                        z2 = z2;
                    }
                    z = z17;
                    str2 = str7;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 2:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("artistDisplayName", "artistDisplayName", c0396l, setLicense);
                        str4 = str9;
                        z3 = true;
                    } else {
                        str4 = (String) objLoadAd4;
                        z3 = z18;
                    }
                    z = z17;
                    z2 = z2;
                    str2 = str7;
                    str3 = str8;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 3:
                    Object objLoadAd5 = this.crashlytics.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setLicense = AbstractC2812l.isVip("cover", "cover", c0396l, setLicense);
                        umaCover = umaCover2;
                        z4 = true;
                    } else {
                        umaCover = (UmaCover) objLoadAd5;
                        z4 = z19;
                    }
                    z = z17;
                    z2 = z2;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 4:
                    Object objLoadAd6 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("file_", "file", c0396l, setLicense);
                        str5 = str10;
                        z5 = true;
                    } else {
                        str5 = (String) objLoadAd6;
                        z5 = z20;
                    }
                    z = z17;
                    z2 = z2;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    b = b2;
                    break;
                case 5:
                    umaAlbum = (UmaAlbum) this.amazon.loadAd(c0396l);
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 6:
                    umaArtist = (UmaArtist) this.purchase.loadAd(c0396l);
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 7:
                    list = (List) this.billing.loadAd(c0396l);
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 8:
                    Object objLoadAd7 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("isLegal", "isLegal", c0396l, setLicense);
                        z6 = true;
                    } else {
                        bool = (Boolean) objLoadAd7;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 9:
                    Object objLoadAd8 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd8 == null) {
                        setLicense = AbstractC2812l.isVip("isRadioCapable", "isRadioCapable", c0396l, setLicense);
                        z7 = true;
                    } else {
                        bool2 = (Boolean) objLoadAd8;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 10:
                    Object objLoadAd9 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd9 == null) {
                        setLicense = AbstractC2812l.isVip("isAdded", "isAdded", c0396l, setLicense);
                        z8 = true;
                    } else {
                        bool3 = (Boolean) objLoadAd9;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 11:
                    Object objLoadAd10 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd10 == null) {
                        setLicense = AbstractC2812l.isVip("isLiked", "isLiked", c0396l, setLicense);
                        z9 = true;
                    } else {
                        bool4 = (Boolean) objLoadAd10;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 12:
                    Object objLoadAd11 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd11 == null) {
                        setLicense = AbstractC2812l.isVip("isDisliked", "isDisliked", c0396l, setLicense);
                        z10 = true;
                    } else {
                        bool5 = (Boolean) objLoadAd11;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 13:
                    Object objLoadAd12 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd12 == null) {
                        setLicense = AbstractC2812l.isVip("isRestricted", "isRestricted", c0396l, setLicense);
                        z11 = true;
                    } else {
                        bool6 = (Boolean) objLoadAd12;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 14:
                    Object objLoadAd13 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd13 == null) {
                        setLicense = AbstractC2812l.isVip("isExplicit", "isExplicit", c0396l, setLicense);
                        z12 = true;
                    } else {
                        bool7 = (Boolean) objLoadAd13;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 15:
                    Object objLoadAd14 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd14 == null) {
                        setLicense = AbstractC2812l.isVip("shareHash", "shareHash", c0396l, setLicense);
                        z13 = true;
                    } else {
                        str6 = (String) objLoadAd14;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 16:
                    Object objLoadAd15 = this.admob.loadAd(c0396l);
                    if (objLoadAd15 == null) {
                        setLicense = AbstractC2812l.isVip("duration", "duration", c0396l, setLicense);
                        z14 = true;
                    } else {
                        num = (Integer) objLoadAd15;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    Object objLoadAd16 = this.subs.loadAd(c0396l);
                    if (objLoadAd16 == null) {
                        setLicense = AbstractC2812l.isVip("size", "size", c0396l, setLicense);
                        z15 = true;
                    } else {
                        l = (Long) objLoadAd16;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    Object objLoadAd17 = this.isPro.loadAd(c0396l);
                    if (objLoadAd17 == null) {
                        setLicense = AbstractC2812l.isVip("permissions", "permissions", c0396l, setLicense);
                        z16 = true;
                    } else {
                        umaPermissions = (UmaPermissions) objLoadAd17;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    objLoadAd = this.firebase.loadAd(c0396l);
                    z = z17;
                    z2 = z2;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = -524289;
                    break;
                case 20:
                    Object objLoadAd18 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd18 == null) {
                        str = "liked";
                        setLicense = AbstractC2812l.isVip(str, str, c0396l, setLicense);
                    } else {
                        bool8 = (Boolean) objLoadAd18;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                case 21:
                    Object objLoadAd19 = abstractC7188l2.loadAd(c0396l);
                    if (objLoadAd19 == null) {
                        str = "disliked";
                        setLicense = AbstractC2812l.isVip(str, str, c0396l, setLicense);
                    } else {
                        bool9 = (Boolean) objLoadAd19;
                    }
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
                default:
                    z = z17;
                    str2 = str7;
                    str3 = str8;
                    z3 = z18;
                    str4 = str9;
                    z4 = z19;
                    umaCover = umaCover2;
                    z5 = z20;
                    str5 = str10;
                    b = b2;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaTrack)";
    }
}
