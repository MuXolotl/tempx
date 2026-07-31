package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lۣ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18128l extends AbstractC2597l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C2630l f35420l = new C2630l(22);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C18128l f35421l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C18128l f35422l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f35423l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C18128l f35424l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f35425l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f35426l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f35427l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f35428l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public byte f35429l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f35430l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f35431l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C18128l f35432l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f35433l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f35434l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f35435l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f35436l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f35437l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f35438l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f35439l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public List f35440l;

    static {
        C18128l c18128l = new C18128l();
        f35421l = c18128l;
        c18128l.adcel();
    }

    public C18128l(C1718l c1718l, C3429l c3429l) {
        this.f35429l = (byte) -1;
        this.f35425l = -1;
        adcel();
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    C2630l c2630l = f35420l;
                    C7699l c7699lAds = null;
                    switch (iMetrica) {
                        case 0:
                            break;
                        case 8:
                            this.f35423l |= 4096;
                            this.f35430l = c1718l.smaato();
                            continue;
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            if ((i & 1) != 1) {
                                this.f35434l = new ArrayList();
                                i |= 1;
                            }
                            this.f35434l.add(c1718l.admob(C16093l.f31532l, c3429l));
                            continue;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            this.f35423l |= 1;
                            this.f35433l = c1718l.remoteconfig() != 0;
                            continue;
                        case 32:
                            this.f35423l |= 2;
                            this.f35437l = c1718l.smaato();
                            continue;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            if ((this.f35423l & 4) == 4) {
                                C18128l c18128l = this.f35424l;
                                c18128l.getClass();
                                c7699lAds = ads(c18128l);
                            }
                            C18128l c18128l2 = (C18128l) c1718l.admob(c2630l, c3429l);
                            this.f35424l = c18128l2;
                            if (c7699lAds != null) {
                                c7699lAds.isPro(c18128l2);
                                this.f35424l = c7699lAds.admob();
                            }
                            this.f35423l |= 4;
                            continue;
                        case 48:
                            this.f35423l |= 16;
                            this.f35436l = c1718l.smaato();
                            continue;
                        case 56:
                            this.f35423l |= 32;
                            this.f35431l = c1718l.smaato();
                            continue;
                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                            this.f35423l |= 8;
                            this.f35426l = c1718l.smaato();
                            continue;
                        case 72:
                            this.f35423l |= 64;
                            this.f35438l = c1718l.smaato();
                            continue;
                        case 82:
                            if ((this.f35423l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                C18128l c18128l3 = this.f35422l;
                                c18128l3.getClass();
                                c7699lAds = ads(c18128l3);
                            }
                            C18128l c18128l4 = (C18128l) c1718l.admob(c2630l, c3429l);
                            this.f35422l = c18128l4;
                            if (c7699lAds != null) {
                                c7699lAds.isPro(c18128l4);
                                this.f35422l = c7699lAds.admob();
                            }
                            this.f35423l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            continue;
                        case 88:
                            this.f35423l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            this.f35439l = c1718l.smaato();
                            continue;
                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                            this.f35423l |= 128;
                            this.f35435l = c1718l.smaato();
                            continue;
                        case 106:
                            if ((this.f35423l & 1024) == 1024) {
                                C18128l c18128l5 = this.f35432l;
                                c18128l5.getClass();
                                c7699lAds = ads(c18128l5);
                            }
                            C18128l c18128l6 = (C18128l) c1718l.admob(c2630l, c3429l);
                            this.f35432l = c18128l6;
                            if (c7699lAds != null) {
                                c7699lAds.isPro(c18128l6);
                                this.f35432l = c7699lAds.admob();
                            }
                            this.f35423l |= 1024;
                            continue;
                        case 112:
                            this.f35423l |= 2048;
                            this.f35427l = c1718l.smaato();
                            continue;
                        case 802:
                            if ((i & 16384) != 16384) {
                                this.f35440l = new ArrayList();
                                i |= 16384;
                            }
                            this.f35440l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            continue;
                        default:
                            if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (C12383l e) {
                    e.f24472l = this;
                    throw e;
                } catch (IOException e2) {
                    C12383l c12383l = new C12383l(e2.getMessage());
                    c12383l.f24472l = this;
                    throw c12383l;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.f35434l = DesugarCollections.unmodifiableList(this.f35434l);
                }
                if ((i & 16384) == 16384) {
                    this.f35440l = DesugarCollections.unmodifiableList(this.f35440l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f35428l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.f35434l = DesugarCollections.unmodifiableList(this.f35434l);
        }
        if ((i & 16384) == 16384) {
            this.f35440l = DesugarCollections.unmodifiableList(this.f35440l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f35428l = c6769l.mopub();
        }
        remoteconfig();
    }

    public static C7699l ads(C18128l c18128l) {
        C7699l c7699lSubs = C7699l.subs();
        c7699lSubs.isPro(c18128l);
        return c7699lSubs;
    }

    public final void adcel() {
        List list = Collections.EMPTY_LIST;
        this.f35434l = list;
        this.f35433l = false;
        this.f35437l = 0;
        C18128l c18128l = f35421l;
        this.f35424l = c18128l;
        this.f35426l = 0;
        this.f35436l = 0;
        this.f35431l = 0;
        this.f35438l = 0;
        this.f35435l = 0;
        this.f35422l = c18128l;
        this.f35439l = 0;
        this.f35432l = c18128l;
        this.f35427l = 0;
        this.f35430l = 0;
        this.f35440l = list;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C7699l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f35423l & 4096) == 4096) {
            c11522l.m3097abstract(1, this.f35430l);
        }
        for (int i = 0; i < this.f35434l.size(); i++) {
            c11522l.m3120public(2, (AbstractC14080l) this.f35434l.get(i));
        }
        if ((this.f35423l & 1) == 1) {
            boolean z = this.f35433l;
            c11522l.m3102const(3, 0);
            c11522l.m3125this(z ? 1 : 0);
        }
        if ((this.f35423l & 2) == 2) {
            c11522l.m3097abstract(4, this.f35437l);
        }
        if ((this.f35423l & 4) == 4) {
            c11522l.m3120public(5, this.f35424l);
        }
        if ((this.f35423l & 16) == 16) {
            c11522l.m3097abstract(6, this.f35436l);
        }
        if ((this.f35423l & 32) == 32) {
            c11522l.m3097abstract(7, this.f35431l);
        }
        if ((this.f35423l & 8) == 8) {
            c11522l.m3097abstract(8, this.f35426l);
        }
        if ((this.f35423l & 64) == 64) {
            c11522l.m3097abstract(9, this.f35438l);
        }
        if ((this.f35423l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c11522l.m3120public(10, this.f35422l);
        }
        if ((this.f35423l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            c11522l.m3097abstract(11, this.f35439l);
        }
        if ((this.f35423l & 128) == 128) {
            c11522l.m3097abstract(12, this.f35435l);
        }
        if ((this.f35423l & 1024) == 1024) {
            c11522l.m3120public(13, this.f35432l);
        }
        if ((this.f35423l & 2048) == 2048) {
            c11522l.m3097abstract(14, this.f35427l);
        }
        for (int i2 = 0; i2 < this.f35440l.size(); i2++) {
            c11522l.m3120public(100, (AbstractC14080l) this.f35440l.get(i2));
        }
        c10023l.m2827for(200, c11522l);
        c11522l.m3129try(this.f35428l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f35425l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f35423l & 4096) == 4096 ? C11522l.vip(1, this.f35430l) : 0;
        for (int i2 = 0; i2 < this.f35434l.size(); i2++) {
            iVip += C11522l.startapp(2, (AbstractC14080l) this.f35434l.get(i2));
        }
        if ((this.f35423l & 1) == 1) {
            iVip += C11522l.tapsense(3) + 1;
        }
        if ((this.f35423l & 2) == 2) {
            iVip += C11522l.vip(4, this.f35437l);
        }
        if ((this.f35423l & 4) == 4) {
            iVip += C11522l.startapp(5, this.f35424l);
        }
        if ((this.f35423l & 16) == 16) {
            iVip += C11522l.vip(6, this.f35436l);
        }
        if ((this.f35423l & 32) == 32) {
            iVip += C11522l.vip(7, this.f35431l);
        }
        if ((this.f35423l & 8) == 8) {
            iVip += C11522l.vip(8, this.f35426l);
        }
        if ((this.f35423l & 64) == 64) {
            iVip += C11522l.vip(9, this.f35438l);
        }
        if ((this.f35423l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iVip += C11522l.startapp(10, this.f35422l);
        }
        if ((this.f35423l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            iVip += C11522l.vip(11, this.f35439l);
        }
        if ((this.f35423l & 128) == 128) {
            iVip += C11522l.vip(12, this.f35435l);
        }
        if ((this.f35423l & 1024) == 1024) {
            iVip += C11522l.startapp(13, this.f35432l);
        }
        if ((this.f35423l & 2048) == 2048) {
            iVip += C11522l.vip(14, this.f35427l);
        }
        for (int i3 = 0; i3 < this.f35440l.size(); i3++) {
            iVip += C11522l.startapp(100, (AbstractC14080l) this.f35440l.get(i3));
        }
        int size = this.f35428l.size() + isPro() + iVip;
        this.f35425l = size;
        return size;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f35421l;
    }

    public final boolean startapp() {
        return (this.f35423l & 16) == 16;
    }

    @Override // defpackage.AbstractC14080l
    /* JADX INFO: renamed from: subscription, reason: merged with bridge method [inline-methods] */
    public final C7699l purchase() {
        return ads(this);
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f35429l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f35434l.size(); i++) {
            if (!((C16093l) this.f35434l.get(i)).yandex()) {
                this.f35429l = (byte) 0;
                return false;
            }
        }
        if ((this.f35423l & 4) == 4 && !this.f35424l.yandex()) {
            this.f35429l = (byte) 0;
            return false;
        }
        if ((this.f35423l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 && !this.f35422l.yandex()) {
            this.f35429l = (byte) 0;
            return false;
        }
        if ((this.f35423l & 1024) == 1024 && !this.f35432l.yandex()) {
            this.f35429l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f35440l.size(); i2++) {
            if (!((C7899l) this.f35440l.get(i2)).yandex()) {
                this.f35429l = (byte) 0;
                return false;
            }
        }
        if (subs()) {
            this.f35429l = (byte) 1;
            return true;
        }
        this.f35429l = (byte) 0;
        return false;
    }

    public C18128l() {
        this.f35429l = (byte) -1;
        this.f35425l = -1;
        this.f35428l = AbstractC7735l.f16231l;
    }

    public C18128l(C7699l c7699l) {
        super(c7699l);
        this.f35429l = (byte) -1;
        this.f35425l = -1;
        this.f35428l = c7699l.f5168l;
    }
}
