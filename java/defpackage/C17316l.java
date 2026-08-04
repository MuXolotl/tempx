package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: lٟۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17316l implements InterfaceC14833l {

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public static final UUID f33587const;

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static final byte[] f33588implements;

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final byte[] f33589protected;

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static final Map f33590return;

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final byte[] f33591transient = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static final byte[] f33592while;
    public long Signature;

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public boolean f33593abstract;
    public boolean ad;
    public ByteBuffer adcel;
    public final C13143l admob;
    public long ads;
    public C3632l advert;
    public final boolean amazon;
    public final SparseArray applovin;
    public boolean appmetrica;
    public final InterfaceC5304l billing;

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public InterfaceC2053l f33594break;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public int f33595case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public long f33596catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public int f33597class;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public int[] f33598continue;
    public final SparseArray crashlytics;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public int f33599default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public long f33600else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public long f33601extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public boolean f33602final;

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public int f33603finally;
    public final C13143l firebase;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public boolean f33604for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public int f33605goto;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public int f33606import;
    public long inmobi;

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public boolean f33607instanceof;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public int f33608interface;
    public final C13143l isPro;
    public boolean isVip;
    public long license;
    public final C5601l loadAd;
    public final C13143l metrica;
    public final C13143l mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public long f33609native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public long f33610new;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public long f33611package;
    public long premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public long f33612private;
    public boolean pro;

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public boolean f33613public;
    public final boolean purchase;
    public final C13143l remoteconfig;
    public int signatures;
    public final C13143l smaato;
    public final C13143l startapp;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public int f33614static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public int f33615strictfp;
    public final C13143l subs;
    public long subscription;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public int f33616super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public int f33617switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public long f33618synchronized;
    public long tapsense;

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public byte f33619this;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public int f33620throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public int f33621throws;

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public boolean f33622try;
    public final C13143l vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean f33623volatile;
    public final C10371l yandex;

    static {
        String str = AbstractC15323l.yandex;
        f33589protected = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f33592while = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f33588implements = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f33587const = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC11043l.firebase(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC11043l.firebase(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f33590return = DesugarCollections.unmodifiableMap(map);
    }

    public C17316l(InterfaceC5304l interfaceC5304l, int i) {
        C10371l c10371l = new C10371l();
        this.subscription = -1L;
        this.tapsense = -9223372036854775807L;
        this.Signature = -9223372036854775807L;
        this.license = -9223372036854775807L;
        this.inmobi = -9223372036854775807L;
        this.f33621throws = -1;
        this.f33611package = -1L;
        this.f33618synchronized = -1L;
        this.f33615strictfp = -1;
        this.f33609native = -1L;
        this.f33612private = -1L;
        this.f33601extends = -9223372036854775807L;
        this.yandex = c10371l;
        c10371l.amazon = new C16543l(17, this);
        this.billing = interfaceC5304l;
        this.applovin = new SparseArray();
        this.amazon = (i & 1) == 0;
        this.purchase = (i & 2) == 0;
        this.loadAd = new C5601l(1);
        this.crashlytics = new SparseArray();
        this.subs = new C13143l(4);
        this.isPro = new C13143l(ByteBuffer.allocate(4).putInt(-1).array());
        this.firebase = new C13143l(4);
        this.mopub = new C13143l(AbstractC16763l.yandex);
        this.admob = new C13143l(4);
        this.smaato = new C13143l();
        this.remoteconfig = new C13143l();
        this.vip = new C13143l(8);
        this.metrica = new C13143l();
        this.startapp = new C13143l();
        this.f33598continue = new int[1];
        this.ad = true;
    }

    public static byte[] isPro(String str, long j, long j2) {
        AbstractC12442l.admob(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = AbstractC15323l.yandex;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final void adcel(InterfaceC10430l interfaceC10430l, byte[] bArr, int i) {
        int length = bArr.length + i;
        C13143l c13143l = this.remoteconfig;
        byte[] bArr2 = c13143l.yandex;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c13143l.getClass();
            c13143l.m3565private(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        interfaceC10430l.readFully(c13143l.yandex, bArr.length, i);
        c13143l.m3562for(0);
        c13143l.m3561extends(length);
    }

    public final void admob(int i) {
        if (this.advert != null) {
            return;
        }
        throw C17655l.yandex(null, "Element " + i + " must be in a TrackEntry");
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.f33601extends = -9223372036854775807L;
        this.f33620throw = 0;
        C10371l c10371l = this.yandex;
        c10371l.purchase = 0;
        c10371l.loadAd.clear();
        C5601l c5601l = c10371l.crashlytics;
        c5601l.f11897l = 0;
        c5601l.f11896l = 0;
        C5601l c5601l2 = this.loadAd;
        c5601l2.f11897l = 0;
        c5601l2.f11896l = 0;
        vip();
        this.appmetrica = false;
        this.inmobi = -9223372036854775807L;
        this.f33621throws = -1;
        this.f33611package = -1L;
        this.f33618synchronized = -1L;
        if (!this.isVip) {
            this.applovin.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.crashlytics;
            if (i >= sparseArray.size()) {
                return;
            }
            C3964l c3964l = ((C3632l) sparseArray.valueAt(i)).f7591interface;
            if (c3964l != null) {
                c3964l.loadAd = false;
                c3964l.crashlytics = 0;
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        if (this.purchase) {
            interfaceC2053l = new C11919l(interfaceC2053l, this.billing);
        }
        this.f33594break = interfaceC2053l;
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) throws EOFException, InterruptedIOException {
        C14785l c14785l = new C14785l((byte) 0, 23);
        C13143l c13143l = (C13143l) c14785l.f28907l;
        C11826l c11826l = (C11826l) interfaceC10430l;
        long j = c11826l.f23654l;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        c11826l.billing(c13143l.yandex, 0, 4, false);
        c14785l.f28908l = 4;
        for (long jApplovin = c13143l.applovin(); jApplovin != 440786851; jApplovin = ((long) (c13143l.yandex[0] & 255)) | ((jApplovin << 8) & (-256))) {
            int i2 = c14785l.f28908l + 1;
            c14785l.f28908l = i2;
            if (i2 == i) {
                return false;
            }
            c11826l.billing(c13143l.yandex, 0, 1, false);
        }
        long jPro = c14785l.pro(c11826l);
        long j3 = c14785l.f28908l;
        if (jPro != Long.MIN_VALUE && (j == -1 || j3 + jPro < j)) {
            while (true) {
                long j4 = c14785l.f28908l;
                long j5 = j3 + jPro;
                if (j4 < j5) {
                    if (c14785l.pro(c11826l) == Long.MIN_VALUE) {
                        break;
                    }
                    long jPro2 = c14785l.pro(c11826l);
                    if (jPro2 < 0 || jPro2 > 2147483647L) {
                        break;
                    }
                    if (jPro2 != 0) {
                        int i3 = (int) jPro2;
                        c11826l.firebase(i3, false);
                        c14785l.f28908l += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void firebase() {
        if (!this.ad) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.crashlytics;
            if (i >= sparseArray.size()) {
                InterfaceC2053l interfaceC2053l = this.f33594break;
                interfaceC2053l.getClass();
                interfaceC2053l.firebase();
                this.ad = false;
                return;
            }
            if (((C3632l) sparseArray.valueAt(i)).f7596static) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x0362  */
    /* JADX WARN: Code duplicated, block: B:325:0x0527  */
    /* JADX WARN: Code duplicated, block: B:626:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:635:0x0ab2  */
    /* JADX WARN: Code duplicated, block: B:636:0x0abe  */
    /* JADX WARN: Code duplicated, block: B:638:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:640:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:642:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:645:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:647:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:650:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:653:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:656:0x0af4  */
    /* JADX WARN: Code duplicated, block: B:658:0x0afa  */
    /* JADX WARN: Code duplicated, block: B:678:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:680:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:683:0x0bd1  */
    /* JADX WARN: Code duplicated, block: B:686:0x0be4  */
    /* JADX WARN: Code duplicated, block: B:689:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:695:0x0c02  */
    /* JADX WARN: Code duplicated, block: B:696:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:698:0x0c0e  */
    /* JADX WARN: Code duplicated, block: B:699:0x0c11  */
    /* JADX WARN: Code duplicated, block: B:701:0x0c1b  */
    /* JADX WARN: Code duplicated, block: B:707:0x0c33  */
    /* JADX WARN: Code duplicated, block: B:709:0x0c4c  */
    /* JADX WARN: Code duplicated, block: B:711:0x0c52  */
    /* JADX WARN: Code duplicated, block: B:726:0x0c7d  */
    /* JADX WARN: Code duplicated, block: B:731:0x0c91  */
    /* JADX WARN: Code duplicated, block: B:732:0x0c94  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [lؚٖٟ] */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v16, types: [lَٜۤ] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4, types: [lَٜۤ] */
    /* JADX WARN: Type inference failed for: r34v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v153 */
    /* JADX WARN: Type inference failed for: r3v41, types: [int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r6v1, types: [lَٙؐ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [lؘُٛ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC14833l
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws C17655l {
        boolean z;
        int i;
        int i2;
        String str;
        int i3;
        int iPurchase;
        ?? r1;
        boolean z2;
        ?? r2;
        byte b;
        List listSingletonList;
        int iM3985throws;
        ?? r3;
        int i4;
        String str2;
        List list;
        RuntimeException runtimeException;
        Pair pair;
        String str3;
        List list2;
        List listIsVip;
        String str4;
        List list3;
        List listIsVip2;
        List list4;
        List list5;
        List list6;
        int i5;
        C12984l c12984l;
        boolean zSubs;
        int i6;
        int i7;
        float f;
        C1591l c1591l;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i8;
        int i9;
        int i10;
        String str6;
        String str7;
        C18176l c18176lYandex;
        int i11;
        List list7;
        int i12;
        long j;
        long j2;
        long j3;
        C7417l c7417l;
        C11429l c11429l;
        C7417l c7417lYandex;
        C17316l c17316l = this;
        boolean z3 = false;
        c17316l.f33604for = false;
        boolean z4 = true;
        boolean z5 = true;
        while (z5 && !c17316l.f33604for) {
            ?? r6 = c17316l.yandex;
            ?? r7 = r6.crashlytics;
            ArrayDeque arrayDeque = r6.loadAd;
            r6.amazon.getClass();
            while (true) {
                C3712l c3712l = (C3712l) arrayDeque.peek();
                if (c3712l == null || interfaceC10430l.getPosition() < c3712l.loadAd) {
                    boolean z6 = z3 ? 1 : 0;
                    ?? r4 = interfaceC10430l;
                    if (r6.purchase == 0) {
                        int i13 = 4;
                        long jMopub = r7.mopub(r4, true, z6, 4);
                        if (jMopub == -2) {
                            byte[] bArr2 = r6.yandex;
                            r4.smaato();
                            ?? r5 = z6;
                            while (true) {
                                r4.yandex(r5, i13, bArr2);
                                byte b2 = bArr2[r5];
                                int i14 = 0;
                                while (true) {
                                    long[] jArr = C5601l.f11893l;
                                    if (i14 >= 8) {
                                        i3 = -1;
                                    } else if ((((long) b2) & jArr[i14]) != 0) {
                                        i3 = i14 + 1;
                                    } else {
                                        i14++;
                                    }
                                }
                                if (i3 != -1 && i3 <= 4) {
                                    iPurchase = (int) C5601l.purchase(i3, false, bArr2);
                                    Object obj = r6.amazon.f32482l;
                                    if (iPurchase == 357149030 || iPurchase == 524531317 || iPurchase == 475249515 || iPurchase == 374648427) {
                                    }
                                }
                                r4.remoteconfig(1);
                                i13 = 4;
                                r5 = 0;
                            }
                            r4.remoteconfig(i3);
                            jMopub = iPurchase;
                        }
                        z = true;
                        if (jMopub == -1) {
                            z5 = false;
                            r1 = r4;
                        } else {
                            r6.billing = (int) jMopub;
                            r6.purchase = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (r6.purchase == z) {
                        r6.mopub = r7.mopub(r4, false, z, 8);
                        r6.purchase = 2;
                    }
                    ?? r0 = r6.amazon;
                    int i15 = r6.billing;
                    Object obj2 = r0.f32482l;
                    switch (i15) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        r4.remoteconfig((int) r6.mopub);
                        r6.purchase = 0;
                        z3 = false;
                        z4 = true;
                    } else if (i == 1) {
                        long position = r4.getPosition();
                        arrayDeque.push(new C3712l(r6.billing, r6.mopub + position));
                        r6.amazon.applovin(r6.billing, position, r6.mopub);
                        r6.purchase = 0;
                        r2 = r4;
                    } else if (i == 2) {
                        long j4 = r6.mopub;
                        if (j4 > 8) {
                            throw C17655l.yandex(null, "Invalid integer size: " + r6.mopub);
                        }
                        r0.tapsense(i15, r6.yandex(r4, (int) j4));
                        r6.purchase = 0;
                        r2 = r4;
                    } else if (i == 3) {
                        long j5 = r6.mopub;
                        if (j5 > 2147483647L) {
                            throw C17655l.yandex(null, "String element size: " + r6.mopub);
                        }
                        int i16 = (int) j5;
                        if (i16 == 0) {
                            str = "";
                            i2 = 0;
                        } else {
                            byte[] bArr3 = new byte[i16];
                            r4.readFully(bArr3, 0, i16);
                            while (i16 > 0 && bArr3[i16 - 1] == 0) {
                                i16--;
                            }
                            i2 = 0;
                            str = new String(bArr3, 0, i16);
                        }
                        r0.appmetrica(i15, str);
                        r6.purchase = i2;
                        r2 = r4;
                    } else if (i == 4) {
                        r0.isPro(i15, (int) r6.mopub, r4);
                        r6.purchase = 0;
                        r2 = r4;
                    } else {
                        if (i != 5) {
                            throw C17655l.yandex(null, "Invalid element type " + i);
                        }
                        long j6 = r6.mopub;
                        if (j6 != 4 && j6 != 8) {
                            throw C17655l.yandex(null, "Invalid float size: " + r6.mopub);
                        }
                        int i17 = (int) j6;
                        long jYandex = r6.yandex(r4, i17);
                        double dIntBitsToFloat = i17 == 4 ? Float.intBitsToFloat((int) jYandex) : Double.longBitsToDouble(jYandex);
                        C17316l c17316l2 = (C17316l) r0.f32482l;
                        if (i15 == 181) {
                            c17316l2.admob(i15);
                            c17316l2.advert.f7599switch = (int) dIntBitsToFloat;
                        } else if (i15 != 17545) {
                            switch (i15) {
                                case 21969:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7602throws = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7594package = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7600synchronized = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7597strictfp = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7603volatile = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7592native = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7595private = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7586extends = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7588for = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    c17316l2.admob(i15);
                                    c17316l2.advert.f7601throw = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i15) {
                                        case 30323:
                                            c17316l2.admob(i15);
                                            c17316l2.advert.Signature = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            c17316l2.admob(i15);
                                            c17316l2.advert.license = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            c17316l2.admob(i15);
                                            c17316l2.advert.pro = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            c17316l2.Signature = (long) dIntBitsToFloat;
                        }
                        r6.purchase = 0;
                        r2 = r4;
                    }
                } else {
                    C16543l c16543l = r6.amazon;
                    int i18 = ((C3712l) arrayDeque.pop()).yandex;
                    C17316l c17316l3 = (C17316l) c16543l.f32482l;
                    SparseArray sparseArray = c17316l3.applovin;
                    SparseArray sparseArray2 = c17316l3.crashlytics;
                    c17316l3.f33594break.getClass();
                    if (i18 != 160) {
                        int i19 = 20;
                        String str8 = "video/webm";
                        if (i18 == 174) {
                            C3632l c3632l = c17316l3.advert;
                            c3632l.getClass();
                            String str9 = c3632l.crashlytics;
                            if (str9 == null) {
                                throw C17655l.yandex(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str9) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i20 = c3632l.amazon;
                                    switch (str9) {
                                        case "V_MPEG4/ISO/AP":
                                            b = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b = 3;
                                            break;
                                        case "A_VORBIS":
                                            b = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b = 12;
                                            break;
                                        case "A_AAC":
                                            b = 13;
                                            break;
                                        case "A_AC3":
                                            b = 14;
                                            break;
                                        case "A_DTS":
                                            b = 15;
                                            break;
                                        case "V_AV1":
                                            b = 16;
                                            break;
                                        case "V_VP8":
                                            b = 17;
                                            break;
                                        case "V_VP9":
                                            b = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b = 19;
                                            break;
                                        case "V_THEORA":
                                            b = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b = 29;
                                            break;
                                        case "V_MPEG2":
                                            b = 30;
                                            break;
                                        case "A_EAC3":
                                            b = 31;
                                            break;
                                        case "A_FLAC":
                                            b = 32;
                                            break;
                                        case "A_OPUS":
                                            b = 33;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    String str10 = "video/x-unknown";
                                    switch (b) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = c3632l.smaato;
                                            str10 = "video/mp4v-es";
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            iM3985throws = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null && (c18176lYandex = C18176l.yandex(new C13143l(c3632l.f7581catch))) != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z7 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21 = (z7 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6 || (i8 = c3632l.ads) == i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (c3632l.metrica * i7) / (c3632l.vip * i8);
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f || c3632l.f7594package == -1.0f || c3632l.f7600synchronized == -1.0f || c3632l.f7597strictfp == -1.0f || c3632l.f7603volatile == -1.0f || c3632l.f7592native == -1.0f || c3632l.f7595private == -1.0f || c3632l.f7586extends == -1.0f || c3632l.f7588for == -1.0f || c3632l.f7601throw == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((c3632l.f7602throws * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((c3632l.f7594package * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((c3632l.f7600synchronized * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((c3632l.f7597strictfp * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((c3632l.f7603volatile * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((c3632l.f7592native * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((c3632l.f7595private * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((c3632l.f7586extends * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (c3632l.f7588for + 0.5f));
                                                        byteBufferOrder.putShort((short) (c3632l.f7601throw + 0.5f));
                                                        byteBufferOrder.putShort((short) c3632l.appmetrica);
                                                        byteBufferOrder.putShort((short) c3632l.inmobi);
                                                        bArr = bArr5;
                                                    }
                                                    int i22 = c3632l.signatures;
                                                    int i23 = c3632l.applovin;
                                                    int i24 = c3632l.premium;
                                                    int i25 = c3632l.startapp;
                                                    c1591l = new C1591l(i22, i23, i24, bArr, i25, i25);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = ((Integer) map.get(c3632l.loadAd)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0 && Float.compare(c3632l.Signature, 0.0f) == 0 && Float.compare(c3632l.license, 0.0f) == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0 || Float.compare(c3632l.pro, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(c3632l.pro, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10) && !"text/x-ssa".equals(str10) && !"text/vtt".equals(str10) && !"application/vobsub".equals(str10) && !"application/pgs".equals(str10) && !"application/dvbsubs".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 2:
                                            str8 = "video/webm";
                                            C13143l c13143l = new C13143l(c3632l.yandex(c3632l.crashlytics));
                                            try {
                                                int iTapsense = c13143l.tapsense();
                                                if (iTapsense != 1) {
                                                    if (iTapsense == 65534) {
                                                        c13143l.m3562for(24);
                                                        long jSignature = c13143l.Signature();
                                                        UUID uuid = f33587const;
                                                        if (jSignature != uuid.getMostSignificantBits() || c13143l.Signature() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str10 = "audio/x-unknown";
                                                        iM3985throws = -1;
                                                        list5 = null;
                                                        str2 = null;
                                                        list6 = list5;
                                                        i4 = -1;
                                                        list = list6;
                                                        if (c3632l.f7581catch != null) {
                                                            str2 = c18176lYandex.f35617l;
                                                            str10 = "video/dolby-vision";
                                                        }
                                                        boolean z8 = c3632l.f7587final;
                                                        if (c3632l.f7584default) {
                                                            i5 = 2;
                                                        } else {
                                                            i5 = 0;
                                                        }
                                                        int i26 = (z8 ? 1 : 0) | i5;
                                                        c12984l = new C12984l();
                                                        zSubs = AbstractC3825l.subs(str10);
                                                        Map map2 = f33590return;
                                                        if (zSubs) {
                                                            c12984l.f25447throws = c3632l.f7585else;
                                                            c12984l.f25442package = c3632l.f7599switch;
                                                            c12984l.f25445synchronized = iM3985throws;
                                                        } else if (AbstractC3825l.remoteconfig(str10)) {
                                                            if (c3632l.subscription == 0) {
                                                                i9 = c3632l.adcel;
                                                                i6 = -1;
                                                                if (i9 == -1) {
                                                                    i9 = c3632l.vip;
                                                                }
                                                                c3632l.adcel = i9;
                                                                i10 = c3632l.ads;
                                                                if (i10 == -1) {
                                                                    i10 = c3632l.metrica;
                                                                }
                                                                c3632l.ads = i10;
                                                            } else {
                                                                i6 = -1;
                                                            }
                                                            i7 = c3632l.adcel;
                                                            if (i7 != i6) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (c3632l.isVip) {
                                                                if (c3632l.f7602throws != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i27 = c3632l.signatures;
                                                                int i28 = c3632l.applovin;
                                                                int i29 = c3632l.premium;
                                                                int i210 = c3632l.startapp;
                                                                c1591l = new C1591l(i27, i28, i29, bArr, i210, i210);
                                                            } else {
                                                                c1591l = null;
                                                            }
                                                            str5 = c3632l.loadAd;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (c3632l.tapsense == 0) {
                                                                if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            c12984l.Signature = c3632l.vip;
                                                            c12984l.license = c3632l.metrica;
                                                            c12984l.signatures = f;
                                                            c12984l.isVip = iIntValue;
                                                            c12984l.premium = c3632l.ad;
                                                            c12984l.applovin = c3632l.advert;
                                                            c12984l.appmetrica = c1591l;
                                                        } else if (!"application/x-subrip".equals(str10)) {
                                                            throw C17655l.yandex(null, "Unexpected MIME type.");
                                                        }
                                                        str6 = c3632l.loadAd;
                                                        if (str6 != null) {
                                                            c12984l.loadAd = c3632l.loadAd;
                                                        }
                                                        c12984l.yandex = Integer.toString(i20);
                                                        if (c3632l.yandex) {
                                                            str7 = str8;
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                                        c12984l.vip = AbstractC3825l.vip(str10);
                                                        c12984l.metrica = i4;
                                                        c12984l.amazon = c3632l.f7593new;
                                                        c12984l.purchase = i26;
                                                        c12984l.adcel = list;
                                                        c12984l.isPro = str2;
                                                        c12984l.ads = c3632l.remoteconfig;
                                                        c3632l.f7598super = new C5978l(c12984l);
                                                        c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                                        sparseArray2.put(c3632l.amazon, c3632l);
                                                    }
                                                    AbstractC6427l.vip("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str10 = "audio/x-unknown";
                                                    iM3985throws = -1;
                                                    list5 = null;
                                                    str2 = null;
                                                    list6 = list5;
                                                    i4 = -1;
                                                    list = list6;
                                                    if (c3632l.f7581catch != null) {
                                                        str2 = c18176lYandex.f35617l;
                                                        str10 = "video/dolby-vision";
                                                    }
                                                    boolean z9 = c3632l.f7587final;
                                                    if (c3632l.f7584default) {
                                                        i5 = 2;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    int i211 = (z9 ? 1 : 0) | i5;
                                                    c12984l = new C12984l();
                                                    zSubs = AbstractC3825l.subs(str10);
                                                    Map map3 = f33590return;
                                                    if (zSubs) {
                                                        c12984l.f25447throws = c3632l.f7585else;
                                                        c12984l.f25442package = c3632l.f7599switch;
                                                        c12984l.f25445synchronized = iM3985throws;
                                                    } else if (AbstractC3825l.remoteconfig(str10)) {
                                                        if (c3632l.subscription == 0) {
                                                            i9 = c3632l.adcel;
                                                            i6 = -1;
                                                            if (i9 == -1) {
                                                                i9 = c3632l.vip;
                                                            }
                                                            c3632l.adcel = i9;
                                                            i10 = c3632l.ads;
                                                            if (i10 == -1) {
                                                                i10 = c3632l.metrica;
                                                            }
                                                            c3632l.ads = i10;
                                                        } else {
                                                            i6 = -1;
                                                        }
                                                        i7 = c3632l.adcel;
                                                        if (i7 != i6) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (c3632l.isVip) {
                                                            if (c3632l.f7602throws != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i212 = c3632l.signatures;
                                                            int i213 = c3632l.applovin;
                                                            int i214 = c3632l.premium;
                                                            int i215 = c3632l.startapp;
                                                            c1591l = new C1591l(i212, i213, i214, bArr, i215, i215);
                                                        } else {
                                                            c1591l = null;
                                                        }
                                                        str5 = c3632l.loadAd;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (c3632l.tapsense == 0) {
                                                            if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c12984l.Signature = c3632l.vip;
                                                        c12984l.license = c3632l.metrica;
                                                        c12984l.signatures = f;
                                                        c12984l.isVip = iIntValue;
                                                        c12984l.premium = c3632l.ad;
                                                        c12984l.applovin = c3632l.advert;
                                                        c12984l.appmetrica = c1591l;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw C17655l.yandex(null, "Unexpected MIME type.");
                                                    }
                                                    str6 = c3632l.loadAd;
                                                    if (str6 != null) {
                                                        c12984l.loadAd = c3632l.loadAd;
                                                    }
                                                    c12984l.yandex = Integer.toString(i20);
                                                    if (c3632l.yandex) {
                                                        str7 = str8;
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                                    c12984l.vip = AbstractC3825l.vip(str10);
                                                    c12984l.metrica = i4;
                                                    c12984l.amazon = c3632l.f7593new;
                                                    c12984l.purchase = i211;
                                                    c12984l.adcel = list;
                                                    c12984l.isPro = str2;
                                                    c12984l.ads = c3632l.remoteconfig;
                                                    c3632l.f7598super = new C5978l(c12984l);
                                                    c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                                    sparseArray2.put(c3632l.amazon, c3632l);
                                                    break;
                                                }
                                                int i30 = c3632l.f7580case;
                                                String str11 = AbstractC15323l.yandex;
                                                iM3985throws = AbstractC15323l.m3985throws(i30, ByteOrder.LITTLE_ENDIAN);
                                                if (iM3985throws == 0) {
                                                    AbstractC6427l.vip("MatroskaExtractor", "Unsupported PCM bit depth: " + c3632l.f7580case + ". Setting mimeType to audio/x-unknown");
                                                    str10 = "audio/x-unknown";
                                                    iM3985throws = -1;
                                                } else {
                                                    str10 = "audio/raw";
                                                }
                                                list5 = null;
                                                str2 = null;
                                                list6 = list5;
                                                i4 = -1;
                                                list = list6;
                                                if (c3632l.f7581catch != null) {
                                                    str2 = c18176lYandex.f35617l;
                                                    str10 = "video/dolby-vision";
                                                }
                                                boolean z10 = c3632l.f7587final;
                                                if (c3632l.f7584default) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i216 = (z10 ? 1 : 0) | i5;
                                                c12984l = new C12984l();
                                                zSubs = AbstractC3825l.subs(str10);
                                                Map map4 = f33590return;
                                                if (zSubs) {
                                                    c12984l.f25447throws = c3632l.f7585else;
                                                    c12984l.f25442package = c3632l.f7599switch;
                                                    c12984l.f25445synchronized = iM3985throws;
                                                } else if (AbstractC3825l.remoteconfig(str10)) {
                                                    if (c3632l.subscription == 0) {
                                                        i9 = c3632l.adcel;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = c3632l.vip;
                                                        }
                                                        c3632l.adcel = i9;
                                                        i10 = c3632l.ads;
                                                        if (i10 == -1) {
                                                            i10 = c3632l.metrica;
                                                        }
                                                        c3632l.ads = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = c3632l.adcel;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (c3632l.isVip) {
                                                        if (c3632l.f7602throws != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i217 = c3632l.signatures;
                                                        int i218 = c3632l.applovin;
                                                        int i219 = c3632l.premium;
                                                        int i2110 = c3632l.startapp;
                                                        c1591l = new C1591l(i217, i218, i219, bArr, i2110, i2110);
                                                    } else {
                                                        c1591l = null;
                                                    }
                                                    str5 = c3632l.loadAd;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (c3632l.tapsense == 0) {
                                                        if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c12984l.Signature = c3632l.vip;
                                                    c12984l.license = c3632l.metrica;
                                                    c12984l.signatures = f;
                                                    c12984l.isVip = iIntValue;
                                                    c12984l.premium = c3632l.ad;
                                                    c12984l.applovin = c3632l.advert;
                                                    c12984l.appmetrica = c1591l;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw C17655l.yandex(null, "Unexpected MIME type.");
                                                }
                                                str6 = c3632l.loadAd;
                                                if (str6 != null) {
                                                    c12984l.loadAd = c3632l.loadAd;
                                                }
                                                c12984l.yandex = Integer.toString(i20);
                                                if (c3632l.yandex) {
                                                    str7 = str8;
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                                c12984l.vip = AbstractC3825l.vip(str10);
                                                c12984l.metrica = i4;
                                                c12984l.amazon = c3632l.f7593new;
                                                c12984l.purchase = i216;
                                                c12984l.adcel = list;
                                                c12984l.isPro = str2;
                                                c12984l.ads = c3632l.remoteconfig;
                                                c3632l.f7598super = new C5978l(c12984l);
                                                c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                                sparseArray2.put(c3632l.amazon, c3632l);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw C17655l.yandex(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            str8 = "video/webm";
                                            c3632l.f7591interface = new C3964l();
                                            str10 = "audio/true-hd";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z11 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111 = (z11 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map5 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2112 = c3632l.signatures;
                                                    int i2113 = c3632l.applovin;
                                                    int i2114 = c3632l.premium;
                                                    int i2115 = c3632l.startapp;
                                                    c1591l = new C1591l(i2112, i2113, i2114, bArr, i2115, i2115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 4:
                                            byte[] bArrYandex = c3632l.yandex(str9);
                                            try {
                                                r3 = bArrYandex[0];
                                                try {
                                                    if (r3 != 2) {
                                                        throw C17655l.yandex(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i31 = 0;
                                                    int i32 = 1;
                                                    while (true) {
                                                        int i33 = bArrYandex[i32] & 255;
                                                        if (i33 != 255) {
                                                            int i34 = i31 + i33;
                                                            int i35 = i32 + 1;
                                                            int i36 = 0;
                                                            while (true) {
                                                                int i37 = bArrYandex[i35] & 255;
                                                                if (i37 != 255) {
                                                                    int i38 = i35 + 1;
                                                                    int i39 = i36 + i37;
                                                                    if (bArrYandex[i38] != 1) {
                                                                        throw C17655l.yandex(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i34];
                                                                    System.arraycopy(bArrYandex, i38, bArr6, 0, i34);
                                                                    int i40 = i38 + i34;
                                                                    if (bArrYandex[i40] != 3) {
                                                                        throw C17655l.yandex(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i41 = i40 + i39;
                                                                    if (bArrYandex[i41] != 5) {
                                                                        throw C17655l.yandex(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrYandex.length - i41];
                                                                    System.arraycopy(bArrYandex, i41, bArr7, 0, bArrYandex.length - i41);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str10 = "audio/vorbis";
                                                                    i4 = 8192;
                                                                    str2 = null;
                                                                    list3 = arrayList;
                                                                    list = list3;
                                                                    iM3985throws = -1;
                                                                    if (c3632l.f7581catch != null) {
                                                                        str2 = c18176lYandex.f35617l;
                                                                        str10 = "video/dolby-vision";
                                                                    }
                                                                    boolean z12 = c3632l.f7587final;
                                                                    if (c3632l.f7584default) {
                                                                        i5 = 2;
                                                                    } else {
                                                                        i5 = 0;
                                                                    }
                                                                    int i2116 = (z12 ? 1 : 0) | i5;
                                                                    c12984l = new C12984l();
                                                                    zSubs = AbstractC3825l.subs(str10);
                                                                    Map map6 = f33590return;
                                                                    if (zSubs) {
                                                                        c12984l.f25447throws = c3632l.f7585else;
                                                                        c12984l.f25442package = c3632l.f7599switch;
                                                                        c12984l.f25445synchronized = iM3985throws;
                                                                    } else if (AbstractC3825l.remoteconfig(str10)) {
                                                                        if (c3632l.subscription == 0) {
                                                                            i9 = c3632l.adcel;
                                                                            i6 = -1;
                                                                            if (i9 == -1) {
                                                                                i9 = c3632l.vip;
                                                                            }
                                                                            c3632l.adcel = i9;
                                                                            i10 = c3632l.ads;
                                                                            if (i10 == -1) {
                                                                                i10 = c3632l.metrica;
                                                                            }
                                                                            c3632l.ads = i10;
                                                                        } else {
                                                                            i6 = -1;
                                                                        }
                                                                        i7 = c3632l.adcel;
                                                                        if (i7 != i6) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (c3632l.isVip) {
                                                                            if (c3632l.f7602throws != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i2117 = c3632l.signatures;
                                                                            int i2118 = c3632l.applovin;
                                                                            int i2119 = c3632l.premium;
                                                                            int i21110 = c3632l.startapp;
                                                                            c1591l = new C1591l(i2117, i2118, i2119, bArr, i21110, i21110);
                                                                        } else {
                                                                            c1591l = null;
                                                                        }
                                                                        str5 = c3632l.loadAd;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (c3632l.tapsense == 0) {
                                                                            if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        c12984l.Signature = c3632l.vip;
                                                                        c12984l.license = c3632l.metrica;
                                                                        c12984l.signatures = f;
                                                                        c12984l.isVip = iIntValue;
                                                                        c12984l.premium = c3632l.ad;
                                                                        c12984l.applovin = c3632l.advert;
                                                                        c12984l.appmetrica = c1591l;
                                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                                        throw C17655l.yandex(null, "Unexpected MIME type.");
                                                                    }
                                                                    str6 = c3632l.loadAd;
                                                                    if (str6 != null) {
                                                                        c12984l.loadAd = c3632l.loadAd;
                                                                    }
                                                                    c12984l.yandex = Integer.toString(i20);
                                                                    if (c3632l.yandex) {
                                                                        str7 = str8;
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                                                    c12984l.vip = AbstractC3825l.vip(str10);
                                                                    c12984l.metrica = i4;
                                                                    c12984l.amazon = c3632l.f7593new;
                                                                    c12984l.purchase = i2116;
                                                                    c12984l.adcel = list;
                                                                    c12984l.isPro = str2;
                                                                    c12984l.ads = c3632l.remoteconfig;
                                                                    c3632l.f7598super = new C5978l(c12984l);
                                                                    c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                                                    sparseArray2.put(c3632l.amazon, c3632l);
                                                                } else {
                                                                    i36 += 255;
                                                                    i35++;
                                                                }
                                                            }
                                                        } else {
                                                            i31 += 255;
                                                            i32++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw C17655l.yandex(r3, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r3 = 0;
                                            }
                                            break;
                                        case 5:
                                            str10 = "audio/mpeg-L2";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list = null;
                                            str2 = null;
                                            i4 = 4096;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z13 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111 = (z13 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map7 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21112 = c3632l.signatures;
                                                    int i21113 = c3632l.applovin;
                                                    int i21114 = c3632l.premium;
                                                    int i21115 = c3632l.startapp;
                                                    c1591l = new C1591l(i21112, i21113, i21114, bArr, i21115, i21115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 6:
                                            str10 = "audio/mpeg";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list = null;
                                            str2 = null;
                                            i4 = 4096;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z14 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21116 = (z14 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map8 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21117 = c3632l.signatures;
                                                    int i21118 = c3632l.applovin;
                                                    int i21119 = c3632l.premium;
                                                    int i211110 = c3632l.startapp;
                                                    c1591l = new C1591l(i21117, i21118, i21119, bArr, i211110, i211110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 7:
                                            C13143l c13143l2 = new C13143l(c3632l.yandex(c3632l.crashlytics));
                                            try {
                                                c13143l2.m3568throw(16);
                                                long jAds = c13143l2.ads();
                                                if (jAds == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str3 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jAds == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jAds == 826496599) {
                                                            int i42 = c13143l2.loadAd + 20;
                                                            byte[] bArr8 = c13143l2.yandex;
                                                            while (true) {
                                                                if (i42 < bArr8.length - 4) {
                                                                    if (bArr8[i42] == 0 && bArr8[i42 + 1] == 0 && bArr8[i42 + 2] == 1) {
                                                                        if (bArr8[i42 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i42, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i42++;
                                                                } else {
                                                                    runtimeException = null;
                                                                    try {
                                                                        throw C17655l.yandex(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    }
                                                                }
                                                                throw C17655l.yandex(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        AbstractC6427l.vip("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str3 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str3 = null;
                                                }
                                                str10 = (String) pair.first;
                                                str2 = str3;
                                                list2 = (List) pair.second;
                                                iM3985throws = -1;
                                                list6 = list2;
                                                i4 = -1;
                                                list = list6;
                                                if (c3632l.f7581catch != null) {
                                                    str2 = c18176lYandex.f35617l;
                                                    str10 = "video/dolby-vision";
                                                }
                                                boolean z15 = c3632l.f7587final;
                                                if (c3632l.f7584default) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i211111 = (z15 ? 1 : 0) | i5;
                                                c12984l = new C12984l();
                                                zSubs = AbstractC3825l.subs(str10);
                                                Map map9 = f33590return;
                                                if (zSubs) {
                                                    c12984l.f25447throws = c3632l.f7585else;
                                                    c12984l.f25442package = c3632l.f7599switch;
                                                    c12984l.f25445synchronized = iM3985throws;
                                                } else if (AbstractC3825l.remoteconfig(str10)) {
                                                    if (c3632l.subscription == 0) {
                                                        i9 = c3632l.adcel;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = c3632l.vip;
                                                        }
                                                        c3632l.adcel = i9;
                                                        i10 = c3632l.ads;
                                                        if (i10 == -1) {
                                                            i10 = c3632l.metrica;
                                                        }
                                                        c3632l.ads = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = c3632l.adcel;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (c3632l.isVip) {
                                                        if (c3632l.f7602throws != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i211112 = c3632l.signatures;
                                                        int i211113 = c3632l.applovin;
                                                        int i211114 = c3632l.premium;
                                                        int i211115 = c3632l.startapp;
                                                        c1591l = new C1591l(i211112, i211113, i211114, bArr, i211115, i211115);
                                                    } else {
                                                        c1591l = null;
                                                    }
                                                    str5 = c3632l.loadAd;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (c3632l.tapsense == 0) {
                                                        if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c12984l.Signature = c3632l.vip;
                                                    c12984l.license = c3632l.metrica;
                                                    c12984l.signatures = f;
                                                    c12984l.isVip = iIntValue;
                                                    c12984l.premium = c3632l.ad;
                                                    c12984l.applovin = c3632l.advert;
                                                    c12984l.appmetrica = c1591l;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw C17655l.yandex(null, "Unexpected MIME type.");
                                                }
                                                str6 = c3632l.loadAd;
                                                if (str6 != null) {
                                                    c12984l.loadAd = c3632l.loadAd;
                                                }
                                                c12984l.yandex = Integer.toString(i20);
                                                if (c3632l.yandex) {
                                                    str7 = str8;
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                                c12984l.vip = AbstractC3825l.vip(str10);
                                                c12984l.metrica = i4;
                                                c12984l.amazon = c3632l.f7593new;
                                                c12984l.purchase = i211111;
                                                c12984l.adcel = list;
                                                c12984l.isPro = str2;
                                                c12984l.ads = c3632l.remoteconfig;
                                                c3632l.f7598super = new C5978l(c12984l);
                                                c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                                sparseArray2.put(c3632l.amazon, c3632l);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(c3632l.yandex(str9), 0, bArr9, 0, 4);
                                            listIsVip = AbstractC1186l.isVip(bArr9);
                                            str10 = "application/dvbsubs";
                                            listSingletonList = listIsVip;
                                            iM3985throws = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z16 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211116 = (z16 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map10 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211117 = c3632l.signatures;
                                                    int i211118 = c3632l.applovin;
                                                    int i211119 = c3632l.premium;
                                                    int i2111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i211117, i211118, i211119, bArr, i2111110, i2111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 10:
                                            C15307l c15307lYandex = C15307l.yandex(new C13143l(c3632l.yandex(c3632l.crashlytics)));
                                            ArrayList arrayList2 = c15307lYandex.yandex;
                                            c3632l.f7590import = c15307lYandex.loadAd;
                                            str4 = c15307lYandex.smaato;
                                            str10 = "video/avc";
                                            list4 = arrayList2;
                                            str2 = str4;
                                            list2 = list4;
                                            iM3985throws = -1;
                                            list6 = list2;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z17 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111 = (z17 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map11 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111112 = c3632l.signatures;
                                                    int i2111113 = c3632l.applovin;
                                                    int i2111114 = c3632l.premium;
                                                    int i2111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i2111112, i2111113, i2111114, bArr, i2111115, i2111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 11:
                                            listIsVip = AbstractC1186l.isVip(c3632l.yandex(str9));
                                            str10 = "application/vobsub";
                                            listSingletonList = listIsVip;
                                            iM3985throws = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z18 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111116 = (z18 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map12 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111117 = c3632l.signatures;
                                                    int i2111118 = c3632l.applovin;
                                                    int i2111119 = c3632l.premium;
                                                    int i21111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i2111117, i2111118, i2111119, bArr, i21111110, i21111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 12:
                                            str10 = "audio/vnd.dts.hd";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z19 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111 = (z19 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map13 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111112 = c3632l.signatures;
                                                    int i21111113 = c3632l.applovin;
                                                    int i21111114 = c3632l.premium;
                                                    int i21111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111112, i21111113, i21111114, bArr, i21111115, i21111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(c3632l.yandex(str9));
                                            byte[] bArr10 = c3632l.smaato;
                                            Cimport cimportAdmob = AbstractC3234l.admob(new C5257l(bArr10, bArr10.length), false);
                                            c3632l.f7599switch = cimportAdmob.loadAd;
                                            c3632l.f7585else = cimportAdmob.crashlytics;
                                            str10 = "audio/mp4a-latm";
                                            str2 = cimportAdmob.yandex;
                                            i4 = -1;
                                            list3 = listSingletonList2;
                                            list = list3;
                                            iM3985throws = -1;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z110 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111116 = (z110 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map14 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111117 = c3632l.signatures;
                                                    int i21111118 = c3632l.applovin;
                                                    int i21111119 = c3632l.premium;
                                                    int i211111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111117, i21111118, i21111119, bArr, i211111110, i211111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 14:
                                            str10 = "audio/ac3";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z111 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111 = (z111 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map15 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111112 = c3632l.signatures;
                                                    int i211111113 = c3632l.applovin;
                                                    int i211111114 = c3632l.premium;
                                                    int i211111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i211111112, i211111113, i211111114, bArr, i211111115, i211111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 15:
                                        case 21:
                                            c3632l.f7596static = true;
                                            str10 = "audio/vnd.dts";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z112 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111116 = (z112 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map16 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111117 = c3632l.signatures;
                                                    int i211111118 = c3632l.applovin;
                                                    int i211111119 = c3632l.premium;
                                                    int i2111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i211111117, i211111118, i211111119, bArr, i2111111110, i2111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 16:
                                            byte[] bArr11 = c3632l.smaato;
                                            listIsVip2 = bArr11 == null ? null : AbstractC1186l.isVip(bArr11);
                                            str10 = "video/av01";
                                            listIsVip = listIsVip2;
                                            listSingletonList = listIsVip;
                                            iM3985throws = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z113 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111 = (z113 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map17 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111112 = c3632l.signatures;
                                                    int i2111111113 = c3632l.applovin;
                                                    int i2111111114 = c3632l.premium;
                                                    int i2111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i2111111112, i2111111113, i2111111114, bArr, i2111111115, i2111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                            str10 = "video/x-vnd.on2.vp8";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z114 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111116 = (z114 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map18 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111117 = c3632l.signatures;
                                                    int i2111111118 = c3632l.applovin;
                                                    int i2111111119 = c3632l.premium;
                                                    int i21111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i2111111117, i2111111118, i2111111119, bArr, i21111111110, i21111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                            byte[] bArr12 = c3632l.smaato;
                                            listIsVip2 = bArr12 == null ? null : AbstractC1186l.isVip(bArr12);
                                            str10 = "video/x-vnd.on2.vp9";
                                            listIsVip = listIsVip2;
                                            listSingletonList = listIsVip;
                                            iM3985throws = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z115 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111 = (z115 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map19 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111112 = c3632l.signatures;
                                                    int i21111111113 = c3632l.applovin;
                                                    int i21111111114 = c3632l.premium;
                                                    int i21111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111111112, i21111111113, i21111111114, bArr, i21111111115, i21111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                                            str8 = "video/webm";
                                            str10 = "application/pgs";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z116 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111116 = (z116 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map110 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111117 = c3632l.signatures;
                                                    int i21111111118 = c3632l.applovin;
                                                    int i21111111119 = c3632l.premium;
                                                    int i211111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111111117, i21111111118, i21111111119, bArr, i211111111110, i211111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 20:
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z117 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111 = (z117 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map111 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111112 = c3632l.signatures;
                                                    int i211111111113 = c3632l.applovin;
                                                    int i211111111114 = c3632l.premium;
                                                    int i211111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i211111111112, i211111111113, i211111111114, bArr, i211111111115, i211111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 22:
                                            if (c3632l.f7580case == 32) {
                                                str8 = "video/webm";
                                                str10 = "audio/raw";
                                                iM3985throws = 4;
                                            } else {
                                                AbstractC6427l.vip("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + c3632l.f7580case + ". Setting mimeType to audio/x-unknown");
                                                str8 = "video/webm";
                                                str10 = "audio/x-unknown";
                                                iM3985throws = -1;
                                            }
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z118 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111116 = (z118 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map112 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111117 = c3632l.signatures;
                                                    int i211111111118 = c3632l.applovin;
                                                    int i211111111119 = c3632l.premium;
                                                    int i2111111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i211111111117, i211111111118, i211111111119, bArr, i2111111111110, i2111111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211111111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 23:
                                            int i43 = c3632l.f7580case;
                                            if (i43 == 8) {
                                                str8 = "video/webm";
                                                str10 = "audio/raw";
                                                iM3985throws = 3;
                                            } else {
                                                if (i43 == 16) {
                                                    iM3985throws = 268435456;
                                                } else if (i43 == 24) {
                                                    iM3985throws = 1342177280;
                                                } else if (i43 == 32) {
                                                    iM3985throws = 1610612736;
                                                } else {
                                                    AbstractC6427l.vip("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + c3632l.f7580case + ". Setting mimeType to audio/x-unknown");
                                                    str8 = "video/webm";
                                                    str10 = "audio/x-unknown";
                                                    iM3985throws = -1;
                                                }
                                                str8 = "video/webm";
                                                str10 = "audio/raw";
                                            }
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z119 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111111 = (z119 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map113 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111112 = c3632l.signatures;
                                                    int i2111111111113 = c3632l.applovin;
                                                    int i2111111111114 = c3632l.premium;
                                                    int i2111111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i2111111111112, i2111111111113, i2111111111114, bArr, i2111111111115, i2111111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                                            int i44 = c3632l.f7580case;
                                            String str12 = AbstractC15323l.yandex;
                                            iM3985throws = AbstractC15323l.m3985throws(i44, ByteOrder.LITTLE_ENDIAN);
                                            if (iM3985throws == 0) {
                                                AbstractC6427l.vip("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + c3632l.f7580case + ". Setting mimeType to audio/x-unknown");
                                                str8 = "video/webm";
                                                str10 = "audio/x-unknown";
                                                iM3985throws = -1;
                                                list5 = null;
                                                str2 = null;
                                                list6 = list5;
                                                i4 = -1;
                                                list = list6;
                                                if (c3632l.f7581catch != null) {
                                                    str2 = c18176lYandex.f35617l;
                                                    str10 = "video/dolby-vision";
                                                }
                                                boolean z1110 = c3632l.f7587final;
                                                if (c3632l.f7584default) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i2111111111116 = (z1110 ? 1 : 0) | i5;
                                                c12984l = new C12984l();
                                                zSubs = AbstractC3825l.subs(str10);
                                                Map map114 = f33590return;
                                                if (zSubs) {
                                                    c12984l.f25447throws = c3632l.f7585else;
                                                    c12984l.f25442package = c3632l.f7599switch;
                                                    c12984l.f25445synchronized = iM3985throws;
                                                } else if (AbstractC3825l.remoteconfig(str10)) {
                                                    if (c3632l.subscription == 0) {
                                                        i9 = c3632l.adcel;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = c3632l.vip;
                                                        }
                                                        c3632l.adcel = i9;
                                                        i10 = c3632l.ads;
                                                        if (i10 == -1) {
                                                            i10 = c3632l.metrica;
                                                        }
                                                        c3632l.ads = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = c3632l.adcel;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (c3632l.isVip) {
                                                        if (c3632l.f7602throws != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i2111111111117 = c3632l.signatures;
                                                        int i2111111111118 = c3632l.applovin;
                                                        int i2111111111119 = c3632l.premium;
                                                        int i21111111111110 = c3632l.startapp;
                                                        c1591l = new C1591l(i2111111111117, i2111111111118, i2111111111119, bArr, i21111111111110, i21111111111110);
                                                    } else {
                                                        c1591l = null;
                                                    }
                                                    str5 = c3632l.loadAd;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (c3632l.tapsense == 0) {
                                                        if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c12984l.Signature = c3632l.vip;
                                                    c12984l.license = c3632l.metrica;
                                                    c12984l.signatures = f;
                                                    c12984l.isVip = iIntValue;
                                                    c12984l.premium = c3632l.ad;
                                                    c12984l.applovin = c3632l.advert;
                                                    c12984l.appmetrica = c1591l;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw C17655l.yandex(null, "Unexpected MIME type.");
                                                }
                                                str6 = c3632l.loadAd;
                                                if (str6 != null) {
                                                    c12984l.loadAd = c3632l.loadAd;
                                                }
                                                c12984l.yandex = Integer.toString(i20);
                                                if (c3632l.yandex) {
                                                    str7 = str8;
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                                c12984l.vip = AbstractC3825l.vip(str10);
                                                c12984l.metrica = i4;
                                                c12984l.amazon = c3632l.f7593new;
                                                c12984l.purchase = i2111111111116;
                                                c12984l.adcel = list;
                                                c12984l.isPro = str2;
                                                c12984l.ads = c3632l.remoteconfig;
                                                c3632l.f7598super = new C5978l(c12984l);
                                                c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                                sparseArray2.put(c3632l.amazon, c3632l);
                                            }
                                            str8 = "video/webm";
                                            str10 = "audio/raw";
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1111 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111111 = (z1111 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map115 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111112 = c3632l.signatures;
                                                    int i21111111111113 = c3632l.applovin;
                                                    int i21111111111114 = c3632l.premium;
                                                    int i21111111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111111111112, i21111111111113, i21111111111114, bArr, i21111111111115, i21111111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                                            listSingletonList = AbstractC1186l.signatures(f33589protected, c3632l.yandex(str9));
                                            str10 = "text/x-ssa";
                                            iM3985throws = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1112 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111116 = (z1112 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map116 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111117 = c3632l.signatures;
                                                    int i21111111111118 = c3632l.applovin;
                                                    int i21111111111119 = c3632l.premium;
                                                    int i211111111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111111111117, i21111111111118, i21111111111119, bArr, i211111111111110, i211111111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111111111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                                            C9444l c9444lYandex = C9444l.yandex(new C13143l(c3632l.yandex(c3632l.crashlytics)), false, null);
                                            List list8 = c9444lYandex.yandex;
                                            c3632l.f7590import = c9444lYandex.loadAd;
                                            str4 = c9444lYandex.vip;
                                            str10 = "video/hevc";
                                            list4 = list8;
                                            str2 = str4;
                                            list2 = list4;
                                            iM3985throws = -1;
                                            list6 = list2;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1113 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111111 = (z1113 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map117 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111112 = c3632l.signatures;
                                                    int i211111111111113 = c3632l.applovin;
                                                    int i211111111111114 = c3632l.premium;
                                                    int i211111111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i211111111111112, i211111111111113, i211111111111114, bArr, i211111111111115, i211111111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211111111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                                            str8 = "video/webm";
                                            str10 = "text/vtt";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1114 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111116 = (z1114 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map118 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111117 = c3632l.signatures;
                                                    int i211111111111118 = c3632l.applovin;
                                                    int i211111111111119 = c3632l.premium;
                                                    int i2111111111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i211111111111117, i211111111111118, i211111111111119, bArr, i2111111111111110, i2111111111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211111111111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                                            str10 = "application/x-subrip";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1115 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111111111 = (z1115 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map119 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111112 = c3632l.signatures;
                                                    int i2111111111111113 = c3632l.applovin;
                                                    int i2111111111111114 = c3632l.premium;
                                                    int i2111111111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i2111111111111112, i2111111111111113, i2111111111111114, bArr, i2111111111111115, i2111111111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111111111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 30:
                                            str10 = "video/mpeg2";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1116 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111111116 = (z1116 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map1110 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111117 = c3632l.signatures;
                                                    int i2111111111111118 = c3632l.applovin;
                                                    int i2111111111111119 = c3632l.premium;
                                                    int i21111111111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i2111111111111117, i2111111111111118, i2111111111111119, bArr, i21111111111111110, i21111111111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i2111111111111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 31:
                                            str10 = "audio/eac3";
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1117 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111111111 = (z1117 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map1111 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111112 = c3632l.signatures;
                                                    int i21111111111111113 = c3632l.applovin;
                                                    int i21111111111111114 = c3632l.premium;
                                                    int i21111111111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111111111111112, i21111111111111113, i21111111111111114, bArr, i21111111111111115, i21111111111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111111111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case 32:
                                            listIsVip2 = Collections.singletonList(c3632l.yandex(str9));
                                            str10 = "audio/flac";
                                            listIsVip = listIsVip2;
                                            listSingletonList = listIsVip;
                                            iM3985throws = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1118 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111111116 = (z1118 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map1112 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111117 = c3632l.signatures;
                                                    int i21111111111111118 = c3632l.applovin;
                                                    int i21111111111111119 = c3632l.premium;
                                                    int i211111111111111110 = c3632l.startapp;
                                                    c1591l = new C1591l(i21111111111111117, i21111111111111118, i21111111111111119, bArr, i211111111111111110, i211111111111111110);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i21111111111111116;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                            ArrayList arrayList3 = new ArrayList(3);
                                            arrayList3.add(c3632l.yandex(c3632l.crashlytics));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(c3632l.f7583continue).array());
                                            arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(c3632l.f7582class).array());
                                            str10 = "audio/opus";
                                            i4 = 5760;
                                            list = arrayList3;
                                            str8 = "video/webm";
                                            iM3985throws = -1;
                                            str2 = null;
                                            if (c3632l.f7581catch != null) {
                                                str2 = c18176lYandex.f35617l;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1119 = c3632l.f7587final;
                                            if (c3632l.f7584default) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111111111 = (z1119 ? 1 : 0) | i5;
                                            c12984l = new C12984l();
                                            zSubs = AbstractC3825l.subs(str10);
                                            Map map1113 = f33590return;
                                            if (zSubs) {
                                                c12984l.f25447throws = c3632l.f7585else;
                                                c12984l.f25442package = c3632l.f7599switch;
                                                c12984l.f25445synchronized = iM3985throws;
                                            } else if (AbstractC3825l.remoteconfig(str10)) {
                                                if (c3632l.subscription == 0) {
                                                    i9 = c3632l.adcel;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = c3632l.vip;
                                                    }
                                                    c3632l.adcel = i9;
                                                    i10 = c3632l.ads;
                                                    if (i10 == -1) {
                                                        i10 = c3632l.metrica;
                                                    }
                                                    c3632l.ads = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = c3632l.adcel;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (c3632l.isVip) {
                                                    if (c3632l.f7602throws != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111111112 = c3632l.signatures;
                                                    int i211111111111111113 = c3632l.applovin;
                                                    int i211111111111111114 = c3632l.premium;
                                                    int i211111111111111115 = c3632l.startapp;
                                                    c1591l = new C1591l(i211111111111111112, i211111111111111113, i211111111111111114, bArr, i211111111111111115, i211111111111111115);
                                                } else {
                                                    c1591l = null;
                                                }
                                                str5 = c3632l.loadAd;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (c3632l.tapsense == 0) {
                                                    if (Float.compare(c3632l.pro, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(c3632l.pro, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(c3632l.pro, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c12984l.Signature = c3632l.vip;
                                                c12984l.license = c3632l.metrica;
                                                c12984l.signatures = f;
                                                c12984l.isVip = iIntValue;
                                                c12984l.premium = c3632l.ad;
                                                c12984l.applovin = c3632l.advert;
                                                c12984l.appmetrica = c1591l;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw C17655l.yandex(null, "Unexpected MIME type.");
                                            }
                                            str6 = c3632l.loadAd;
                                            if (str6 != null) {
                                                c12984l.loadAd = c3632l.loadAd;
                                            }
                                            c12984l.yandex = Integer.toString(i20);
                                            if (c3632l.yandex) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            c12984l.remoteconfig = AbstractC3825l.vip(str7);
                                            c12984l.vip = AbstractC3825l.vip(str10);
                                            c12984l.metrica = i4;
                                            c12984l.amazon = c3632l.f7593new;
                                            c12984l.purchase = i211111111111111111;
                                            c12984l.adcel = list;
                                            c12984l.isPro = str2;
                                            c12984l.ads = c3632l.remoteconfig;
                                            c3632l.f7598super = new C5978l(c12984l);
                                            c3632l.f7589goto = c17316l3.f33594break.startapp(c3632l.amazon, c3632l.purchase);
                                            sparseArray2.put(c3632l.amazon, c3632l);
                                            break;
                                        default:
                                            throw C17655l.yandex(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    c17316l3.advert = null;
                                    break;
                            }
                        } else if (i18 != 183) {
                            if (i18 == 19899) {
                                int i45 = c17316l3.signatures;
                                if (i45 != -1) {
                                    long j7 = c17316l3.premium;
                                    if (j7 != -1) {
                                        if (i45 == 475249515) {
                                            c17316l3.f33609native = j7;
                                        }
                                    }
                                }
                                throw C17655l.yandex(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i18 == 25152) {
                                c17316l3.admob(i18);
                                C3632l c3632l2 = c17316l3.advert;
                                if (c3632l2.subs) {
                                    C0472l c0472l = c3632l2.firebase;
                                    if (c0472l == null) {
                                        throw C17655l.yandex(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    c3632l2.remoteconfig = new C17564l(null, true, new C12687l(AbstractC17252l.loadAd, null, "video/webm", c0472l.loadAd));
                                }
                            } else if (i18 == 28032) {
                                c17316l3.admob(i18);
                                C3632l c3632l3 = c17316l3.advert;
                                if (c3632l3.subs && c3632l3.isPro != null) {
                                    throw C17655l.yandex(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i18 == 357149030) {
                                if (c17316l3.tapsense == -9223372036854775807L) {
                                    c17316l3.tapsense = 1000000L;
                                }
                                long j8 = c17316l3.Signature;
                                if (j8 != -9223372036854775807L) {
                                    c17316l3.license = c17316l3.metrica(j8);
                                }
                            } else if (i18 == 374648427) {
                                boolean z20 = z3 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw C17655l.yandex(null, "No valid tracks were found");
                                }
                                boolean z21 = (!c17316l3.amazon || c17316l3.f33609native == -1) ? true : z20 ? 1 : 0;
                                int i46 = -1;
                                int i47 = -1;
                                int i48 = -1;
                                int i49 = -1;
                                for (int i50 = z20 ? 1 : 0; i50 < sparseArray2.size(); i50++) {
                                    C3632l c3632l4 = (C3632l) sparseArray2.valueAt(i50);
                                    int i51 = c3632l4.purchase;
                                    if (i51 == 2) {
                                        if (c3632l4.f7587final) {
                                            i46 = c3632l4.amazon;
                                        }
                                        if (i47 == -1) {
                                            i47 = c3632l4.amazon;
                                        }
                                    } else if (i51 == 1) {
                                        if (c3632l4.f7587final) {
                                            i48 = c3632l4.amazon;
                                        }
                                        if (i49 == -1) {
                                            i49 = c3632l4.amazon;
                                        }
                                    }
                                    if (z21) {
                                        c3632l4.f7589goto.getClass();
                                        if (!c3632l4.f7596static) {
                                            InterfaceC8979l interfaceC8979l = c3632l4.f7589goto;
                                            C5978l c5978l = c3632l4.f7598super;
                                            c5978l.getClass();
                                            interfaceC8979l.mopub(c5978l);
                                        }
                                    }
                                }
                                if (i46 != -1) {
                                    c17316l3.f33615strictfp = i46;
                                } else if (i47 != -1) {
                                    c17316l3.f33615strictfp = i47;
                                } else if (i48 != -1) {
                                    c17316l3.f33615strictfp = i48;
                                } else if (i49 != -1) {
                                    c17316l3.f33615strictfp = i49;
                                } else {
                                    c17316l3.f33615strictfp = sparseArray2.size() > 0 ? ((C3632l) sparseArray2.valueAt(z20 ? 1 : 0)).amazon : -1;
                                }
                                if (z21) {
                                    c17316l3.firebase();
                                }
                            } else if (i18 == 475249515 && !c17316l3.isVip) {
                                int i52 = z3 ? 1 : 0;
                                while (true) {
                                    if (i52 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i52)).isEmpty()) {
                                            i52++;
                                        } else if (c17316l3.license != -9223372036854775807L) {
                                            for (int i53 = z3 ? 1 : 0; i53 < sparseArray.size(); i53++) {
                                                Collections.sort((List) sparseArray.valueAt(i53));
                                            }
                                            c17316l3.f33594break.tapsense(new C8829l(sparseArray, c17316l3.license, c17316l3.f33615strictfp, c17316l3.subscription, c17316l3.ads));
                                        }
                                    }
                                    c17316l3.f33594break.tapsense(new C9828l(c17316l3.license));
                                }
                                c17316l3.isVip = z4;
                                c17316l3.appmetrica = z3;
                                int i54 = z3 ? 1 : 0;
                                while (i54 < sparseArray2.size()) {
                                    C3632l c3632l5 = (C3632l) sparseArray2.valueAt(i54);
                                    long j9 = c17316l3.license;
                                    long j10 = c17316l3.subscription;
                                    boolean z22 = z3;
                                    int i55 = z4;
                                    long j11 = c17316l3.ads;
                                    if (c3632l5.purchase != 2 || (list7 = (List) sparseArray.get(c3632l5.amazon)) == null || list7.isEmpty()) {
                                        i12 = i19;
                                    } else {
                                        if (list7.isEmpty()) {
                                            i12 = i19;
                                        } else {
                                            int iMin = Math.min(list7.size(), i19);
                                            double d = 0.0d;
                                            i12 = i19;
                                            int i56 = z22 ? 1 : 0;
                                            int i57 = -1;
                                            while (i56 < iMin) {
                                                C7745l c7745l = (C7745l) list7.get(i56);
                                                long j12 = j9;
                                                long j13 = c7745l.f16254l;
                                                long j14 = c7745l.f16252l;
                                                long j15 = c7745l.f16253l;
                                                if (j13 > 10000000) {
                                                    if (i57 == -1) {
                                                        j = ((C7745l) list7.get(i57 == true ? 1 : 0)).f16254l;
                                                    }
                                                    if (j != -9223372036854775807L) {
                                                        C5978l c5978l2 = c3632l5.f7598super;
                                                        c5978l2.getClass();
                                                        c7417l = c5978l2.smaato;
                                                        c11429l = new C11429l(j);
                                                        if (c7417l == null) {
                                                            InterfaceC1525l[] interfaceC1525lArr = new InterfaceC1525l[i55];
                                                            interfaceC1525lArr[z22 ? 1 : 0] = c11429l;
                                                            c7417lYandex = new C7417l(interfaceC1525lArr);
                                                        } else {
                                                            InterfaceC1525l[] interfaceC1525lArr2 = new InterfaceC1525l[i55];
                                                            interfaceC1525lArr2[z22 ? 1 : 0] = c11429l;
                                                            c7417lYandex = c7417l.yandex(interfaceC1525lArr2);
                                                        }
                                                        C12984l c12984lYandex = c3632l5.f7598super.yandex();
                                                        c12984lYandex.firebase = c7417lYandex;
                                                        c3632l5.f7598super = new C5978l(c12984lYandex);
                                                    }
                                                } else {
                                                    if (i56 < list7.size() - 1) {
                                                        C7745l c7745l2 = (C7745l) list7.get(i56 + 1);
                                                        j2 = (c7745l2.f16253l + c7745l2.f16252l) - (j15 + j14);
                                                        j3 = c7745l2.f16254l - j13;
                                                    } else {
                                                        j2 = (j10 + j11) - (j15 + j14);
                                                        j3 = j12 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i57 = i56;
                                                        }
                                                    }
                                                    i56++;
                                                    j9 = j12;
                                                }
                                            }
                                            if (i57 == -1) {
                                                j = ((C7745l) list7.get(i57 == true ? 1 : 0)).f16254l;
                                            }
                                            if (j != -9223372036854775807L) {
                                                C5978l c5978l3 = c3632l5.f7598super;
                                                c5978l3.getClass();
                                                c7417l = c5978l3.smaato;
                                                c11429l = new C11429l(j);
                                                if (c7417l == null) {
                                                    InterfaceC1525l[] interfaceC1525lArr3 = new InterfaceC1525l[i55];
                                                    interfaceC1525lArr3[z22 ? 1 : 0] = c11429l;
                                                    c7417lYandex = new C7417l(interfaceC1525lArr3);
                                                } else {
                                                    InterfaceC1525l[] interfaceC1525lArr4 = new InterfaceC1525l[i55];
                                                    interfaceC1525lArr4[z22 ? 1 : 0] = c11429l;
                                                    c7417lYandex = c7417l.yandex(interfaceC1525lArr4);
                                                }
                                                C12984l c12984lYandex2 = c3632l5.f7598super.yandex();
                                                c12984lYandex2.firebase = c7417lYandex;
                                                c3632l5.f7598super = new C5978l(c12984lYandex2);
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            C5978l c5978l4 = c3632l5.f7598super;
                                            c5978l4.getClass();
                                            c7417l = c5978l4.smaato;
                                            c11429l = new C11429l(j);
                                            if (c7417l == null) {
                                                InterfaceC1525l[] interfaceC1525lArr5 = new InterfaceC1525l[i55];
                                                interfaceC1525lArr5[z22 ? 1 : 0] = c11429l;
                                                c7417lYandex = new C7417l(interfaceC1525lArr5);
                                            } else {
                                                InterfaceC1525l[] interfaceC1525lArr6 = new InterfaceC1525l[i55];
                                                interfaceC1525lArr6[z22 ? 1 : 0] = c11429l;
                                                c7417lYandex = c7417l.yandex(interfaceC1525lArr6);
                                            }
                                            C12984l c12984lYandex3 = c3632l5.f7598super.yandex();
                                            c12984lYandex3.firebase = c7417lYandex;
                                            c3632l5.f7598super = new C5978l(c12984lYandex3);
                                        }
                                    }
                                    if (!c3632l5.f7596static) {
                                        c3632l5.f7589goto.getClass();
                                        InterfaceC8979l interfaceC8979l2 = c3632l5.f7589goto;
                                        C5978l c5978l5 = c3632l5.f7598super;
                                        c5978l5.getClass();
                                        interfaceC8979l2.mopub(c5978l5);
                                    }
                                    i54++;
                                    i19 = i12;
                                    z3 = z22 ? 1 : 0;
                                    z4 = true;
                                }
                                c17316l3.firebase();
                            }
                        } else if (!c17316l3.isVip) {
                            c17316l3.mopub(i18);
                            if (c17316l3.inmobi != -9223372036854775807L && (i11 = c17316l3.f33621throws) != -1 && c17316l3.f33611package != -1) {
                                List arrayList4 = (List) sparseArray.get(i11);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    sparseArray.put(c17316l3.f33621throws, arrayList4);
                                }
                                arrayList4.add(new C7745l(c17316l3.inmobi, c17316l3.subscription + c17316l3.f33611package, c17316l3.f33618synchronized));
                            }
                        }
                    } else if (c17316l3.f33620throw == 2) {
                        C3632l c3632l6 = (C3632l) sparseArray2.get(c17316l3.f33597class);
                        c3632l6.f7589goto.getClass();
                        if (c17316l3.f33610new > 0 && "A_OPUS".equals(c3632l6.crashlytics)) {
                            C13143l c13143l3 = c17316l3.startapp;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(c17316l3.f33610new).array();
                            c13143l3.getClass();
                            c13143l3.m3565private(bArrArray.length, bArrArray);
                        }
                        int i58 = 0;
                        for (int i59 = 0; i59 < c17316l3.f33617switch; i59++) {
                            i58 += c17316l3.f33598continue[i59];
                        }
                        int i60 = 0;
                        while (i60 < c17316l3.f33617switch) {
                            long j16 = c17316l3.f33596catch + ((long) ((c3632l6.billing * i60) / 1000));
                            int i61 = c17316l3.f33614static;
                            if (i60 == 0 && !c17316l3.f33602final) {
                                i61 |= 1;
                            }
                            int i62 = c17316l3.f33598continue[i60];
                            int i63 = i58 - i62;
                            c17316l3.subs(c3632l6, j16, i61, i62, i63);
                            i60++;
                            i58 = i63;
                        }
                        c17316l3.f33620throw = 0;
                    }
                    r2 = interfaceC10430l;
                }
                z5 = true;
                r1 = r2;
            }
            if (z5) {
                c17316l = this;
                z2 = true;
                if (c17316l.smaato(c1014l, r1.getPosition())) {
                    return 1;
                }
            } else {
                c17316l = this;
                z2 = true;
            }
            z4 = z2;
            z3 = false;
        }
        if (z5) {
            return 0;
        }
        int i64 = 0;
        while (true) {
            SparseArray sparseArray3 = c17316l.crashlytics;
            if (i64 >= sparseArray3.size()) {
                return -1;
            }
            C3632l c3632l7 = (C3632l) sparseArray3.valueAt(i64);
            c3632l7.f7589goto.getClass();
            C3964l c3964l = c3632l7.f7591interface;
            if (c3964l != null) {
                c3964l.yandex(c3632l7.f7589goto, c3632l7.firebase);
            }
            i64++;
        }
    }

    public final long metrica(long j) throws C17655l {
        long j2 = this.tapsense;
        if (j2 == -9223372036854775807L) {
            throw C17655l.yandex(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = AbstractC15323l.yandex;
        return AbstractC15323l.m3970import(j, j2, 1000L, RoundingMode.DOWN);
    }

    public final void mopub(int i) {
        if (this.appmetrica) {
            return;
        }
        throw C17655l.yandex(null, "Element " + i + " must be in a Cues");
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    public final void remoteconfig(InterfaceC10430l interfaceC10430l, int i) {
        C13143l c13143l = this.subs;
        if (c13143l.crashlytics >= i) {
            return;
        }
        byte[] bArr = c13143l.yandex;
        if (bArr.length < i) {
            c13143l.crashlytics(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c13143l.yandex;
        int i2 = c13143l.crashlytics;
        interfaceC10430l.readFully(bArr2, i2, i - i2);
        c13143l.m3561extends(i);
    }

    public final boolean smaato(C1014l c1014l, long j) {
        if (this.f33623volatile) {
            this.f33612private = j;
            c1014l.f2761l = this.f33609native;
            this.f33623volatile = false;
            return true;
        }
        if (this.isVip) {
            long j2 = this.f33612private;
            if (j2 != -1) {
                c1014l.f2761l = j2;
                this.f33612private = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
    public final int startapp(InterfaceC10430l interfaceC10430l, C3632l c3632l, int i, boolean z) {
        int iBilling;
        int iBilling2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(c3632l.crashlytics)) {
            adcel(interfaceC10430l, f33591transient, i);
            int i4 = this.f33616super;
            vip();
            return i4;
        }
        if ("S_TEXT/ASS".equals(c3632l.crashlytics) || "S_TEXT/SSA".equals(c3632l.crashlytics)) {
            adcel(interfaceC10430l, f33592while, i);
            int i5 = this.f33616super;
            vip();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(c3632l.crashlytics)) {
            adcel(interfaceC10430l, f33588implements, i);
            int i6 = this.f33616super;
            vip();
            return i6;
        }
        int i7 = 2;
        if (c3632l.f7596static) {
            c3632l.f7598super.getClass();
            C13143l c13143l = new C13143l(i);
            if (interfaceC10430l.billing(c13143l.yandex, 0, i, true)) {
                interfaceC10430l.smaato();
                if (AbstractC0441l.purchase(c13143l.subs()) == 1 && c13143l.yandex() >= 10) {
                    byte[] bArr = new byte[10];
                    c13143l.firebase(0, 10, bArr);
                    c13143l.m3562for(0);
                    int iAmazon = AbstractC0441l.amazon(bArr);
                    if (iAmazon > 0 && c13143l.yandex() >= iAmazon + 4) {
                        c13143l.m3568throw(iAmazon);
                        if (AbstractC0441l.purchase(c13143l.remoteconfig()) == 2) {
                            C12984l c12984lYandex = c3632l.f7598super.yandex();
                            c12984lYandex.vip = AbstractC3825l.vip("audio/vnd.dts.hd");
                            c3632l.f7598super = new C5978l(c12984lYandex);
                        }
                    }
                }
            }
            c3632l.f7589goto.mopub(c3632l.f7598super);
            c3632l.f7596static = false;
            firebase();
        }
        InterfaceC8979l interfaceC8979l = c3632l.f7589goto;
        boolean z3 = this.f33593abstract;
        C13143l c13143l2 = this.smaato;
        if (!z3) {
            boolean z4 = c3632l.subs;
            C13143l c13143l3 = this.subs;
            if (z4) {
                this.f33614static &= -1073741825;
                if (!this.f33607instanceof) {
                    interfaceC10430l.readFully(c13143l3.yandex, 0, 1);
                    this.f33605goto++;
                    byte b = c13143l3.yandex[0];
                    if ((b & 128) == 128) {
                        throw C17655l.yandex(null, "Extension bit is set in signal byte");
                    }
                    this.f33619this = b;
                    this.f33607instanceof = true;
                }
                byte b2 = this.f33619this;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b2 & 2) == 2;
                    this.f33614static |= 1073741824;
                    if (!this.f33622try) {
                        C13143l c13143l4 = this.vip;
                        interfaceC10430l.readFully(c13143l4.yandex, 0, 8);
                        this.f33605goto += 8;
                        this.f33622try = true;
                        c13143l3.yandex[0] = (byte) ((z5 ? 128 : 0) | 8);
                        c13143l3.m3562for(0);
                        interfaceC8979l.loadAd(c13143l3, 1, 1);
                        this.f33616super++;
                        c13143l4.m3562for(0);
                        interfaceC8979l.loadAd(c13143l4, 8, 1);
                        this.f33616super += 8;
                    }
                    if (z5) {
                        if (!this.f33613public) {
                            interfaceC10430l.readFully(c13143l3.yandex, 0, 1);
                            this.f33605goto++;
                            c13143l3.m3562for(0);
                            this.f33603finally = c13143l3.signatures();
                            this.f33613public = true;
                        }
                        int i8 = this.f33603finally * 4;
                        c13143l3.m3563native(i8);
                        interfaceC10430l.readFully(c13143l3.yandex, 0, i8);
                        this.f33605goto += i8;
                        short s = (short) ((this.f33603finally / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.adcel;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.adcel = ByteBuffer.allocate(i9);
                        }
                        this.adcel.position(0);
                        this.adcel.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.f33603finally;
                            if (i10 >= i3) {
                                break;
                            }
                            int iInmobi = c13143l3.inmobi();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.adcel;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (iInmobi - i11));
                            } else {
                                byteBuffer2.putInt(iInmobi - i11);
                            }
                            i10++;
                            i11 = iInmobi;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.f33605goto) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.adcel;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.adcel.putInt(0);
                        }
                        byte[] bArrArray = this.adcel.array();
                        C13143l c13143l5 = this.metrica;
                        c13143l5.m3565private(i9, bArrArray);
                        interfaceC8979l.loadAd(c13143l5, i9, 1);
                        this.f33616super += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr2 = c3632l.isPro;
                if (bArr2 != null) {
                    c13143l2.m3565private(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(c3632l.crashlytics)) {
                z2 = z;
            } else {
                z2 = c3632l.mopub > 0;
            }
            if (z2) {
                this.f33614static |= 268435456;
                this.startapp.m3563native(0);
                int i16 = (c13143l2.crashlytics + i) - this.f33605goto;
                c13143l3.m3563native(4);
                byte[] bArr3 = c13143l3.yandex;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                interfaceC8979l.loadAd(c13143l3, 4, i2);
                this.f33616super += 4;
            }
            this.f33593abstract = true;
        }
        int i17 = i + c13143l2.crashlytics;
        if (!"V_MPEG4/ISO/AVC".equals(c3632l.crashlytics) && !"V_MPEGH/ISO/HEVC".equals(c3632l.crashlytics)) {
            if (c3632l.f7591interface != null) {
                AbstractC12442l.subscription(c13143l2.crashlytics == 0);
                c3632l.f7591interface.crashlytics(interfaceC10430l);
            }
            while (true) {
                int i18 = this.f33605goto;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iYandex = c13143l2.yandex();
                if (iYandex > 0) {
                    iBilling2 = Math.min(i19, iYandex);
                    interfaceC8979l.purchase(iBilling2, c13143l2);
                } else {
                    iBilling2 = interfaceC8979l.billing(interfaceC10430l, i19, false);
                }
                this.f33605goto += iBilling2;
                this.f33616super += iBilling2;
            }
        } else {
            C13143l c13143l6 = this.admob;
            byte[] bArr4 = c13143l6.yandex;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = c3632l.f7590import;
            int i21 = 4 - i20;
            while (this.f33605goto < i17) {
                int i22 = this.f33606import;
                if (i22 == 0) {
                    int iMin = Math.min(i20, c13143l2.yandex());
                    interfaceC10430l.readFully(bArr4, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        c13143l2.firebase(i21, iMin, bArr4);
                    }
                    this.f33605goto += i20;
                    c13143l6.m3562for(0);
                    this.f33606import = c13143l6.inmobi();
                    C13143l c13143l7 = this.mopub;
                    c13143l7.m3562for(0);
                    interfaceC8979l.purchase(4, c13143l7);
                    this.f33616super += 4;
                } else {
                    int iYandex2 = c13143l2.yandex();
                    if (iYandex2 > 0) {
                        iBilling = Math.min(i22, iYandex2);
                        interfaceC8979l.purchase(iBilling, c13143l2);
                    } else {
                        iBilling = interfaceC8979l.billing(interfaceC10430l, i22, false);
                    }
                    this.f33605goto += iBilling;
                    this.f33616super += iBilling;
                    this.f33606import -= iBilling;
                }
            }
        }
        if ("A_VORBIS".equals(c3632l.crashlytics)) {
            C13143l c13143l8 = this.isPro;
            c13143l8.m3562for(0);
            interfaceC8979l.purchase(4, c13143l8);
            this.f33616super += 4;
        }
        int i23 = this.f33616super;
        vip();
        return i23;
    }

    public final void subs(C3632l c3632l, long j, int i, int i2, int i3) {
        byte[] bArrIsPro;
        int i4;
        int i5;
        C3964l c3964l = c3632l.f7591interface;
        if (c3964l != null) {
            c3964l.loadAd(c3632l.f7589goto, j, i, i2, i3, c3632l.firebase);
        } else {
            if ("S_TEXT/UTF8".equals(c3632l.crashlytics) || "S_TEXT/ASS".equals(c3632l.crashlytics) || "S_TEXT/SSA".equals(c3632l.crashlytics) || "S_TEXT/WEBVTT".equals(c3632l.crashlytics)) {
                if (this.f33617switch > 1) {
                    AbstractC6427l.vip("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f33600else;
                    if (j2 == -9223372036854775807L) {
                        AbstractC6427l.vip("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = c3632l.crashlytics;
                        C13143l c13143l = this.remoteconfig;
                        byte[] bArr = c13143l.yandex;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrIsPro = isPro("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrIsPro = isPro("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrIsPro = isPro("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                C11983l.crashlytics();
                                return;
                        }
                        System.arraycopy(bArrIsPro, 0, bArr, i4, bArrIsPro.length);
                        for (int i6 = c13143l.loadAd; i6 < c13143l.crashlytics; i6++) {
                            if (c13143l.yandex[i6] == 0) {
                                c13143l.m3561extends(i6);
                                c3632l.f7589goto.purchase(c13143l.crashlytics, c13143l);
                                i5 = i2 + c13143l.crashlytics;
                            }
                        }
                        c3632l.f7589goto.purchase(c13143l.crashlytics, c13143l);
                        i5 = i2 + c13143l.crashlytics;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.f33617switch;
                C13143l c13143l2 = this.startapp;
                if (i7 > 1) {
                    c13143l2.m3563native(0);
                } else {
                    int i8 = c13143l2.crashlytics;
                    c3632l.f7589goto.loadAd(c13143l2, i8, 2);
                    i5 += i8;
                }
            }
            c3632l.f7589goto.yandex(j, i, i5, i3, c3632l.firebase);
        }
        this.f33604for = true;
    }

    public final void vip() {
        this.f33605goto = 0;
        this.f33616super = 0;
        this.f33606import = 0;
        this.f33593abstract = false;
        this.f33607instanceof = false;
        this.f33613public = false;
        this.f33603finally = 0;
        this.f33619this = (byte) 0;
        this.f33622try = false;
        this.smaato.m3563native(0);
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }
}
