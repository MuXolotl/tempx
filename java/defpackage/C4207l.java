package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؖٙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4207l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C4207l f8622l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C2630l f8623l = new C2630l(7);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f8624l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public EnumC16484l f8625l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f8626l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f8627l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f8628l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f8629l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C7899l f8630l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f8631l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public float f8632l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f8633l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f8634l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f8635l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public double f8636l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public List f8637l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public byte f8638l;

    static {
        C4207l c4207l = new C4207l();
        f8622l = c4207l;
        c4207l.subs();
    }

    public C4207l(C1718l c1718l, C3429l c3429l) {
        C10657l c10657l;
        this.f8638l = (byte) -1;
        this.f8631l = -1;
        subs();
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        int i = 0;
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    switch (iMetrica) {
                        case 0:
                            break;
                        case 8:
                            int iSmaato = c1718l.smaato();
                            EnumC16484l enumC16484lLoadAd = EnumC16484l.loadAd(iSmaato);
                            if (enumC16484lLoadAd == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato);
                            } else {
                                this.f8628l |= 1;
                                this.f8625l = enumC16484lLoadAd;
                                continue;
                            }
                            break;
                        case 16:
                            this.f8628l |= 2;
                            long jRemoteconfig = c1718l.remoteconfig();
                            this.f8633l = (-(jRemoteconfig & 1)) ^ (jRemoteconfig >>> 1);
                            continue;
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                            this.f8628l |= 4;
                            this.f8632l = Float.intBitsToFloat(c1718l.isPro());
                            continue;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                            this.f8628l |= 8;
                            this.f8636l = Double.longBitsToDouble(c1718l.firebase());
                            continue;
                        case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                            this.f8628l |= 16;
                            this.f8626l = c1718l.smaato();
                            continue;
                        case 48:
                            this.f8628l |= 32;
                            this.f8627l = c1718l.smaato();
                            continue;
                        case 56:
                            this.f8628l |= 64;
                            this.f8635l = c1718l.smaato();
                            continue;
                        case 66:
                            if ((this.f8628l & 128) == 128) {
                                C7899l c7899l = this.f8630l;
                                c7899l.getClass();
                                c10657l = new C10657l(i);
                                c10657l.f21625l = Collections.EMPTY_LIST;
                                c10657l.isPro(c7899l);
                            } else {
                                c10657l = null;
                            }
                            C7899l c7899l2 = (C7899l) c1718l.admob(C7899l.f16471l, c3429l);
                            this.f8630l = c7899l2;
                            if (c10657l != null) {
                                c10657l.isPro(c7899l2);
                                this.f8630l = c10657l.billing();
                            }
                            this.f8628l |= 128;
                            continue;
                        case 74:
                            if ((c & 256) != 256) {
                                this.f8637l = new ArrayList();
                                c = 256;
                            }
                            this.f8637l.add(c1718l.admob(f8623l, c3429l));
                            continue;
                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                            this.f8628l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            this.f8624l = c1718l.smaato();
                            continue;
                        case 88:
                            this.f8628l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            this.f8634l = c1718l.smaato();
                            continue;
                        default:
                            if (!c1718l.ads(iMetrica, c11522lM3096volatile)) {
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
                if ((c & 256) == 256) {
                    this.f8637l = DesugarCollections.unmodifiableList(this.f8637l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f8629l = c6769l.mopub();
                }
                throw th;
            }
        }
        if ((c & 256) == 256) {
            this.f8637l = DesugarCollections.unmodifiableList(this.f8637l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f8629l = c6769l.mopub();
        }
    }

    public static C13836l isPro(C4207l c4207l) {
        C13836l c13836lAdmob = C13836l.admob();
        c13836lAdmob.subs(c4207l);
        return c13836lAdmob;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C13836l.admob();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f8628l & 1) == 1) {
            c11522l.m3112import(1, this.f8625l.f32226l);
        }
        if ((this.f8628l & 2) == 2) {
            long j = this.f8633l;
            c11522l.m3102const(2, 0);
            c11522l.m3111implements((j >> 63) ^ (j << 1));
        }
        if ((this.f8628l & 4) == 4) {
            float f = this.f8632l;
            c11522l.m3102const(3, 5);
            c11522l.m3128transient(Float.floatToRawIntBits(f));
        }
        if ((this.f8628l & 8) == 8) {
            double d = this.f8636l;
            c11522l.m3102const(4, 1);
            c11522l.m3119protected(Double.doubleToRawLongBits(d));
        }
        if ((this.f8628l & 16) == 16) {
            c11522l.m3097abstract(5, this.f8626l);
        }
        if ((this.f8628l & 32) == 32) {
            c11522l.m3097abstract(6, this.f8627l);
        }
        if ((this.f8628l & 64) == 64) {
            c11522l.m3097abstract(7, this.f8635l);
        }
        if ((this.f8628l & 128) == 128) {
            c11522l.m3120public(8, this.f8630l);
        }
        for (int i = 0; i < this.f8637l.size(); i++) {
            c11522l.m3120public(9, (AbstractC14080l) this.f8637l.get(i));
        }
        if ((this.f8628l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            c11522l.m3097abstract(10, this.f8624l);
        }
        if ((this.f8628l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c11522l.m3097abstract(11, this.f8634l);
        }
        c11522l.m3129try(this.f8629l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f8631l;
        if (i != -1) {
            return i;
        }
        int iRemoteconfig = (this.f8628l & 1) == 1 ? C11522l.remoteconfig(1, this.f8625l.f32226l) : 0;
        if ((this.f8628l & 2) == 2) {
            long j = this.f8633l;
            iRemoteconfig += C11522l.subscription((j >> 63) ^ (j << 1)) + C11522l.tapsense(2);
        }
        if ((this.f8628l & 4) == 4) {
            iRemoteconfig += C11522l.tapsense(3) + 4;
        }
        if ((this.f8628l & 8) == 8) {
            iRemoteconfig += C11522l.tapsense(4) + 8;
        }
        if ((this.f8628l & 16) == 16) {
            iRemoteconfig += C11522l.vip(5, this.f8626l);
        }
        if ((this.f8628l & 32) == 32) {
            iRemoteconfig += C11522l.vip(6, this.f8627l);
        }
        if ((this.f8628l & 64) == 64) {
            iRemoteconfig += C11522l.vip(7, this.f8635l);
        }
        if ((this.f8628l & 128) == 128) {
            iRemoteconfig += C11522l.startapp(8, this.f8630l);
        }
        for (int i2 = 0; i2 < this.f8637l.size(); i2++) {
            iRemoteconfig += C11522l.startapp(9, (AbstractC14080l) this.f8637l.get(i2));
        }
        if ((this.f8628l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            iRemoteconfig += C11522l.vip(10, this.f8624l);
        }
        if ((this.f8628l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iRemoteconfig += C11522l.vip(11, this.f8634l);
        }
        int size = this.f8629l.size() + iRemoteconfig;
        this.f8631l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        return isPro(this);
    }

    public final void subs() {
        this.f8625l = EnumC16484l.BYTE;
        this.f8633l = 0L;
        this.f8632l = 0.0f;
        this.f8636l = 0.0d;
        this.f8626l = 0;
        this.f8627l = 0;
        this.f8635l = 0;
        this.f8630l = C7899l.f16470l;
        this.f8637l = Collections.EMPTY_LIST;
        this.f8634l = 0;
        this.f8624l = 0;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f8638l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f8628l & 128) == 128 && !this.f8630l.yandex()) {
            this.f8638l = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f8637l.size(); i++) {
            if (!((C4207l) this.f8637l.get(i)).yandex()) {
                this.f8638l = (byte) 0;
                return false;
            }
        }
        this.f8638l = (byte) 1;
        return true;
    }

    public C4207l() {
        this.f8638l = (byte) -1;
        this.f8631l = -1;
        this.f8629l = AbstractC7735l.f16231l;
    }

    public C4207l(C13836l c13836l) {
        this.f8638l = (byte) -1;
        this.f8631l = -1;
        this.f8629l = c13836l.f5168l;
    }
}
