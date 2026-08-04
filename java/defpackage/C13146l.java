package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13146l extends AbstractC2597l {

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final C13146l f25711l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public static final C2630l f25712l = new C2630l(18);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C15743l f25713l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public List f25714l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public List f25715l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f25716l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C18128l f25717l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public List f25718l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public List f25719l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f25720l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C18426l f25721l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public List f25722l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f25723l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public List f25724l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f25725l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C15743l f25726l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public List f25727l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C18128l f25728l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public List f25729l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f25730l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f25731l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public byte f25732l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public List f25733l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public List f25734l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f25735l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f25736l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f25737l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f25738l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public int f25739l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f25740l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public List f25741l;

    static {
        C13146l c13146l = new C13146l();
        f25711l = c13146l;
        c13146l.startapp();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    public C13146l(C1718l c1718l, C3429l c3429l) throws Throwable {
        C3730l c3730l;
        C3730l c3730l2;
        this.f25738l = -1;
        this.f25732l = (byte) -1;
        this.f25739l = -1;
        startapp();
        C6769l c6769lVip = AbstractC7735l.vip();
        boolean z = true;
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769lVip, 1);
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean z3 = z;
            if (z2) {
                if ((i2 & 32) == 32) {
                    this.f25735l = DesugarCollections.unmodifiableList(this.f25735l);
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                    this.f25734l = DesugarCollections.unmodifiableList(this.f25734l);
                }
                if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                    this.f25715l = DesugarCollections.unmodifiableList(this.f25715l);
                }
                if ((i2 & 65536) == 65536) {
                    this.f25718l = DesugarCollections.unmodifiableList(this.f25718l);
                }
                if ((i2 & 131072) == 131072) {
                    this.f25714l = DesugarCollections.unmodifiableList(this.f25714l);
                }
                if ((i2 & 262144) == 262144) {
                    this.f25741l = DesugarCollections.unmodifiableList(this.f25741l);
                }
                if ((i2 & 1024) == 1024) {
                    this.f25729l = DesugarCollections.unmodifiableList(this.f25729l);
                }
                if ((i2 & 16384) == 16384) {
                    this.f25724l = DesugarCollections.unmodifiableList(this.f25724l);
                }
                if ((i2 & 32768) == 32768) {
                    this.f25719l = DesugarCollections.unmodifiableList(this.f25719l);
                }
                if ((i2 & 524288) == 524288) {
                    this.f25722l = DesugarCollections.unmodifiableList(this.f25722l);
                }
                if ((i2 & 1048576) == 1048576) {
                    this.f25727l = DesugarCollections.unmodifiableList(this.f25727l);
                }
                if ((i2 & 2097152) == 2097152) {
                    this.f25733l = DesugarCollections.unmodifiableList(this.f25733l);
                }
                try {
                    c11522lM3096volatile.signatures();
                } catch (IOException unused) {
                } finally {
                    this.f25723l = c6769lVip.mopub();
                }
                remoteconfig();
                return;
            }
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    switch (iMetrica) {
                        case 0:
                            z2 = z3;
                            z = z3;
                            break;
                        case 8:
                            this.f25716l |= 2;
                            this.f25730l = c1718l.mopub();
                            z = z3;
                            break;
                        case 16:
                            this.f25716l |= 4;
                            this.f25736l = c1718l.mopub();
                            z = z3;
                            break;
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                            C7699l c7699lPurchase = (this.f25716l & 8) == 8 ? this.f25717l.purchase() : null;
                            C18128l c18128l = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                            this.f25717l = c18128l;
                            if (c7699lPurchase != 0) {
                                c7699lPurchase.isPro(c18128l);
                                this.f25717l = c7699lPurchase.admob();
                            }
                            this.f25716l |= 8;
                            z = z3;
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                            if ((i2 & 32) != 32) {
                                this.f25735l = new ArrayList();
                                i2 |= 32;
                            }
                            this.f25735l.add(c1718l.admob(C17586l.f34234l, c3429l));
                            z = z3;
                            break;
                        case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                            C7699l c7699lPurchase2 = (this.f25716l & 32) == 32 ? this.f25728l.purchase() : null;
                            C18128l c18128l2 = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                            this.f25728l = c18128l2;
                            if (c7699lPurchase2 != 0) {
                                c7699lPurchase2.isPro(c18128l2);
                                this.f25728l = c7699lPurchase2.admob();
                            }
                            this.f25716l |= 32;
                            z = z3;
                            break;
                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                            C9259l c9259lStartapp = (this.f25716l & 128) == 128 ? this.f25721l.startapp() : null;
                            C18426l c18426l = (C18426l) c1718l.admob(C18426l.f35981l, c3429l);
                            this.f25721l = c18426l;
                            if (c9259lStartapp != 0) {
                                c9259lStartapp.isPro(c18426l);
                                this.f25721l = c9259lStartapp.admob();
                            }
                            this.f25716l |= 128;
                            z = z3;
                            break;
                        case 56:
                            this.f25716l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            this.f25725l = c1718l.mopub();
                            z = z3;
                            break;
                        case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                            this.f25716l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            this.f25740l = c1718l.mopub();
                            z = z3;
                            break;
                        case 72:
                            this.f25716l |= 16;
                            this.f25720l = c1718l.mopub();
                            z = z3;
                            break;
                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                            this.f25716l |= 64;
                            this.f25737l = c1718l.mopub();
                            z = z3;
                            break;
                        case 88:
                            this.f25716l |= 1;
                            this.f25731l = c1718l.mopub();
                            z = z3;
                            break;
                        case 98:
                            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                                this.f25734l = new ArrayList();
                                i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            }
                            this.f25734l.add(c1718l.admob(C18128l.f35420l, c3429l));
                            z = z3;
                            break;
                        case 104:
                            if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                                this.f25715l = new ArrayList();
                                i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            }
                            this.f25715l.add(Integer.valueOf(c1718l.mopub()));
                            z = z3;
                            break;
                        case 106:
                            int iPurchase = c1718l.purchase(c1718l.smaato());
                            if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 512 && c1718l.crashlytics() > 0) {
                                this.f25715l = new ArrayList();
                                i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                            }
                            while (c1718l.crashlytics() > 0) {
                                this.f25715l.add(Integer.valueOf(c1718l.mopub()));
                            }
                            c1718l.amazon(iPurchase);
                            z = z3;
                            break;
                        case 114:
                            if ((i2 & 65536) != 65536) {
                                this.f25718l = new ArrayList();
                                i2 |= 65536;
                            }
                            this.f25718l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            z = z3;
                            break;
                        case 122:
                            if ((i2 & 131072) != 131072) {
                                this.f25714l = new ArrayList();
                                i2 |= 131072;
                            }
                            this.f25714l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            z = z3;
                            break;
                        case 130:
                            if ((i2 & 262144) != 262144) {
                                this.f25741l = new ArrayList();
                                i2 |= 262144;
                            }
                            this.f25741l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            z = z3;
                            break;
                        case 138:
                            if ((i2 & 1024) != 1024) {
                                this.f25729l = new ArrayList();
                                i2 |= 1024;
                            }
                            this.f25729l.add(c1718l.admob(C18426l.f35981l, c3429l));
                            z = z3;
                            break;
                        case 248:
                            if ((i2 & 16384) != 16384) {
                                this.f25724l = new ArrayList();
                                i2 |= 16384;
                            }
                            this.f25724l.add(Integer.valueOf(c1718l.mopub()));
                            z = z3;
                            break;
                        case 250:
                            int iPurchase2 = c1718l.purchase(c1718l.smaato());
                            if ((i2 & 16384) != 16384 && c1718l.crashlytics() > 0) {
                                this.f25724l = new ArrayList();
                                i2 |= 16384;
                            }
                            while (c1718l.crashlytics() > 0) {
                                this.f25724l.add(Integer.valueOf(c1718l.mopub()));
                            }
                            c1718l.amazon(iPurchase2);
                            z = z3;
                            break;
                        case 258:
                            if ((i2 & 32768) != 32768) {
                                this.f25719l = new ArrayList();
                                i2 |= 32768;
                            }
                            this.f25719l.add(c1718l.admob(C4987l.f10218l, c3429l));
                            z = z3;
                            break;
                        case 266:
                            if ((i2 & 524288) != 524288) {
                                this.f25722l = new ArrayList();
                                i2 |= 524288;
                            }
                            this.f25722l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            z = z3;
                            break;
                        case 274:
                            if ((i2 & 1048576) != 1048576) {
                                this.f25727l = new ArrayList();
                                i2 |= 1048576;
                            }
                            this.f25727l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            z = z3;
                            break;
                        case 282:
                            if ((i2 & 2097152) != 2097152) {
                                this.f25733l = new ArrayList();
                                i2 |= 2097152;
                            }
                            this.f25733l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            z = z3;
                            break;
                        case 322:
                            if ((this.f25716l & 1024) == 1024) {
                                C15743l c15743l = this.f25713l;
                                c15743l.getClass();
                                c3730l2 = new C3730l(i);
                                c3730l2.f7796l = Collections.EMPTY_LIST;
                                c3730l2.firebase(c15743l);
                            } else {
                                c3730l2 = null;
                            }
                            C15743l c15743l2 = (C15743l) c1718l.admob(C15743l.f30920l, c3429l);
                            this.f25713l = c15743l2;
                            if (c3730l2 != null) {
                                c3730l2.firebase(c15743l2);
                                this.f25713l = c3730l2.billing();
                            }
                            this.f25716l |= 1024;
                            z = z3;
                            break;
                        case 330:
                            try {
                                if ((this.f25716l & 2048) == 2048) {
                                    try {
                                        C15743l c15743l3 = this.f25726l;
                                        c15743l3.getClass();
                                        c3730l = new C3730l(i);
                                        c3730l.f7796l = Collections.EMPTY_LIST;
                                        c3730l.firebase(c15743l3);
                                    } catch (C12383l e) {
                                        e = e;
                                        e.yandex(this);
                                        throw e;
                                    } catch (IOException e2) {
                                        e = e2;
                                        C12383l c12383l = new C12383l(e.getMessage());
                                        c12383l.yandex(this);
                                        throw c12383l;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i2 & 32) == 32) {
                                            this.f25735l = DesugarCollections.unmodifiableList(this.f25735l);
                                        }
                                        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                                            this.f25734l = DesugarCollections.unmodifiableList(this.f25734l);
                                        }
                                        if ((i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
                                            this.f25715l = DesugarCollections.unmodifiableList(this.f25715l);
                                        }
                                        if ((i2 & 65536) == 65536) {
                                            this.f25718l = DesugarCollections.unmodifiableList(this.f25718l);
                                        }
                                        if ((i2 & 131072) == 131072) {
                                            this.f25714l = DesugarCollections.unmodifiableList(this.f25714l);
                                        }
                                        if ((i2 & 262144) == 262144) {
                                            this.f25741l = DesugarCollections.unmodifiableList(this.f25741l);
                                        }
                                        if ((i2 & 1024) == 1024) {
                                            this.f25729l = DesugarCollections.unmodifiableList(this.f25729l);
                                        }
                                        if ((i2 & 16384) == 16384) {
                                            this.f25724l = DesugarCollections.unmodifiableList(this.f25724l);
                                        }
                                        if ((i2 & 32768) == 32768) {
                                            this.f25719l = DesugarCollections.unmodifiableList(this.f25719l);
                                        }
                                        if ((i2 & 524288) == 524288) {
                                            this.f25722l = DesugarCollections.unmodifiableList(this.f25722l);
                                        }
                                        if ((i2 & 1048576) == 1048576) {
                                            this.f25727l = DesugarCollections.unmodifiableList(this.f25727l);
                                        }
                                        if ((i2 & 2097152) == 2097152) {
                                            this.f25733l = DesugarCollections.unmodifiableList(this.f25733l);
                                        }
                                        try {
                                            c11522lM3096volatile.signatures();
                                            break;
                                        } catch (IOException unused2) {
                                        } finally {
                                            this.f25723l = c6769lVip.mopub();
                                        }
                                        remoteconfig();
                                        throw th;
                                    }
                                } else {
                                    c3730l = null;
                                }
                                C15743l c15743l4 = (C15743l) c1718l.admob(C15743l.f30920l, c3429l);
                                this.f25726l = c15743l4;
                                if (c3730l != null) {
                                    c3730l.firebase(c15743l4);
                                    this.f25726l = c3730l.billing();
                                }
                                this.f25716l |= 2048;
                                z = z3;
                            } catch (C12383l e3) {
                                e = e3;
                            } catch (IOException e4) {
                                e = e4;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            break;
                        default:
                            if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
                                z2 = z3;
                            }
                            z = z3;
                            break;
                    }
                } catch (C12383l e5) {
                    e = e5;
                } catch (IOException e6) {
                    e = e6;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C7950l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f25716l & 2) == 2) {
            c11522l.m3097abstract(1, this.f25730l);
        }
        if ((this.f25716l & 4) == 4) {
            c11522l.m3097abstract(2, this.f25736l);
        }
        if ((this.f25716l & 8) == 8) {
            c11522l.m3120public(3, this.f25717l);
        }
        for (int i = 0; i < this.f25735l.size(); i++) {
            c11522l.m3120public(4, (AbstractC14080l) this.f25735l.get(i));
        }
        if ((this.f25716l & 32) == 32) {
            c11522l.m3120public(5, this.f25728l);
        }
        if ((this.f25716l & 128) == 128) {
            c11522l.m3120public(6, this.f25721l);
        }
        if ((this.f25716l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c11522l.m3097abstract(7, this.f25725l);
        }
        if ((this.f25716l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            c11522l.m3097abstract(8, this.f25740l);
        }
        if ((this.f25716l & 16) == 16) {
            c11522l.m3097abstract(9, this.f25720l);
        }
        if ((this.f25716l & 64) == 64) {
            c11522l.m3097abstract(10, this.f25737l);
        }
        if ((this.f25716l & 1) == 1) {
            c11522l.m3097abstract(11, this.f25731l);
        }
        for (int i2 = 0; i2 < this.f25734l.size(); i2++) {
            c11522l.m3120public(12, (AbstractC14080l) this.f25734l.get(i2));
        }
        if (this.f25715l.size() > 0) {
            c11522l.m3130while(106);
            c11522l.m3130while(this.f25738l);
        }
        for (int i3 = 0; i3 < this.f25715l.size(); i3++) {
            c11522l.m3113instanceof(((Integer) this.f25715l.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f25718l.size(); i4++) {
            c11522l.m3120public(14, (AbstractC14080l) this.f25718l.get(i4));
        }
        for (int i5 = 0; i5 < this.f25714l.size(); i5++) {
            c11522l.m3120public(15, (AbstractC14080l) this.f25714l.get(i5));
        }
        for (int i6 = 0; i6 < this.f25741l.size(); i6++) {
            c11522l.m3120public(16, (AbstractC14080l) this.f25741l.get(i6));
        }
        for (int i7 = 0; i7 < this.f25729l.size(); i7++) {
            c11522l.m3120public(17, (AbstractC14080l) this.f25729l.get(i7));
        }
        for (int i8 = 0; i8 < this.f25724l.size(); i8++) {
            c11522l.m3097abstract(31, ((Integer) this.f25724l.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.f25719l.size(); i9++) {
            c11522l.m3120public(32, (AbstractC14080l) this.f25719l.get(i9));
        }
        for (int i10 = 0; i10 < this.f25722l.size(); i10++) {
            c11522l.m3120public(33, (AbstractC14080l) this.f25722l.get(i10));
        }
        for (int i11 = 0; i11 < this.f25727l.size(); i11++) {
            c11522l.m3120public(34, (AbstractC14080l) this.f25727l.get(i11));
        }
        for (int i12 = 0; i12 < this.f25733l.size(); i12++) {
            c11522l.m3120public(35, (AbstractC14080l) this.f25733l.get(i12));
        }
        if ((this.f25716l & 1024) == 1024) {
            c11522l.m3120public(40, this.f25713l);
        }
        if ((this.f25716l & 2048) == 2048) {
            c11522l.m3120public(41, this.f25726l);
        }
        c10023l.m2827for(19000, c11522l);
        c11522l.m3129try(this.f25723l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        List list;
        List list2;
        int i = this.f25739l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f25716l & 2) == 2 ? C11522l.vip(1, this.f25730l) : 0;
        if ((this.f25716l & 4) == 4) {
            iVip += C11522l.vip(2, this.f25736l);
        }
        if ((this.f25716l & 8) == 8) {
            iVip += C11522l.startapp(3, this.f25717l);
        }
        for (int i2 = 0; i2 < this.f25735l.size(); i2++) {
            iVip += C11522l.startapp(4, (AbstractC14080l) this.f25735l.get(i2));
        }
        if ((this.f25716l & 32) == 32) {
            iVip += C11522l.startapp(5, this.f25728l);
        }
        if ((this.f25716l & 128) == 128) {
            iVip += C11522l.startapp(6, this.f25721l);
        }
        if ((this.f25716l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iVip += C11522l.vip(7, this.f25725l);
        }
        if ((this.f25716l & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            iVip += C11522l.vip(8, this.f25740l);
        }
        if ((this.f25716l & 16) == 16) {
            iVip += C11522l.vip(9, this.f25720l);
        }
        if ((this.f25716l & 64) == 64) {
            iVip += C11522l.vip(10, this.f25737l);
        }
        if ((this.f25716l & 1) == 1) {
            iVip += C11522l.vip(11, this.f25731l);
        }
        for (int i3 = 0; i3 < this.f25734l.size(); i3++) {
            iVip += C11522l.startapp(12, (AbstractC14080l) this.f25734l.get(i3));
        }
        int i4 = 0;
        int iMetrica = 0;
        while (true) {
            int size = this.f25715l.size();
            list = this.f25715l;
            if (i4 >= size) {
                break;
            }
            iMetrica += C11522l.metrica(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int iStartapp = iVip + iMetrica;
        if (!list.isEmpty()) {
            iStartapp = iStartapp + 1 + C11522l.metrica(iMetrica);
        }
        this.f25738l = iMetrica;
        for (int i5 = 0; i5 < this.f25718l.size(); i5++) {
            iStartapp += C11522l.startapp(14, (AbstractC14080l) this.f25718l.get(i5));
        }
        for (int i6 = 0; i6 < this.f25714l.size(); i6++) {
            iStartapp += C11522l.startapp(15, (AbstractC14080l) this.f25714l.get(i6));
        }
        for (int i7 = 0; i7 < this.f25741l.size(); i7++) {
            iStartapp += C11522l.startapp(16, (AbstractC14080l) this.f25741l.get(i7));
        }
        for (int i8 = 0; i8 < this.f25729l.size(); i8++) {
            iStartapp += C11522l.startapp(17, (AbstractC14080l) this.f25729l.get(i8));
        }
        int i9 = 0;
        int iMetrica2 = 0;
        while (true) {
            int size2 = this.f25724l.size();
            list2 = this.f25724l;
            if (i9 >= size2) {
                break;
            }
            iMetrica2 += C11522l.metrica(((Integer) list2.get(i9)).intValue());
            i9++;
        }
        int size3 = (list2.size() * 2) + iStartapp + iMetrica2;
        for (int i10 = 0; i10 < this.f25719l.size(); i10++) {
            size3 += C11522l.startapp(32, (AbstractC14080l) this.f25719l.get(i10));
        }
        for (int i11 = 0; i11 < this.f25722l.size(); i11++) {
            size3 += C11522l.startapp(33, (AbstractC14080l) this.f25722l.get(i11));
        }
        for (int i12 = 0; i12 < this.f25727l.size(); i12++) {
            size3 += C11522l.startapp(34, (AbstractC14080l) this.f25727l.get(i12));
        }
        for (int i13 = 0; i13 < this.f25733l.size(); i13++) {
            size3 += C11522l.startapp(35, (AbstractC14080l) this.f25733l.get(i13));
        }
        if ((this.f25716l & 1024) == 1024) {
            size3 += C11522l.startapp(40, this.f25713l);
        }
        if ((this.f25716l & 2048) == 2048) {
            size3 += C11522l.startapp(41, this.f25726l);
        }
        int size4 = this.f25723l.size() + isPro() + size3;
        this.f25739l = size4;
        return size4;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f25711l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C7950l c7950lSubs = C7950l.subs();
        c7950lSubs.isPro(this);
        return c7950lSubs;
    }

    public final void startapp() {
        this.f25731l = 518;
        this.f25730l = 2054;
        this.f25736l = 0;
        C18128l c18128l = C18128l.f35421l;
        this.f25717l = c18128l;
        this.f25720l = 0;
        List list = Collections.EMPTY_LIST;
        this.f25735l = list;
        this.f25728l = c18128l;
        this.f25737l = 0;
        this.f25734l = list;
        this.f25715l = list;
        this.f25729l = list;
        this.f25721l = C18426l.f35982l;
        this.f25725l = 0;
        this.f25740l = 0;
        this.f25724l = list;
        this.f25719l = list;
        this.f25718l = list;
        this.f25714l = list;
        this.f25741l = list;
        this.f25722l = list;
        this.f25727l = list;
        this.f25733l = list;
        C15743l c15743l = C15743l.f30919l;
        this.f25713l = c15743l;
        this.f25726l = c15743l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f25732l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f25716l;
        if ((i & 4) != 4) {
            this.f25732l = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.f25717l.yandex()) {
            this.f25732l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f25735l.size(); i2++) {
            if (!((C17586l) this.f25735l.get(i2)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        if ((this.f25716l & 32) == 32 && !this.f25728l.yandex()) {
            this.f25732l = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f25734l.size(); i3++) {
            if (!((C18128l) this.f25734l.get(i3)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f25729l.size(); i4++) {
            if (!((C18426l) this.f25729l.get(i4)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        if ((this.f25716l & 128) == 128 && !this.f25721l.yandex()) {
            this.f25732l = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f25719l.size(); i5++) {
            if (!((C4987l) this.f25719l.get(i5)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f25718l.size(); i6++) {
            if (!((C7899l) this.f25718l.get(i6)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f25714l.size(); i7++) {
            if (!((C7899l) this.f25714l.get(i7)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f25741l.size(); i8++) {
            if (!((C7899l) this.f25741l.get(i8)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f25722l.size(); i9++) {
            if (!((C7899l) this.f25722l.get(i9)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f25727l.size(); i10++) {
            if (!((C7899l) this.f25727l.get(i10)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f25733l.size(); i11++) {
            if (!((C7899l) this.f25733l.get(i11)).yandex()) {
                this.f25732l = (byte) 0;
                return false;
            }
        }
        if ((this.f25716l & 1024) == 1024 && !this.f25713l.yandex()) {
            this.f25732l = (byte) 0;
            return false;
        }
        if ((this.f25716l & 2048) == 2048 && !this.f25726l.yandex()) {
            this.f25732l = (byte) 0;
            return false;
        }
        if (subs()) {
            this.f25732l = (byte) 1;
            return true;
        }
        this.f25732l = (byte) 0;
        return false;
    }

    public C13146l() {
        this.f25738l = -1;
        this.f25732l = (byte) -1;
        this.f25739l = -1;
        this.f25723l = AbstractC7735l.f16231l;
    }

    public C13146l(C7950l c7950l) {
        super(c7950l);
        this.f25738l = -1;
        this.f25732l = (byte) -1;
        this.f25739l = -1;
        this.f25723l = c7950l.f5168l;
    }
}
