package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: lْؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13104l {
    public final /* synthetic */ C13370l admob;
    public Boolean amazon;
    public Long billing;
    public Boolean crashlytics;
    public final int loadAd;
    public final /* synthetic */ int mopub;
    public Long purchase;
    public final AbstractC0288l subs;
    public final String yandex;

    public C13104l(C13370l c13370l, String str, int i, AbstractC0288l abstractC0288l, int i2) {
        this.mopub = i2;
        this.admob = c13370l;
        this.yandex = str;
        this.loadAd = i;
        this.subs = abstractC0288l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean amazon(String str, C17590l c17590l, C8118l c8118l) {
        List listAdvert;
        AbstractC1051l.subs(c17590l);
        if (str != null && c17590l.tapsense() && c17590l.premium() != 1 && (c17590l.premium() != 7 ? c17590l.Signature() : c17590l.isVip() != 0)) {
            int iPremium = c17590l.premium();
            boolean zAd = c17590l.ad();
            String strLicense = (zAd || iPremium == 2 || iPremium == 7) ? c17590l.license() : c17590l.license().toUpperCase(Locale.ENGLISH);
            if (c17590l.isVip() == 0) {
                listAdvert = null;
            } else {
                listAdvert = c17590l.advert();
                if (!zAd) {
                    ArrayList arrayList = new ArrayList(listAdvert.size());
                    Iterator it = listAdvert.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listAdvert = DesugarCollections.unmodifiableList(arrayList);
                }
            }
            String str2 = iPremium == 2 ? strLicense : null;
            if (iPremium != 7 ? strLicense != null : listAdvert != null && !listAdvert.isEmpty()) {
                if (!zAd && iPremium != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iPremium - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zAd ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (c8118l != null) {
                                    c8118l.f16910l.loadAd(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strLicense));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strLicense));
                    case 4:
                        return Boolean.valueOf(str.contains(strLicense));
                    case 5:
                        return Boolean.valueOf(str.equals(strLicense));
                    case 6:
                        if (listAdvert != null) {
                            return Boolean.valueOf(listAdvert.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean crashlytics(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    public static Boolean purchase(BigDecimal bigDecimal, C9070l c9070l, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        AbstractC1051l.subs(c9070l);
        if (c9070l.tapsense()) {
            if (c9070l.appmetrica() != 1 && (c9070l.appmetrica() != 5 ? c9070l.pro() : c9070l.advert() && c9070l.signatures())) {
                int iAppmetrica = c9070l.appmetrica();
                try {
                    if (c9070l.appmetrica() == 5) {
                        if (C13718l.m3690l(c9070l.isVip()) && C13718l.m3690l(c9070l.premium())) {
                            BigDecimal bigDecimal5 = new BigDecimal(c9070l.isVip());
                            bigDecimal4 = new BigDecimal(c9070l.premium());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iAppmetrica == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iAppmetrica - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (C13718l.m3690l(c9070l.ad())) {
                        bigDecimal2 = new BigDecimal(c9070l.ad());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iAppmetrica == 5) {
                            i = iAppmetrica - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iAppmetrica - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public boolean loadAd(Long l, Long l2, C8252l c8252l, boolean z) {
        boolean z2;
        Boolean boolCrashlytics;
        Boolean boolPurchase;
        Boolean boolPurchase2;
        Boolean boolPurchase3;
        C3264l.yandex();
        C17417l c17417l = (C17417l) this.admob.f833l;
        C5051l c5051l = c17417l.f33945l;
        C14135l c14135l = c17417l.f33942l;
        C8118l c8118l = c17417l.f33950l;
        boolean zM1682l = c5051l.m1682l(this.yandex, AbstractC5981l.f12673l);
        C16493l c16493l = (C16493l) this.subs;
        boolean zAd = c16493l.ad();
        boolean zAdvert = c16493l.advert();
        boolean zSignatures = c16493l.signatures();
        boolean z3 = zAd || zAdvert || zSignatures;
        if (z && !z3) {
            C17417l.admob(c8118l);
            c8118l.f16911l.crashlytics(Integer.valueOf(this.loadAd), c16493l.tapsense() ? Integer.valueOf(c16493l.Signature()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C3153l c3153lPro = c16493l.pro();
        boolean zAdvert2 = c3153lPro.advert();
        if (!c8252l.advert()) {
            z2 = zSignatures;
            if (!c8252l.applovin()) {
                if (!c8252l.pro()) {
                    C17417l.admob(c8118l);
                    c8118l.f16910l.loadAd(c14135l.crashlytics(c8252l.license()), "User property has no value, property");
                } else if (c3153lPro.tapsense()) {
                    String strAd = c8252l.ad();
                    C17590l c17590lSignature = c3153lPro.Signature();
                    C17417l.admob(c8118l);
                    boolCrashlytics = crashlytics(amazon(strAd, c17590lSignature, c8118l), zAdvert2);
                } else if (!c3153lPro.license()) {
                    C17417l.admob(c8118l);
                    c8118l.f16910l.loadAd(c14135l.crashlytics(c8252l.license()), "No string or number filter defined. property");
                } else if (C13718l.m3690l(c8252l.ad())) {
                    String strAd2 = c8252l.ad();
                    C9070l c9070lPro = c3153lPro.pro();
                    if (C13718l.m3690l(strAd2)) {
                        try {
                            boolPurchase = purchase(new BigDecimal(strAd2), c9070lPro, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolPurchase = null;
                        }
                    } else {
                        boolPurchase = null;
                    }
                    boolCrashlytics = crashlytics(boolPurchase, zAdvert2);
                } else {
                    C17417l.admob(c8118l);
                    c8118l.f16910l.crashlytics(c14135l.crashlytics(c8252l.license()), c8252l.ad(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolCrashlytics = null;
            } else if (c3153lPro.license()) {
                double dAppmetrica = c8252l.appmetrica();
                try {
                    boolPurchase2 = purchase(new BigDecimal(dAppmetrica), c3153lPro.pro(), Math.ulp(dAppmetrica));
                } catch (NumberFormatException unused2) {
                    boolPurchase2 = null;
                }
                boolCrashlytics = crashlytics(boolPurchase2, zAdvert2);
            } else {
                C17417l.admob(c8118l);
                c8118l.f16910l.loadAd(c14135l.crashlytics(c8252l.license()), "No number filter for double property. property");
                boolCrashlytics = null;
            }
        } else if (c3153lPro.license()) {
            z2 = zSignatures;
            try {
                boolPurchase3 = purchase(new BigDecimal(c8252l.isVip()), c3153lPro.pro(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolPurchase3 = null;
            }
            boolCrashlytics = crashlytics(boolPurchase3, zAdvert2);
        } else {
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(c14135l.crashlytics(c8252l.license()), "No number filter for long property. property");
            z2 = zSignatures;
            boolCrashlytics = null;
        }
        C17417l.admob(c8118l);
        c8118l.f16911l.loadAd(boolCrashlytics == null ? "null" : boolCrashlytics, "Property filter result");
        if (boolCrashlytics == null) {
            return false;
        }
        this.crashlytics = Boolean.TRUE;
        if (!z2 || boolCrashlytics.booleanValue()) {
            if (!z || c16493l.ad()) {
                this.amazon = boolCrashlytics;
            }
            if (boolCrashlytics.booleanValue() && z3 && c8252l.tapsense()) {
                long jSignature = c8252l.Signature();
                if (l != null) {
                    jSignature = l.longValue();
                }
                if (zM1682l && c16493l.ad() && !c16493l.advert() && l2 != null) {
                    jSignature = l2.longValue();
                }
                if (c16493l.advert()) {
                    this.billing = Long.valueOf(jSignature);
                } else {
                    this.purchase = Long.valueOf(jSignature);
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
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
    public boolean yandex(Long l, Long l2, C1841l c1841l, long j, C6491l c6491l, boolean z) {
        HashSet hashSet;
        Iterator it;
        C11154l c11154l;
        Iterator it2;
        Iterator it3;
        C3153l c3153l;
        boolean z2;
        String strSignatures;
        Object obj;
        Boolean boolPurchase;
        Boolean boolPurchase2;
        String str;
        C9070l c9070lPro;
        long j2;
        Boolean boolPurchase3;
        C0420l c0420l;
        Long lValueOf;
        Double dValueOf;
        C3153l c3153l2;
        Boolean boolPurchase4;
        int i;
        C3264l.yandex();
        C13370l c13370l = this.admob;
        C17417l c17417l = (C17417l) c13370l.f833l;
        C5051l c5051l = c17417l.f33945l;
        C8118l c8118l = c17417l.f33950l;
        C14135l c14135l = c17417l.f33942l;
        C3032l c3032l = AbstractC5981l.f12661l;
        String str2 = this.yandex;
        boolean zM1682l = c5051l.m1682l(str2, c3032l);
        C9540l c9540l = (C9540l) this.subs;
        long j3 = c9540l.inmobi() ? c6491l.purchase : j;
        C17417l.admob(c8118l);
        C14906l c14906l = c8118l.f16911l;
        C14906l c14906l2 = c8118l.f16910l;
        boolean zIsLoggable = Log.isLoggable(c8118l.m2266l(), 2);
        int i2 = this.loadAd;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            C17417l.admob(c8118l);
            c14906l.amazon("Evaluating filter. audience, filter, event", Integer.valueOf(i2), c9540l.tapsense() ? Integer.valueOf(c9540l.Signature()) : null, c14135l.yandex(c9540l.license()));
            C17417l.admob(c8118l);
            C13718l c13718l = c13370l.f13233l.f14452l;
            C6901l.m2082case(c13718l);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (c9540l.tapsense()) {
                i = 0;
                C13718l.m3704l(sb, 0, "filter_id", Integer.valueOf(c9540l.Signature()));
            } else {
                i = 0;
            }
            C13718l.m3704l(sb, i, "event_name", ((C17417l) c13718l.f833l).f33942l.yandex(c9540l.license()));
            String strM3699l = C13718l.m3699l(c9540l.premium(), c9540l.applovin(), c9540l.inmobi());
            if (!strM3699l.isEmpty()) {
                C13718l.m3704l(sb, 0, "filter_type", strM3699l);
            }
            if (c9540l.isVip()) {
                C13718l.m3703l(sb, 1, "event_count_filter", c9540l.signatures());
            }
            if (c9540l.ad() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = c9540l.pro().iterator();
                while (it4.hasNext()) {
                    c13718l.m3716l(sb, 2, (C3153l) it4.next());
                }
            }
            C13718l.m3694l(1, sb);
            sb.append("}\n}\n");
            c14906l.loadAd(sb.toString(), "Filter definition");
        }
        if (!c9540l.tapsense() || c9540l.Signature() > 256) {
            C17417l.admob(c8118l);
            c14906l2.crashlytics(C8118l.m2260l(str2), String.valueOf(c9540l.tapsense() ? Integer.valueOf(c9540l.Signature()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = c9540l.premium() || c9540l.applovin() || c9540l.inmobi();
        if (z && !z3) {
            C17417l.admob(c8118l);
            c14906l.crashlytics(Integer.valueOf(i2), c9540l.tapsense() ? Integer.valueOf(c9540l.Signature()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strAdvert = c1841l.advert();
        if (!c9540l.isVip()) {
            hashSet = new HashSet();
            it = c9540l.pro().iterator();
            while (true) {
                if (it.hasNext()) {
                    c11154l = new C11154l(0);
                    it2 = c1841l.license().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c9540l.pro().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zM1682l = zM1682l;
                                    c8118l = c8118l;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c3153l = (C3153l) it3.next();
                                if (c3153l.ad()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strSignatures = c3153l.signatures();
                                if (strSignatures.isEmpty()) {
                                    obj = c11154l.get(strSignatures);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zM1682l = zM1682l;
                                                c8118l = c8118l;
                                                if (obj == null) {
                                                    C17417l.admob(c8118l);
                                                    c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "Unknown param type. event, param");
                                                    break;
                                                }
                                                C17417l.admob(c8118l);
                                                c14906l.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (c3153l.tapsense()) {
                                                if (c3153l.license()) {
                                                    zM1682l = zM1682l;
                                                    c8118l = c8118l;
                                                    C17417l.admob(c8118l);
                                                    c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (C13718l.m3690l(str)) {
                                                    zM1682l = zM1682l;
                                                    c8118l = c8118l;
                                                    C17417l.admob(c8118l);
                                                    c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                c9070lPro = c3153l.pro();
                                                if (C13718l.m3690l(str)) {
                                                    zM1682l = zM1682l;
                                                    c8118l = c8118l;
                                                    j2 = 0;
                                                    boolPurchase3 = purchase(new BigDecimal(str), c9070lPro, 0.0d);
                                                } else {
                                                    boolPurchase3 = null;
                                                }
                                                if (boolPurchase3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolPurchase3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                c8118l = c8118l;
                                                zM1682l = zM1682l;
                                            } else {
                                                C17590l c17590lSignature = c3153l.Signature();
                                                C17417l.admob(c8118l);
                                                boolPurchase3 = amazon((String) obj, c17590lSignature, c8118l);
                                            }
                                            j2 = 0;
                                            if (boolPurchase3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolPurchase3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            c8118l = c8118l;
                                            zM1682l = zM1682l;
                                        } else if (c3153l.license()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolPurchase2 = purchase(new BigDecimal(dDoubleValue), c3153l.pro(), Math.ulp(dDoubleValue));
                                            if (boolPurchase2 != null) {
                                                if (boolPurchase2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            C17417l.admob(c8118l);
                                            c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "No number filter for double param. event, param");
                                        }
                                    } else if (c3153l.license()) {
                                        boolPurchase = purchase(new BigDecimal(((Long) obj).longValue()), c3153l.pro(), 0.0d);
                                        if (boolPurchase != null) {
                                            if (boolPurchase.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        C17417l.admob(c8118l);
                                        c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "No number filter for long param. event, param");
                                    }
                                } else {
                                    C17417l.admob(c8118l);
                                    c14906l2.loadAd(c14135l.yandex(strAdvert), "Event has empty param name. event");
                                }
                            }
                        } else {
                            c0420l = (C0420l) it2.next();
                            if (!hashSet.contains(c0420l.Signature())) {
                                if (c0420l.ad()) {
                                    String strSignature = c0420l.Signature();
                                    if (c0420l.ad()) {
                                        lValueOf = Long.valueOf(c0420l.advert());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c11154l.put(strSignature, lValueOf);
                                } else if (c0420l.premium()) {
                                    String strSignature2 = c0420l.Signature();
                                    if (c0420l.premium()) {
                                        dValueOf = Double.valueOf(c0420l.applovin());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c11154l.put(strSignature2, dValueOf);
                                } else if (c0420l.license()) {
                                    c11154l.put(c0420l.Signature(), c0420l.pro());
                                } else {
                                    C17417l.admob(c8118l);
                                    c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(c0420l.Signature()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    c3153l2 = (C3153l) it.next();
                    if (c3153l2.signatures().isEmpty()) {
                        C17417l.admob(c8118l);
                        c14906l2.loadAd(c14135l.yandex(strAdvert), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c3153l2.signatures());
                    }
                }
                zM1682l = zM1682l;
                c8118l = c8118l;
                break;
            }
        }
        try {
            boolPurchase4 = purchase(new BigDecimal(j3), c9540l.signatures(), 0.0d);
        } catch (NumberFormatException unused) {
            boolPurchase4 = null;
        }
        if (boolPurchase4 != null) {
            if (boolPurchase4.booleanValue()) {
                hashSet = new HashSet();
                it = c9540l.pro().iterator();
                while (true) {
                    if (it.hasNext()) {
                        c11154l = new C11154l(0);
                        it2 = c1841l.license().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = c9540l.pro().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zM1682l = zM1682l;
                                        c8118l = c8118l;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    c3153l = (C3153l) it3.next();
                                    if (c3153l.ad() || !c3153l.advert()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strSignatures = c3153l.signatures();
                                    if (strSignatures.isEmpty()) {
                                        obj = c11154l.get(strSignatures);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zM1682l = zM1682l;
                                                    c8118l = c8118l;
                                                    if (obj == null) {
                                                        C17417l.admob(c8118l);
                                                        c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    C17417l.admob(c8118l);
                                                    c14906l.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (c3153l.tapsense()) {
                                                    if (c3153l.license()) {
                                                        zM1682l = zM1682l;
                                                        c8118l = c8118l;
                                                        C17417l.admob(c8118l);
                                                        c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (C13718l.m3690l(str)) {
                                                        zM1682l = zM1682l;
                                                        c8118l = c8118l;
                                                        C17417l.admob(c8118l);
                                                        c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    c9070lPro = c3153l.pro();
                                                    if (C13718l.m3690l(str)) {
                                                        boolPurchase3 = null;
                                                    } else {
                                                        try {
                                                            zM1682l = zM1682l;
                                                            c8118l = c8118l;
                                                            j2 = 0;
                                                            try {
                                                                boolPurchase3 = purchase(new BigDecimal(str), c9070lPro, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolPurchase3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zM1682l = zM1682l;
                                                            c8118l = c8118l;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolPurchase3 != null) {
                                                        break;
                                                    }
                                                    if (boolPurchase3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    c8118l = c8118l;
                                                    zM1682l = zM1682l;
                                                } else {
                                                    C17590l c17590lSignature2 = c3153l.Signature();
                                                    C17417l.admob(c8118l);
                                                    boolPurchase3 = amazon((String) obj, c17590lSignature2, c8118l);
                                                }
                                                j2 = 0;
                                                if (boolPurchase3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolPurchase3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                c8118l = c8118l;
                                                zM1682l = zM1682l;
                                            } else if (c3153l.license()) {
                                                C17417l.admob(c8118l);
                                                c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolPurchase2 = purchase(new BigDecimal(dDoubleValue2), c3153l.pro(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolPurchase2 = null;
                                                }
                                                if (boolPurchase2 != null) {
                                                    if (boolPurchase2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (c3153l.license()) {
                                            C17417l.admob(c8118l);
                                            c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(strSignatures), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolPurchase = purchase(new BigDecimal(((Long) obj).longValue()), c3153l.pro(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolPurchase = null;
                                            }
                                            if (boolPurchase != null) {
                                                if (boolPurchase.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        C17417l.admob(c8118l);
                                        c14906l2.loadAd(c14135l.yandex(strAdvert), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                c0420l = (C0420l) it2.next();
                                if (!hashSet.contains(c0420l.Signature())) {
                                    if (c0420l.ad()) {
                                        String strSignature3 = c0420l.Signature();
                                        if (c0420l.ad()) {
                                            lValueOf = Long.valueOf(c0420l.advert());
                                        } else {
                                            lValueOf = null;
                                        }
                                        c11154l.put(strSignature3, lValueOf);
                                    } else if (c0420l.premium()) {
                                        String strSignature4 = c0420l.Signature();
                                        if (c0420l.premium()) {
                                            dValueOf = Double.valueOf(c0420l.applovin());
                                        } else {
                                            dValueOf = null;
                                        }
                                        c11154l.put(strSignature4, dValueOf);
                                    } else if (c0420l.license()) {
                                        c11154l.put(c0420l.Signature(), c0420l.pro());
                                    } else {
                                        C17417l.admob(c8118l);
                                        c14906l2.crashlytics(c14135l.yandex(strAdvert), c14135l.loadAd(c0420l.Signature()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        c3153l2 = (C3153l) it.next();
                        if (c3153l2.signatures().isEmpty()) {
                            C17417l.admob(c8118l);
                            c14906l2.loadAd(c14135l.yandex(strAdvert), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(c3153l2.signatures());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zM1682l = zM1682l;
        c8118l = c8118l;
        break;
        C17417l.admob(c8118l);
        c14906l.loadAd(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.crashlytics = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.amazon = bool2;
        if (!z3 || !c1841l.isVip()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(c1841l.signatures());
        if (c9540l.applovin()) {
            if (zM1682l && c9540l.isVip()) {
                lValueOf2 = l;
            }
            this.billing = lValueOf2;
            return true;
        }
        if (zM1682l && c9540l.isVip()) {
            lValueOf2 = l2;
        }
        this.purchase = lValueOf2;
        return true;
    }
}
