package defpackage;

import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: renamed from: lٕٞۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15843l implements InterfaceC14833l {
    public long Signature;
    public int adcel;
    public InterfaceC8979l admob;
    public InterfaceC1584l ads;
    public final C10912l amazon;
    public final C6120l billing;
    public final C9892l crashlytics;
    public C7417l firebase;
    public int isPro;
    public final C13143l loadAd;
    public long metrica;
    public InterfaceC2053l mopub;
    public final C7026l purchase;
    public long remoteconfig;
    public C7417l smaato;
    public long startapp;
    public InterfaceC8979l subs;
    public boolean subscription;
    public boolean tapsense;
    public long vip;
    public final long yandex;

    public C15843l(long j) {
        this.yandex = j;
        this.loadAd = new C13143l(10);
        this.crashlytics = new C9892l();
        this.amazon = new C10912l();
        this.remoteconfig = -9223372036854775807L;
        this.purchase = new C7026l(10);
        C6120l c6120l = new C6120l();
        this.billing = c6120l;
        this.subs = c6120l;
        this.startapp = -1L;
    }

    public final boolean admob(InterfaceC10430l interfaceC10430l) {
        InterfaceC1584l interfaceC1584l = this.ads;
        if (interfaceC1584l != null) {
            long jYandex = interfaceC1584l.yandex();
            if (jYandex == -1 || interfaceC10430l.mopub() <= jYandex - 4) {
            }
            return true;
        }
        try {
            return !interfaceC10430l.billing(this.loadAd.yandex, 0, 4, true);
        } catch (EOFException unused) {
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void amazon(long j, long j2) {
        this.isPro = 0;
        this.remoteconfig = -9223372036854775807L;
        this.vip = 0L;
        this.adcel = 0;
        this.startapp = -1L;
        this.Signature = j2;
        if (this.ads instanceof AbstractC8280l) {
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final void billing(InterfaceC2053l interfaceC2053l) {
        this.mopub = interfaceC2053l;
        InterfaceC8979l interfaceC8979lStartapp = interfaceC2053l.startapp(0, 1);
        this.admob = interfaceC8979lStartapp;
        this.subs = interfaceC8979lStartapp;
        this.mopub.firebase();
    }

    @Override // defpackage.InterfaceC14833l
    public final boolean crashlytics(InterfaceC10430l interfaceC10430l) {
        return subs(interfaceC10430l, true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x0246  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251  */
    /* JADX WARN: Code duplicated, block: B:108:0x0264  */
    /* JADX WARN: Code duplicated, block: B:110:0x026c  */
    /* JADX WARN: Code duplicated, block: B:114:0x027c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0282  */
    /* JADX WARN: Code duplicated, block: B:118:0x0286  */
    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x028a  */
    /* JADX WARN: Code duplicated, block: B:126:0x02be  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:145:0x032b  */
    /* JADX WARN: Code duplicated, block: B:146:0x032f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0336  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0344  */
    /* JADX WARN: Code duplicated, block: B:153:0x0353  */
    /* JADX WARN: Code duplicated, block: B:156:0x0358 A[LOOP:0: B:147:0x0334->B:156:0x0358, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x0362  */
    /* JADX WARN: Code duplicated, block: B:163:0x036a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0378  */
    /* JADX WARN: Code duplicated, block: B:168:0x038c  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0391 A[LOOP:1: B:162:0x0368->B:171:0x0391, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x039a  */
    /* JADX WARN: Code duplicated, block: B:176:0x039e  */
    /* JADX WARN: Code duplicated, block: B:179:0x03bf A[LOOP:2: B:178:0x03bd->B:179:0x03bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:184:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:186:0x0401  */
    /* JADX WARN: Code duplicated, block: B:187:0x0404 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0407  */
    /* JADX WARN: Code duplicated, block: B:191:0x040b  */
    /* JADX WARN: Code duplicated, block: B:192:0x043c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0461 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:197:0x0463  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:201:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:203:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:205:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:207:0x04da  */
    /* JADX WARN: Code duplicated, block: B:210:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x055d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0568  */
    /* JADX WARN: Code duplicated, block: B:233:0x056b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0573  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:248:0x035b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x035d A[EDGE_INSN: B:249:0x035d->B:158:0x035d BREAK  A[LOOP:0: B:147:0x0334->B:156:0x0358], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0396 A[EDGE_INSN: B:251:0x0396->B:173:0x0396 BREAK  A[LOOP:1: B:162:0x0368->B:171:0x0391], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x011c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x017e  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bb A[LOOP:4: B:77:0x01b9->B:78:0x01bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01df  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0209  */
    /* JADX WARN: Code duplicated, block: B:94:0x021f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0237  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
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
    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) throws Throwable {
        C9892l c9892l;
        Throwable th;
        int i;
        long j;
        InterfaceC1584l interfaceC1584l;
        C13143l c13143l;
        boolean z;
        long j2;
        long j3;
        long position;
        long j4;
        ?? r4;
        int iBilling;
        int i2;
        int iRemoteconfig;
        C13143l c13143l2;
        int i3;
        int i4;
        int i5;
        int i6;
        int iRemoteconfig2;
        C10912l c10912l;
        C9892l c9892l2;
        int i7;
        int iRemoteconfig3;
        int iInmobi;
        long jMin;
        long[] jArr;
        C1897l c1897l;
        int i8;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        C1897l c1897l2;
        C7417l c7417l;
        long position2;
        long length;
        long jM3969goto;
        long j6;
        long j7;
        InterfaceC1584l c12060l;
        long length2;
        long jM3969goto2;
        float fIntBitsToFloat;
        C10487l c10487lYandex;
        C10487l c10487lYandex2;
        int i14;
        long[] jArr2;
        int i15;
        C7417l c7417l2;
        long position3;
        InterfaceC1525l[] interfaceC1525lArr;
        int length3;
        int i16;
        InterfaceC1525l interfaceC1525l;
        C18132l c18132l;
        int[] iArr;
        InterfaceC1525l[] interfaceC1525lArr2;
        int length4;
        int i17;
        InterfaceC1525l interfaceC1525l2;
        C11403l c11403l;
        char c;
        long jM3962continue;
        int length5;
        long[] jArr3;
        long[] jArr4;
        long j8;
        int i18;
        C4445l c4445l;
        InterfaceC1525l interfaceC1525l3;
        InterfaceC1525l interfaceC1525l4;
        boolean z2;
        InterfaceC1584l c9579l;
        boolean z3;
        C7417l c7417lLoadAd;
        C7417l c7417l3;
        C12984l c12984l;
        long length6;
        long position4;
        long j9;
        long j10;
        int iRemoteconfig4;
        long jM3969goto3;
        int iM3567synchronized;
        int iM3567synchronized2;
        int iM3567synchronized3;
        long[] jArr5;
        long[] jArr6;
        C9892l c9892l3;
        long j11;
        int i19;
        long j12;
        long jMax;
        C9892l c9892l4;
        int iSignatures;
        this.admob.getClass();
        String str = AbstractC15323l.yandex;
        int i20 = this.isPro;
        int i21 = 0;
        C9892l c9892l5 = this.crashlytics;
        if (i20 == 0) {
            try {
                subs(interfaceC10430l, false);
                interfaceC1584l = this.ads;
                c13143l = this.loadAd;
                if (interfaceC1584l == null) {
                    c13143l2 = new C13143l(c9892l5.loadAd);
                    th = null;
                    interfaceC10430l.yandex(0, c9892l5.loadAd, c13143l2.yandex);
                    i3 = c9892l5.yandex & 1;
                    i4 = c9892l5.amazon;
                    i5 = 21;
                    j = 1000000;
                    if (i3 != 0) {
                        if (i4 != 1) {
                            i6 = 36;
                        }
                        j2 = -9223372036854775807L;
                        if (c13143l2.crashlytics >= i6 + 4) {
                            c13143l2.m3562for(i6);
                            iRemoteconfig2 = c13143l2.remoteconfig();
                            if (iRemoteconfig2 != 1483304551 && iRemoteconfig2 != 1231971951) {
                                if (c13143l2.crashlytics >= 40) {
                                    c13143l2.m3562for(36);
                                    if (c13143l2.remoteconfig() == 1447187017) {
                                        iRemoteconfig2 = 1447187017;
                                    } else {
                                        iRemoteconfig2 = 0;
                                    }
                                } else {
                                    iRemoteconfig2 = 0;
                                }
                            }
                        } else if (c13143l2.crashlytics >= 40) {
                            c13143l2.m3562for(36);
                            if (c13143l2.remoteconfig() == 1447187017) {
                                iRemoteconfig2 = 1447187017;
                            } else {
                                iRemoteconfig2 = 0;
                            }
                        } else {
                            iRemoteconfig2 = 0;
                        }
                        c10912l = this.amazon;
                        if (iRemoteconfig2 == 1231971951) {
                            c9892l2 = c9892l5;
                            i7 = 0;
                            iRemoteconfig3 = c13143l2.remoteconfig();
                            if ((iRemoteconfig3 & 1) != 0) {
                                iInmobi = c13143l2.inmobi();
                            } else {
                                iInmobi = -1;
                            }
                            if ((iRemoteconfig3 & 2) != 0) {
                                jMin = c13143l2.applovin();
                            } else {
                                jMin = -1;
                            }
                            if ((iRemoteconfig3 & 4) == 4) {
                                jArr2 = new long[100];
                                i15 = 0;
                                for (i14 = 100; i15 < i14; i14 = 100) {
                                    jArr2[i15] = c13143l2.signatures();
                                    i15++;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iRemoteconfig3 & 8) != 0) {
                                c13143l2.m3568throw(4);
                            }
                            if (c13143l2.yandex() >= 24) {
                                c13143l2.m3568throw(11);
                                fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                                int iM3567synchronized4 = c13143l2.m3567synchronized();
                                int iM3567synchronized5 = c13143l2.m3567synchronized();
                                c10487lYandex = C10487l.yandex(iM3567synchronized4);
                                c10487lYandex2 = C10487l.yandex(iM3567synchronized5);
                                if (fIntBitsToFloat > 0.0f && c10487lYandex == null && c10487lYandex2 == null) {
                                    c1897l = null;
                                } else {
                                    c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                                }
                                c13143l2.m3568throw(2);
                                int iAppmetrica = c13143l2.appmetrica();
                                i9 = (16773120 & iAppmetrica) >> 12;
                                i8 = iAppmetrica & 4095;
                            } else {
                                c1897l = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iInmobi;
                            i10 = c9892l2.loadAd;
                            i11 = c9892l2.crashlytics;
                            i12 = c9892l2.purchase;
                            i13 = c9892l2.billing;
                            c1897l2 = c1897l;
                            if ((c10912l.yandex != -1 || c10912l.loadAd == -1) && i9 != -1 && i8 != -1) {
                                c10912l.yandex = i9;
                                c10912l.loadAd = i8;
                            }
                            if (c1897l2 != null) {
                                c7417l = new C7417l(c1897l2);
                            } else {
                                c7417l = null;
                            }
                            this.smaato = c7417l;
                            position2 = interfaceC10430l.getPosition();
                            interfaceC10430l.remoteconfig(c9892l2.loadAd);
                            if (iRemoteconfig2 == 1483304551) {
                                length2 = interfaceC10430l.getLength();
                                if (j5 != -1 || j5 == 0) {
                                    jM3969goto2 = -9223372036854775807L;
                                } else {
                                    jM3969goto2 = AbstractC15323l.m3969goto(i11, (j5 * ((long) i13)) - 1);
                                }
                                if (jM3969goto2 == -9223372036854775807L) {
                                    c12060l = null;
                                } else {
                                    if (jMin != -1 && length2 != -1 && position2 + jMin != length2) {
                                        long j13 = length2 - position2;
                                        StringBuilder sbSignature = AbstractC0653l.Signature(j13, "Data size mismatch between stream (", ") and Xing frame (");
                                        sbSignature.append(jMin);
                                        sbSignature.append("), using smaller value.");
                                        AbstractC6427l.firebase("XingSeeker", sbSignature.toString());
                                        jMin = Math.min(jMin, j13);
                                    }
                                    c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                                }
                            } else {
                                length = interfaceC10430l.getLength();
                                jM3969goto = (j5 != -1 || j5 == 0) ? -9223372036854775807L : AbstractC15323l.m3969goto(i11, (((long) i13) * j5) - 1);
                                if (jM3969goto != -9223372036854775807L) {
                                    if (jMin != -1) {
                                        j7 = position2 + jMin;
                                        j6 = jMin - ((long) i10);
                                    } else if (length != -1) {
                                        j6 = (length - position2) - ((long) i10);
                                        j7 = length;
                                    } else {
                                        c12060l = null;
                                    }
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode)), false, true);
                                } else {
                                    c12060l = null;
                                }
                            }
                        } else if (iRemoteconfig2 != 1447187017) {
                            length6 = interfaceC10430l.getLength();
                            position4 = interfaceC10430l.getPosition();
                            c13143l2.m3568throw(6);
                            int iRemoteconfig5 = c13143l2.remoteconfig();
                            i7 = 0;
                            j9 = position4 + ((long) c9892l5.loadAd);
                            j10 = j9 + ((long) iRemoteconfig5);
                            iRemoteconfig4 = c13143l2.remoteconfig();
                            if (iRemoteconfig4 <= 0) {
                                jM3969goto3 = AbstractC15323l.m3969goto(c9892l5.crashlytics, (((long) iRemoteconfig4) * ((long) c9892l5.billing)) - 1);
                                iM3567synchronized = c13143l2.m3567synchronized();
                                iM3567synchronized2 = c13143l2.m3567synchronized();
                                iM3567synchronized3 = c13143l2.m3567synchronized();
                                c13143l2.m3568throw(2);
                                jArr5 = new long[iM3567synchronized];
                                jArr6 = new long[iM3567synchronized];
                                c9892l3 = c9892l5;
                                j11 = position4 + ((long) c9892l5.loadAd);
                                i19 = 0;
                                while (true) {
                                    if (i19 < iM3567synchronized) {
                                        long[] jArr7 = jArr5;
                                        long[] jArr8 = jArr6;
                                        C9892l c9892l6 = c9892l3;
                                        if (length6 != -1 || length6 == j10) {
                                            j12 = j10;
                                        } else {
                                            StringBuilder sbSignature2 = AbstractC0653l.Signature(length6, "VBRI data size mismatch: ", ", ");
                                            j12 = j10;
                                            sbSignature2.append(j12);
                                            AbstractC6427l.vip("VbriSeeker", sbSignature2.toString());
                                        }
                                        if (j12 != j11) {
                                            StringBuilder sbSignature3 = AbstractC0653l.Signature(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                            sbSignature3.append(j11);
                                            sbSignature3.append("\nSeeking will be inaccurate.");
                                            AbstractC6427l.vip("VbriSeeker", sbSignature3.toString());
                                            jMax = Math.max(j12, j11);
                                        } else {
                                            jMax = j12;
                                        }
                                        c9892l2 = c9892l6;
                                        c12060l = new C6595l(jArr7, jArr8, jM3969goto3, j9, jMax, c9892l2.purchase);
                                        break;
                                    }
                                    long[] jArr9 = jArr6;
                                    c9892l4 = c9892l3;
                                    int i22 = i19;
                                    long[] jArr10 = jArr5;
                                    jArr10[i22] = (((long) i19) * jM3969goto3) / ((long) iM3567synchronized);
                                    jArr9[i22] = j11;
                                    if (iM3567synchronized3 != 1) {
                                        iSignatures = c13143l2.signatures();
                                    } else if (iM3567synchronized3 != 2) {
                                        iSignatures = c13143l2.m3567synchronized();
                                    } else if (iM3567synchronized3 != 3) {
                                        iSignatures = c13143l2.appmetrica();
                                    } else {
                                        if (iM3567synchronized3 != 4) {
                                            c12060l = null;
                                            c9892l2 = c9892l4;
                                            break;
                                        }
                                        iSignatures = c13143l2.inmobi();
                                    }
                                    j11 += ((long) iSignatures) * ((long) iM3567synchronized2);
                                    i19 = i22 + 1;
                                    jArr6 = jArr9;
                                    c9892l3 = c9892l4;
                                    jArr5 = jArr10;
                                }
                            } else {
                                c12060l = null;
                                c9892l2 = c9892l5;
                            }
                            interfaceC10430l.remoteconfig(c9892l2.loadAd);
                        } else if (iRemoteconfig2 != 1483304551) {
                            interfaceC10430l.smaato();
                            c12060l = null;
                            c9892l2 = c9892l5;
                            i7 = 0;
                        } else {
                            c9892l2 = c9892l5;
                            i7 = 0;
                            iRemoteconfig3 = c13143l2.remoteconfig();
                            if ((iRemoteconfig3 & 1) != 0) {
                                iInmobi = c13143l2.inmobi();
                            } else {
                                iInmobi = -1;
                            }
                            if ((iRemoteconfig3 & 2) != 0) {
                                jMin = c13143l2.applovin();
                            } else {
                                jMin = -1;
                            }
                            if ((iRemoteconfig3 & 4) == 4) {
                                jArr2 = new long[100];
                                i15 = 0;
                                while (i15 < i14) {
                                    jArr2[i15] = c13143l2.signatures();
                                    i15++;
                                }
                                jArr = jArr2;
                            } else {
                                jArr = null;
                            }
                            if ((iRemoteconfig3 & 8) != 0) {
                                c13143l2.m3568throw(4);
                            }
                            if (c13143l2.yandex() >= 24) {
                                c13143l2.m3568throw(11);
                                fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                                int iM3567synchronized6 = c13143l2.m3567synchronized();
                                int iM3567synchronized7 = c13143l2.m3567synchronized();
                                c10487lYandex = C10487l.yandex(iM3567synchronized6);
                                c10487lYandex2 = C10487l.yandex(iM3567synchronized7);
                                if (fIntBitsToFloat > 0.0f) {
                                    c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                                } else {
                                    c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                                }
                                c13143l2.m3568throw(2);
                                int iAppmetrica2 = c13143l2.appmetrica();
                                i9 = (16773120 & iAppmetrica2) >> 12;
                                i8 = iAppmetrica2 & 4095;
                            } else {
                                c1897l = null;
                                i8 = -1;
                                i9 = -1;
                            }
                            j5 = iInmobi;
                            i10 = c9892l2.loadAd;
                            i11 = c9892l2.crashlytics;
                            i12 = c9892l2.purchase;
                            i13 = c9892l2.billing;
                            c1897l2 = c1897l;
                            if (c10912l.yandex != -1) {
                                c10912l.yandex = i9;
                                c10912l.loadAd = i8;
                            } else {
                                c10912l.yandex = i9;
                                c10912l.loadAd = i8;
                            }
                            if (c1897l2 != null) {
                                c7417l = new C7417l(c1897l2);
                            } else {
                                c7417l = null;
                            }
                            this.smaato = c7417l;
                            position2 = interfaceC10430l.getPosition();
                            interfaceC10430l.remoteconfig(c9892l2.loadAd);
                            if (iRemoteconfig2 == 1483304551) {
                                length2 = interfaceC10430l.getLength();
                                if (j5 != -1) {
                                    jM3969goto2 = -9223372036854775807L;
                                } else {
                                    jM3969goto2 = -9223372036854775807L;
                                }
                                if (jM3969goto2 == -9223372036854775807L) {
                                    c12060l = null;
                                } else {
                                    if (jMin != -1) {
                                        long j14 = length2 - position2;
                                        StringBuilder sbSignature4 = AbstractC0653l.Signature(j14, "Data size mismatch between stream (", ") and Xing frame (");
                                        sbSignature4.append(jMin);
                                        sbSignature4.append("), using smaller value.");
                                        AbstractC6427l.firebase("XingSeeker", sbSignature4.toString());
                                        jMin = Math.min(jMin, j14);
                                    }
                                    c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                                }
                            } else {
                                length = interfaceC10430l.getLength();
                                if (j5 != -1) {
                                }
                                if (jM3969goto != -9223372036854775807L) {
                                    if (jMin != -1) {
                                        j7 = position2 + jMin;
                                        j6 = jMin - ((long) i10);
                                    } else if (length != -1) {
                                        j6 = (length - position2) - ((long) i10);
                                        j7 = length;
                                    } else {
                                        c12060l = null;
                                    }
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode2)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode2)), false, true);
                                } else {
                                    c12060l = null;
                                }
                            }
                        }
                        c7417l2 = this.firebase;
                        position3 = interfaceC10430l.getPosition();
                        if (c7417l2 == null) {
                            c4445l = null;
                        } else {
                            interfaceC1525lArr = c7417l2.yandex;
                            length3 = interfaceC1525lArr.length;
                            i16 = i7;
                            while (true) {
                                if (i16 < length3) {
                                    interfaceC1525l = null;
                                    break;
                                }
                                interfaceC1525l4 = interfaceC1525lArr[i16];
                                if (C18132l.class.isAssignableFrom(interfaceC1525l4.getClass())) {
                                    interfaceC1525l = (InterfaceC1525l) C18132l.class.cast(interfaceC1525l4);
                                    if (!EnumC18623l.f36395l.apply(interfaceC1525l)) {
                                        interfaceC1525l = null;
                                    }
                                } else {
                                    interfaceC1525l = null;
                                }
                                if (interfaceC1525l != null) {
                                    break;
                                }
                                i16++;
                            }
                            c18132l = (C18132l) interfaceC1525l;
                            if (c18132l == null) {
                                c4445l = null;
                            } else {
                                iArr = c18132l.purchase;
                                interfaceC1525lArr2 = c7417l2.yandex;
                                length4 = interfaceC1525lArr2.length;
                                i17 = 0;
                                while (true) {
                                    if (i17 < length4) {
                                        interfaceC1525l2 = null;
                                        break;
                                    }
                                    interfaceC1525l3 = interfaceC1525lArr2[i17];
                                    if (C11403l.class.isAssignableFrom(interfaceC1525l3.getClass())) {
                                        interfaceC1525l2 = (InterfaceC1525l) C11403l.class.cast(interfaceC1525l3);
                                        if (!((C11403l) interfaceC1525l2).yandex.equals("TLEN")) {
                                            interfaceC1525l2 = null;
                                        }
                                    } else {
                                        interfaceC1525l2 = null;
                                    }
                                    if (interfaceC1525l2 != null) {
                                        break;
                                    }
                                    i17++;
                                }
                                c11403l = (C11403l) interfaceC1525l2;
                                if (c11403l == null) {
                                    jM3962continue = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    jM3962continue = AbstractC15323l.m3962continue(Long.parseLong((String) c11403l.crashlytics.get(0)));
                                }
                                length5 = iArr.length;
                                int i23 = length5 + 1;
                                jArr3 = new long[i23];
                                jArr4 = new long[i23];
                                jArr3[c] = position3;
                                jArr4[c] = 0;
                                j8 = 0;
                                i18 = 1;
                                while (i18 <= length5) {
                                    int i24 = i18 - 1;
                                    int i25 = length5;
                                    long j15 = position3 + ((long) (c18132l.crashlytics + iArr[i24]));
                                    j8 += (long) (c18132l.amazon + c18132l.billing[i24]);
                                    jArr3[i18] = j15;
                                    jArr4[i18] = j8;
                                    i18++;
                                    length5 = i25;
                                    position3 = j15;
                                }
                                c4445l = new C4445l(jM3962continue, jArr3, jArr4);
                            }
                        }
                        if (this.subscription) {
                            c9579l = new C9579l(-9223372036854775807L);
                            c13143l = c13143l;
                            c10912l = c10912l;
                            c9892l = c9892l2;
                            z3 = true;
                            i21 = 0;
                        } else {
                            j2 = -9223372036854775807L;
                            if (c4445l != null) {
                                c12060l = c4445l;
                            } else if (c12060l == null) {
                                c12060l = null;
                            }
                            if (c12060l == null) {
                                int i26 = i7;
                                interfaceC10430l.yandex(i26, 4, c13143l.yandex);
                                c13143l.m3562for(i26);
                                c9892l2.yandex(c13143l.remoteconfig());
                                c9892l = c9892l2;
                                z2 = true;
                                i21 = 0;
                                c12060l = new C12060l(interfaceC10430l.getLength(), interfaceC10430l.getPosition(), c9892l2.purchase, c9892l2.loadAd, false, true);
                            } else {
                                c9892l = c9892l2;
                                z2 = true;
                                i21 = 0;
                            }
                            c12060l.loadAd();
                            c12060l.loadAd();
                            this.admob.amazon(c12060l.mopub());
                            c9579l = c12060l;
                            z3 = z2;
                        }
                        this.ads = c9579l;
                        this.mopub.tapsense(c9579l);
                        c7417lLoadAd = this.firebase;
                        c7417l3 = this.smaato;
                        if (c7417lLoadAd != null) {
                            if (c7417l3 != null) {
                                c7417lLoadAd = c7417lLoadAd.loadAd(c7417l3);
                            }
                            c7417l3 = c7417lLoadAd;
                        }
                        c12984l = new C12984l();
                        c12984l.remoteconfig = AbstractC3825l.vip("audio/mpeg");
                        c12984l.vip = AbstractC3825l.vip((String) c9892l.mopub);
                        c12984l.metrica = 4096;
                        c12984l.f25447throws = c9892l.amazon;
                        c12984l.f25442package = c9892l.crashlytics;
                        c12984l.f25444strictfp = c10912l.yandex;
                        c12984l.f25448volatile = c10912l.loadAd;
                        c12984l.firebase = c7417l3;
                        if (this.ads.billing() != -2147483647) {
                            c12984l.admob = this.ads.billing();
                        }
                        this.subs.mopub(new C5978l(c12984l));
                        this.metrica = interfaceC10430l.getPosition();
                        j3 = 0;
                        r4 = z3;
                    } else if (i4 == 1) {
                        i5 = 13;
                    }
                    i6 = i5;
                    j2 = -9223372036854775807L;
                    if (c13143l2.crashlytics >= i6 + 4) {
                        c13143l2.m3562for(i6);
                        iRemoteconfig2 = c13143l2.remoteconfig();
                        if (iRemoteconfig2 != 1483304551) {
                            if (c13143l2.crashlytics >= 40) {
                                c13143l2.m3562for(36);
                                if (c13143l2.remoteconfig() == 1447187017) {
                                    iRemoteconfig2 = 1447187017;
                                } else {
                                    iRemoteconfig2 = 0;
                                }
                            } else {
                                iRemoteconfig2 = 0;
                            }
                        }
                    } else if (c13143l2.crashlytics >= 40) {
                        c13143l2.m3562for(36);
                        if (c13143l2.remoteconfig() == 1447187017) {
                            iRemoteconfig2 = 1447187017;
                        } else {
                            iRemoteconfig2 = 0;
                        }
                    } else {
                        iRemoteconfig2 = 0;
                    }
                    c10912l = this.amazon;
                    if (iRemoteconfig2 == 1231971951) {
                        c9892l2 = c9892l5;
                        i7 = 0;
                        iRemoteconfig3 = c13143l2.remoteconfig();
                        if ((iRemoteconfig3 & 1) != 0) {
                            iInmobi = c13143l2.inmobi();
                        } else {
                            iInmobi = -1;
                        }
                        if ((iRemoteconfig3 & 2) != 0) {
                            jMin = c13143l2.applovin();
                        } else {
                            jMin = -1;
                        }
                        if ((iRemoteconfig3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = c13143l2.signatures();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iRemoteconfig3 & 8) != 0) {
                            c13143l2.m3568throw(4);
                        }
                        if (c13143l2.yandex() >= 24) {
                            c13143l2.m3568throw(11);
                            fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                            int iM3567synchronized8 = c13143l2.m3567synchronized();
                            int iM3567synchronized9 = c13143l2.m3567synchronized();
                            c10487lYandex = C10487l.yandex(iM3567synchronized8);
                            c10487lYandex2 = C10487l.yandex(iM3567synchronized9);
                            if (fIntBitsToFloat > 0.0f) {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            } else {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            }
                            c13143l2.m3568throw(2);
                            int iAppmetrica3 = c13143l2.appmetrica();
                            i9 = (16773120 & iAppmetrica3) >> 12;
                            i8 = iAppmetrica3 & 4095;
                        } else {
                            c1897l = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iInmobi;
                        i10 = c9892l2.loadAd;
                        i11 = c9892l2.crashlytics;
                        i12 = c9892l2.purchase;
                        i13 = c9892l2.billing;
                        c1897l2 = c1897l;
                        if (c10912l.yandex != -1) {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        } else {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        }
                        if (c1897l2 != null) {
                            c7417l = new C7417l(c1897l2);
                        } else {
                            c7417l = null;
                        }
                        this.smaato = c7417l;
                        position2 = interfaceC10430l.getPosition();
                        interfaceC10430l.remoteconfig(c9892l2.loadAd);
                        if (iRemoteconfig2 == 1483304551) {
                            length2 = interfaceC10430l.getLength();
                            if (j5 != -1) {
                                jM3969goto2 = -9223372036854775807L;
                            } else {
                                jM3969goto2 = -9223372036854775807L;
                            }
                            if (jM3969goto2 == -9223372036854775807L) {
                                c12060l = null;
                            } else {
                                if (jMin != -1) {
                                    long j16 = length2 - position2;
                                    StringBuilder sbSignature5 = AbstractC0653l.Signature(j16, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbSignature5.append(jMin);
                                    sbSignature5.append("), using smaller value.");
                                    AbstractC6427l.firebase("XingSeeker", sbSignature5.toString());
                                    jMin = Math.min(jMin, j16);
                                }
                                c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                            }
                        } else {
                            length = interfaceC10430l.getLength();
                            if (j5 != -1) {
                            }
                            if (jM3969goto != -9223372036854775807L) {
                                if (jMin != -1) {
                                    j7 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    c12060l = null;
                                }
                                RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                                c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode3)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode3)), false, true);
                            } else {
                                c12060l = null;
                            }
                        }
                    } else if (iRemoteconfig2 != 1447187017) {
                        length6 = interfaceC10430l.getLength();
                        position4 = interfaceC10430l.getPosition();
                        c13143l2.m3568throw(6);
                        int iRemoteconfig6 = c13143l2.remoteconfig();
                        i7 = 0;
                        j9 = position4 + ((long) c9892l5.loadAd);
                        j10 = j9 + ((long) iRemoteconfig6);
                        iRemoteconfig4 = c13143l2.remoteconfig();
                        if (iRemoteconfig4 <= 0) {
                            jM3969goto3 = AbstractC15323l.m3969goto(c9892l5.crashlytics, (((long) iRemoteconfig4) * ((long) c9892l5.billing)) - 1);
                            iM3567synchronized = c13143l2.m3567synchronized();
                            iM3567synchronized2 = c13143l2.m3567synchronized();
                            iM3567synchronized3 = c13143l2.m3567synchronized();
                            c13143l2.m3568throw(2);
                            jArr5 = new long[iM3567synchronized];
                            jArr6 = new long[iM3567synchronized];
                            c9892l3 = c9892l5;
                            j11 = position4 + ((long) c9892l5.loadAd);
                            i19 = 0;
                            while (true) {
                                if (i19 < iM3567synchronized) {
                                    long[] jArr11 = jArr5;
                                    long[] jArr12 = jArr6;
                                    C9892l c9892l7 = c9892l3;
                                    if (length6 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        StringBuilder sbSignature6 = AbstractC0653l.Signature(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        sbSignature6.append(j11);
                                        sbSignature6.append("\nSeeking will be inaccurate.");
                                        AbstractC6427l.vip("VbriSeeker", sbSignature6.toString());
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    c9892l2 = c9892l7;
                                    c12060l = new C6595l(jArr11, jArr12, jM3969goto3, j9, jMax, c9892l2.purchase);
                                    break;
                                }
                                long[] jArr13 = jArr6;
                                c9892l4 = c9892l3;
                                int i27 = i19;
                                long[] jArr14 = jArr5;
                                jArr14[i27] = (((long) i19) * jM3969goto3) / ((long) iM3567synchronized);
                                jArr13[i27] = j11;
                                if (iM3567synchronized3 != 1) {
                                    iSignatures = c13143l2.signatures();
                                } else if (iM3567synchronized3 != 2) {
                                    iSignatures = c13143l2.m3567synchronized();
                                } else if (iM3567synchronized3 != 3) {
                                    iSignatures = c13143l2.appmetrica();
                                } else {
                                    if (iM3567synchronized3 != 4) {
                                        c12060l = null;
                                        c9892l2 = c9892l4;
                                        break;
                                    }
                                    iSignatures = c13143l2.inmobi();
                                }
                                j11 += ((long) iSignatures) * ((long) iM3567synchronized2);
                                i19 = i27 + 1;
                                jArr6 = jArr13;
                                c9892l3 = c9892l4;
                                jArr5 = jArr14;
                            }
                        } else {
                            c12060l = null;
                            c9892l2 = c9892l5;
                        }
                        interfaceC10430l.remoteconfig(c9892l2.loadAd);
                    } else if (iRemoteconfig2 != 1483304551) {
                        interfaceC10430l.smaato();
                        c12060l = null;
                        c9892l2 = c9892l5;
                        i7 = 0;
                    } else {
                        c9892l2 = c9892l5;
                        i7 = 0;
                        iRemoteconfig3 = c13143l2.remoteconfig();
                        if ((iRemoteconfig3 & 1) != 0) {
                            iInmobi = c13143l2.inmobi();
                        } else {
                            iInmobi = -1;
                        }
                        if ((iRemoteconfig3 & 2) != 0) {
                            jMin = c13143l2.applovin();
                        } else {
                            jMin = -1;
                        }
                        if ((iRemoteconfig3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = c13143l2.signatures();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iRemoteconfig3 & 8) != 0) {
                            c13143l2.m3568throw(4);
                        }
                        if (c13143l2.yandex() >= 24) {
                            c13143l2.m3568throw(11);
                            fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                            int iM3567synchronized10 = c13143l2.m3567synchronized();
                            int iM3567synchronized11 = c13143l2.m3567synchronized();
                            c10487lYandex = C10487l.yandex(iM3567synchronized10);
                            c10487lYandex2 = C10487l.yandex(iM3567synchronized11);
                            if (fIntBitsToFloat > 0.0f) {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            } else {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            }
                            c13143l2.m3568throw(2);
                            int iAppmetrica4 = c13143l2.appmetrica();
                            i9 = (16773120 & iAppmetrica4) >> 12;
                            i8 = iAppmetrica4 & 4095;
                        } else {
                            c1897l = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iInmobi;
                        i10 = c9892l2.loadAd;
                        i11 = c9892l2.crashlytics;
                        i12 = c9892l2.purchase;
                        i13 = c9892l2.billing;
                        c1897l2 = c1897l;
                        if (c10912l.yandex != -1) {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        } else {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        }
                        if (c1897l2 != null) {
                            c7417l = new C7417l(c1897l2);
                        } else {
                            c7417l = null;
                        }
                        this.smaato = c7417l;
                        position2 = interfaceC10430l.getPosition();
                        interfaceC10430l.remoteconfig(c9892l2.loadAd);
                        if (iRemoteconfig2 == 1483304551) {
                            length2 = interfaceC10430l.getLength();
                            if (j5 != -1) {
                                jM3969goto2 = -9223372036854775807L;
                            } else {
                                jM3969goto2 = -9223372036854775807L;
                            }
                            if (jM3969goto2 == -9223372036854775807L) {
                                c12060l = null;
                            } else {
                                if (jMin != -1) {
                                    long j17 = length2 - position2;
                                    StringBuilder sbSignature7 = AbstractC0653l.Signature(j17, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbSignature7.append(jMin);
                                    sbSignature7.append("), using smaller value.");
                                    AbstractC6427l.firebase("XingSeeker", sbSignature7.toString());
                                    jMin = Math.min(jMin, j17);
                                }
                                c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                            }
                        } else {
                            length = interfaceC10430l.getLength();
                            if (j5 != -1) {
                            }
                            if (jM3969goto != -9223372036854775807L) {
                                if (jMin != -1) {
                                    j7 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    c12060l = null;
                                }
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode4)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode4)), false, true);
                            } else {
                                c12060l = null;
                            }
                        }
                    }
                    c7417l2 = this.firebase;
                    position3 = interfaceC10430l.getPosition();
                    if (c7417l2 == null) {
                        c4445l = null;
                    } else {
                        interfaceC1525lArr = c7417l2.yandex;
                        length3 = interfaceC1525lArr.length;
                        i16 = i7;
                        while (true) {
                            if (i16 < length3) {
                                interfaceC1525l = null;
                                break;
                            }
                            interfaceC1525l4 = interfaceC1525lArr[i16];
                            if (C18132l.class.isAssignableFrom(interfaceC1525l4.getClass())) {
                                interfaceC1525l = (InterfaceC1525l) C18132l.class.cast(interfaceC1525l4);
                                if (!EnumC18623l.f36395l.apply(interfaceC1525l)) {
                                    interfaceC1525l = null;
                                }
                            } else {
                                interfaceC1525l = null;
                            }
                            if (interfaceC1525l != null) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        c18132l = (C18132l) interfaceC1525l;
                        if (c18132l == null) {
                            c4445l = null;
                        } else {
                            iArr = c18132l.purchase;
                            interfaceC1525lArr2 = c7417l2.yandex;
                            length4 = interfaceC1525lArr2.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length4) {
                                    interfaceC1525l2 = null;
                                    break;
                                }
                                interfaceC1525l3 = interfaceC1525lArr2[i17];
                                if (C11403l.class.isAssignableFrom(interfaceC1525l3.getClass())) {
                                    interfaceC1525l2 = (InterfaceC1525l) C11403l.class.cast(interfaceC1525l3);
                                    if (!((C11403l) interfaceC1525l2).yandex.equals("TLEN")) {
                                        interfaceC1525l2 = null;
                                    }
                                } else {
                                    interfaceC1525l2 = null;
                                }
                                if (interfaceC1525l2 != null) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            c11403l = (C11403l) interfaceC1525l2;
                            if (c11403l == null) {
                                jM3962continue = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jM3962continue = AbstractC15323l.m3962continue(Long.parseLong((String) c11403l.crashlytics.get(0)));
                            }
                            length5 = iArr.length;
                            int i28 = length5 + 1;
                            jArr3 = new long[i28];
                            jArr4 = new long[i28];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i18 = 1;
                            while (i18 <= length5) {
                                int i29 = i18 - 1;
                                int i210 = length5;
                                long j18 = position3 + ((long) (c18132l.crashlytics + iArr[i29]));
                                j8 += (long) (c18132l.amazon + c18132l.billing[i29]);
                                jArr3[i18] = j18;
                                jArr4[i18] = j8;
                                i18++;
                                length5 = i210;
                                position3 = j18;
                            }
                            c4445l = new C4445l(jM3962continue, jArr3, jArr4);
                        }
                    }
                    if (this.subscription) {
                        c9579l = new C9579l(-9223372036854775807L);
                        c13143l = c13143l;
                        c10912l = c10912l;
                        c9892l = c9892l2;
                        z3 = true;
                        i21 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (c4445l != null) {
                            c12060l = c4445l;
                        } else if (c12060l == null) {
                            c12060l = null;
                        }
                        if (c12060l == null) {
                            int i211 = i7;
                            interfaceC10430l.yandex(i211, 4, c13143l.yandex);
                            c13143l.m3562for(i211);
                            c9892l2.yandex(c13143l.remoteconfig());
                            c9892l = c9892l2;
                            z2 = true;
                            i21 = 0;
                            c12060l = new C12060l(interfaceC10430l.getLength(), interfaceC10430l.getPosition(), c9892l2.purchase, c9892l2.loadAd, false, true);
                        } else {
                            c9892l = c9892l2;
                            z2 = true;
                            i21 = 0;
                        }
                        c12060l.loadAd();
                        c12060l.loadAd();
                        this.admob.amazon(c12060l.mopub());
                        c9579l = c12060l;
                        z3 = z2;
                    }
                    this.ads = c9579l;
                    this.mopub.tapsense(c9579l);
                    c7417lLoadAd = this.firebase;
                    c7417l3 = this.smaato;
                    if (c7417lLoadAd != null) {
                        if (c7417l3 != null) {
                            c7417lLoadAd = c7417lLoadAd.loadAd(c7417l3);
                        }
                        c7417l3 = c7417lLoadAd;
                    }
                    c12984l = new C12984l();
                    c12984l.remoteconfig = AbstractC3825l.vip("audio/mpeg");
                    c12984l.vip = AbstractC3825l.vip((String) c9892l.mopub);
                    c12984l.metrica = 4096;
                    c12984l.f25447throws = c9892l.amazon;
                    c12984l.f25442package = c9892l.crashlytics;
                    c12984l.f25444strictfp = c10912l.yandex;
                    c12984l.f25448volatile = c10912l.loadAd;
                    c12984l.firebase = c7417l3;
                    if (this.ads.billing() != -2147483647) {
                        c12984l.admob = this.ads.billing();
                    }
                    this.subs.mopub(new C5978l(c12984l));
                    this.metrica = interfaceC10430l.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else {
                    c9892l = c9892l5;
                    c13143l = c13143l;
                    z = true;
                    th = null;
                    j = 1000000;
                    j2 = -9223372036854775807L;
                    j3 = 0;
                    if (this.metrica != 0) {
                        position = interfaceC10430l.getPosition();
                        j4 = this.metrica;
                        if (position < j4) {
                            r4 = z;
                            r4 = z;
                            interfaceC10430l.remoteconfig((int) (j4 - position));
                            r4 = z;
                        }
                    }
                }
                r4 = z;
                r4 = z;
                r4 = z;
                if (this.adcel == 0) {
                    interfaceC10430l.smaato();
                    if (admob(interfaceC10430l)) {
                        i = -1;
                        i21 = -1;
                    } else {
                        c13143l.m3562for(i21);
                        iRemoteconfig = c13143l.remoteconfig();
                        if (((-128000) & iRemoteconfig) == (((long) this.isPro) & (-128000)) || AbstractC6968l.crashlytics(iRemoteconfig) == -1) {
                            interfaceC10430l.remoteconfig(r4);
                            this.isPro = i21;
                        } else {
                            c9892l.yandex(iRemoteconfig);
                            if (this.remoteconfig == j2) {
                                this.remoteconfig = this.ads.crashlytics(interfaceC10430l.getPosition());
                                long j19 = this.yandex;
                                if (j19 != j2) {
                                    this.remoteconfig = (j19 - this.ads.crashlytics(j3)) + this.remoteconfig;
                                }
                            }
                            this.adcel = c9892l.loadAd;
                            this.startapp = interfaceC10430l.getPosition() + ((long) c9892l.loadAd);
                            if (this.ads instanceof AbstractC8280l) {
                                long j20 = ((this.vip + ((long) c9892l.billing)) * j) / ((long) c9892l.crashlytics);
                                throw th;
                            }
                            iBilling = this.subs.billing(interfaceC10430l, this.adcel, r4);
                            if (iBilling == -1) {
                                i = -1;
                                i21 = -1;
                            } else {
                                i2 = this.adcel - iBilling;
                                this.adcel = i2;
                                if (i2 <= 0) {
                                    this.subs.yandex(this.remoteconfig + ((this.vip * j) / ((long) c9892l.crashlytics)), 1, c9892l.loadAd, 0, null);
                                    this.vip += (long) c9892l.billing;
                                    this.adcel = i21;
                                }
                            }
                        }
                        i = -1;
                    }
                } else {
                    iBilling = this.subs.billing(interfaceC10430l, this.adcel, r4);
                    if (iBilling == -1) {
                        i = -1;
                        i21 = -1;
                    } else {
                        i2 = this.adcel - iBilling;
                        this.adcel = i2;
                        if (i2 <= 0) {
                            this.subs.yandex(this.remoteconfig + ((this.vip * j) / ((long) c9892l.crashlytics)), 1, c9892l.loadAd, 0, null);
                            this.vip += (long) c9892l.billing;
                            this.adcel = i21;
                        }
                        i = -1;
                    }
                }
            } catch (EOFException unused) {
                c9892l = c9892l5;
                th = null;
                i = -1;
                i21 = -1;
                j = 1000000;
            }
        } else {
            interfaceC1584l = this.ads;
            c13143l = this.loadAd;
            if (interfaceC1584l == null) {
                c13143l2 = new C13143l(c9892l5.loadAd);
                th = null;
                interfaceC10430l.yandex(0, c9892l5.loadAd, c13143l2.yandex);
                i3 = c9892l5.yandex & 1;
                i4 = c9892l5.amazon;
                i5 = 21;
                j = 1000000;
                if (i3 != 0) {
                    if (i4 != 1) {
                        i6 = 36;
                    }
                    j2 = -9223372036854775807L;
                    if (c13143l2.crashlytics >= i6 + 4) {
                        c13143l2.m3562for(i6);
                        iRemoteconfig2 = c13143l2.remoteconfig();
                        if (iRemoteconfig2 != 1483304551) {
                            if (c13143l2.crashlytics >= 40) {
                                c13143l2.m3562for(36);
                                if (c13143l2.remoteconfig() == 1447187017) {
                                    iRemoteconfig2 = 1447187017;
                                } else {
                                    iRemoteconfig2 = 0;
                                }
                            } else {
                                iRemoteconfig2 = 0;
                            }
                        }
                    } else if (c13143l2.crashlytics >= 40) {
                        c13143l2.m3562for(36);
                        if (c13143l2.remoteconfig() == 1447187017) {
                            iRemoteconfig2 = 1447187017;
                        } else {
                            iRemoteconfig2 = 0;
                        }
                    } else {
                        iRemoteconfig2 = 0;
                    }
                    c10912l = this.amazon;
                    if (iRemoteconfig2 == 1231971951) {
                        c9892l2 = c9892l5;
                        i7 = 0;
                        iRemoteconfig3 = c13143l2.remoteconfig();
                        if ((iRemoteconfig3 & 1) != 0) {
                            iInmobi = c13143l2.inmobi();
                        } else {
                            iInmobi = -1;
                        }
                        if ((iRemoteconfig3 & 2) != 0) {
                            jMin = c13143l2.applovin();
                        } else {
                            jMin = -1;
                        }
                        if ((iRemoteconfig3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = c13143l2.signatures();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iRemoteconfig3 & 8) != 0) {
                            c13143l2.m3568throw(4);
                        }
                        if (c13143l2.yandex() >= 24) {
                            c13143l2.m3568throw(11);
                            fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                            int iM3567synchronized12 = c13143l2.m3567synchronized();
                            int iM3567synchronized13 = c13143l2.m3567synchronized();
                            c10487lYandex = C10487l.yandex(iM3567synchronized12);
                            c10487lYandex2 = C10487l.yandex(iM3567synchronized13);
                            if (fIntBitsToFloat > 0.0f) {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            } else {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            }
                            c13143l2.m3568throw(2);
                            int iAppmetrica5 = c13143l2.appmetrica();
                            i9 = (16773120 & iAppmetrica5) >> 12;
                            i8 = iAppmetrica5 & 4095;
                        } else {
                            c1897l = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iInmobi;
                        i10 = c9892l2.loadAd;
                        i11 = c9892l2.crashlytics;
                        i12 = c9892l2.purchase;
                        i13 = c9892l2.billing;
                        c1897l2 = c1897l;
                        if (c10912l.yandex != -1) {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        } else {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        }
                        if (c1897l2 != null) {
                            c7417l = new C7417l(c1897l2);
                        } else {
                            c7417l = null;
                        }
                        this.smaato = c7417l;
                        position2 = interfaceC10430l.getPosition();
                        interfaceC10430l.remoteconfig(c9892l2.loadAd);
                        if (iRemoteconfig2 == 1483304551) {
                            length2 = interfaceC10430l.getLength();
                            if (j5 != -1) {
                                jM3969goto2 = -9223372036854775807L;
                            } else {
                                jM3969goto2 = -9223372036854775807L;
                            }
                            if (jM3969goto2 == -9223372036854775807L) {
                                c12060l = null;
                            } else {
                                if (jMin != -1) {
                                    long j110 = length2 - position2;
                                    StringBuilder sbSignature8 = AbstractC0653l.Signature(j110, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbSignature8.append(jMin);
                                    sbSignature8.append("), using smaller value.");
                                    AbstractC6427l.firebase("XingSeeker", sbSignature8.toString());
                                    jMin = Math.min(jMin, j110);
                                }
                                c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                            }
                        } else {
                            length = interfaceC10430l.getLength();
                            if (j5 != -1) {
                            }
                            if (jM3969goto != -9223372036854775807L) {
                                if (jMin != -1) {
                                    j7 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    c12060l = null;
                                }
                                RoundingMode roundingMode5 = RoundingMode.HALF_UP;
                                c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode5)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode5)), false, true);
                            } else {
                                c12060l = null;
                            }
                        }
                    } else if (iRemoteconfig2 != 1447187017) {
                        length6 = interfaceC10430l.getLength();
                        position4 = interfaceC10430l.getPosition();
                        c13143l2.m3568throw(6);
                        int iRemoteconfig7 = c13143l2.remoteconfig();
                        i7 = 0;
                        j9 = position4 + ((long) c9892l5.loadAd);
                        j10 = j9 + ((long) iRemoteconfig7);
                        iRemoteconfig4 = c13143l2.remoteconfig();
                        if (iRemoteconfig4 <= 0) {
                            jM3969goto3 = AbstractC15323l.m3969goto(c9892l5.crashlytics, (((long) iRemoteconfig4) * ((long) c9892l5.billing)) - 1);
                            iM3567synchronized = c13143l2.m3567synchronized();
                            iM3567synchronized2 = c13143l2.m3567synchronized();
                            iM3567synchronized3 = c13143l2.m3567synchronized();
                            c13143l2.m3568throw(2);
                            jArr5 = new long[iM3567synchronized];
                            jArr6 = new long[iM3567synchronized];
                            c9892l3 = c9892l5;
                            j11 = position4 + ((long) c9892l5.loadAd);
                            i19 = 0;
                            while (true) {
                                if (i19 < iM3567synchronized) {
                                    long[] jArr15 = jArr5;
                                    long[] jArr16 = jArr6;
                                    C9892l c9892l8 = c9892l3;
                                    if (length6 != -1) {
                                        j12 = j10;
                                    } else {
                                        j12 = j10;
                                    }
                                    if (j12 != j11) {
                                        StringBuilder sbSignature9 = AbstractC0653l.Signature(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        sbSignature9.append(j11);
                                        sbSignature9.append("\nSeeking will be inaccurate.");
                                        AbstractC6427l.vip("VbriSeeker", sbSignature9.toString());
                                        jMax = Math.max(j12, j11);
                                    } else {
                                        jMax = j12;
                                    }
                                    c9892l2 = c9892l8;
                                    c12060l = new C6595l(jArr15, jArr16, jM3969goto3, j9, jMax, c9892l2.purchase);
                                    break;
                                }
                                long[] jArr17 = jArr6;
                                c9892l4 = c9892l3;
                                int i212 = i19;
                                long[] jArr18 = jArr5;
                                jArr18[i212] = (((long) i19) * jM3969goto3) / ((long) iM3567synchronized);
                                jArr17[i212] = j11;
                                if (iM3567synchronized3 != 1) {
                                    iSignatures = c13143l2.signatures();
                                } else if (iM3567synchronized3 != 2) {
                                    iSignatures = c13143l2.m3567synchronized();
                                } else if (iM3567synchronized3 != 3) {
                                    iSignatures = c13143l2.appmetrica();
                                } else {
                                    if (iM3567synchronized3 != 4) {
                                        c12060l = null;
                                        c9892l2 = c9892l4;
                                        break;
                                    }
                                    iSignatures = c13143l2.inmobi();
                                }
                                j11 += ((long) iSignatures) * ((long) iM3567synchronized2);
                                i19 = i212 + 1;
                                jArr6 = jArr17;
                                c9892l3 = c9892l4;
                                jArr5 = jArr18;
                            }
                        } else {
                            c12060l = null;
                            c9892l2 = c9892l5;
                        }
                        interfaceC10430l.remoteconfig(c9892l2.loadAd);
                    } else if (iRemoteconfig2 != 1483304551) {
                        interfaceC10430l.smaato();
                        c12060l = null;
                        c9892l2 = c9892l5;
                        i7 = 0;
                    } else {
                        c9892l2 = c9892l5;
                        i7 = 0;
                        iRemoteconfig3 = c13143l2.remoteconfig();
                        if ((iRemoteconfig3 & 1) != 0) {
                            iInmobi = c13143l2.inmobi();
                        } else {
                            iInmobi = -1;
                        }
                        if ((iRemoteconfig3 & 2) != 0) {
                            jMin = c13143l2.applovin();
                        } else {
                            jMin = -1;
                        }
                        if ((iRemoteconfig3 & 4) == 4) {
                            jArr2 = new long[100];
                            i15 = 0;
                            while (i15 < i14) {
                                jArr2[i15] = c13143l2.signatures();
                                i15++;
                            }
                            jArr = jArr2;
                        } else {
                            jArr = null;
                        }
                        if ((iRemoteconfig3 & 8) != 0) {
                            c13143l2.m3568throw(4);
                        }
                        if (c13143l2.yandex() >= 24) {
                            c13143l2.m3568throw(11);
                            fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                            int iM3567synchronized14 = c13143l2.m3567synchronized();
                            int iM3567synchronized15 = c13143l2.m3567synchronized();
                            c10487lYandex = C10487l.yandex(iM3567synchronized14);
                            c10487lYandex2 = C10487l.yandex(iM3567synchronized15);
                            if (fIntBitsToFloat > 0.0f) {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            } else {
                                c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                            }
                            c13143l2.m3568throw(2);
                            int iAppmetrica6 = c13143l2.appmetrica();
                            i9 = (16773120 & iAppmetrica6) >> 12;
                            i8 = iAppmetrica6 & 4095;
                        } else {
                            c1897l = null;
                            i8 = -1;
                            i9 = -1;
                        }
                        j5 = iInmobi;
                        i10 = c9892l2.loadAd;
                        i11 = c9892l2.crashlytics;
                        i12 = c9892l2.purchase;
                        i13 = c9892l2.billing;
                        c1897l2 = c1897l;
                        if (c10912l.yandex != -1) {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        } else {
                            c10912l.yandex = i9;
                            c10912l.loadAd = i8;
                        }
                        if (c1897l2 != null) {
                            c7417l = new C7417l(c1897l2);
                        } else {
                            c7417l = null;
                        }
                        this.smaato = c7417l;
                        position2 = interfaceC10430l.getPosition();
                        interfaceC10430l.remoteconfig(c9892l2.loadAd);
                        if (iRemoteconfig2 == 1483304551) {
                            length2 = interfaceC10430l.getLength();
                            if (j5 != -1) {
                                jM3969goto2 = -9223372036854775807L;
                            } else {
                                jM3969goto2 = -9223372036854775807L;
                            }
                            if (jM3969goto2 == -9223372036854775807L) {
                                c12060l = null;
                            } else {
                                if (jMin != -1) {
                                    long j111 = length2 - position2;
                                    StringBuilder sbSignature10 = AbstractC0653l.Signature(j111, "Data size mismatch between stream (", ") and Xing frame (");
                                    sbSignature10.append(jMin);
                                    sbSignature10.append("), using smaller value.");
                                    AbstractC6427l.firebase("XingSeeker", sbSignature10.toString());
                                    jMin = Math.min(jMin, j111);
                                }
                                c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                            }
                        } else {
                            length = interfaceC10430l.getLength();
                            if (j5 != -1) {
                            }
                            if (jM3969goto != -9223372036854775807L) {
                                if (jMin != -1) {
                                    j7 = position2 + jMin;
                                    j6 = jMin - ((long) i10);
                                } else if (length != -1) {
                                    j6 = (length - position2) - ((long) i10);
                                    j7 = length;
                                } else {
                                    c12060l = null;
                                }
                                RoundingMode roundingMode6 = RoundingMode.HALF_UP;
                                c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode6)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode6)), false, true);
                            } else {
                                c12060l = null;
                            }
                        }
                    }
                    c7417l2 = this.firebase;
                    position3 = interfaceC10430l.getPosition();
                    if (c7417l2 == null) {
                        c4445l = null;
                    } else {
                        interfaceC1525lArr = c7417l2.yandex;
                        length3 = interfaceC1525lArr.length;
                        i16 = i7;
                        while (true) {
                            if (i16 < length3) {
                                interfaceC1525l = null;
                                break;
                            }
                            interfaceC1525l4 = interfaceC1525lArr[i16];
                            if (C18132l.class.isAssignableFrom(interfaceC1525l4.getClass())) {
                                interfaceC1525l = (InterfaceC1525l) C18132l.class.cast(interfaceC1525l4);
                                if (!EnumC18623l.f36395l.apply(interfaceC1525l)) {
                                    interfaceC1525l = null;
                                }
                            } else {
                                interfaceC1525l = null;
                            }
                            if (interfaceC1525l != null) {
                                break;
                                break;
                            }
                            i16++;
                        }
                        c18132l = (C18132l) interfaceC1525l;
                        if (c18132l == null) {
                            c4445l = null;
                        } else {
                            iArr = c18132l.purchase;
                            interfaceC1525lArr2 = c7417l2.yandex;
                            length4 = interfaceC1525lArr2.length;
                            i17 = 0;
                            while (true) {
                                if (i17 < length4) {
                                    interfaceC1525l2 = null;
                                    break;
                                }
                                interfaceC1525l3 = interfaceC1525lArr2[i17];
                                if (C11403l.class.isAssignableFrom(interfaceC1525l3.getClass())) {
                                    interfaceC1525l2 = (InterfaceC1525l) C11403l.class.cast(interfaceC1525l3);
                                    if (!((C11403l) interfaceC1525l2).yandex.equals("TLEN")) {
                                        interfaceC1525l2 = null;
                                    }
                                } else {
                                    interfaceC1525l2 = null;
                                }
                                if (interfaceC1525l2 != null) {
                                    break;
                                    break;
                                }
                                i17++;
                            }
                            c11403l = (C11403l) interfaceC1525l2;
                            if (c11403l == null) {
                                jM3962continue = -9223372036854775807L;
                                c = 0;
                            } else {
                                c = 0;
                                jM3962continue = AbstractC15323l.m3962continue(Long.parseLong((String) c11403l.crashlytics.get(0)));
                            }
                            length5 = iArr.length;
                            int i213 = length5 + 1;
                            jArr3 = new long[i213];
                            jArr4 = new long[i213];
                            jArr3[c] = position3;
                            jArr4[c] = 0;
                            j8 = 0;
                            i18 = 1;
                            while (i18 <= length5) {
                                int i214 = i18 - 1;
                                int i215 = length5;
                                long j112 = position3 + ((long) (c18132l.crashlytics + iArr[i214]));
                                j8 += (long) (c18132l.amazon + c18132l.billing[i214]);
                                jArr3[i18] = j112;
                                jArr4[i18] = j8;
                                i18++;
                                length5 = i215;
                                position3 = j112;
                            }
                            c4445l = new C4445l(jM3962continue, jArr3, jArr4);
                        }
                    }
                    if (this.subscription) {
                        c9579l = new C9579l(-9223372036854775807L);
                        c13143l = c13143l;
                        c10912l = c10912l;
                        c9892l = c9892l2;
                        z3 = true;
                        i21 = 0;
                    } else {
                        j2 = -9223372036854775807L;
                        if (c4445l != null) {
                            c12060l = c4445l;
                        } else if (c12060l == null) {
                            c12060l = null;
                        }
                        if (c12060l == null) {
                            int i216 = i7;
                            interfaceC10430l.yandex(i216, 4, c13143l.yandex);
                            c13143l.m3562for(i216);
                            c9892l2.yandex(c13143l.remoteconfig());
                            c9892l = c9892l2;
                            z2 = true;
                            i21 = 0;
                            c12060l = new C12060l(interfaceC10430l.getLength(), interfaceC10430l.getPosition(), c9892l2.purchase, c9892l2.loadAd, false, true);
                        } else {
                            c9892l = c9892l2;
                            z2 = true;
                            i21 = 0;
                        }
                        c12060l.loadAd();
                        c12060l.loadAd();
                        this.admob.amazon(c12060l.mopub());
                        c9579l = c12060l;
                        z3 = z2;
                    }
                    this.ads = c9579l;
                    this.mopub.tapsense(c9579l);
                    c7417lLoadAd = this.firebase;
                    c7417l3 = this.smaato;
                    if (c7417lLoadAd != null) {
                        if (c7417l3 != null) {
                            c7417lLoadAd = c7417lLoadAd.loadAd(c7417l3);
                        }
                        c7417l3 = c7417lLoadAd;
                    }
                    c12984l = new C12984l();
                    c12984l.remoteconfig = AbstractC3825l.vip("audio/mpeg");
                    c12984l.vip = AbstractC3825l.vip((String) c9892l.mopub);
                    c12984l.metrica = 4096;
                    c12984l.f25447throws = c9892l.amazon;
                    c12984l.f25442package = c9892l.crashlytics;
                    c12984l.f25444strictfp = c10912l.yandex;
                    c12984l.f25448volatile = c10912l.loadAd;
                    c12984l.firebase = c7417l3;
                    if (this.ads.billing() != -2147483647) {
                        c12984l.admob = this.ads.billing();
                    }
                    this.subs.mopub(new C5978l(c12984l));
                    this.metrica = interfaceC10430l.getPosition();
                    j3 = 0;
                    r4 = z3;
                } else if (i4 == 1) {
                    i5 = 13;
                }
                i6 = i5;
                j2 = -9223372036854775807L;
                if (c13143l2.crashlytics >= i6 + 4) {
                    c13143l2.m3562for(i6);
                    iRemoteconfig2 = c13143l2.remoteconfig();
                    if (iRemoteconfig2 != 1483304551) {
                        if (c13143l2.crashlytics >= 40) {
                            c13143l2.m3562for(36);
                            if (c13143l2.remoteconfig() == 1447187017) {
                                iRemoteconfig2 = 1447187017;
                            } else {
                                iRemoteconfig2 = 0;
                            }
                        } else {
                            iRemoteconfig2 = 0;
                        }
                    }
                } else if (c13143l2.crashlytics >= 40) {
                    c13143l2.m3562for(36);
                    if (c13143l2.remoteconfig() == 1447187017) {
                        iRemoteconfig2 = 1447187017;
                    } else {
                        iRemoteconfig2 = 0;
                    }
                } else {
                    iRemoteconfig2 = 0;
                }
                c10912l = this.amazon;
                if (iRemoteconfig2 == 1231971951) {
                    c9892l2 = c9892l5;
                    i7 = 0;
                    iRemoteconfig3 = c13143l2.remoteconfig();
                    if ((iRemoteconfig3 & 1) != 0) {
                        iInmobi = c13143l2.inmobi();
                    } else {
                        iInmobi = -1;
                    }
                    if ((iRemoteconfig3 & 2) != 0) {
                        jMin = c13143l2.applovin();
                    } else {
                        jMin = -1;
                    }
                    if ((iRemoteconfig3 & 4) == 4) {
                        jArr2 = new long[100];
                        i15 = 0;
                        while (i15 < i14) {
                            jArr2[i15] = c13143l2.signatures();
                            i15++;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iRemoteconfig3 & 8) != 0) {
                        c13143l2.m3568throw(4);
                    }
                    if (c13143l2.yandex() >= 24) {
                        c13143l2.m3568throw(11);
                        fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                        int iM3567synchronized16 = c13143l2.m3567synchronized();
                        int iM3567synchronized17 = c13143l2.m3567synchronized();
                        c10487lYandex = C10487l.yandex(iM3567synchronized16);
                        c10487lYandex2 = C10487l.yandex(iM3567synchronized17);
                        if (fIntBitsToFloat > 0.0f) {
                            c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                        } else {
                            c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                        }
                        c13143l2.m3568throw(2);
                        int iAppmetrica7 = c13143l2.appmetrica();
                        i9 = (16773120 & iAppmetrica7) >> 12;
                        i8 = iAppmetrica7 & 4095;
                    } else {
                        c1897l = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iInmobi;
                    i10 = c9892l2.loadAd;
                    i11 = c9892l2.crashlytics;
                    i12 = c9892l2.purchase;
                    i13 = c9892l2.billing;
                    c1897l2 = c1897l;
                    if (c10912l.yandex != -1) {
                        c10912l.yandex = i9;
                        c10912l.loadAd = i8;
                    } else {
                        c10912l.yandex = i9;
                        c10912l.loadAd = i8;
                    }
                    if (c1897l2 != null) {
                        c7417l = new C7417l(c1897l2);
                    } else {
                        c7417l = null;
                    }
                    this.smaato = c7417l;
                    position2 = interfaceC10430l.getPosition();
                    interfaceC10430l.remoteconfig(c9892l2.loadAd);
                    if (iRemoteconfig2 == 1483304551) {
                        length2 = interfaceC10430l.getLength();
                        if (j5 != -1) {
                            jM3969goto2 = -9223372036854775807L;
                        } else {
                            jM3969goto2 = -9223372036854775807L;
                        }
                        if (jM3969goto2 == -9223372036854775807L) {
                            c12060l = null;
                        } else {
                            if (jMin != -1) {
                                long j113 = length2 - position2;
                                StringBuilder sbSignature11 = AbstractC0653l.Signature(j113, "Data size mismatch between stream (", ") and Xing frame (");
                                sbSignature11.append(jMin);
                                sbSignature11.append("), using smaller value.");
                                AbstractC6427l.firebase("XingSeeker", sbSignature11.toString());
                                jMin = Math.min(jMin, j113);
                            }
                            c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                        }
                    } else {
                        length = interfaceC10430l.getLength();
                        if (j5 != -1) {
                        }
                        if (jM3969goto != -9223372036854775807L) {
                            if (jMin != -1) {
                                j7 = position2 + jMin;
                                j6 = jMin - ((long) i10);
                            } else if (length != -1) {
                                j6 = (length - position2) - ((long) i10);
                                j7 = length;
                            } else {
                                c12060l = null;
                            }
                            RoundingMode roundingMode7 = RoundingMode.HALF_UP;
                            c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode7)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode7)), false, true);
                        } else {
                            c12060l = null;
                        }
                    }
                } else if (iRemoteconfig2 != 1447187017) {
                    length6 = interfaceC10430l.getLength();
                    position4 = interfaceC10430l.getPosition();
                    c13143l2.m3568throw(6);
                    int iRemoteconfig8 = c13143l2.remoteconfig();
                    i7 = 0;
                    j9 = position4 + ((long) c9892l5.loadAd);
                    j10 = j9 + ((long) iRemoteconfig8);
                    iRemoteconfig4 = c13143l2.remoteconfig();
                    if (iRemoteconfig4 <= 0) {
                        jM3969goto3 = AbstractC15323l.m3969goto(c9892l5.crashlytics, (((long) iRemoteconfig4) * ((long) c9892l5.billing)) - 1);
                        iM3567synchronized = c13143l2.m3567synchronized();
                        iM3567synchronized2 = c13143l2.m3567synchronized();
                        iM3567synchronized3 = c13143l2.m3567synchronized();
                        c13143l2.m3568throw(2);
                        jArr5 = new long[iM3567synchronized];
                        jArr6 = new long[iM3567synchronized];
                        c9892l3 = c9892l5;
                        j11 = position4 + ((long) c9892l5.loadAd);
                        i19 = 0;
                        while (true) {
                            if (i19 < iM3567synchronized) {
                                long[] jArr19 = jArr5;
                                long[] jArr110 = jArr6;
                                C9892l c9892l9 = c9892l3;
                                if (length6 != -1) {
                                    j12 = j10;
                                } else {
                                    j12 = j10;
                                }
                                if (j12 != j11) {
                                    StringBuilder sbSignature12 = AbstractC0653l.Signature(j12, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                    sbSignature12.append(j11);
                                    sbSignature12.append("\nSeeking will be inaccurate.");
                                    AbstractC6427l.vip("VbriSeeker", sbSignature12.toString());
                                    jMax = Math.max(j12, j11);
                                } else {
                                    jMax = j12;
                                }
                                c9892l2 = c9892l9;
                                c12060l = new C6595l(jArr19, jArr110, jM3969goto3, j9, jMax, c9892l2.purchase);
                                break;
                            }
                            long[] jArr111 = jArr6;
                            c9892l4 = c9892l3;
                            int i217 = i19;
                            long[] jArr112 = jArr5;
                            jArr112[i217] = (((long) i19) * jM3969goto3) / ((long) iM3567synchronized);
                            jArr111[i217] = j11;
                            if (iM3567synchronized3 != 1) {
                                iSignatures = c13143l2.signatures();
                            } else if (iM3567synchronized3 != 2) {
                                iSignatures = c13143l2.m3567synchronized();
                            } else if (iM3567synchronized3 != 3) {
                                iSignatures = c13143l2.appmetrica();
                            } else {
                                if (iM3567synchronized3 != 4) {
                                    c12060l = null;
                                    c9892l2 = c9892l4;
                                    break;
                                }
                                iSignatures = c13143l2.inmobi();
                            }
                            j11 += ((long) iSignatures) * ((long) iM3567synchronized2);
                            i19 = i217 + 1;
                            jArr6 = jArr111;
                            c9892l3 = c9892l4;
                            jArr5 = jArr112;
                        }
                    } else {
                        c12060l = null;
                        c9892l2 = c9892l5;
                    }
                    interfaceC10430l.remoteconfig(c9892l2.loadAd);
                } else if (iRemoteconfig2 != 1483304551) {
                    interfaceC10430l.smaato();
                    c12060l = null;
                    c9892l2 = c9892l5;
                    i7 = 0;
                } else {
                    c9892l2 = c9892l5;
                    i7 = 0;
                    iRemoteconfig3 = c13143l2.remoteconfig();
                    if ((iRemoteconfig3 & 1) != 0) {
                        iInmobi = c13143l2.inmobi();
                    } else {
                        iInmobi = -1;
                    }
                    if ((iRemoteconfig3 & 2) != 0) {
                        jMin = c13143l2.applovin();
                    } else {
                        jMin = -1;
                    }
                    if ((iRemoteconfig3 & 4) == 4) {
                        jArr2 = new long[100];
                        i15 = 0;
                        while (i15 < i14) {
                            jArr2[i15] = c13143l2.signatures();
                            i15++;
                        }
                        jArr = jArr2;
                    } else {
                        jArr = null;
                    }
                    if ((iRemoteconfig3 & 8) != 0) {
                        c13143l2.m3568throw(4);
                    }
                    if (c13143l2.yandex() >= 24) {
                        c13143l2.m3568throw(11);
                        fIntBitsToFloat = Float.intBitsToFloat(c13143l2.remoteconfig());
                        int iM3567synchronized18 = c13143l2.m3567synchronized();
                        int iM3567synchronized19 = c13143l2.m3567synchronized();
                        c10487lYandex = C10487l.yandex(iM3567synchronized18);
                        c10487lYandex2 = C10487l.yandex(iM3567synchronized19);
                        if (fIntBitsToFloat > 0.0f) {
                            c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                        } else {
                            c1897l = new C1897l(fIntBitsToFloat, c10487lYandex, c10487lYandex2);
                        }
                        c13143l2.m3568throw(2);
                        int iAppmetrica8 = c13143l2.appmetrica();
                        i9 = (16773120 & iAppmetrica8) >> 12;
                        i8 = iAppmetrica8 & 4095;
                    } else {
                        c1897l = null;
                        i8 = -1;
                        i9 = -1;
                    }
                    j5 = iInmobi;
                    i10 = c9892l2.loadAd;
                    i11 = c9892l2.crashlytics;
                    i12 = c9892l2.purchase;
                    i13 = c9892l2.billing;
                    c1897l2 = c1897l;
                    if (c10912l.yandex != -1) {
                        c10912l.yandex = i9;
                        c10912l.loadAd = i8;
                    } else {
                        c10912l.yandex = i9;
                        c10912l.loadAd = i8;
                    }
                    if (c1897l2 != null) {
                        c7417l = new C7417l(c1897l2);
                    } else {
                        c7417l = null;
                    }
                    this.smaato = c7417l;
                    position2 = interfaceC10430l.getPosition();
                    interfaceC10430l.remoteconfig(c9892l2.loadAd);
                    if (iRemoteconfig2 == 1483304551) {
                        length2 = interfaceC10430l.getLength();
                        if (j5 != -1) {
                            jM3969goto2 = -9223372036854775807L;
                        } else {
                            jM3969goto2 = -9223372036854775807L;
                        }
                        if (jM3969goto2 == -9223372036854775807L) {
                            c12060l = null;
                        } else {
                            if (jMin != -1) {
                                long j114 = length2 - position2;
                                StringBuilder sbSignature13 = AbstractC0653l.Signature(j114, "Data size mismatch between stream (", ") and Xing frame (");
                                sbSignature13.append(jMin);
                                sbSignature13.append("), using smaller value.");
                                AbstractC6427l.firebase("XingSeeker", sbSignature13.toString());
                                jMin = Math.min(jMin, j114);
                            }
                            c12060l = new C0870l(position2, i10, jM3969goto2, i12, jMin, jArr);
                        }
                    } else {
                        length = interfaceC10430l.getLength();
                        if (j5 != -1) {
                        }
                        if (jM3969goto != -9223372036854775807L) {
                            if (jMin != -1) {
                                j7 = position2 + jMin;
                                j6 = jMin - ((long) i10);
                            } else if (length != -1) {
                                j6 = (length - position2) - ((long) i10);
                                j7 = length;
                            } else {
                                c12060l = null;
                            }
                            RoundingMode roundingMode8 = RoundingMode.HALF_UP;
                            c12060l = new C12060l(j7, position2 + ((long) i10), AbstractC9966l.loadAd(AbstractC15323l.m3970import(j6, 8000000L, jM3969goto, roundingMode8)), AbstractC9966l.loadAd(AbstractC3483l.amazon(j6, j5, roundingMode8)), false, true);
                        } else {
                            c12060l = null;
                        }
                    }
                }
                c7417l2 = this.firebase;
                position3 = interfaceC10430l.getPosition();
                if (c7417l2 == null) {
                    c4445l = null;
                } else {
                    interfaceC1525lArr = c7417l2.yandex;
                    length3 = interfaceC1525lArr.length;
                    i16 = i7;
                    while (true) {
                        if (i16 < length3) {
                            interfaceC1525l = null;
                            break;
                        }
                        interfaceC1525l4 = interfaceC1525lArr[i16];
                        if (C18132l.class.isAssignableFrom(interfaceC1525l4.getClass())) {
                            interfaceC1525l = (InterfaceC1525l) C18132l.class.cast(interfaceC1525l4);
                            if (!EnumC18623l.f36395l.apply(interfaceC1525l)) {
                                interfaceC1525l = null;
                            }
                        } else {
                            interfaceC1525l = null;
                        }
                        if (interfaceC1525l != null) {
                            break;
                            break;
                        }
                        i16++;
                    }
                    c18132l = (C18132l) interfaceC1525l;
                    if (c18132l == null) {
                        c4445l = null;
                    } else {
                        iArr = c18132l.purchase;
                        interfaceC1525lArr2 = c7417l2.yandex;
                        length4 = interfaceC1525lArr2.length;
                        i17 = 0;
                        while (true) {
                            if (i17 < length4) {
                                interfaceC1525l2 = null;
                                break;
                            }
                            interfaceC1525l3 = interfaceC1525lArr2[i17];
                            if (C11403l.class.isAssignableFrom(interfaceC1525l3.getClass())) {
                                interfaceC1525l2 = (InterfaceC1525l) C11403l.class.cast(interfaceC1525l3);
                                if (!((C11403l) interfaceC1525l2).yandex.equals("TLEN")) {
                                    interfaceC1525l2 = null;
                                }
                            } else {
                                interfaceC1525l2 = null;
                            }
                            if (interfaceC1525l2 != null) {
                                break;
                                break;
                            }
                            i17++;
                        }
                        c11403l = (C11403l) interfaceC1525l2;
                        if (c11403l == null) {
                            jM3962continue = -9223372036854775807L;
                            c = 0;
                        } else {
                            c = 0;
                            jM3962continue = AbstractC15323l.m3962continue(Long.parseLong((String) c11403l.crashlytics.get(0)));
                        }
                        length5 = iArr.length;
                        int i218 = length5 + 1;
                        jArr3 = new long[i218];
                        jArr4 = new long[i218];
                        jArr3[c] = position3;
                        jArr4[c] = 0;
                        j8 = 0;
                        i18 = 1;
                        while (i18 <= length5) {
                            int i219 = i18 - 1;
                            int i2110 = length5;
                            long j115 = position3 + ((long) (c18132l.crashlytics + iArr[i219]));
                            j8 += (long) (c18132l.amazon + c18132l.billing[i219]);
                            jArr3[i18] = j115;
                            jArr4[i18] = j8;
                            i18++;
                            length5 = i2110;
                            position3 = j115;
                        }
                        c4445l = new C4445l(jM3962continue, jArr3, jArr4);
                    }
                }
                if (this.subscription) {
                    c9579l = new C9579l(-9223372036854775807L);
                    c13143l = c13143l;
                    c10912l = c10912l;
                    c9892l = c9892l2;
                    z3 = true;
                    i21 = 0;
                } else {
                    j2 = -9223372036854775807L;
                    if (c4445l != null) {
                        c12060l = c4445l;
                    } else if (c12060l == null) {
                        c12060l = null;
                    }
                    if (c12060l == null) {
                        int i2111 = i7;
                        interfaceC10430l.yandex(i2111, 4, c13143l.yandex);
                        c13143l.m3562for(i2111);
                        c9892l2.yandex(c13143l.remoteconfig());
                        c9892l = c9892l2;
                        z2 = true;
                        i21 = 0;
                        c12060l = new C12060l(interfaceC10430l.getLength(), interfaceC10430l.getPosition(), c9892l2.purchase, c9892l2.loadAd, false, true);
                    } else {
                        c9892l = c9892l2;
                        z2 = true;
                        i21 = 0;
                    }
                    c12060l.loadAd();
                    c12060l.loadAd();
                    this.admob.amazon(c12060l.mopub());
                    c9579l = c12060l;
                    z3 = z2;
                }
                this.ads = c9579l;
                this.mopub.tapsense(c9579l);
                c7417lLoadAd = this.firebase;
                c7417l3 = this.smaato;
                if (c7417lLoadAd != null) {
                    if (c7417l3 != null) {
                        c7417lLoadAd = c7417lLoadAd.loadAd(c7417l3);
                    }
                    c7417l3 = c7417lLoadAd;
                }
                c12984l = new C12984l();
                c12984l.remoteconfig = AbstractC3825l.vip("audio/mpeg");
                c12984l.vip = AbstractC3825l.vip((String) c9892l.mopub);
                c12984l.metrica = 4096;
                c12984l.f25447throws = c9892l.amazon;
                c12984l.f25442package = c9892l.crashlytics;
                c12984l.f25444strictfp = c10912l.yandex;
                c12984l.f25448volatile = c10912l.loadAd;
                c12984l.firebase = c7417l3;
                if (this.ads.billing() != -2147483647) {
                    c12984l.admob = this.ads.billing();
                }
                this.subs.mopub(new C5978l(c12984l));
                this.metrica = interfaceC10430l.getPosition();
                j3 = 0;
                r4 = z3;
            } else {
                c9892l = c9892l5;
                c13143l = c13143l;
                z = true;
                th = null;
                j = 1000000;
                j2 = -9223372036854775807L;
                j3 = 0;
                if (this.metrica != 0) {
                    position = interfaceC10430l.getPosition();
                    j4 = this.metrica;
                    if (position < j4) {
                        r4 = z;
                        r4 = z;
                        interfaceC10430l.remoteconfig((int) (j4 - position));
                        r4 = z;
                    }
                }
            }
            r4 = z;
            r4 = z;
            r4 = z;
            if (this.adcel == 0) {
                interfaceC10430l.smaato();
                if (admob(interfaceC10430l)) {
                    i = -1;
                    i21 = -1;
                } else {
                    c13143l.m3562for(i21);
                    iRemoteconfig = c13143l.remoteconfig();
                    if (((-128000) & iRemoteconfig) == (((long) this.isPro) & (-128000))) {
                    }
                    interfaceC10430l.remoteconfig(r4);
                    this.isPro = i21;
                    i = -1;
                }
            } else {
                iBilling = this.subs.billing(interfaceC10430l, this.adcel, r4);
                if (iBilling == -1) {
                    i = -1;
                    i21 = -1;
                } else {
                    i2 = this.adcel - iBilling;
                    this.adcel = i2;
                    if (i2 <= 0) {
                        this.subs.yandex(this.remoteconfig + ((this.vip * j) / ((long) c9892l.crashlytics)), 1, c9892l.loadAd, 0, null);
                        this.vip += (long) c9892l.billing;
                        this.adcel = i21;
                    }
                    i = -1;
                }
            }
        }
        if (i21 == i) {
            InterfaceC1584l interfaceC1584l2 = this.ads;
            if (interfaceC1584l2 instanceof AbstractC8280l) {
                if (interfaceC1584l2.mopub() != ((this.vip * j) / ((long) c9892l.crashlytics)) + this.remoteconfig) {
                    ((AbstractC8280l) this.ads).getClass();
                    throw th;
                }
            }
        }
        return i21;
    }

    public final void mopub() {
        InterfaceC1584l interfaceC1584l = this.ads;
        if ((interfaceC1584l instanceof C12060l) && ((C12060l) interfaceC1584l).loadAd()) {
            long j = this.startapp;
            if (j == -1 || j == this.ads.yandex()) {
                return;
            }
            C12060l c12060l = (C12060l) this.ads;
            this.ads = new C12060l(this.startapp, c12060l.subs, c12060l.isPro, c12060l.firebase, c12060l.smaato, false);
            InterfaceC2053l interfaceC2053l = this.mopub;
            interfaceC2053l.getClass();
            interfaceC2053l.tapsense(this.ads);
            InterfaceC8979l interfaceC8979l = this.admob;
            interfaceC8979l.getClass();
            interfaceC8979l.amazon(this.ads.mopub());
        }
    }

    @Override // defpackage.InterfaceC14833l
    public final List purchase() {
        C9258l c9258l = AbstractC1186l.f3181l;
        return C13708l.f26763l;
    }

    public final boolean subs(InterfaceC10430l interfaceC10430l, boolean z) throws EOFException {
        int iMopub;
        int i;
        int iCrashlytics;
        interfaceC10430l.smaato();
        if (interfaceC10430l.getPosition() == 0) {
            C7417l c7417lPro = this.purchase.pro(interfaceC10430l, null, 131072);
            this.firebase = c7417lPro;
            if (c7417lPro != null) {
                this.amazon.loadAd(c7417lPro);
            }
            iMopub = (int) interfaceC10430l.mopub();
            if (!z) {
                interfaceC10430l.remoteconfig(iMopub);
            }
            i = 0;
        } else {
            iMopub = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (admob(interfaceC10430l)) {
                if (i2 > 0) {
                    break;
                }
                mopub();
                C8339l.vip();
                return false;
            }
            C13143l c13143l = this.loadAd;
            c13143l.m3562for(0);
            int iRemoteconfig = c13143l.remoteconfig();
            if ((i == 0 || ((-128000) & iRemoteconfig) == (((long) i) & (-128000))) && (iCrashlytics = AbstractC6968l.crashlytics(iRemoteconfig)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.crashlytics.yandex(iRemoteconfig);
                    i = iRemoteconfig;
                }
                interfaceC10430l.admob(iCrashlytics - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    mopub();
                    C8339l.vip();
                    return false;
                }
                if (z) {
                    interfaceC10430l.smaato();
                    interfaceC10430l.admob(iMopub + i4);
                } else {
                    interfaceC10430l.remoteconfig(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            interfaceC10430l.remoteconfig(iMopub + i3);
        } else {
            interfaceC10430l.smaato();
        }
        this.isPro = i;
        return true;
    }

    @Override // defpackage.InterfaceC14833l
    public final void release() {
    }

    @Override // defpackage.InterfaceC14833l
    public final InterfaceC14833l yandex() {
        return this;
    }

    public C15843l(int i) {
        this(-9223372036854775807L);
    }
}
