package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؚۤ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7621l extends AbstractC5563l implements Function3 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f15686l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f15687l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C6295l f15688l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C6295l f15689l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final /* synthetic */ C4791l f15690l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f15691l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C6295l f15692l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C6295l f15693l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f15694l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Set f15695l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC13854l f15696l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7621l(C4791l c4791l, InterfaceC14029l interfaceC14029l) {
        super(3, interfaceC14029l);
        this.f15690l = c4791l;
    }

    public static final void ad(List list, C4791l c4791l) {
        list.clear();
        synchronized (c4791l.amazon) {
            try {
                ArrayList arrayList = c4791l.smaato;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((AbstractC11411l) arrayList.get(i));
                }
                c4791l.smaato.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:22:0x0077, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0029, LOOP:3: B:27:0x008f->B:37:0x00bc, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x0029, LOOP:5: B:41:0x00cf->B:51:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[EDGE_INSN: B:61:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0041->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[EDGE_INSN: B:66:0x00bf->B:38:0x00bf BREAK  A[LOOP:3: B:27:0x008f->B:37:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102 A[EDGE_INSN: B:71:0x0102->B:52:0x0102 BREAK  A[LOOP:5: B:41:0x00cf->B:51:0x00ff], SYNTHETIC] */
    public static final void pro(C4791l c4791l, List list, List list2, List list3, C6295l c6295l, C6295l c6295l2, C6295l c6295l3, C6295l c6295l4) {
        char c;
        long j;
        long j2;
        synchronized (c4791l.amazon) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    C6931l c6931l = (C6931l) list3.get(i);
                    c6931l.loadAd();
                    c4791l.m1602case(c6931l);
                }
                list3.clear();
                Object[] objArr = c6295l.loadAd;
                long[] jArr = c6295l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    C6931l c6931l2 = (C6931l) objArr[(i2 << 3) + i4];
                                    c6931l2.loadAd();
                                    c4791l.m1602case(c6931l2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                c6295l.loadAd();
                Object[] objArr2 = c6295l2.loadAd;
                long[] jArr2 = c6295l2.yandex;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) == j2) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((C6931l) objArr2[(i5 << 3) + i7]).admob();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                c6295l2.loadAd();
                c6295l3.loadAd();
                Object[] objArr3 = c6295l4.loadAd;
                long[] jArr3 = c6295l4.yandex;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) == j2) {
                            if (i8 != length3) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    C6931l c6931l3 = (C6931l) objArr3[(i8 << 3) + i10];
                                    c6931l3.loadAd();
                                    c4791l.m1602case(c6931l3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                c6295l4.loadAd();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:18:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:26:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ee -> B:25:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0116 -> B:12:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7621l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C7621l c7621l = new C7621l(this.f15690l, (InterfaceC14029l) obj3);
        c7621l.f15696l = (InterfaceC13854l) obj2;
        c7621l.Signature(Unit.INSTANCE);
        return EnumC9342l.f19165l;
    }
}
