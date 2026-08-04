package defpackage;

/* JADX INFO: renamed from: lؔۖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2828l {
    public static final InterfaceC12750l amazon;
    public static final long yandex = AbstractC7039l.isPro(14);
    public static final long loadAd = AbstractC7039l.isPro(0);
    public static final long crashlytics = C9735l.isPro;

    static {
        long j = C9735l.loadAd;
        amazon = j != 16 ? new C8245l(j) : C15368l.yandex;
    }

    public static final long crashlytics(long j, long j2, float f) {
        C12735l[] c12735lArr = C1794l.loadAd;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    AbstractC10280l.yandex("Cannot perform operation for Unspecified type.");
                }
                if (!C12735l.yandex(C1794l.loadAd(j), C1794l.loadAd(j2))) {
                    AbstractC10280l.yandex("Cannot perform operation for " + C12735l.loadAd(C1794l.loadAd(j)) + " and " + C12735l.loadAd(C1794l.loadAd(j2)));
                }
                return AbstractC7039l.firebase(AbstractC7572l.firebase(C1794l.crashlytics(j), C1794l.crashlytics(j2), f), j3);
            }
        }
        return ((C1794l) loadAd(f, new C1794l(j), new C1794l(j2))).yandex;
    }

    public static final Object loadAd(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015c  */
    /* JADX WARN: Code duplicated, block: B:101:0x015f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0163  */
    /* JADX WARN: Code duplicated, block: B:104:0x0166  */
    /* JADX WARN: Code duplicated, block: B:106:0x0169  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0177  */
    /* JADX WARN: Code duplicated, block: B:113:0x017b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:119:0x0189  */
    /* JADX WARN: Code duplicated, block: B:120:0x018c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0192  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0143  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x0158  */
    public static final C14264l yandex(C14264l c14264l, long j, AbstractC9544l abstractC9544l, float f, long j2, C6886l c6886l, C11617l c11617l, C8689l c8689l, AbstractC17569l abstractC17569l, String str, long j3, C10524l c10524l, C16810l c16810l, C10537l c10537l, long j4, C9867l c9867l, C0387l c0387l, C1354l c1354l, AbstractC3239l abstractC3239l) {
        C10524l c10524l2;
        C0387l c0387l2;
        C1354l c1354l2;
        AbstractC3239l abstractC3239l2;
        InterfaceC12750l c8245l;
        long j5;
        C6886l c6886l2;
        C11617l c11617l2;
        C16810l c16810l2;
        C10537l c10537l2;
        long j6;
        C9867l c9867l2;
        C1354l c1354l3;
        long jAmazon;
        C8689l c8689l2 = c8689l;
        AbstractC17569l abstractC17569l2 = abstractC17569l;
        String str2 = str;
        long j7 = j3;
        C12735l[] c12735lArr = C1794l.loadAd;
        long j8 = j2 & 1095216660480L;
        if ((j8 == 0 || C1794l.yandex(j2, c14264l.loadAd)) && ((abstractC9544l != null || j == 16 || C9735l.crashlytics(j, c14264l.yandex.loadAd())) && ((c11617l == null || c11617l.equals(c14264l.amazon)) && ((c6886l == null || c6886l.equals(c14264l.crashlytics)) && ((abstractC17569l2 == null || abstractC17569l2 == c14264l.billing) && (((j7 & 1095216660480L) == 0 || C1794l.yandex(j7, c14264l.admob)) && ((c9867l == null || c9867l.equals(c14264l.remoteconfig)) && AbstractC8576l.yandex(abstractC9544l, c14264l.yandex.purchase()) && ((abstractC9544l == null || f == c14264l.yandex.yandex()) && ((c8689l2 == null || c8689l2.equals(c14264l.purchase)) && (str2 == null || str2.equals(c14264l.mopub))))))))))) {
            if (c10524l != null) {
                c10524l2 = c10524l;
                if (c10524l2.equals(c14264l.subs)) {
                }
                c8245l = C15368l.yandex;
                if (abstractC9544l != null) {
                    if (abstractC9544l instanceof C8990l) {
                        jAmazon = AbstractC2069l.amazon(f, ((C8990l) abstractC9544l).yandex);
                        if (jAmazon != 16) {
                            c8245l = new C8245l(jAmazon);
                        }
                    } else {
                        if (!(abstractC9544l instanceof AbstractC17404l)) {
                            C18725l.billing();
                            return null;
                        }
                        c8245l = new C16686l((AbstractC17404l) abstractC9544l, f);
                    }
                } else if (j != 16) {
                    c8245l = new C8245l(j);
                }
                InterfaceC12750l interfaceC12750lAmazon = c14264l.yandex.amazon(c8245l);
                if (abstractC17569l2 == null) {
                    abstractC17569l2 = c14264l.billing;
                }
                if (j8 == 0) {
                    j5 = c14264l.loadAd;
                } else {
                    j5 = j2;
                }
                if (c6886l == null) {
                    c6886l2 = c14264l.crashlytics;
                } else {
                    c6886l2 = c6886l;
                }
                if (c11617l == null) {
                    c11617l2 = c14264l.amazon;
                } else {
                    c11617l2 = c11617l;
                }
                if (c8689l2 == null) {
                    c8689l2 = c14264l.purchase;
                }
                if (str2 == null) {
                    str2 = c14264l.mopub;
                }
                if ((j7 & 1095216660480L) == 0) {
                    j7 = c14264l.admob;
                }
                if (c10524l2 == null) {
                    c10524l2 = c14264l.subs;
                }
                if (c16810l == null) {
                    c16810l2 = c14264l.isPro;
                } else {
                    c16810l2 = c16810l;
                }
                if (c10537l == null) {
                    c10537l2 = c14264l.firebase;
                } else {
                    c10537l2 = c10537l;
                }
                if (j4 != 16) {
                    j6 = j4;
                } else {
                    j6 = c14264l.smaato;
                }
                if (c9867l == null) {
                    c9867l2 = c14264l.remoteconfig;
                } else {
                    c9867l2 = c9867l;
                }
                if (c0387l2 == null) {
                    c0387l2 = c14264l.vip;
                }
                long j9 = j6;
                c1354l3 = c14264l.metrica;
                if (c1354l3 == null) {
                    c1354l3 = c1354l2;
                }
                if (abstractC3239l2 == null) {
                    abstractC3239l2 = c14264l.startapp;
                }
                return new C14264l(interfaceC12750lAmazon, j5, c6886l2, c11617l2, c8689l2, abstractC17569l2, str2, j7, c10524l2, c16810l2, c10537l2, j9, c9867l2, c0387l2, c1354l3, abstractC3239l2);
            }
            c10524l2 = c10524l;
            if (c16810l == null || c16810l.equals(c14264l.isPro)) {
                if (c10537l == null || c10537l.equals(c14264l.firebase)) {
                    if (j4 == 16 || C9735l.crashlytics(j4, c14264l.smaato)) {
                        c0387l2 = c0387l;
                        if (c0387l2 == null || c0387l2.equals(c14264l.vip)) {
                            c1354l2 = c1354l;
                            if (c1354l2 == null || c1354l2.equals(c14264l.metrica)) {
                                abstractC3239l2 = abstractC3239l;
                                if (abstractC3239l2 == null || abstractC3239l2.equals(c14264l.startapp)) {
                                    return c14264l;
                                }
                            }
                        }
                        abstractC3239l2 = abstractC3239l;
                    }
                    c1354l2 = c1354l;
                    abstractC3239l2 = abstractC3239l;
                }
            }
            c8245l = C15368l.yandex;
            if (abstractC9544l != null) {
                if (abstractC9544l instanceof C8990l) {
                    jAmazon = AbstractC2069l.amazon(f, ((C8990l) abstractC9544l).yandex);
                    if (jAmazon != 16) {
                        c8245l = new C8245l(jAmazon);
                    }
                } else {
                    if (!(abstractC9544l instanceof AbstractC17404l)) {
                        C18725l.billing();
                        return null;
                    }
                    c8245l = new C16686l((AbstractC17404l) abstractC9544l, f);
                }
            } else if (j != 16) {
                c8245l = new C8245l(j);
            }
            InterfaceC12750l interfaceC12750lAmazon2 = c14264l.yandex.amazon(c8245l);
            if (abstractC17569l2 == null) {
                abstractC17569l2 = c14264l.billing;
            }
            if (j8 == 0) {
                j5 = c14264l.loadAd;
            } else {
                j5 = j2;
            }
            if (c6886l == null) {
                c6886l2 = c14264l.crashlytics;
            } else {
                c6886l2 = c6886l;
            }
            if (c11617l == null) {
                c11617l2 = c14264l.amazon;
            } else {
                c11617l2 = c11617l;
            }
            if (c8689l2 == null) {
                c8689l2 = c14264l.purchase;
            }
            if (str2 == null) {
                str2 = c14264l.mopub;
            }
            if ((j7 & 1095216660480L) == 0) {
                j7 = c14264l.admob;
            }
            if (c10524l2 == null) {
                c10524l2 = c14264l.subs;
            }
            if (c16810l == null) {
                c16810l2 = c14264l.isPro;
            } else {
                c16810l2 = c16810l;
            }
            if (c10537l == null) {
                c10537l2 = c14264l.firebase;
            } else {
                c10537l2 = c10537l;
            }
            if (j4 != 16) {
                j6 = j4;
            } else {
                j6 = c14264l.smaato;
            }
            if (c9867l == null) {
                c9867l2 = c14264l.remoteconfig;
            } else {
                c9867l2 = c9867l;
            }
            if (c0387l2 == null) {
                c0387l2 = c14264l.vip;
            }
            long j10 = j6;
            c1354l3 = c14264l.metrica;
            if (c1354l3 == null) {
                c1354l3 = c1354l2;
            }
            if (abstractC3239l2 == null) {
                abstractC3239l2 = c14264l.startapp;
            }
            return new C14264l(interfaceC12750lAmazon2, j5, c6886l2, c11617l2, c8689l2, abstractC17569l2, str2, j7, c10524l2, c16810l2, c10537l2, j10, c9867l2, c0387l2, c1354l3, abstractC3239l2);
        }
        c10524l2 = c10524l;
        c0387l2 = c0387l;
        c1354l2 = c1354l;
        abstractC3239l2 = abstractC3239l;
        c8245l = C15368l.yandex;
        if (abstractC9544l != null) {
            if (abstractC9544l instanceof C8990l) {
                jAmazon = AbstractC2069l.amazon(f, ((C8990l) abstractC9544l).yandex);
                if (jAmazon != 16) {
                    c8245l = new C8245l(jAmazon);
                }
            } else {
                if (!(abstractC9544l instanceof AbstractC17404l)) {
                    C18725l.billing();
                    return null;
                }
                c8245l = new C16686l((AbstractC17404l) abstractC9544l, f);
            }
        } else if (j != 16) {
            c8245l = new C8245l(j);
        }
        InterfaceC12750l interfaceC12750lAmazon3 = c14264l.yandex.amazon(c8245l);
        if (abstractC17569l2 == null) {
            abstractC17569l2 = c14264l.billing;
        }
        if (j8 == 0) {
            j5 = c14264l.loadAd;
        } else {
            j5 = j2;
        }
        if (c6886l == null) {
            c6886l2 = c14264l.crashlytics;
        } else {
            c6886l2 = c6886l;
        }
        if (c11617l == null) {
            c11617l2 = c14264l.amazon;
        } else {
            c11617l2 = c11617l;
        }
        if (c8689l2 == null) {
            c8689l2 = c14264l.purchase;
        }
        if (str2 == null) {
            str2 = c14264l.mopub;
        }
        if ((j7 & 1095216660480L) == 0) {
            j7 = c14264l.admob;
        }
        if (c10524l2 == null) {
            c10524l2 = c14264l.subs;
        }
        if (c16810l == null) {
            c16810l2 = c14264l.isPro;
        } else {
            c16810l2 = c16810l;
        }
        if (c10537l == null) {
            c10537l2 = c14264l.firebase;
        } else {
            c10537l2 = c10537l;
        }
        if (j4 != 16) {
            j6 = j4;
        } else {
            j6 = c14264l.smaato;
        }
        if (c9867l == null) {
            c9867l2 = c14264l.remoteconfig;
        } else {
            c9867l2 = c9867l;
        }
        if (c0387l2 == null) {
            c0387l2 = c14264l.vip;
        }
        long j11 = j6;
        c1354l3 = c14264l.metrica;
        if (c1354l3 == null) {
            c1354l3 = c1354l2;
        }
        if (abstractC3239l2 == null) {
            abstractC3239l2 = c14264l.startapp;
        }
        return new C14264l(interfaceC12750lAmazon3, j5, c6886l2, c11617l2, c8689l2, abstractC17569l2, str2, j7, c10524l2, c16810l2, c10537l2, j11, c9867l2, c0387l2, c1354l3, abstractC3239l2);
    }
}
