package defpackage;

import j$.util.Objects;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lۣٗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17363l implements InterfaceC14833l {
    public boolean Signature;
    public long ad;
    public int adcel;
    public final ArrayDeque admob;
    public int ads;
    public boolean advert;
    public final C13143l amazon;
    public C3614l[] applovin;
    public long[][] appmetrica;
    public final C13143l billing;
    public final boolean crashlytics;
    public C13708l firebase;
    public int inmobi;
    public final ArrayList isPro;
    public boolean isVip;
    public boolean license;
    public final int loadAd;
    public int metrica;
    public final C13143l mopub;
    public InterfaceC2053l premium;
    public boolean pro;
    public final C13143l purchase;
    public int remoteconfig;
    public long signatures;
    public int smaato;
    public C13143l startapp;
    public final C12252l subs;
    public int subscription;
    public int tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public C16542l f33830throws;
    public long vip;
    public final InterfaceC5304l yandex;

    public C17363l(InterfaceC5304l interfaceC5304l, int i) {
        this.yandex = interfaceC5304l;
        this.loadAd = i;
        this.crashlytics = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        C9258l c9258l = AbstractC1186l.f3181l;
        this.firebase = C13708l.f26763l;
        this.smaato = (i & 4) != 0 ? 3 : 0;
        this.subs = new C12252l();
        this.isPro = new ArrayList();
        this.mopub = new C13143l(16);
        this.admob = new ArrayDeque();
        this.amazon = new C13143l(AbstractC16763l.yandex);
        this.purchase = new C13143l(6);
        this.billing = new C13143l();
        this.adcel = -1;
        this.premium = InterfaceC2053l.pro;
        this.applovin = new C3614l[0];
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.admob.clear();
        this.metrica = 0;
        this.adcel = -1;
        this.ads = 0;
        this.subscription = 0;
        this.tapsense = 0;
        this.Signature = false;
        this.isVip = false;
        if (j == 0) {
            if (this.smaato != 3) {
                this.smaato = 0;
                this.metrica = 0;
                return;
            } else {
                C12252l c12252l = this.subs;
                c12252l.yandex.clear();
                c12252l.loadAd = 0;
                this.isPro.clear();
                return;
            }
        }
        for (C3614l c3614l : this.applovin) {
            C9267l c9267l = c3614l.loadAd;
            int iYandex = c9267l.yandex(j2);
            if (iYandex == -1) {
                iYandex = c9267l.loadAd(j2);
            }
            c3614l.purchase = iYandex;
            C3964l c3964l = c3614l.amazon;
            if (c3964l != null) {
                c3964l.loadAd = false;
                c3964l.crashlytics = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        if ((this.loadAd & 16) == 0) {
            interfaceC2053l = new C11919l(interfaceC2053l, this.yandex);
        }
        this.premium = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        C13708l c13708lIsVip;
        InterfaceC10110l interfaceC10110lMopub = AbstractC11790l.mopub(interfaceC10430l, false, (this.loadAd & 2) != 0);
        if (interfaceC10110lMopub != null) {
            c13708lIsVip = AbstractC1186l.isVip(interfaceC10110lMopub);
        } else {
            C9258l c9258l = AbstractC1186l.f3181l;
            c13708lIsVip = C13708l.f26763l;
        }
        this.firebase = c13708lIsVip;
        return interfaceC10110lMopub == null;
    }

    /* JADX WARN: Code duplicated, block: B:277:0x0561  */
    /* JADX WARN: Code duplicated, block: B:282:0x0576  */
    /* JADX WARN: Code duplicated, block: B:303:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:304:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:306:0x0602  */
    /* JADX WARN: Code duplicated, block: B:313:0x0618  */
    /* JADX WARN: Code duplicated, block: B:316:0x062c  */
    /* JADX WARN: Code duplicated, block: B:338:0x066b  */
    /* JADX WARN: Code duplicated, block: B:390:0x0736  */
    /* JADX WARN: Code duplicated, block: B:395:0x0763  */
    /* JADX WARN: Code duplicated, block: B:396:0x0767  */
    /* JADX WARN: Code duplicated, block: B:406:0x0579 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x016a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int iSmaato;
        int i4;
        C13143l c13143l;
        int i5;
        char c3;
        int i6;
        ArrayList arrayList;
        List listPurchase;
        int i7;
        List listPurchase2;
        boolean z;
        boolean z2;
        int i8;
        long j;
        long length;
        C11311l c11311l;
        long j2;
        long j3;
        int i9;
        boolean z3;
        long j4;
        long j5;
        long j6;
        boolean z4;
        if (!this.crashlytics || !this.isVip) {
            while (true) {
                int i10 = this.smaato;
                ArrayDeque arrayDeque = this.admob;
                int i11 = this.loadAd;
                C13143l c13143l2 = this.billing;
                int i12 = 4;
                int i13 = 0;
                char c4 = 2;
                if (i10 == 0) {
                    int i14 = this.metrica;
                    C13143l c13143l3 = this.mopub;
                    if (i14 != 0) {
                        j = this.vip;
                        if (j == 1) {
                            interfaceC10430l.readFully(c13143l3.yandex, 8, 8);
                            this.metrica += 8;
                            this.vip = c13143l3.m3564package();
                        } else if (j == 0) {
                            length = interfaceC10430l.getLength();
                            if (length == -1 && (c11311l = (C11311l) arrayDeque.peek()) != null) {
                                length = c11311l.f22798l;
                            }
                            if (length != -1) {
                                this.vip = (length - interfaceC10430l.getPosition()) + ((long) this.metrica);
                            }
                        }
                        j2 = this.vip;
                        int i15 = this.metrica;
                        j3 = i15;
                        if (j2 < j3) {
                            if (this.remoteconfig == 1718773093 || i15 != 8) {
                                throw C17655l.crashlytics("Atom size less than header length (unsupported).");
                            }
                            this.vip = j3;
                        }
                        i9 = this.remoteconfig;
                        if (i9 != 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1701082227 || i9 == 1835365473 || i9 == 1635284069) {
                            z3 = true;
                            long position = interfaceC10430l.getPosition();
                            j4 = this.vip;
                            j5 = this.metrica;
                            j6 = (position + j4) - j5;
                            if (j4 != j5 && this.remoteconfig == 1835365473) {
                                c13143l2.m3563native(8);
                                interfaceC10430l.yandex(0, 8, c13143l2.yandex);
                                AbstractC2686l.yandex(c13143l2);
                                interfaceC10430l.remoteconfig(c13143l2.loadAd);
                                interfaceC10430l.smaato();
                            }
                            arrayDeque.push(new C11311l(this.remoteconfig, j6));
                            if (this.vip == this.metrica) {
                                mopub(j6);
                            } else {
                                this.smaato = 0;
                                this.metrica = 0;
                            }
                        } else if (i9 == 1835296868 || i9 == 1836476516 || i9 == 1751411826 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1937011571 || i9 == 1668576371 || i9 == 1701606260 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1953196132 || i9 == 1718909296 || i9 == 1969517665 || i9 == 1801812339 || i9 == 1768715124) {
                            AbstractC12442l.subscription(i15 == 8);
                            AbstractC12442l.subscription(this.vip <= 2147483647L);
                            C13143l c13143l4 = new C13143l((int) this.vip);
                            System.arraycopy(c13143l3.yandex, 0, c13143l4.yandex, 0, 8);
                            this.startapp = c13143l4;
                            z3 = true;
                            this.smaato = 1;
                        } else {
                            long position2 = interfaceC10430l.getPosition();
                            long j7 = this.metrica;
                            long j8 = position2 - j7;
                            if (this.remoteconfig == 1836086884) {
                                this.f33830throws = new C16542l(0L, j8, -9223372036854775807L, j8 + j7, this.vip - j7);
                            }
                            this.startapp = null;
                            this.smaato = 1;
                            z3 = true;
                        }
                        z4 = z3;
                    } else if (interfaceC10430l.loadAd(c13143l3.yandex, 0, 8, true)) {
                        this.metrica = 8;
                        c13143l3.m3562for(0);
                        this.vip = c13143l3.applovin();
                        this.remoteconfig = c13143l3.remoteconfig();
                        j = this.vip;
                        if (j == 1) {
                            interfaceC10430l.readFully(c13143l3.yandex, 8, 8);
                            this.metrica += 8;
                            this.vip = c13143l3.m3564package();
                        } else if (j == 0) {
                            length = interfaceC10430l.getLength();
                            if (length == -1) {
                                length = c11311l.f22798l;
                            }
                            if (length != -1) {
                                this.vip = (length - interfaceC10430l.getPosition()) + ((long) this.metrica);
                            }
                        }
                        j2 = this.vip;
                        int i16 = this.metrica;
                        j3 = i16;
                        if (j2 < j3) {
                            if (this.remoteconfig == 1718773093) {
                            }
                            throw C17655l.crashlytics("Atom size less than header length (unsupported).");
                        }
                        i9 = this.remoteconfig;
                        if (i9 != 1836019574) {
                            z3 = true;
                            long position3 = interfaceC10430l.getPosition();
                            j4 = this.vip;
                            j5 = this.metrica;
                            j6 = (position3 + j4) - j5;
                            if (j4 != j5) {
                                c13143l2.m3563native(8);
                                interfaceC10430l.yandex(0, 8, c13143l2.yandex);
                                AbstractC2686l.yandex(c13143l2);
                                interfaceC10430l.remoteconfig(c13143l2.loadAd);
                                interfaceC10430l.smaato();
                            }
                            arrayDeque.push(new C11311l(this.remoteconfig, j6));
                            if (this.vip == this.metrica) {
                                mopub(j6);
                            } else {
                                this.smaato = 0;
                                this.metrica = 0;
                            }
                        } else {
                            z3 = true;
                            long position4 = interfaceC10430l.getPosition();
                            j4 = this.vip;
                            j5 = this.metrica;
                            j6 = (position4 + j4) - j5;
                            if (j4 != j5) {
                                c13143l2.m3563native(8);
                                interfaceC10430l.yandex(0, 8, c13143l2.yandex);
                                AbstractC2686l.yandex(c13143l2);
                                interfaceC10430l.remoteconfig(c13143l2.loadAd);
                                interfaceC10430l.smaato();
                            }
                            arrayDeque.push(new C11311l(this.remoteconfig, j6));
                            if (this.vip == this.metrica) {
                                mopub(j6);
                            } else {
                                this.smaato = 0;
                                this.metrica = 0;
                            }
                        }
                        z4 = z3;
                    } else {
                        if (this.inmobi == 2 && (i11 & 2) != 0) {
                            InterfaceC8979l interfaceC8979lStartapp = this.premium.startapp(0, 4);
                            C16542l c16542l = this.f33830throws;
                            C7417l c7417l = c16542l == null ? null : new C7417l(c16542l);
                            C12984l c12984l = new C12984l();
                            c12984l.firebase = c7417l;
                            AbstractC9029l.license(c12984l, interfaceC8979lStartapp);
                            this.premium.firebase();
                            this.premium.tapsense(new C9828l(-9223372036854775807L));
                        }
                        z4 = false;
                    }
                    if (!z4) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            long position5 = interfaceC10430l.getPosition();
                            if (this.adcel == -1) {
                                boolean z5 = true;
                                int i17 = 0;
                                int i18 = -1;
                                int i19 = -1;
                                boolean z6 = true;
                                long j9 = Long.MAX_VALUE;
                                long j10 = Long.MAX_VALUE;
                                long j11 = Long.MAX_VALUE;
                                while (true) {
                                    C3614l[] c3614lArr = this.applovin;
                                    if (i17 >= c3614lArr.length) {
                                        break;
                                    }
                                    C3614l c3614l = c3614lArr[i17];
                                    int i20 = c3614l.purchase;
                                    C9267l c9267l = c3614l.loadAd;
                                    char c5 = c4;
                                    if (i20 != c9267l.loadAd) {
                                        long j12 = c9267l.crashlytics[i20];
                                        long[][] jArr = this.appmetrica;
                                        jArr.getClass();
                                        long j13 = jArr[i17][i20];
                                        long j14 = j12 - position5;
                                        boolean z7 = j14 < 0 || j14 >= 262144;
                                        if ((!z7 && z5) || (z7 == z5 && j14 < j11)) {
                                            z5 = z7;
                                            i19 = i17;
                                            j11 = j14;
                                            j10 = j13;
                                        }
                                        if (j13 < j9) {
                                            z6 = z7;
                                            i18 = i17;
                                            j9 = j13;
                                        }
                                    }
                                    i17++;
                                    c4 = c5;
                                }
                                c = c4;
                                if (j9 == Long.MAX_VALUE || !z6 || j10 < j9 + 10485760) {
                                    i18 = i19;
                                }
                                this.adcel = i18;
                                if (i18 == -1) {
                                    return -1;
                                }
                            } else {
                                c = 2;
                            }
                            C3614l c3614l2 = this.applovin[this.adcel];
                            InterfaceC8979l interfaceC8979l = c3614l2.crashlytics;
                            C9267l c9267l2 = c3614l2.loadAd;
                            C11436l c11436l = c3614l2.yandex;
                            int i21 = c3614l2.purchase;
                            long[] jArr2 = c9267l2.crashlytics;
                            int[] iArr = c9267l2.amazon;
                            long j15 = jArr2[i21] + this.signatures;
                            int i22 = iArr[i21];
                            C3964l c3964l = c3614l2.amazon;
                            long j16 = (j15 - position5) + ((long) this.ads);
                            if (j16 < 0 || j16 >= 262144) {
                                c1014l.f2761l = j15;
                                return 1;
                            }
                            int i23 = c11436l.admob;
                            int i24 = c11436l.firebase;
                            C5978l c5978l = c11436l.mopub;
                            if (i23 == 1) {
                                j16 += 8;
                                i22 -= 8;
                            }
                            int i25 = i22;
                            interfaceC10430l.remoteconfig((int) j16);
                            String str = c5978l.metrica;
                            String str2 = c5978l.metrica;
                            if (!Objects.equals(str, "video/avc") ? !(!Objects.equals(str2, "video/hevc") || (i11 & 128) == 0) : (i11 & 32) != 0) {
                                c2 = 1;
                                this.Signature = true;
                            } else {
                                c2 = 1;
                            }
                            if (i24 != 0) {
                                C13143l c13143l5 = this.purchase;
                                byte[] bArr = c13143l5.yandex;
                                bArr[0] = 0;
                                bArr[c2] = 0;
                                bArr[c] = 0;
                                int i26 = 4 - i24;
                                int i27 = i25 + i26;
                                while (this.subscription < i27) {
                                    int i28 = this.tapsense;
                                    if (i28 == 0) {
                                        if (this.Signature || AbstractC16763l.smaato(c5978l) + i24 > iArr[i21] - this.ads) {
                                            i3 = i24;
                                            iSmaato = 0;
                                        } else {
                                            iSmaato = AbstractC16763l.smaato(c5978l);
                                            i3 = i24 + iSmaato;
                                        }
                                        interfaceC10430l.readFully(bArr, i26, i3);
                                        i2 = i27;
                                        this.ads += i3;
                                        c13143l5.m3562for(0);
                                        int iRemoteconfig = c13143l5.remoteconfig();
                                        if (iRemoteconfig < 0) {
                                            throw C17655l.yandex(null, "Invalid NAL length");
                                        }
                                        this.tapsense = iRemoteconfig - iSmaato;
                                        C13143l c13143l6 = this.amazon;
                                        c13143l6.m3562for(0);
                                        int i29 = iSmaato;
                                        interfaceC8979l.purchase(4, c13143l6);
                                        this.subscription += 4;
                                        if (i29 > 0) {
                                            interfaceC8979l.purchase(i29, c13143l5);
                                            this.subscription += i29;
                                            if (AbstractC16763l.isPro(bArr, i29, c5978l)) {
                                                this.Signature = true;
                                            }
                                        }
                                    } else {
                                        i2 = i27;
                                        int iBilling = interfaceC8979l.billing(interfaceC10430l, i28, false);
                                        this.ads += iBilling;
                                        this.subscription += iBilling;
                                        this.tapsense -= iBilling;
                                    }
                                    i27 = i2;
                                }
                                i = i27;
                            } else {
                                if ("audio/ac4".equals(str2)) {
                                    if (this.subscription == 0) {
                                        AbstractC13693l.amazon(i25, c13143l2);
                                        interfaceC8979l.purchase(7, c13143l2);
                                        this.subscription += 7;
                                    }
                                    i25 += 7;
                                } else if (c3614l2.billing != null && Objects.equals(str2, "audio/mpeg")) {
                                    C5978l c5978l2 = c3614l2.billing;
                                    c13143l2.m3563native(4);
                                    interfaceC10430l.yandex(0, 4, c13143l2.yandex);
                                    interfaceC10430l.smaato();
                                    C9892l c9892l = new C9892l();
                                    InterfaceC8979l interfaceC8979l2 = c3614l2.crashlytics;
                                    if (c9892l.yandex(c13143l2.remoteconfig()) && !Objects.equals(c5978l2.metrica, (String) c9892l.mopub)) {
                                        C12984l c12984lYandex = c5978l2.yandex();
                                        String str3 = (String) c9892l.mopub;
                                        str3.getClass();
                                        c12984lYandex.vip = AbstractC3825l.vip(str3);
                                        c5978l2 = new C5978l(c12984lYandex);
                                    }
                                    interfaceC8979l2.mopub(c5978l2);
                                    c3614l2.billing = null;
                                } else if (c3964l != null) {
                                    c3964l.crashlytics(interfaceC10430l);
                                }
                                while (true) {
                                    int i30 = this.subscription;
                                    if (i30 >= i25) {
                                        break;
                                    }
                                    int iBilling2 = interfaceC8979l.billing(interfaceC10430l, i25 - i30, false);
                                    this.ads += iBilling2;
                                    this.subscription += iBilling2;
                                    this.tapsense -= iBilling2;
                                }
                                i = i25;
                            }
                            long j17 = c9267l2.billing[i21];
                            int i31 = c9267l2.mopub[i21];
                            if (!this.Signature) {
                                i31 |= 67108864;
                            }
                            int i32 = i31;
                            if (c3964l != null) {
                                c3964l.loadAd(interfaceC8979l, j17, i32, i, 0, null);
                                if (i21 + 1 == c9267l2.loadAd) {
                                    c3964l.yandex(interfaceC8979l, null);
                                }
                            } else {
                                interfaceC8979l.yandex(j17, i32, i, 0, null);
                            }
                            c3614l2.purchase++;
                            this.adcel = -1;
                            this.ads = 0;
                            this.subscription = 0;
                            this.tapsense = 0;
                            this.Signature = false;
                            return 0;
                        }
                        if (i10 != 3) {
                            C18073l.admob();
                            return 0;
                        }
                        C12252l c12252l = this.subs;
                        ArrayList arrayList2 = c12252l.yandex;
                        int i33 = c12252l.loadAd;
                        if (i33 != 0) {
                            if (i33 != 1) {
                                short s = 2817;
                                short s2 = 2816;
                                short s3 = 2192;
                                if (i33 == 2) {
                                    long length2 = interfaceC10430l.getLength();
                                    int i34 = c12252l.crashlytics - 20;
                                    C13143l c13143l7 = new C13143l(i34);
                                    interfaceC10430l.readFully(c13143l7.yandex, 0, i34);
                                    int i35 = 0;
                                    while (i35 < i34 / 12) {
                                        c13143l7.m3568throw(2);
                                        short sAdcel = c13143l7.adcel();
                                        if (sAdcel != s3 && sAdcel != s2 && sAdcel != s && sAdcel != 2819) {
                                            if (sAdcel != 2820) {
                                                c13143l7.m3568throw(8);
                                                c13143l = c13143l7;
                                            }
                                            i35++;
                                            c13143l7 = c13143l;
                                            s = 2817;
                                            s3 = 2192;
                                            s2 = 2816;
                                        }
                                        c13143l = c13143l7;
                                        arrayList2.add(new C13121l((length2 - ((long) c12252l.crashlytics)) - ((long) c13143l7.metrica()), c13143l.metrica()));
                                        i35++;
                                        c13143l7 = c13143l;
                                        s = 2817;
                                        s3 = 2192;
                                        s2 = 2816;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        c1014l.f2761l = 0L;
                                    } else {
                                        c12252l.loadAd = 3;
                                        c1014l.f2761l = ((C13121l) arrayList2.get(0)).yandex;
                                    }
                                } else {
                                    if (i33 != 3) {
                                        C18073l.admob();
                                        return 0;
                                    }
                                    long position6 = interfaceC10430l.getPosition();
                                    int length3 = (int) ((interfaceC10430l.getLength() - interfaceC10430l.getPosition()) - ((long) c12252l.crashlytics));
                                    C13143l c13143l8 = new C13143l(length3);
                                    interfaceC10430l.readFully(c13143l8.yandex, 0, length3);
                                    int i36 = 0;
                                    while (i36 < arrayList2.size()) {
                                        C13121l c13121l = (C13121l) arrayList2.get(i36);
                                        int i37 = i13;
                                        c13143l8.m3562for((int) (c13121l.yandex - position6));
                                        c13143l8.m3568throw(i12);
                                        int iMetrica = c13143l8.metrica();
                                        Charset charset = StandardCharsets.UTF_8;
                                        int i38 = i37;
                                        String strAdvert = c13143l8.advert(iMetrica, charset);
                                        switch (strAdvert.hashCode()) {
                                            case -1711564334:
                                                if (strAdvert.equals("SlowMotion_Data")) {
                                                    i5 = i38;
                                                }
                                                switch (i5) {
                                                    case 0:
                                                        c3 = 2192;
                                                        break;
                                                    case 1:
                                                        c3 = 2819;
                                                        break;
                                                    case 2:
                                                        c3 = 2816;
                                                        break;
                                                    case 3:
                                                        c3 = 2820;
                                                        break;
                                                    case 4:
                                                        c3 = 2817;
                                                        break;
                                                    default:
                                                        throw C17655l.yandex(null, "Invalid SEF name");
                                                }
                                                i6 = c13121l.loadAd - (iMetrica + 8);
                                                if (c3 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listPurchase = C12252l.purchase.purchase(c13143l8.advert(i6, charset));
                                                    i7 = i38;
                                                    while (i7 < listPurchase.size()) {
                                                        listPurchase2 = C12252l.amazon.purchase((CharSequence) listPurchase.get(i7));
                                                        if (listPurchase2.size() == 3) {
                                                            throw C17655l.yandex(null, null);
                                                        }
                                                        try {
                                                            arrayList.add(new C1327l(1 << (Integer.parseInt((String) listPurchase2.get(2)) - 1), Long.parseLong((String) listPurchase2.get(i38)), Long.parseLong((String) listPurchase2.get(1))));
                                                            i7++;
                                                            i38 = 0;
                                                        } catch (NumberFormatException e) {
                                                            throw C17655l.yandex(e, null);
                                                        }
                                                    }
                                                    this.isPro.add(new C1319l(arrayList));
                                                } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                                    C18073l.admob();
                                                    return i38;
                                                }
                                                i36++;
                                                i13 = 0;
                                                i12 = 4;
                                                break;
                                            case -1332107749:
                                                if (strAdvert.equals("Super_SlowMotion_Edit_Data")) {
                                                    i5 = 1;
                                                }
                                                switch (i5) {
                                                    case 0:
                                                        c3 = 2192;
                                                        break;
                                                    case 1:
                                                        c3 = 2819;
                                                        break;
                                                    case 2:
                                                        c3 = 2816;
                                                        break;
                                                    case 3:
                                                        c3 = 2820;
                                                        break;
                                                    case 4:
                                                        c3 = 2817;
                                                        break;
                                                    default:
                                                        throw C17655l.yandex(null, "Invalid SEF name");
                                                }
                                                i6 = c13121l.loadAd - (iMetrica + 8);
                                                if (c3 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listPurchase = C12252l.purchase.purchase(c13143l8.advert(i6, charset));
                                                    i7 = i38;
                                                    while (i7 < listPurchase.size()) {
                                                        listPurchase2 = C12252l.amazon.purchase((CharSequence) listPurchase.get(i7));
                                                        if (listPurchase2.size() == 3) {
                                                            throw C17655l.yandex(null, null);
                                                        }
                                                        arrayList.add(new C1327l(1 << (Integer.parseInt((String) listPurchase2.get(2)) - 1), Long.parseLong((String) listPurchase2.get(i38)), Long.parseLong((String) listPurchase2.get(1))));
                                                        i7++;
                                                        i38 = 0;
                                                    }
                                                    this.isPro.add(new C1319l(arrayList));
                                                } else if (c3 != 2816) {
                                                    continue;
                                                }
                                                i36++;
                                                i13 = 0;
                                                i12 = 4;
                                                break;
                                            case -1251387154:
                                                if (strAdvert.equals("Super_SlowMotion_Data")) {
                                                    i5 = 2;
                                                }
                                                switch (i5) {
                                                    case 0:
                                                        c3 = 2192;
                                                        break;
                                                    case 1:
                                                        c3 = 2819;
                                                        break;
                                                    case 2:
                                                        c3 = 2816;
                                                        break;
                                                    case 3:
                                                        c3 = 2820;
                                                        break;
                                                    case 4:
                                                        c3 = 2817;
                                                        break;
                                                    default:
                                                        throw C17655l.yandex(null, "Invalid SEF name");
                                                }
                                                i6 = c13121l.loadAd - (iMetrica + 8);
                                                if (c3 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listPurchase = C12252l.purchase.purchase(c13143l8.advert(i6, charset));
                                                    i7 = i38;
                                                    while (i7 < listPurchase.size()) {
                                                        listPurchase2 = C12252l.amazon.purchase((CharSequence) listPurchase.get(i7));
                                                        if (listPurchase2.size() == 3) {
                                                            throw C17655l.yandex(null, null);
                                                        }
                                                        arrayList.add(new C1327l(1 << (Integer.parseInt((String) listPurchase2.get(2)) - 1), Long.parseLong((String) listPurchase2.get(i38)), Long.parseLong((String) listPurchase2.get(1))));
                                                        i7++;
                                                        i38 = 0;
                                                    }
                                                    this.isPro.add(new C1319l(arrayList));
                                                } else if (c3 != 2816) {
                                                    continue;
                                                }
                                                i36++;
                                                i13 = 0;
                                                i12 = 4;
                                                break;
                                            case -830665521:
                                                if (strAdvert.equals("Super_SlowMotion_Deflickering_On")) {
                                                    i5 = 3;
                                                }
                                                switch (i5) {
                                                    case 0:
                                                        c3 = 2192;
                                                        break;
                                                    case 1:
                                                        c3 = 2819;
                                                        break;
                                                    case 2:
                                                        c3 = 2816;
                                                        break;
                                                    case 3:
                                                        c3 = 2820;
                                                        break;
                                                    case 4:
                                                        c3 = 2817;
                                                        break;
                                                    default:
                                                        throw C17655l.yandex(null, "Invalid SEF name");
                                                }
                                                i6 = c13121l.loadAd - (iMetrica + 8);
                                                if (c3 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listPurchase = C12252l.purchase.purchase(c13143l8.advert(i6, charset));
                                                    i7 = i38;
                                                    while (i7 < listPurchase.size()) {
                                                        listPurchase2 = C12252l.amazon.purchase((CharSequence) listPurchase.get(i7));
                                                        if (listPurchase2.size() == 3) {
                                                            throw C17655l.yandex(null, null);
                                                        }
                                                        arrayList.add(new C1327l(1 << (Integer.parseInt((String) listPurchase2.get(2)) - 1), Long.parseLong((String) listPurchase2.get(i38)), Long.parseLong((String) listPurchase2.get(1))));
                                                        i7++;
                                                        i38 = 0;
                                                    }
                                                    this.isPro.add(new C1319l(arrayList));
                                                } else if (c3 != 2816) {
                                                    continue;
                                                }
                                                i36++;
                                                i13 = 0;
                                                i12 = 4;
                                                break;
                                            case 1760745220:
                                                if (strAdvert.equals("Super_SlowMotion_BGM")) {
                                                    i5 = 4;
                                                }
                                                switch (i5) {
                                                    case 0:
                                                        c3 = 2192;
                                                        break;
                                                    case 1:
                                                        c3 = 2819;
                                                        break;
                                                    case 2:
                                                        c3 = 2816;
                                                        break;
                                                    case 3:
                                                        c3 = 2820;
                                                        break;
                                                    case 4:
                                                        c3 = 2817;
                                                        break;
                                                    default:
                                                        throw C17655l.yandex(null, "Invalid SEF name");
                                                }
                                                i6 = c13121l.loadAd - (iMetrica + 8);
                                                if (c3 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listPurchase = C12252l.purchase.purchase(c13143l8.advert(i6, charset));
                                                    i7 = i38;
                                                    while (i7 < listPurchase.size()) {
                                                        listPurchase2 = C12252l.amazon.purchase((CharSequence) listPurchase.get(i7));
                                                        if (listPurchase2.size() == 3) {
                                                            throw C17655l.yandex(null, null);
                                                        }
                                                        arrayList.add(new C1327l(1 << (Integer.parseInt((String) listPurchase2.get(2)) - 1), Long.parseLong((String) listPurchase2.get(i38)), Long.parseLong((String) listPurchase2.get(1))));
                                                        i7++;
                                                        i38 = 0;
                                                    }
                                                    this.isPro.add(new C1319l(arrayList));
                                                } else if (c3 != 2816) {
                                                    continue;
                                                }
                                                i36++;
                                                i13 = 0;
                                                i12 = 4;
                                                break;
                                        }
                                        i5 = -1;
                                        switch (i5) {
                                            case 0:
                                                c3 = 2192;
                                                break;
                                            case 1:
                                                c3 = 2819;
                                                break;
                                            case 2:
                                                c3 = 2816;
                                                break;
                                            case 3:
                                                c3 = 2820;
                                                break;
                                            case 4:
                                                c3 = 2817;
                                                break;
                                            default:
                                                throw C17655l.yandex(null, "Invalid SEF name");
                                        }
                                        i6 = c13121l.loadAd - (iMetrica + 8);
                                        if (c3 != 2192) {
                                            arrayList = new ArrayList();
                                            listPurchase = C12252l.purchase.purchase(c13143l8.advert(i6, charset));
                                            i7 = i38;
                                            while (i7 < listPurchase.size()) {
                                                listPurchase2 = C12252l.amazon.purchase((CharSequence) listPurchase.get(i7));
                                                if (listPurchase2.size() == 3) {
                                                    throw C17655l.yandex(null, null);
                                                }
                                                arrayList.add(new C1327l(1 << (Integer.parseInt((String) listPurchase2.get(2)) - 1), Long.parseLong((String) listPurchase2.get(i38)), Long.parseLong((String) listPurchase2.get(1))));
                                                i7++;
                                                i38 = 0;
                                            }
                                            this.isPro.add(new C1319l(arrayList));
                                        } else if (c3 != 2816) {
                                            continue;
                                        }
                                        i36++;
                                        i13 = 0;
                                        i12 = 4;
                                    }
                                    c1014l.f2761l = 0L;
                                }
                            } else {
                                C13143l c13143l9 = new C13143l(8);
                                interfaceC10430l.readFully(c13143l9.yandex, 0, 8);
                                c12252l.crashlytics = c13143l9.metrica() + 8;
                                if (c13143l9.remoteconfig() != 1397048916) {
                                    c1014l.f2761l = 0L;
                                } else {
                                    c1014l.f2761l = interfaceC10430l.getPosition() - ((long) (c12252l.crashlytics - 12));
                                    c12252l.loadAd = 2;
                                }
                            }
                            i4 = 1;
                        } else {
                            long length4 = interfaceC10430l.getLength();
                            c1014l.f2761l = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                            i4 = 1;
                            c12252l.loadAd = 1;
                        }
                        if (c1014l.f2761l != 0) {
                            return i4;
                        }
                        this.smaato = 0;
                        this.metrica = 0;
                        return i4;
                    }
                    long j18 = this.vip - ((long) this.metrica);
                    long position7 = interfaceC10430l.getPosition() + j18;
                    C13143l c13143l10 = this.startapp;
                    if (c13143l10 != null) {
                        interfaceC10430l.readFully(c13143l10.yandex, this.metrica, (int) j18);
                        if (this.remoteconfig == 1718909296) {
                            this.license = true;
                            c13143l10.m3562for(8);
                            int iRemoteconfig2 = c13143l10.remoteconfig();
                            if (iRemoteconfig2 != 1751476579) {
                                i8 = iRemoteconfig2 != 1903435808 ? 0 : 1;
                            } else {
                                i8 = 2;
                            }
                            if (i8 == 0) {
                                c13143l10.m3568throw(4);
                                do {
                                    if (c13143l10.yandex() <= 0) {
                                        i8 = 0;
                                        break;
                                    }
                                    int iRemoteconfig3 = c13143l10.remoteconfig();
                                    if (iRemoteconfig3 != 1751476579) {
                                        i8 = iRemoteconfig3 != 1903435808 ? 0 : 1;
                                    } else {
                                        i8 = 2;
                                    }
                                } while (i8 == 0);
                            }
                            this.inmobi = i8;
                        } else if (!arrayDeque.isEmpty()) {
                            ((C11311l) arrayDeque.peek()).f22800l.add(new C16792l(this.remoteconfig, c13143l10));
                        }
                    } else {
                        if (!this.license && this.remoteconfig == 1835295092) {
                            this.inmobi = 1;
                        }
                        if (j18 < 262144) {
                            interfaceC10430l.remoteconfig((int) j18);
                        } else {
                            c1014l.f2761l = interfaceC10430l.getPosition() + j18;
                            z = true;
                        }
                        mopub(position7);
                        if (this.pro) {
                            this.advert = true;
                            c1014l.f2761l = this.ad;
                            this.pro = false;
                            z = true;
                        }
                        if (z || this.smaato == 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            return 1;
                        }
                    }
                    z = false;
                    mopub(position7);
                    if (this.pro) {
                        this.advert = true;
                        c1014l.f2761l = this.ad;
                        this.pro = false;
                        z = true;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0323  */
    /* JADX WARN: Code duplicated, block: B:166:0x0333  */
    /* JADX WARN: Code duplicated, block: B:175:0x034f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0353  */
    /* JADX WARN: Code duplicated, block: B:180:0x0376  */
    /* JADX WARN: Code duplicated, block: B:182:0x037f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:264:0x0148 A[EDGE_INSN: B:264:0x0148->B:75:0x0148 BREAK  A[LOOP:9: B:63:0x0114->B:73:0x013f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f A[LOOP:9: B:63:0x0114->B:73:0x013f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void mopub(long j) {
        char c;
        int i;
        ArrayList arrayList;
        C7417l c7417lBilling;
        ArrayDeque arrayDeque;
        boolean z;
        boolean z2;
        C7417l c7417l;
        String str;
        C7417l c7417l2;
        int i2;
        long j2;
        int i3;
        C7417l c7417l3;
        ArrayList arrayList2;
        C7417l c7417l4;
        ArrayList arrayList3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1525l interfaceC1525l;
        InterfaceC1525l interfaceC1525l2;
        InterfaceC1525l interfaceC1525l3;
        int i8;
        while (true) {
            ArrayDeque arrayDeque2 = this.admob;
            if (arrayDeque2.isEmpty() || ((C11311l) arrayDeque2.peek()).f22798l != j) {
                break;
            }
            C11311l c11311l = (C11311l) arrayDeque2.pop();
            if (c11311l.f16423l == 1836019574) {
                C11311l c11311lRemoteconfig = c11311l.remoteconfig(1835365473);
                ArrayList arrayList4 = new ArrayList();
                char c2 = 3;
                long[][] jArr = null;
                boolean z3 = this.crashlytics;
                long j3 = 0;
                int i9 = this.loadAd;
                if (c11311lRemoteconfig != null) {
                    c7417lBilling = AbstractC2686l.billing(c11311lRemoteconfig);
                    if (this.advert) {
                        c7417lBilling.getClass();
                        InterfaceC1525l[] interfaceC1525lArr = c7417lBilling.yandex;
                        int length = interfaceC1525lArr.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                i = 0;
                                interfaceC1525l2 = null;
                                break;
                            }
                            InterfaceC1525l interfaceC1525l4 = interfaceC1525lArr[i10];
                            i = 0;
                            if (C7020l.class.isAssignableFrom(interfaceC1525l4.getClass())) {
                                interfaceC1525l2 = (InterfaceC1525l) C7020l.class.cast(interfaceC1525l4);
                                if (!((C7020l) interfaceC1525l2).yandex.equals("auxiliary.tracks.interleaved")) {
                                    interfaceC1525l2 = null;
                                }
                            } else {
                                interfaceC1525l2 = null;
                            }
                            if (interfaceC1525l2 != null) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        C7020l c7020l = (C7020l) interfaceC1525l2;
                        if (c7020l != null && c7020l.loadAd[i] == 0) {
                            this.signatures = this.ad + 16;
                        }
                        int length2 = interfaceC1525lArr.length;
                        int i11 = i;
                        while (true) {
                            if (i11 >= length2) {
                                interfaceC1525l3 = null;
                                break;
                            }
                            InterfaceC1525l interfaceC1525l5 = interfaceC1525lArr[i11];
                            if (C7020l.class.isAssignableFrom(interfaceC1525l5.getClass())) {
                                interfaceC1525l3 = (InterfaceC1525l) C7020l.class.cast(interfaceC1525l5);
                                if (!((C7020l) interfaceC1525l3).yandex.equals("auxiliary.tracks.map")) {
                                    interfaceC1525l3 = null;
                                }
                            } else {
                                interfaceC1525l3 = null;
                            }
                            if (interfaceC1525l3 != null) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        C7020l c7020l2 = (C7020l) interfaceC1525l3;
                        c7020l2.getClass();
                        ArrayList arrayListAmazon = c7020l2.amazon();
                        ArrayList arrayList5 = new ArrayList(arrayListAmazon.size());
                        for (int i12 = i; i12 < arrayListAmazon.size(); i12++) {
                            int iIntValue = ((Integer) arrayListAmazon.get(i12)).intValue();
                            if (iIntValue == 0) {
                                i8 = 1;
                            } else if (iIntValue == 1) {
                                i8 = 2;
                            } else if (iIntValue != 2) {
                                i8 = iIntValue != 3 ? i : 4;
                            } else {
                                i8 = 3;
                            }
                            arrayList5.add(Integer.valueOf(i8));
                        }
                        arrayList = arrayList5;
                        c = 3;
                    } else {
                        i = 0;
                        if (c7417lBilling == null || (i9 & 64) == 0) {
                            c = 3;
                        } else {
                            InterfaceC1525l[] interfaceC1525lArr2 = c7417lBilling.yandex;
                            int length3 = interfaceC1525lArr2.length;
                            int i13 = 0;
                            while (true) {
                                if (i13 >= length3) {
                                    c = c2;
                                    interfaceC1525l = null;
                                    break;
                                }
                                InterfaceC1525l interfaceC1525l6 = interfaceC1525lArr2[i13];
                                if (C7020l.class.isAssignableFrom(interfaceC1525l6.getClass())) {
                                    interfaceC1525l = (InterfaceC1525l) C7020l.class.cast(interfaceC1525l6);
                                    c = c2;
                                    if (!((C7020l) interfaceC1525l).yandex.equals("auxiliary.tracks.offset")) {
                                    }
                                    if (interfaceC1525l != null) {
                                        break;
                                    }
                                    i13++;
                                    c2 = c;
                                } else {
                                    c = c2;
                                }
                                interfaceC1525l = null;
                                if (interfaceC1525l != null) {
                                    break;
                                    break;
                                } else {
                                    i13++;
                                    c2 = c;
                                }
                            }
                            C7020l c7020l3 = (C7020l) interfaceC1525l;
                            if (c7020l3 != null) {
                                long jM3564package = new C13143l(c7020l3.loadAd).m3564package();
                                if (jM3564package > 0) {
                                    this.ad = jM3564package;
                                    this.pro = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = z3;
                                    z = true;
                                }
                                arrayDeque.clear();
                                this.isVip = z;
                                if (this.pro && !z2) {
                                    this.smaato = 2;
                                }
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    c = 3;
                    i = 0;
                    arrayList = arrayList4;
                    c7417lBilling = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z4 = this.inmobi == 1 ? 1 : i;
                C10912l c10912l = new C10912l();
                C16792l c16792lVip = c11311l.vip(1969517665);
                if (c16792lVip != null) {
                    C7417l c7417lFirebase = AbstractC2686l.firebase(c16792lVip);
                    c10912l.loadAd(c7417lFirebase);
                    c7417l = c7417lFirebase;
                } else {
                    c7417l = null;
                }
                C16792l c16792lVip2 = c11311l.vip(1836476516);
                c16792lVip2.getClass();
                InterfaceC1525l[] interfaceC1525lArr3 = new InterfaceC1525l[1];
                interfaceC1525lArr3[i] = AbstractC2686l.mopub(c16792lVip2.f32816l);
                C7417l c7417l5 = new C7417l(interfaceC1525lArr3);
                z2 = z3;
                ArrayList arrayListIsPro = AbstractC2686l.isPro(c11311l, c10912l, -9223372036854775807L, null, (i9 & 1) != 0 ? 1 : i, z4, new C2922l(16), this.crashlytics);
                if (this.advert) {
                    boolean z5 = arrayList.size() == arrayListIsPro.size() ? 1 : i;
                    Locale locale = Locale.US;
                    AbstractC12442l.ads(AbstractC12589l.applovin(arrayList.size(), arrayListIsPro.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z5);
                }
                String strPurchase = AbstractC14506l.purchase(arrayListIsPro);
                int i14 = i;
                int i15 = i14;
                long j4 = -9223372036854775807L;
                int size = -1;
                while (i14 < arrayListIsPro.size()) {
                    C9267l c9267l = (C9267l) arrayListIsPro.get(i14);
                    int i16 = c9267l.loadAd;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    long[] jArr2 = c9267l.billing;
                    C11436l c11436l = c9267l.yandex;
                    if (i16 == 0) {
                        arrayList = arrayList;
                        str = strPurchase;
                        i2 = i14;
                        arrayList3 = arrayList6;
                        c7417l2 = c7417l;
                    } else {
                        str = strPurchase;
                        InterfaceC2053l interfaceC2053l = this.premium;
                        int i17 = i15 + 1;
                        c7417l2 = c7417l;
                        int i18 = c11436l.loadAd;
                        ArrayList arrayList7 = arrayList6;
                        C5978l c5978l = c11436l.mopub;
                        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(i15, i18);
                        C3614l c3614l = new C3614l(c11436l, c9267l, interfaceC8979lStartapp);
                        long j5 = c11436l.purchase;
                        if (j5 == -9223372036854775807L) {
                            j5 = c9267l.subs;
                        }
                        interfaceC8979lStartapp.amazon(j5);
                        long jMax = Math.max(j4, j5);
                        String str2 = c5978l.metrica;
                        String str3 = c5978l.metrica;
                        boolean zEquals = "audio/true-hd".equals(str2);
                        int i19 = c9267l.purchase;
                        int i20 = zEquals ? i19 * 16 : i19 + 30;
                        C12984l c12984lYandex = c5978l.yandex();
                        c12984lYandex.metrica = i20;
                        if (i18 == 2) {
                            int i21 = c5978l.billing;
                            if ((i9 & 8) != 0) {
                                i21 |= size == -1 ? 1 : 2;
                            }
                            int i22 = i21;
                            if (this.advert) {
                                i7 = i22 | 32768;
                                c12984lYandex.mopub = ((Integer) arrayList.get(i14)).intValue();
                            } else {
                                i7 = i22;
                            }
                            c12984lYandex.billing = i7;
                        } else {
                            arrayList = arrayList;
                        }
                        int[] iArr = c9267l.admob;
                        boolean z6 = c9267l.isPro;
                        if (!AbstractC3825l.remoteconfig(str3) || jArr2.length <= 0) {
                            i2 = i14;
                        } else {
                            int iMin = Math.min(z6 ? c9267l.loadAd : iArr.length, 20);
                            AbstractC12442l.subscription(j5 != -9223372036854775807L ? 1 : i);
                            i2 = i14;
                            long jMin = Math.min(j5, 10000000L);
                            int i23 = i;
                            int i24 = i23;
                            int i25 = -1;
                            while (i23 < iMin) {
                                int i26 = z6 ? i23 : iArr[i23];
                                long j6 = jArr2[i26];
                                if (j6 > jMin) {
                                    break;
                                }
                                if (j6 >= 0) {
                                    i6 = iMin;
                                    int i27 = c9267l.amazon[i26];
                                    if (i27 > i24) {
                                        i24 = i27;
                                        i25 = i26;
                                    }
                                } else {
                                    i6 = iMin;
                                }
                                i23++;
                                iMin = i6;
                            }
                            if (i25 != -1) {
                                j2 = jArr2[i25];
                            }
                            if (j2 != -9223372036854775807L) {
                                C11429l c11429l = new C11429l(j2);
                                i3 = 1;
                                InterfaceC1525l[] interfaceC1525lArr4 = new InterfaceC1525l[1];
                                interfaceC1525lArr4[i] = c11429l;
                                c7417l3 = new C7417l(interfaceC1525lArr4);
                            } else {
                                i3 = 1;
                                c7417l3 = null;
                            }
                            if (i18 == i3 && (i4 = c10912l.yandex) != -1 && (i5 = c10912l.loadAd) != -1) {
                                c12984lYandex.f25444strictfp = i4;
                                c12984lYandex.f25448volatile = i5;
                            }
                            C7417l c7417l6 = c5978l.smaato;
                            arrayList2 = this.isPro;
                            if (arrayList2.isEmpty()) {
                                c7417l4 = null;
                            } else {
                                c7417l4 = new C7417l(arrayList2);
                            }
                            C7417l[] c7417lArr = new C7417l[4];
                            c7417lArr[i] = c7417l4;
                            c7417lArr[i3] = c7417l2;
                            c7417lArr[2] = c7417l5;
                            c7417lArr[c] = c7417l3;
                            AbstractC15918l.subscription(i18, c7417lBilling, c12984lYandex, c7417l6, c7417lArr);
                            c12984lYandex.remoteconfig = AbstractC3825l.vip(str);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                c3614l.billing = new C5978l(c12984lYandex);
                            } else {
                                AbstractC9029l.license(c12984lYandex, c3614l.crashlytics);
                            }
                            if (i18 == 2 && size == -1) {
                                size = arrayList7.size();
                            }
                            arrayList3 = arrayList7;
                            arrayList3.add(c3614l);
                            i15 = i17;
                            j4 = jMax;
                        }
                        j2 = -9223372036854775807L;
                        if (j2 != -9223372036854775807L) {
                            C11429l c11429l2 = new C11429l(j2);
                            i3 = 1;
                            InterfaceC1525l[] interfaceC1525lArr5 = new InterfaceC1525l[1];
                            interfaceC1525lArr5[i] = c11429l2;
                            c7417l3 = new C7417l(interfaceC1525lArr5);
                        } else {
                            i3 = 1;
                            c7417l3 = null;
                        }
                        if (i18 == i3) {
                            c12984lYandex.f25444strictfp = i4;
                            c12984lYandex.f25448volatile = i5;
                        }
                        C7417l c7417l7 = c5978l.smaato;
                        arrayList2 = this.isPro;
                        if (arrayList2.isEmpty()) {
                            c7417l4 = null;
                        } else {
                            c7417l4 = new C7417l(arrayList2);
                        }
                        C7417l[] c7417lArr2 = new C7417l[4];
                        c7417lArr2[i] = c7417l4;
                        c7417lArr2[i3] = c7417l2;
                        c7417lArr2[2] = c7417l5;
                        c7417lArr2[c] = c7417l3;
                        AbstractC15918l.subscription(i18, c7417lBilling, c12984lYandex, c7417l7, c7417lArr2);
                        c12984lYandex.remoteconfig = AbstractC3825l.vip(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                            c3614l.billing = new C5978l(c12984lYandex);
                        } else {
                            AbstractC9029l.license(c12984lYandex, c3614l.crashlytics);
                        }
                        if (i18 == 2) {
                            size = arrayList7.size();
                        }
                        arrayList3 = arrayList7;
                        arrayList3.add(c3614l);
                        i15 = i17;
                        j4 = jMax;
                    }
                    i14 = i2 + 1;
                    arrayList6 = arrayList3;
                    arrayDeque2 = arrayDeque3;
                    arrayListIsPro = arrayListIsPro;
                    strPurchase = str;
                    c7417l = c7417l2;
                    arrayList = arrayList;
                }
                arrayDeque = arrayDeque2;
                int i28 = -1;
                boolean z7 = true;
                C3614l[] c3614lArr = (C3614l[]) arrayList6.toArray(new C3614l[i]);
                this.applovin = c3614lArr;
                if (!z2) {
                    long[][] jArr3 = new long[c3614lArr.length][];
                    int[] iArr2 = new int[c3614lArr.length];
                    long[] jArr4 = new long[c3614lArr.length];
                    boolean[] zArr = new boolean[c3614lArr.length];
                    for (int i29 = 0; i29 < c3614lArr.length; i29++) {
                        jArr3[i29] = new long[c3614lArr[i29].loadAd.loadAd];
                        jArr4[i29] = c3614lArr[i29].loadAd.billing[0];
                    }
                    int i30 = 0;
                    while (i30 < c3614lArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i31 = i28;
                        for (int i32 = 0; i32 < c3614lArr.length; i32++) {
                            if (!zArr[i32]) {
                                long j8 = jArr4[i32];
                                if (j8 <= j7) {
                                    i31 = i32;
                                    j7 = j8;
                                }
                            }
                        }
                        int i33 = iArr2[i31];
                        long[] jArr5 = jArr3[i31];
                        jArr5[i33] = j3;
                        C9267l c9267l2 = c3614lArr[i31].loadAd;
                        boolean z8 = z7;
                        long[][] jArr6 = jArr3;
                        j3 += (long) c9267l2.amazon[i33];
                        int i34 = i33 + 1;
                        iArr2[i31] = i34;
                        if (i34 < jArr5.length) {
                            jArr4[i31] = c9267l2.billing[i34];
                        } else {
                            zArr[i31] = z8;
                            i30++;
                        }
                        jArr3 = jArr6;
                        z7 = z8;
                        i28 = -1;
                    }
                    jArr = jArr3;
                }
                z = z7;
                this.appmetrica = jArr;
                this.premium.firebase();
                this.premium.tapsense(new C5005l(j4, this.applovin, size));
                arrayDeque.clear();
                this.isVip = z;
                if (this.pro) {
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((C11311l) arrayDeque2.peek()).f22799l.add(c11311l);
            }
        }
        if (this.smaato != 2) {
            this.smaato = 0;
            this.metrica = 0;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        return this.firebase;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
