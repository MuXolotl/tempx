package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1721l implements InterfaceC14833l {

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final byte[] f4108for = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final C5978l f4109throw;
    public int Signature;
    public int ad;
    public C13708l adcel;
    public final byte[] admob;
    public int ads;
    public long advert;
    public int applovin;
    public int appmetrica;
    public final List crashlytics;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public long f4110extends;
    public int inmobi;
    public final C16391l isPro;
    public long isVip;
    public C13143l license;
    public final int loadAd;
    public final C1080l metrica;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public boolean f4111native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public boolean f4112package;
    public C8501l premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public boolean f4113private;
    public long pro;
    public long signatures;
    public final C6551l startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public InterfaceC8979l[] f4114strictfp;
    public final C13143l subs;
    public int subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public InterfaceC2053l f4115synchronized;
    public long tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public boolean f4116throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public InterfaceC8979l[] f4117volatile;
    public final InterfaceC5304l yandex;
    public final C0458l firebase = new C0458l(21);
    public final C13143l smaato = new C13143l(16);
    public final C13143l purchase = new C13143l(AbstractC16763l.yandex);
    public final C13143l billing = new C13143l(6);
    public final C13143l mopub = new C13143l();
    public final ArrayDeque remoteconfig = new ArrayDeque();
    public final ArrayDeque vip = new ArrayDeque();
    public final SparseArray amazon = new SparseArray();

    static {
        C12984l c12984l = new C12984l();
        c12984l.vip = AbstractC3825l.vip("application/x-emsg");
        f4109throw = new C5978l(c12984l);
    }

    public C1721l(InterfaceC5304l interfaceC5304l, int i, C16391l c16391l, List list) {
        this.yandex = interfaceC5304l;
        this.loadAd = i;
        this.isPro = c16391l;
        this.crashlytics = DesugarCollections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.admob = bArr;
        this.subs = new C13143l(bArr);
        C9258l c9258l = AbstractC1186l.f3181l;
        this.adcel = C13708l.f26763l;
        this.isVip = -9223372036854775807L;
        this.advert = -9223372036854775807L;
        this.signatures = -9223372036854775807L;
        this.f4115synchronized = InterfaceC2053l.pro;
        this.f4114strictfp = new InterfaceC8979l[0];
        this.f4117volatile = new InterfaceC8979l[0];
        this.metrica = new C1080l(new C6536l(1, this));
        this.startapp = new C6551l(0);
        this.f4110extends = -1L;
    }

    public static C17564l admob(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C16792l c16792l = (C16792l) list.get(i);
            if (c16792l.f16423l == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c16792l.f32816l.yandex;
                C17219l c17219lBilling = AbstractC14231l.billing(bArr);
                UUID uuid = c17219lBilling == null ? null : (UUID) c17219lBilling.f33423l;
                if (uuid == null) {
                    AbstractC6427l.vip("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C12687l(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C17564l(null, false, (C12687l[]) arrayList.toArray(new C12687l[0]));
    }

    public static Pair isPro(long j, C13143l c13143l) throws C17655l {
        long jM3564package;
        long jM3564package2;
        C13143l c13143l2 = c13143l;
        c13143l2.m3562for(8);
        int iPurchase = AbstractC2686l.purchase(c13143l2.remoteconfig());
        c13143l2.m3568throw(4);
        long jApplovin = c13143l2.applovin();
        if (iPurchase == 0) {
            jM3564package = c13143l2.applovin();
            jM3564package2 = c13143l2.applovin();
        } else {
            jM3564package = c13143l2.m3564package();
            jM3564package2 = c13143l2.m3564package();
        }
        long j2 = jM3564package2 + j;
        String str = AbstractC15323l.yandex;
        long jM3970import = AbstractC15323l.m3970import(jM3564package, 1000000L, jApplovin, RoundingMode.DOWN);
        c13143l2.m3568throw(2);
        int iM3567synchronized = c13143l2.m3567synchronized();
        int[] iArr = new int[iM3567synchronized];
        long[] jArr = new long[iM3567synchronized];
        long[] jArr2 = new long[iM3567synchronized];
        long[] jArr3 = new long[iM3567synchronized];
        long j3 = j2;
        long j4 = jM3970import;
        int i = 0;
        while (i < iM3567synchronized) {
            int iRemoteconfig = c13143l2.remoteconfig();
            if ((Integer.MIN_VALUE & iRemoteconfig) != 0) {
                throw C17655l.yandex(null, "Unhandled indirect reference");
            }
            long jApplovin2 = c13143l2.applovin();
            iArr[i] = iRemoteconfig & Alert.DURATION_SHOW_INDEFINITELY;
            jArr[i] = j3;
            jArr3[i] = j4;
            jM3564package += jApplovin2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jM3970import2 = AbstractC15323l.m3970import(jM3564package, 1000000L, jApplovin, RoundingMode.DOWN);
            jArr4[i] = jM3970import2 - jArr5[i];
            c13143l2.m3568throw(4);
            j3 += (long) iArr[i];
            i++;
            iM3567synchronized = iM3567synchronized;
            c13143l2 = c13143l;
            j4 = jM3970import2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jM3970import), new C18645l(iArr, jArr, jArr2, jArr3));
    }

    public static void subs(C13143l c13143l, int i, C16142l c16142l) throws C17655l {
        c13143l.m3562for(i + 8);
        int iRemoteconfig = c13143l.remoteconfig();
        byte[] bArr = AbstractC2686l.yandex;
        if ((iRemoteconfig & 1) != 0) {
            throw C17655l.crashlytics("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iRemoteconfig & 2) != 0;
        int iInmobi = c13143l.inmobi();
        if (iInmobi == 0) {
            Arrays.fill(c16142l.smaato, 0, c16142l.purchase, false);
            return;
        }
        int i2 = c16142l.purchase;
        C13143l c13143l2 = c16142l.vip;
        if (iInmobi != i2) {
            StringBuilder sbSignature = AbstractC2812l.Signature("Senc sample count ", iInmobi, " is different from fragment sample count");
            sbSignature.append(c16142l.purchase);
            throw C17655l.yandex(null, sbSignature.toString());
        }
        Arrays.fill(c16142l.smaato, 0, iInmobi, z);
        c13143l2.m3563native(c13143l.yandex());
        c16142l.firebase = true;
        c16142l.metrica = true;
        c13143l.firebase(0, c13143l2.crashlytics, c13143l2.yandex);
        c13143l2.m3562for(0);
        c16142l.metrica = false;
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        SparseArray sparseArray = this.amazon;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C8501l) sparseArray.valueAt(i)).purchase();
        }
        this.vip.clear();
        this.ad = 0;
        ((PriorityQueue) this.metrica.f2976l).clear();
        this.advert = j2;
        this.remoteconfig.clear();
        mopub();
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        int i;
        int i2 = this.loadAd;
        if ((i2 & 32) == 0) {
            interfaceC2053l = new C11919l(interfaceC2053l, this.yandex);
        }
        this.f4115synchronized = interfaceC2053l;
        mopub();
        InterfaceC8979l[] interfaceC8979lArr = new InterfaceC8979l[2];
        this.f4114strictfp = interfaceC8979lArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            interfaceC8979lArr[0] = this.f4115synchronized.startapp(100, 5);
            i = 1;
            i3 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        } else {
            i = 0;
        }
        InterfaceC8979l[] interfaceC8979lArr2 = (InterfaceC8979l[]) AbstractC15323l.m3972interface(i, this.f4114strictfp);
        this.f4114strictfp = interfaceC8979lArr2;
        for (InterfaceC8979l interfaceC8979l : interfaceC8979lArr2) {
            interfaceC8979l.mopub(f4109throw);
        }
        List list = this.crashlytics;
        this.f4117volatile = new InterfaceC8979l[list.size()];
        while (i4 < this.f4117volatile.length) {
            InterfaceC8979l interfaceC8979lStartapp = this.f4115synchronized.startapp(i3, 3);
            interfaceC8979lStartapp.mopub((C5978l) list.get(i4));
            this.f4117volatile[i4] = interfaceC8979lStartapp;
            i4++;
            i3++;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        C13708l c13708lIsVip;
        InterfaceC10110l interfaceC10110lMopub = AbstractC11790l.mopub(interfaceC10430l, true, false);
        if (interfaceC10110lMopub != null) {
            c13708lIsVip = AbstractC1186l.isVip(interfaceC10110lMopub);
        } else {
            C9258l c9258l = AbstractC1186l.f3181l;
            c13708lIsVip = C13708l.f26763l;
        }
        this.adcel = c13708lIsVip;
        return interfaceC10110lMopub == null;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x042c  */
    /* JADX WARN: Code duplicated, block: B:309:0x0724  */
    /* JADX WARN: Code duplicated, block: B:311:0x0731  */
    /* JADX WARN: Code duplicated, block: B:314:0x0749  */
    /* JADX WARN: Code duplicated, block: B:315:0x074d  */
    /* JADX WARN: Code duplicated, block: B:397:0x0752 A[SYNTHETIC] */
    public final void firebase(long j) throws C17655l {
        C7417l c7417l;
        ArrayList arrayList;
        C7417l c7417l2;
        C16610l c16610l;
        int i;
        C16610l c16610l2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        int i3;
        C8501l c8501l;
        int i4;
        int size;
        int i5;
        C16792l c16792l;
        C13143l c13143l;
        byte[] bArr;
        byte[] bArr2;
        int i6;
        boolean z;
        int i7;
        while (true) {
            ArrayDeque arrayDeque = this.remoteconfig;
            if (arrayDeque.isEmpty() || ((C11311l) arrayDeque.peek()).f22798l != j) {
                break;
            }
            C11311l c11311l = (C11311l) arrayDeque.pop();
            int i8 = c11311l.f16423l;
            ArrayList arrayList5 = c11311l.f22799l;
            ArrayList arrayList6 = c11311l.f22800l;
            int i9 = 12;
            int i10 = this.loadAd;
            int i11 = 0;
            SparseArray sparseArray = this.amazon;
            if (i8 == 1836019574) {
                C17564l c17564lAdmob = admob(arrayList6);
                C11311l c11311lRemoteconfig = c11311l.remoteconfig(1836475768);
                c11311lRemoteconfig.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList7 = c11311lRemoteconfig.f22800l;
                int size2 = arrayList7.size();
                int i12 = 0;
                long jApplovin = -9223372036854775807L;
                while (i12 < size2) {
                    C16792l c16792l2 = (C16792l) arrayList7.get(i12);
                    int i13 = c16792l2.f16423l;
                    C13143l c13143l2 = c16792l2.f32816l;
                    if (i13 == 1953654136) {
                        c13143l2.m3562for(i9);
                        arrayList2 = arrayList7;
                        Pair pairCreate = Pair.create(Integer.valueOf(c13143l2.remoteconfig()), new C16610l(c13143l2.remoteconfig() - 1, c13143l2.remoteconfig(), c13143l2.remoteconfig(), c13143l2.remoteconfig()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (C16610l) pairCreate.second);
                    } else {
                        arrayList2 = arrayList7;
                        if (i13 == 1835362404) {
                            c13143l2.m3562for(8);
                            jApplovin = AbstractC2686l.purchase(c13143l2.remoteconfig()) == 0 ? c13143l2.applovin() : c13143l2.m3564package();
                        }
                    }
                    i12++;
                    arrayList7 = arrayList2;
                    i9 = 12;
                }
                C11311l c11311lRemoteconfig2 = c11311l.remoteconfig(1835365473);
                C7417l c7417lBilling = c11311lRemoteconfig2 != null ? AbstractC2686l.billing(c11311lRemoteconfig2) : null;
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
                C7417l c7417l3 = new C7417l(AbstractC2686l.mopub(c16792lVip2.f32816l));
                ArrayList arrayListIsPro = AbstractC2686l.isPro(c11311l, c10912l, jApplovin, c17564lAdmob, (i10 & 16) != 0, false, new C2922l(this), false);
                int size3 = arrayListIsPro.size();
                if (sparseArray.size() == 0) {
                    String strPurchase = AbstractC14506l.purchase(arrayListIsPro);
                    int i14 = 0;
                    while (i14 < size3) {
                        C9267l c9267l = (C9267l) arrayListIsPro.get(i14);
                        C11436l c11436l = c9267l.yandex;
                        InterfaceC2053l interfaceC2053l = this.f4115synchronized;
                        int i15 = c11436l.loadAd;
                        int i16 = c11436l.yandex;
                        C5978l c5978l = c11436l.mopub;
                        int i17 = size3;
                        String str = strPurchase;
                        long j2 = c11436l.purchase;
                        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(i14, i15);
                        interfaceC8979lStartapp.amazon(j2);
                        C12984l c12984lYandex = c5978l.yandex();
                        int i18 = i14;
                        c12984lYandex.remoteconfig = AbstractC3825l.vip(str);
                        if (i15 == 1) {
                            int i19 = c10912l.yandex;
                            c7417l2 = c7417l3;
                            arrayList = arrayListIsPro;
                            if (i19 != -1 && (i = c10912l.loadAd) != -1) {
                                c12984lYandex.f25444strictfp = i19;
                                c12984lYandex.f25448volatile = i;
                            }
                        } else {
                            arrayList = arrayListIsPro;
                            c7417l2 = c7417l3;
                        }
                        C7417l c7417l4 = c5978l.smaato;
                        C7417l[] c7417lArr = new C7417l[2];
                        c7417lArr[i11] = c7417l;
                        c7417lArr[1] = c7417l2;
                        AbstractC15918l.subscription(i15, c7417lBilling, c12984lYandex, c7417l4, c7417lArr);
                        if (sparseArray2.size() == 1) {
                            c16610l = (C16610l) sparseArray2.valueAt(i11);
                        } else {
                            c16610l = (C16610l) sparseArray2.get(i16);
                            c16610l.getClass();
                        }
                        sparseArray.put(i16, new C8501l(interfaceC8979lStartapp, c9267l, c16610l, new C5978l(c12984lYandex)));
                        this.isVip = Math.max(this.isVip, j2);
                        i14 = i18 + 1;
                        size3 = i17;
                        strPurchase = str;
                        c7417l3 = c7417l2;
                        arrayListIsPro = arrayList;
                        i11 = 0;
                    }
                    this.f4115synchronized.firebase();
                } else {
                    ArrayList arrayList8 = arrayListIsPro;
                    AbstractC12442l.subscription(sparseArray.size() == size3);
                    int i20 = 0;
                    while (i20 < size3) {
                        ArrayList arrayList9 = arrayList8;
                        C9267l c9267l2 = (C9267l) arrayList9.get(i20);
                        C11436l c11436l2 = c9267l2.yandex;
                        C8501l c8501l2 = (C8501l) sparseArray.get(c11436l2.yandex);
                        int i21 = c11436l2.yandex;
                        if (sparseArray2.size() == 1) {
                            c16610l2 = (C16610l) sparseArray2.valueAt(0);
                        } else {
                            c16610l2 = (C16610l) sparseArray2.get(i21);
                            c16610l2.getClass();
                        }
                        c8501l2.amazon = c9267l2;
                        c8501l2.purchase = c16610l2;
                        c8501l2.yandex.mopub(c8501l2.isPro);
                        c8501l2.purchase();
                        i20++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i8 == 1836019558) {
                int size4 = arrayList5.size();
                int i22 = 0;
                while (i22 < size4) {
                    C11311l c11311l2 = (C11311l) arrayList5.get(i22);
                    if (c11311l2.f16423l == 1953653094) {
                        C16792l c16792lVip3 = c11311l2.vip(1952868452);
                        ArrayList arrayList10 = c11311l2.f22800l;
                        c16792lVip3.getClass();
                        C13143l c13143l3 = c16792lVip3.f32816l;
                        c13143l3.m3562for(8);
                        int iRemoteconfig = c13143l3.remoteconfig();
                        byte[] bArr3 = AbstractC2686l.yandex;
                        C8501l c8501l3 = (C8501l) sparseArray.get(c13143l3.remoteconfig());
                        if (c8501l3 == null) {
                            size4 = size4;
                            arrayList5 = arrayList5;
                            c8501l = null;
                        } else {
                            C16142l c16142l = c8501l3.loadAd;
                            if ((iRemoteconfig & 1) != 0) {
                                long jM3564package = c13143l3.m3564package();
                                c16142l.loadAd = jM3564package;
                                c16142l.crashlytics = jM3564package;
                            }
                            C16610l c16610l3 = c8501l3.purchase;
                            c16142l.yandex = new C16610l((iRemoteconfig & 2) != 0 ? c13143l3.remoteconfig() - 1 : c16610l3.yandex, (iRemoteconfig & 8) != 0 ? c13143l3.remoteconfig() : c16610l3.loadAd, (iRemoteconfig & 16) != 0 ? c13143l3.remoteconfig() : c16610l3.crashlytics, (iRemoteconfig & 32) != 0 ? c13143l3.remoteconfig() : c16610l3.amazon);
                            c8501l = c8501l3;
                        }
                        if (c8501l != null) {
                            C16142l c16142l2 = c8501l.loadAd;
                            long j3 = c16142l2.startapp;
                            boolean z2 = c16142l2.adcel;
                            c8501l.purchase();
                            c8501l.remoteconfig = true;
                            C16792l c16792lVip4 = c11311l2.vip(1952867444);
                            if (c16792lVip4 == null || (i10 & 2) != 0) {
                                c16142l2.startapp = j3;
                                c16142l2.adcel = z2;
                            } else {
                                C13143l c13143l4 = c16792lVip4.f32816l;
                                c13143l4.m3562for(8);
                                c16142l2.startapp = AbstractC2686l.purchase(c13143l4.remoteconfig()) == 1 ? c13143l4.m3564package() : c13143l4.applovin();
                                c16142l2.adcel = true;
                            }
                            int size5 = arrayList10.size();
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                i4 = 1953658222;
                                if (i23 >= size5) {
                                    break;
                                }
                                C16792l c16792l3 = (C16792l) arrayList10.get(i23);
                                ArrayList arrayList11 = arrayList6;
                                if (c16792l3.f16423l == 1953658222) {
                                    C13143l c13143l5 = c16792l3.f32816l;
                                    c13143l5.m3562for(12);
                                    int iInmobi = c13143l5.inmobi();
                                    if (iInmobi > 0) {
                                        i25 += iInmobi;
                                        i24++;
                                    }
                                }
                                i23++;
                                arrayList6 = arrayList11;
                            }
                            arrayList4 = arrayList6;
                            c8501l.admob = 0;
                            c8501l.mopub = 0;
                            c8501l.billing = 0;
                            c16142l2.amazon = i24;
                            c16142l2.purchase = i25;
                            if (c16142l2.mopub.length < i24) {
                                c16142l2.billing = new long[i24];
                                c16142l2.mopub = new int[i24];
                            }
                            if (c16142l2.admob.length < i25) {
                                int i26 = (i25 * 125) / 100;
                                c16142l2.admob = new int[i26];
                                c16142l2.subs = new long[i26];
                                c16142l2.isPro = new boolean[i26];
                                c16142l2.smaato = new boolean[i26];
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                long j4 = 0;
                                if (i27 >= size5) {
                                    i2 = i22;
                                    arrayList3 = arrayList5;
                                    i3 = i10;
                                    C11436l c11436l3 = c8501l.amazon.yandex;
                                    C16610l c16610l4 = c16142l2.yandex;
                                    c16610l4.getClass();
                                    C4098l c4098l = c11436l3.smaato[c16610l4.yandex];
                                    C16792l c16792lVip5 = c11311l2.vip(1935763834);
                                    if (c16792lVip5 != null) {
                                        c4098l.getClass();
                                        C13143l c13143l6 = c16792lVip5.f32816l;
                                        int i30 = c4098l.amazon;
                                        c13143l6.m3562for(8);
                                        int iRemoteconfig2 = c13143l6.remoteconfig();
                                        byte[] bArr4 = AbstractC2686l.yandex;
                                        if ((iRemoteconfig2 & 1) == 1) {
                                            c13143l6.m3568throw(8);
                                        }
                                        int iSignatures = c13143l6.signatures();
                                        int iInmobi2 = c13143l6.inmobi();
                                        if (iInmobi2 > c16142l2.purchase) {
                                            StringBuilder sbSignature = AbstractC2812l.Signature("Saiz sample count ", iInmobi2, " is greater than fragment sample count");
                                            sbSignature.append(c16142l2.purchase);
                                            throw C17655l.yandex(null, sbSignature.toString());
                                        }
                                        if (iSignatures == 0) {
                                            boolean[] zArr = c16142l2.smaato;
                                            i6 = 0;
                                            for (int i31 = 0; i31 < iInmobi2; i31++) {
                                                int iSignatures2 = c13143l6.signatures();
                                                i6 += iSignatures2;
                                                zArr[i31] = iSignatures2 > i30;
                                            }
                                            z = false;
                                        } else {
                                            boolean z3 = iSignatures > i30;
                                            i6 = iSignatures * iInmobi2;
                                            z = false;
                                            Arrays.fill(c16142l2.smaato, 0, iInmobi2, z3);
                                        }
                                        Arrays.fill(c16142l2.smaato, iInmobi2, c16142l2.purchase, z);
                                        if (i6 > 0) {
                                            c16142l2.vip.m3563native(i6);
                                            c16142l2.firebase = true;
                                            c16142l2.metrica = true;
                                        }
                                    }
                                    C16792l c16792lVip6 = c11311l2.vip(1935763823);
                                    if (c16792lVip6 != null) {
                                        C13143l c13143l7 = c16792lVip6.f32816l;
                                        c13143l7.m3562for(8);
                                        int iRemoteconfig3 = c13143l7.remoteconfig();
                                        byte[] bArr5 = AbstractC2686l.yandex;
                                        if ((iRemoteconfig3 & 1) == 1) {
                                            c13143l7.m3568throw(8);
                                        }
                                        int iInmobi3 = c13143l7.inmobi();
                                        if (iInmobi3 != 1) {
                                            throw C17655l.yandex(null, "Unexpected saio entry count: " + iInmobi3);
                                        }
                                        c16142l2.crashlytics += AbstractC2686l.purchase(iRemoteconfig3) == 0 ? c13143l7.applovin() : c13143l7.m3564package();
                                    }
                                    C16792l c16792lVip7 = c11311l2.vip(1936027235);
                                    if (c16792lVip7 != null) {
                                        subs(c16792lVip7.f32816l, 0, c16142l2);
                                    }
                                    String str2 = c4098l != null ? c4098l.loadAd : null;
                                    C13143l c13143l8 = null;
                                    C13143l c13143l9 = null;
                                    for (int i32 = 0; i32 < arrayList10.size(); i32++) {
                                        C16792l c16792l4 = (C16792l) arrayList10.get(i32);
                                        C13143l c13143l10 = c16792l4.f32816l;
                                        int i33 = c16792l4.f16423l;
                                        if (i33 == 1935828848) {
                                            c13143l10.m3562for(12);
                                            if (c13143l10.remoteconfig() == 1936025959) {
                                                c13143l8 = c13143l10;
                                            }
                                        } else if (i33 == 1936158820) {
                                            c13143l10.m3562for(12);
                                            if (c13143l10.remoteconfig() == 1936025959) {
                                                c13143l9 = c13143l10;
                                            }
                                        }
                                    }
                                    if (c13143l8 != null && c13143l9 != null) {
                                        c13143l8.m3562for(8);
                                        int iPurchase = AbstractC2686l.purchase(c13143l8.remoteconfig());
                                        c13143l8.m3568throw(4);
                                        if (iPurchase == 1) {
                                            c13143l8.m3568throw(4);
                                        }
                                        if (c13143l8.remoteconfig() != 1) {
                                            throw C17655l.crashlytics("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        c13143l9.m3562for(8);
                                        int iPurchase2 = AbstractC2686l.purchase(c13143l9.remoteconfig());
                                        c13143l9.m3568throw(4);
                                        if (iPurchase2 == 1) {
                                            if (c13143l9.applovin() == 0) {
                                                throw C17655l.crashlytics("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iPurchase2 >= 2) {
                                            c13143l9.m3568throw(4);
                                        }
                                        if (c13143l9.applovin() != 1) {
                                            throw C17655l.crashlytics("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        c13143l9.m3568throw(1);
                                        int iSignatures3 = c13143l9.signatures();
                                        int i34 = (iSignatures3 & 240) >> 4;
                                        int i35 = iSignatures3 & 15;
                                        boolean z4 = c13143l9.signatures() == 1;
                                        if (z4) {
                                            int iSignatures4 = c13143l9.signatures();
                                            byte[] bArr6 = new byte[16];
                                            c13143l9.firebase(0, 16, bArr6);
                                            if (iSignatures4 == 0) {
                                                int iSignatures5 = c13143l9.signatures();
                                                byte[] bArr7 = new byte[iSignatures5];
                                                c13143l9.firebase(0, iSignatures5, bArr7);
                                                bArr2 = bArr7;
                                            } else {
                                                bArr2 = null;
                                            }
                                            c16142l2.firebase = true;
                                            c16142l2.remoteconfig = new C4098l(z4, str2, iSignatures4, bArr6, i34, i35, bArr2);
                                        }
                                        size = arrayList10.size();
                                        for (i5 = 0; i5 < size; i5++) {
                                            c16792l = (C16792l) arrayList10.get(i5);
                                            if (c16792l.f16423l == 1970628964) {
                                                c13143l = c16792l.f32816l;
                                                c13143l.m3562for(8);
                                                bArr = this.admob;
                                                c13143l.firebase(0, 16, bArr);
                                                if (!Arrays.equals(bArr, f4108for)) {
                                                    subs(c13143l, 16, c16142l2);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    size = arrayList10.size();
                                    while (i5 < size) {
                                        c16792l = (C16792l) arrayList10.get(i5);
                                        if (c16792l.f16423l == 1970628964) {
                                            c13143l = c16792l.f32816l;
                                            c13143l.m3562for(8);
                                            bArr = this.admob;
                                            c13143l.firebase(0, 16, bArr);
                                            if (!Arrays.equals(bArr, f4108for)) {
                                                subs(c13143l, 16, c16142l2);
                                            }
                                        }
                                    }
                                    break;
                                    break;
                                }
                                C16792l c16792l5 = (C16792l) arrayList10.get(i27);
                                if (c16792l5.f16423l == i4) {
                                    int i36 = i28 + 1;
                                    C13143l c13143l11 = c16792l5.f32816l;
                                    c13143l11.m3562for(8);
                                    int iRemoteconfig4 = c13143l11.remoteconfig();
                                    byte[] bArr8 = AbstractC2686l.yandex;
                                    C11436l c11436l4 = c8501l.amazon.yandex;
                                    C16610l c16610l5 = c16142l2.yandex;
                                    String str3 = AbstractC15323l.yandex;
                                    c16142l2.mopub[i28] = c13143l11.inmobi();
                                    long[] jArr = c16142l2.billing;
                                    int i37 = i28;
                                    long j5 = c16142l2.loadAd;
                                    jArr[i37] = j5;
                                    if ((iRemoteconfig4 & 1) != 0) {
                                        jArr[i37] = j5 + ((long) c13143l11.remoteconfig());
                                    }
                                    boolean z5 = (iRemoteconfig4 & 4) != 0;
                                    int iRemoteconfig5 = c16610l5.amazon;
                                    if (z5) {
                                        iRemoteconfig5 = c13143l11.remoteconfig();
                                    }
                                    boolean z6 = z5;
                                    boolean z7 = (iRemoteconfig4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
                                    boolean z8 = (iRemoteconfig4 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0;
                                    boolean z9 = (iRemoteconfig4 & 1024) != 0;
                                    boolean z10 = (iRemoteconfig4 & 2048) != 0;
                                    boolean z11 = z9;
                                    long[] jArr2 = c11436l4.subs;
                                    int i38 = iRemoteconfig5;
                                    long[] jArr3 = c11436l4.isPro;
                                    if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                        long j6 = jArr2[0];
                                        if (j6 == 0) {
                                            j4 = jArr3[0];
                                        } else {
                                            long j7 = c11436l4.amazon;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (AbstractC15323l.m3970import(j6, 1000000L, j7, roundingMode) + AbstractC15323l.m3970import(jArr3[0], 1000000L, c11436l4.crashlytics, roundingMode) >= c11436l4.purchase) {
                                                j4 = jArr3[0];
                                            }
                                        }
                                    }
                                    int[] iArr = c16142l2.admob;
                                    long[] jArr4 = c16142l2.subs;
                                    boolean[] zArr2 = c16142l2.isPro;
                                    boolean z12 = c11436l4.loadAd == 2 && (i10 & 1) != 0;
                                    int i39 = c16142l2.mopub[i37] + i29;
                                    int i40 = i29;
                                    long j8 = c11436l4.crashlytics;
                                    C13143l c13143l12 = c13143l11;
                                    long j9 = c16142l2.startapp;
                                    int i41 = i40;
                                    while (i41 < i39) {
                                        int iRemoteconfig6 = z7 ? c13143l12.remoteconfig() : c16610l5.loadAd;
                                        boolean z13 = z12;
                                        if (iRemoteconfig6 < 0) {
                                            throw C17655l.yandex(null, "Unexpected negative value: " + iRemoteconfig6);
                                        }
                                        int iRemoteconfig7 = z8 ? c13143l12.remoteconfig() : c16610l5.crashlytics;
                                        if (iRemoteconfig7 < 0) {
                                            throw C17655l.yandex(null, "Unexpected negative value: " + iRemoteconfig7);
                                        }
                                        int iRemoteconfig8 = z11 ? c13143l12.remoteconfig() : (i41 == 0 && z6) ? i38 : c16610l5.amazon;
                                        int i42 = i36;
                                        int i43 = i10;
                                        long jM3970import = AbstractC15323l.m3970import((((long) (z10 ? c13143l12.remoteconfig() : 0)) + j9) - j4, 1000000L, j8, RoundingMode.DOWN);
                                        jArr4[i41] = jM3970import;
                                        if (!c16142l2.adcel) {
                                            jArr4[i41] = jM3970import + c8501l.amazon.subs;
                                        }
                                        iArr[i41] = iRemoteconfig7;
                                        zArr2[i41] = ((iRemoteconfig8 >> 16) & 1) == 0 && (!z13 || i41 == 0);
                                        j9 += (long) iRemoteconfig6;
                                        i41++;
                                        c13143l12 = c13143l12;
                                        z12 = z13;
                                        i39 = i39;
                                        c16610l5 = c16610l5;
                                        i10 = i43;
                                        i36 = i42;
                                    }
                                    i7 = i10;
                                    c16142l2.startapp = j9;
                                    i29 = i39;
                                    i28 = i36;
                                } else {
                                    i7 = i10;
                                }
                                i27++;
                                size5 = size5;
                                i22 = i22;
                                arrayList5 = arrayList5;
                                i10 = i7;
                                i4 = 1953658222;
                            }
                        } else {
                            arrayList4 = arrayList6;
                            i2 = i22;
                            arrayList3 = arrayList5;
                            i3 = i10;
                        }
                    } else {
                        size4 = size4;
                        arrayList3 = arrayList5;
                        arrayList4 = arrayList6;
                        i2 = i22;
                        i3 = i10;
                    }
                    i22 = i2 + 1;
                    size4 = size4;
                    arrayList6 = arrayList4;
                    arrayList5 = arrayList3;
                    i10 = i3;
                }
                C17564l c17564lAdmob2 = admob(arrayList6);
                if (c17564lAdmob2 != null) {
                    int size6 = sparseArray.size();
                    for (int i44 = 0; i44 < size6; i44++) {
                        C8501l c8501l4 = (C8501l) sparseArray.valueAt(i44);
                        C11436l c11436l5 = c8501l4.amazon.yandex;
                        C16610l c16610l6 = c8501l4.loadAd.yandex;
                        String str4 = AbstractC15323l.yandex;
                        C4098l c4098l2 = c11436l5.smaato[c16610l6.yandex];
                        C17564l c17564lYandex = c17564lAdmob2.yandex(c4098l2 != null ? c4098l2.loadAd : null);
                        C12984l c12984lYandex2 = c8501l4.isPro.yandex();
                        c12984lYandex2.ads = c17564lYandex;
                        c8501l4.yandex.mopub(new C5978l(c12984lYandex2));
                    }
                }
                if (this.advert != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i45 = 0; i45 < size7; i45++) {
                        C8501l c8501l5 = (C8501l) sparseArray.valueAt(i45);
                        long j10 = this.advert;
                        int i46 = c8501l5.billing;
                        while (true) {
                            C16142l c16142l3 = c8501l5.loadAd;
                            if (i46 >= c16142l3.purchase || c16142l3.subs[i46] > j10) {
                                break;
                            }
                            if (c16142l3.isPro[i46]) {
                                c8501l5.subs = i46;
                            }
                            i46++;
                        }
                    }
                    this.advert = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((C11311l) arrayDeque.peek()).f22799l.add(c11311l);
            }
        }
        mopub();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:121:0x0247  */
    /* JADX WARN: Code duplicated, block: B:144:0x0292  */
    /* JADX WARN: Code duplicated, block: B:145:0x0294  */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        C1080l c1080l;
        C13143l c13143l;
        ArrayDeque arrayDeque;
        int i;
        C16391l c16391l;
        C8501l c8501l;
        boolean z;
        int i2;
        C8501l c8501l2;
        int i3;
        int iBilling;
        int i4;
        boolean z2;
        String strSubs;
        int i5;
        int i6;
        String strLicense;
        String strLicense2;
        long jM3970import;
        long j;
        long jYandex;
        long j2;
        long jApplovin;
        int i7;
        InterfaceC10430l interfaceC10430l2 = interfaceC10430l;
        while (true) {
            int i8 = this.ads;
            ArrayDeque arrayDeque2 = this.remoteconfig;
            c1080l = this.metrica;
            c13143l = this.subs;
            C6551l c6551l = this.startapp;
            SparseArray sparseArray = this.amazon;
            boolean z3 = true;
            if (i8 != 0) {
                arrayDeque = this.vip;
                i = this.loadAd;
                c16391l = this.isPro;
                if (i8 != 1) {
                    long j3 = Long.MAX_VALUE;
                    if (i8 != 2) {
                        c8501l = this.premium;
                        if (c8501l != null) {
                            z = true;
                            i2 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        int i9 = 0;
                        C8501l c8501l3 = null;
                        while (i9 < size) {
                            C8501l c8501l4 = (C8501l) sparseArray.valueAt(i9);
                            boolean z4 = z3;
                            boolean z5 = c8501l4.remoteconfig;
                            C16142l c16142l = c8501l4.loadAd;
                            if (z5) {
                                i6 = size;
                            } else {
                                i6 = size;
                                if (c8501l4.billing != c8501l4.amazon.loadAd) {
                                }
                                i9++;
                                z3 = z4;
                                size = i6;
                            }
                            if (!z5 || c8501l4.admob != c16142l.amazon) {
                                long j4 = !z5 ? c8501l4.amazon.crashlytics[c8501l4.billing] : c16142l.billing[c8501l4.admob];
                                if (j4 < j3) {
                                    c8501l3 = c8501l4;
                                    j3 = j4;
                                }
                            }
                            i9++;
                            z3 = z4;
                            size = i6;
                        }
                        z = z3;
                        i2 = 8;
                        if (c8501l3 != null) {
                            int position = (int) ((!c8501l3.remoteconfig ? c8501l3.amazon.crashlytics[c8501l3.billing] : c8501l3.loadAd.billing[c8501l3.admob]) - interfaceC10430l2.getPosition());
                            if (position < 0) {
                                AbstractC6427l.vip("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            interfaceC10430l2.remoteconfig(position);
                            this.premium = c8501l3;
                            c8501l = c8501l3;
                            break;
                        }
                        int position2 = (int) (this.pro - interfaceC10430l2.getPosition());
                        if (position2 < 0) {
                            throw C17655l.yandex(null, "Offset to end of mdat was negative.");
                        }
                        interfaceC10430l2.remoteconfig(position2);
                        mopub();
                    } else {
                        int size2 = sparseArray.size();
                        C8501l c8501l5 = null;
                        for (int i10 = 0; i10 < size2; i10++) {
                            C16142l c16142l2 = ((C8501l) sparseArray.valueAt(i10)).loadAd;
                            if (c16142l2.metrica) {
                                long j5 = c16142l2.crashlytics;
                                if (j5 < j3) {
                                    c8501l5 = (C8501l) sparseArray.valueAt(i10);
                                    j3 = j5;
                                }
                            }
                        }
                        if (c8501l5 == null) {
                            this.ads = 3;
                        } else {
                            int position3 = (int) (j3 - interfaceC10430l2.getPosition());
                            if (position3 < 0) {
                                throw C17655l.yandex(null, "Offset to encryption data was negative.");
                            }
                            interfaceC10430l2.remoteconfig(position3);
                            C16142l c16142l3 = c8501l5.loadAd;
                            C13143l c13143l2 = c16142l3.vip;
                            interfaceC10430l2.readFully(c13143l2.yandex, 0, c13143l2.crashlytics);
                            c13143l2.m3562for(0);
                            c16142l3.metrica = false;
                        }
                    }
                } else {
                    int i11 = (int) (this.tapsense - ((long) this.Signature));
                    C13143l c13143l3 = this.license;
                    if (c13143l3 != null) {
                        interfaceC10430l2.readFully(c13143l3.yandex, 8, i11);
                        int i12 = this.subscription;
                        C16792l c16792l = new C16792l(i12, c13143l3);
                        if (!arrayDeque2.isEmpty()) {
                            ((C11311l) arrayDeque2.peek()).f22800l.add(c16792l);
                        } else if (i12 == 1936286840) {
                            Pair pairIsPro = isPro(interfaceC10430l2.getPosition(), c13143l3);
                            c6551l.yandex((C18645l) pairIsPro.second);
                            LinkedHashMap linkedHashMap = c6551l.yandex;
                            this.signatures = ((Long) pairIsPro.first).longValue();
                            if (this.f4113private) {
                                i7 = 1;
                            } else {
                                i7 = 1;
                                this.f4115synchronized.tapsense(linkedHashMap.size() == 1 ? (InterfaceC12703l) pairIsPro.second : c6551l.loadAd());
                                this.f4111native = true;
                            }
                            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && !this.f4113private && linkedHashMap.size() > i7) {
                                this.f4110extends = interfaceC10430l2.getPosition();
                            }
                        } else if (i12 == 1701671783 && this.f4114strictfp.length != 0) {
                            c13143l3.m3562for(8);
                            int iPurchase = AbstractC2686l.purchase(c13143l3.remoteconfig());
                            if (iPurchase == 0) {
                                strLicense = c13143l3.license();
                                strLicense.getClass();
                                strLicense2 = c13143l3.license();
                                strLicense2.getClass();
                                long jApplovin2 = c13143l3.applovin();
                                long jApplovin3 = c13143l3.applovin();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jM3970import2 = AbstractC15323l.m3970import(jApplovin3, 1000000L, jApplovin2, roundingMode);
                                long j6 = this.signatures;
                                long j7 = j6 != -9223372036854775807L ? j6 + jM3970import2 : -9223372036854775807L;
                                jM3970import = AbstractC15323l.m3970import(c13143l3.applovin(), 1000L, jApplovin2, roundingMode);
                                long j8 = j7;
                                j = jM3970import2;
                                jYandex = j8;
                                j2 = -9223372036854775807L;
                                jApplovin = c13143l3.applovin();
                            } else if (iPurchase != 1) {
                                AbstractC12900l.subscription("Skipping unsupported emsg version: ", iPurchase, "FragmentedMp4Extractor");
                            } else {
                                long jApplovin4 = c13143l3.applovin();
                                long jM3564package = c13143l3.m3564package();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jYandex = AbstractC15323l.m3970import(jM3564package, 1000000L, jApplovin4, roundingMode2);
                                long jM3970import3 = AbstractC15323l.m3970import(c13143l3.applovin(), 1000L, jApplovin4, roundingMode2);
                                long jApplovin5 = c13143l3.applovin();
                                strLicense = c13143l3.license();
                                strLicense.getClass();
                                strLicense2 = c13143l3.license();
                                strLicense2.getClass();
                                j2 = -9223372036854775807L;
                                jApplovin = jApplovin5;
                                jM3970import = jM3970import3;
                                j = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[c13143l3.yandex()];
                            c13143l3.firebase(0, c13143l3.yandex(), bArr);
                            C0458l c0458l = this.firebase;
                            DataOutputStream dataOutputStream = (DataOutputStream) c0458l.f1690l;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) c0458l.f1691l;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strLicense);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strLicense2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jM3970import);
                                dataOutputStream.writeLong(jApplovin);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                C13143l c13143l4 = new C13143l(byteArrayOutputStream.toByteArray());
                                int iYandex = c13143l4.yandex();
                                for (InterfaceC8979l interfaceC8979l : this.f4114strictfp) {
                                    c13143l4.m3562for(0);
                                    interfaceC8979l.purchase(iYandex, c13143l4);
                                }
                                if (jYandex == j2) {
                                    arrayDeque.addLast(new C16331l(iYandex, j, true));
                                    this.ad += iYandex;
                                } else if (!arrayDeque.isEmpty()) {
                                    arrayDeque.addLast(new C16331l(iYandex, jYandex, false));
                                    this.ad += iYandex;
                                } else if (c16391l == null || c16391l.billing()) {
                                    if (c16391l != null) {
                                        jYandex = c16391l.yandex(jYandex);
                                    }
                                    long j9 = jYandex;
                                    for (InterfaceC8979l interfaceC8979l2 : this.f4114strictfp) {
                                        interfaceC8979l2.yandex(j9, 1, iYandex, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new C16331l(iYandex, jYandex, false));
                                    this.ad += iYandex;
                                }
                            } catch (IOException e) {
                                C11467l.metrica(e);
                                return 0;
                            }
                        }
                        interfaceC10430l2 = interfaceC10430l;
                    } else {
                        interfaceC10430l2.remoteconfig(i11);
                    }
                    firebase(interfaceC10430l2.getPosition());
                }
            } else {
                int i13 = this.Signature;
                C13143l c13143l5 = this.smaato;
                if (i13 == 0) {
                    if (!interfaceC10430l2.loadAd(c13143l5.yandex, 0, 8, true)) {
                        long j10 = this.f4110extends;
                        if (j10 == -1) {
                            c1080l.subs(0);
                            return -1;
                        }
                        c1014l.f2761l = j10;
                        this.f4110extends = -1L;
                        this.f4115synchronized.tapsense(c6551l.loadAd());
                        this.f4113private = true;
                        return 1;
                    }
                    this.Signature = 8;
                    c13143l5.m3562for(0);
                    this.tapsense = c13143l5.applovin();
                    this.subscription = c13143l5.remoteconfig();
                }
                long j11 = this.tapsense;
                if (j11 == 1) {
                    interfaceC10430l2.readFully(c13143l5.yandex, 8, 8);
                    this.Signature += 8;
                    this.tapsense = c13143l5.m3564package();
                } else if (j11 == 0) {
                    long length = interfaceC10430l2.getLength();
                    if (length == -1 && !arrayDeque2.isEmpty()) {
                        length = ((C11311l) arrayDeque2.peek()).f22798l;
                    }
                    if (length != -1) {
                        this.tapsense = (length - interfaceC10430l2.getPosition()) + ((long) this.Signature);
                    }
                }
                long j12 = this.tapsense;
                int i14 = this.Signature;
                long j13 = i14;
                if (j12 < j13) {
                    if (this.subscription != 1718773093 || i14 != 8) {
                        throw C17655l.crashlytics("Atom size less than header length (unsupported).");
                    }
                    this.tapsense = j13;
                }
                if (this.f4110extends != -1) {
                    int i15 = this.subscription;
                    long j14 = this.tapsense;
                    if (i15 == 1936286840) {
                        c13143l.m3563native((int) j14);
                        System.arraycopy(c13143l5.yandex, 0, c13143l.yandex, 0, 8);
                        interfaceC10430l2.readFully(c13143l.yandex, 8, (int) (this.tapsense - ((long) this.Signature)));
                        c6551l.yandex((C18645l) isPro(interfaceC10430l2.mopub(), c13143l).second);
                    } else {
                        interfaceC10430l2.purchase((int) (j14 - j13), true);
                    }
                    mopub();
                } else {
                    long position4 = interfaceC10430l2.getPosition() - ((long) this.Signature);
                    int i16 = this.subscription;
                    if ((i16 == 1836019558 || i16 == 1835295092) && !this.f4111native) {
                        this.f4115synchronized.tapsense(new C9828l(this.isVip, position4));
                        this.f4111native = true;
                    }
                    if (this.subscription == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            C16142l c16142l4 = ((C8501l) sparseArray.valueAt(i17)).loadAd;
                            c16142l4.getClass();
                            c16142l4.crashlytics = position4;
                            c16142l4.loadAd = position4;
                        }
                    }
                    int i18 = this.subscription;
                    if (i18 == 1835295092) {
                        this.premium = null;
                        this.pro = position4 + this.tapsense;
                        this.ads = 2;
                    } else if (i18 == 1836019574 || i18 == 1953653099 || i18 == 1835297121 || i18 == 1835626086 || i18 == 1937007212 || i18 == 1836019558 || i18 == 1953653094 || i18 == 1836475768 || i18 == 1701082227 || i18 == 1835365473) {
                        long position5 = interfaceC10430l2.getPosition();
                        long j15 = this.tapsense;
                        long j16 = (position5 + j15) - 8;
                        if (j15 != this.Signature && this.subscription == 1835365473) {
                            c13143l.m3563native(8);
                            interfaceC10430l2.yandex(0, 8, c13143l.yandex);
                            AbstractC2686l.yandex(c13143l);
                            interfaceC10430l2.remoteconfig(c13143l.loadAd);
                            interfaceC10430l2.smaato();
                        }
                        arrayDeque2.push(new C11311l(this.subscription, j16));
                        if (this.tapsense == this.Signature) {
                            firebase(j16);
                        } else {
                            mopub();
                        }
                    } else if (i18 == 1751411826 || i18 == 1835296868 || i18 == 1836476516 || i18 == 1936286840 || i18 == 1937011556 || i18 == 1937011827 || i18 == 1668576371 || i18 == 1937011555 || i18 == 1937011578 || i18 == 1937013298 || i18 == 1937007471 || i18 == 1668232756 || i18 == 1937011571 || i18 == 1952867444 || i18 == 1952868452 || i18 == 1953196132 || i18 == 1953654136 || i18 == 1953658222 || i18 == 1886614376 || i18 == 1935763834 || i18 == 1935763823 || i18 == 1936027235 || i18 == 1970628964 || i18 == 1935828848 || i18 == 1936158820 || i18 == 1701606260 || i18 == 1835362404 || i18 == 1701671783 || i18 == 1969517665 || i18 == 1801812339 || i18 == 1768715124) {
                        if (this.Signature != 8) {
                            throw C17655l.crashlytics("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.tapsense > 2147483647L) {
                            throw C17655l.crashlytics("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        C13143l c13143l6 = new C13143l((int) this.tapsense);
                        System.arraycopy(c13143l5.yandex, 0, c13143l6.yandex, 0, 8);
                        this.license = c13143l6;
                        this.ads = 1;
                    } else {
                        if (this.tapsense > 2147483647L) {
                            throw C17655l.crashlytics("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.license = null;
                        this.ads = 1;
                    }
                }
            }
        }
        InterfaceC8979l interfaceC8979l3 = c8501l.yandex;
        C16142l c16142l5 = c8501l.loadAd;
        if (this.ads == 3) {
            this.applovin = !c8501l.remoteconfig ? c8501l.amazon.amazon[c8501l.billing] : c16142l5.admob[c8501l.billing];
            C5978l c5978l = c8501l.amazon.yandex.mopub;
            this.f4116throws = !((!Objects.equals(c5978l.metrica, "video/avc") ? !(!Objects.equals(c5978l.metrica, "video/hevc") || (i & 128) == 0) : (i & 64) != 0) ? false : z);
            if (c8501l.billing < c8501l.subs) {
                interfaceC10430l2.remoteconfig(this.applovin);
                C4098l c4098lLoadAd = c8501l.loadAd();
                if (c4098lLoadAd != null) {
                    C13143l c13143l7 = c16142l5.vip;
                    int i19 = c4098lLoadAd.amazon;
                    if (i19 != 0) {
                        c13143l7.m3568throw(i19);
                    }
                    int i20 = c8501l.billing;
                    if (c16142l5.firebase && c16142l5.smaato[i20]) {
                        c13143l7.m3568throw(c13143l7.m3567synchronized() * 6);
                    }
                }
                if (!c8501l.crashlytics()) {
                    this.premium = null;
                }
                this.ads = 3;
                return 0;
            }
            if (c8501l.amazon.yandex.admob == z) {
                this.applovin -= 8;
                interfaceC10430l2.remoteconfig(i2);
            }
            boolean zEquals = "audio/ac4".equals(c8501l.amazon.yandex.mopub.metrica);
            int i21 = this.applovin;
            if (zEquals) {
                this.appmetrica = c8501l.amazon(i21, 7);
                AbstractC13693l.amazon(this.applovin, c13143l);
                interfaceC8979l3.purchase(7, c13143l);
                this.appmetrica += 7;
                i5 = 0;
            } else {
                i5 = 0;
                this.appmetrica = c8501l.amazon(i21, 0);
            }
            this.applovin += this.appmetrica;
            this.ads = 4;
            this.inmobi = i5;
        }
        C9267l c9267l = c8501l.amazon;
        C11436l c11436l = c9267l.yandex;
        long jYandex2 = !c8501l.remoteconfig ? c9267l.billing[c8501l.billing] : c16142l5.subs[c8501l.billing];
        if (c16391l != null) {
            jYandex2 = c16391l.yandex(jYandex2);
        }
        int i22 = c11436l.firebase;
        C5978l c5978l2 = c11436l.mopub;
        if (i22 == 0) {
            c8501l2 = c8501l;
            while (true) {
                int i23 = this.appmetrica;
                int i24 = this.applovin;
                if (i23 >= i24) {
                    break;
                }
                this.appmetrica += interfaceC8979l3.billing(interfaceC10430l2, i24 - i23, false);
            }
        } else {
            C13143l c13143l8 = this.billing;
            byte[] bArr2 = c13143l8.yandex;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[r13] = 0;
            int i25 = 4 - i22;
            c8501l2 = c8501l;
            while (true) {
                i22 = i22;
                if (this.appmetrica < this.applovin) {
                    int i26 = this.inmobi;
                    if (i26 == 0) {
                        if (this.f4117volatile.length > 0 || !this.f4116throws) {
                            int iSmaato = AbstractC16763l.smaato(c5978l2);
                            if (i22 + iSmaato <= this.applovin - this.appmetrica) {
                                i4 = iSmaato;
                            } else {
                                i4 = 0;
                            }
                        } else {
                            i4 = 0;
                        }
                        interfaceC10430l2.readFully(bArr2, i25, i22 + i4);
                        c13143l8.m3562for(0);
                        int iRemoteconfig = c13143l8.remoteconfig();
                        if (iRemoteconfig < 0) {
                            throw C17655l.yandex(null, "Invalid NAL length");
                        }
                        this.inmobi = iRemoteconfig - i4;
                        C13143l c13143l9 = this.purchase;
                        i3 = i25;
                        c13143l9.m3562for(0);
                        interfaceC8979l3.purchase(4, c13143l9);
                        this.appmetrica += 4;
                        this.applovin += i3;
                        if (this.f4117volatile.length > 0 && i4 > 0 && (strSubs = AbstractC16763l.subs(c5978l2)) != null) {
                            switch (strSubs) {
                                case "video/hevc":
                                    if (((bArr2[4] & 126) >> 1) == 39) {
                                        z2 = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                case "video/avc":
                                    if ((bArr2[4] & 31) == 6) {
                                        z2 = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                case "video/vvc":
                                    if (((bArr2[5] & 248) >> 3) == 23) {
                                        z2 = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                    break;
                                default:
                                    z2 = false;
                                    break;
                            }
                        } else {
                            z2 = false;
                        }
                        this.f4112package = z2;
                        interfaceC8979l3.purchase(i4, c13143l8);
                        this.appmetrica += i4;
                        if (i4 > 0 && !this.f4116throws && AbstractC16763l.isPro(bArr2, i4, c5978l2)) {
                            this.f4116throws = true;
                        }
                    } else {
                        i3 = i25;
                        if (this.f4112package) {
                            C13143l c13143l10 = this.mopub;
                            c13143l10.m3563native(i26);
                            interfaceC10430l2.readFully(c13143l10.yandex, 0, this.inmobi);
                            interfaceC8979l3.purchase(this.inmobi, c13143l10);
                            int i27 = this.inmobi;
                            int iLicense = AbstractC16763l.license(c13143l10.crashlytics, c13143l10.yandex);
                            c13143l10.m3562for(0);
                            c13143l10.m3561extends(iLicense);
                            int i28 = c5978l2.adcel;
                            if (i28 == -1) {
                                if (c1080l.f2972l != 0) {
                                    c1080l.m801throw(0);
                                }
                            } else if (c1080l.f2972l != i28) {
                                c1080l.m801throw(i28);
                            }
                            c1080l.amazon(jYandex2, c13143l10);
                            if ((c8501l2.yandex() & 4) != 0) {
                                c1080l.subs(0);
                            }
                            iBilling = i27;
                        } else {
                            iBilling = interfaceC8979l3.billing(interfaceC10430l2, i26, false);
                        }
                        this.appmetrica += iBilling;
                        this.inmobi -= iBilling;
                        c13143l8 = c13143l8;
                    }
                    i25 = i3;
                }
            }
        }
        int iYandex2 = c8501l2.yandex();
        if (!this.f4116throws) {
            iYandex2 |= 67108864;
        }
        int i29 = iYandex2;
        C4098l c4098lLoadAd2 = c8501l2.loadAd();
        long j17 = jYandex2;
        interfaceC8979l3.yandex(j17, i29, this.applovin, 0, c4098lLoadAd2 != null ? c4098lLoadAd2.crashlytics : null);
        while (!arrayDeque.isEmpty()) {
            C16331l c16331l = (C16331l) arrayDeque.removeFirst();
            this.ad -= c16331l.crashlytics;
            long jYandex3 = c16331l.yandex;
            if (c16331l.loadAd) {
                jYandex3 += j17;
            }
            if (c16391l != null) {
                jYandex3 = c16391l.yandex(jYandex3);
            }
            long j18 = jYandex3;
            for (InterfaceC8979l interfaceC8979l4 : this.f4114strictfp) {
                interfaceC8979l4.yandex(j18, 1, c16331l.crashlytics, this.ad, null);
            }
        }
        if (!c8501l2.crashlytics()) {
            this.premium = null;
        }
        this.ads = 3;
        return 0;
    }

    public final void mopub() {
        this.ads = 0;
        this.Signature = 0;
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
