package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؘۧٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6125l extends AbstractC0775l implements InterfaceC17487l {
    public C2231l admob;
    public final EnumC4737l amazon;
    public final C13975l billing;
    public final AbstractC8237l crashlytics;
    public final C16387l isPro;
    public int mopub = -1;
    public final AbstractC0576l purchase;
    public final C17752l subs;

    public C6125l(AbstractC8237l abstractC8237l, EnumC4737l enumC4737l, AbstractC0576l abstractC0576l, InterfaceC18035l interfaceC18035l, C2231l c2231l) {
        this.crashlytics = abstractC8237l;
        this.amazon = enumC4737l;
        this.purchase = abstractC0576l;
        this.billing = abstractC8237l.loadAd;
        this.admob = c2231l;
        C17752l c17752l = abstractC8237l.yandex;
        this.subs = c17752l;
        this.isPro = c17752l.purchase ? null : new C16387l(interfaceC18035l);
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int Signature(InterfaceC18035l interfaceC18035l) {
        return AbstractC3644l.loadAd(interfaceC18035l, this.crashlytics, tapsense(), " at path ".concat(((C17219l) this.purchase.f1975l).m4289private()));
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final InterfaceC10726l adcel(InterfaceC18035l interfaceC18035l) {
        return AbstractC5345l.yandex(interfaceC18035l) ? new C11413l(this.purchase, this.crashlytics) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC14988l
    public final int admob(InterfaceC18035l interfaceC18035l) {
        int iYandex;
        boolean z;
        boolean z2;
        boolean z3;
        char c;
        String strIsVip;
        AbstractC0576l abstractC0576l = this.purchase;
        C17219l c17219l = (C17219l) abstractC0576l.f1975l;
        EnumC4737l enumC4737l = this.amazon;
        int iOrdinal = enumC4737l.ordinal();
        char c2 = ':';
        int i = 0;
        zAppmetrica = false;
        boolean zAppmetrica = false;
        AbstractC8237l abstractC8237l = this.crashlytics;
        boolean z4 = true;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zAppmetrica2 = abstractC0576l.appmetrica();
            while (true) {
                boolean zPurchase = abstractC0576l.purchase();
                C16387l c16387l = this.isPro;
                if (zPurchase) {
                    C17752l c17752l = this.subs;
                    boolean z5 = c17752l.crashlytics;
                    String strStartapp = z5 ? abstractC0576l.startapp() : abstractC0576l.mopub();
                    abstractC0576l.firebase(c2);
                    iYandex = AbstractC3644l.yandex(interfaceC18035l, abstractC8237l, strStartapp);
                    int i3 = i2;
                    if (iYandex != -3) {
                        if (c17752l.mopub) {
                            boolean zFirebase = interfaceC18035l.firebase(iYandex);
                            InterfaceC18035l interfaceC18035lIsPro = interfaceC18035l.isPro(iYandex);
                            if (zFirebase && !interfaceC18035lIsPro.crashlytics() && abstractC0576l.inmobi(z4)) {
                                z = z4;
                            } else {
                                z = z4;
                                if (AbstractC8576l.yandex(interfaceC18035lIsPro.billing(), C2374l.amazon) && ((!interfaceC18035lIsPro.crashlytics() || !abstractC0576l.inmobi(false)) && (strIsVip = abstractC0576l.isVip(z5)) != null)) {
                                    int iYandex2 = AbstractC3644l.yandex(interfaceC18035lIsPro, abstractC8237l, strIsVip);
                                    boolean z6 = (abstractC8237l.yandex.purchase || !interfaceC18035lIsPro.crashlytics()) ? false : z;
                                    if (iYandex2 == -3 && (zFirebase || z6)) {
                                        abstractC0576l.remoteconfig();
                                    }
                                }
                            }
                            zAppmetrica2 = abstractC0576l.appmetrica();
                            z2 = false;
                        }
                        if (c16387l != null) {
                            C0093l c0093l = c16387l.yandex;
                            if (iYandex < 64) {
                                c0093l.f1006l |= 1 << iYandex;
                            } else {
                                int i4 = (iYandex >>> 6) - 1;
                                long[] jArr = (long[]) c0093l.f1007l;
                                jArr[i4] = jArr[i4] | (1 << (iYandex & 63));
                            }
                        }
                    } else {
                        z = z4;
                        zAppmetrica2 = false;
                        z2 = z;
                    }
                    if (z2) {
                        if (!AbstractC3644l.crashlytics(abstractC8237l, interfaceC18035l)) {
                            C2231l c2231l = this.admob;
                            if (c2231l == null || !AbstractC8576l.yandex(c2231l.f4910l, strStartapp)) {
                                int i5 = c17219l.f33424l;
                                int[] iArr = (int[]) c17219l.f33426l;
                                if (iArr[i5] == -2) {
                                    iArr[i5] = i3;
                                    c17219l.f33424l = i5 - 1;
                                }
                                int i6 = c17219l.f33424l;
                                if (i6 != i3) {
                                    c17219l.f33424l = i6 + i3;
                                }
                                abstractC0576l.subscription(AbstractC14814l.smaato('\'', "Encountered an unknown key '", strStartapp), AbstractC12024l.m3314case(0, 6, abstractC0576l.applovin(0, abstractC0576l.f1972l), strStartapp), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                                throw null;
                            }
                            c2231l.f4910l = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bAdvert = abstractC0576l.advert();
                        if (bAdvert == 8 || bAdvert == 6) {
                            while (true) {
                                byte bAdvert2 = abstractC0576l.advert();
                                z3 = z;
                                if (bAdvert2 != z3) {
                                    c = 6;
                                    if (bAdvert2 == 8 || bAdvert2 == 6) {
                                        arrayList.add(Byte.valueOf(bAdvert2));
                                    } else if (bAdvert2 == 9) {
                                        if (((Number) AbstractC16901l.m4214continue(arrayList)).byteValue() != 8) {
                                            AbstractC0576l.tapsense(abstractC0576l, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        AbstractC3984l.isVip(arrayList);
                                    } else if (bAdvert2 == 7) {
                                        if (((Number) AbstractC16901l.m4214continue(arrayList)).byteValue() != 6) {
                                            AbstractC0576l.tapsense(abstractC0576l, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        AbstractC3984l.isVip(arrayList);
                                    } else if (bAdvert2 == 10) {
                                        AbstractC0576l.tapsense(abstractC0576l, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    abstractC0576l.admob();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z5) {
                                    abstractC0576l.metrica();
                                } else {
                                    abstractC0576l.mopub();
                                }
                                z = z3;
                            }
                        } else {
                            abstractC0576l.metrica();
                            z3 = z;
                            c = 6;
                        }
                        zAppmetrica2 = abstractC0576l.appmetrica();
                        z4 = z3;
                        i2 = i3;
                        c2 = ':';
                    } else {
                        i2 = i3;
                        z4 = z;
                        c2 = ':';
                    }
                } else if (!zAppmetrica2) {
                    if (c16387l == null) {
                        i2 = -1;
                        break;
                    }
                    C0093l c0093l2 = c16387l.yandex;
                    C14959l c14959l = (C14959l) c0093l2.f1004l;
                    InterfaceC18035l interfaceC18035l2 = (InterfaceC18035l) c0093l2.f1005l;
                    int iMopub = interfaceC18035l2.mopub();
                    while (true) {
                        long j = c0093l2.f1006l;
                        if (j == -1) {
                            if (iMopub > 64) {
                                long[] jArr2 = (long[]) c0093l2.f1007l;
                                int length = jArr2.length;
                                while (true) {
                                    if (i < length) {
                                        int i7 = i + 1;
                                        int i8 = i7 * 64;
                                        long j2 = jArr2[i];
                                        while (true) {
                                            if (j2 != -1) {
                                                int i9 = i;
                                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                                j2 |= 1 << iNumberOfTrailingZeros;
                                                iYandex = iNumberOfTrailingZeros + i8;
                                                if (((Boolean) c14959l.invoke(interfaceC18035l2, Integer.valueOf(iYandex))).booleanValue()) {
                                                    jArr2[i9] = j2;
                                                } else {
                                                    i = i9;
                                                }
                                            } else {
                                                jArr2[i] = j2;
                                                i = i7;
                                            }
                                        }
                                    }
                                }
                            }
                            i2 = -1;
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        c0093l2.f1006l |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) c14959l.invoke(interfaceC18035l2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            i2 = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                } else {
                    C17752l c17752l2 = abstractC8237l.yandex;
                    AbstractC2238l.billing(abstractC0576l);
                    throw null;
                }
                i2 = iYandex;
                break;
            }
        } else if (iOrdinal != 2) {
            boolean zAppmetrica3 = abstractC0576l.appmetrica();
            if (abstractC0576l.purchase()) {
                int i10 = this.mopub;
                if (i10 != -1 && !zAppmetrica3) {
                    AbstractC0576l.tapsense(abstractC0576l, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i10 + 1;
                this.mopub = i2;
            } else if (zAppmetrica3) {
                C17752l c17752l3 = abstractC8237l.yandex;
                AbstractC2238l.purchase(abstractC0576l, "array");
                throw null;
            }
        } else {
            int i11 = this.mopub;
            byte b = i11 % 2 != 0;
            if (b != true) {
                abstractC0576l.firebase(':');
            } else if (i11 != -1) {
                zAppmetrica = abstractC0576l.appmetrica();
            }
            if (abstractC0576l.purchase()) {
                if (b != false) {
                    int i12 = this.mopub;
                    int i13 = abstractC0576l.f1972l;
                    if (i12 == -1) {
                        if (zAppmetrica) {
                            AbstractC0576l.tapsense(abstractC0576l, "Unexpected leading comma", i13, null, 4);
                            throw null;
                        }
                    } else if (!zAppmetrica) {
                        AbstractC0576l.tapsense(abstractC0576l, "Expected comma after the key-value pair", i13, null, 4);
                        throw null;
                    }
                }
                i2 = this.mopub + 1;
                this.mopub = i2;
            } else if (zAppmetrica) {
                C17752l c17752l4 = abstractC8237l.yandex;
                AbstractC2238l.billing(abstractC0576l);
                throw null;
            }
        }
        if (enumC4737l != EnumC4737l.MAP) {
            ((int[]) c17219l.f33426l)[c17219l.f33424l] = i2;
        }
        return i2;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC14988l
    public final Object ads(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        C17219l c17219l = (C17219l) this.purchase.f1975l;
        boolean z = this.amazon == EnumC4737l.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c17219l.f33426l;
            int i2 = c17219l.f33424l;
            if (iArr[i2] == -2) {
                ((Object[]) c17219l.f33427l)[i2] = C6168l.f12988l;
            }
        }
        Object objMopub = mopub(interfaceC16588l);
        if (z) {
            int[] iArr2 = (int[]) c17219l.f33426l;
            int i3 = c17219l.f33424l;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c17219l.f33424l = i4;
                if (i4 == ((Object[]) c17219l.f33427l).length) {
                    c17219l.m4288interface();
                }
            }
            Object[] objArr = (Object[]) c17219l.f33427l;
            int i5 = c17219l.f33424l;
            objArr[i5] = ((C17752l) c17219l.f33423l).smaato ? objMopub : C15718l.f30865l;
            ((int[]) c17219l.f33426l)[i5] = -2;
        }
        return objMopub;
    }

    @Override // defpackage.InterfaceC17487l
    public final AbstractC8237l advert() {
        return this.crashlytics;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final short applovin() {
        AbstractC0576l abstractC0576l = this.purchase;
        long jSmaato = abstractC0576l.smaato();
        short s = (short) jSmaato;
        if (jSmaato == s) {
            return s;
        }
        AbstractC0576l.tapsense(abstractC0576l, "Failed to parse short for input '" + jSmaato + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final float appmetrica() {
        AbstractC0576l abstractC0576l = this.purchase;
        String strMetrica = abstractC0576l.metrica();
        try {
            float f = Float.parseFloat(strMetrica);
            if (this.crashlytics.yandex.subs || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            AbstractC0576l.tapsense(abstractC0576l, AbstractC2238l.subs(Float.valueOf(f), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0576l.tapsense(abstractC0576l, AbstractC14814l.smaato('\'', "Failed to parse type 'float' for input '", strMetrica), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final char billing() {
        AbstractC0576l abstractC0576l = this.purchase;
        String strMetrica = abstractC0576l.metrica();
        if (strMetrica.length() == 1) {
            return strMetrica.charAt(0);
        }
        AbstractC0576l.tapsense(abstractC0576l, AbstractC14814l.smaato('\'', "Expected single char, but got '", strMetrica), 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final InterfaceC14988l crashlytics(InterfaceC18035l interfaceC18035l) {
        AbstractC8237l abstractC8237l = this.crashlytics;
        EnumC4737l enumC4737lAdmob = AbstractC17541l.admob(abstractC8237l, interfaceC18035l);
        AbstractC0576l abstractC0576l = this.purchase;
        C17219l c17219l = (C17219l) abstractC0576l.f1975l;
        int i = c17219l.f33424l + 1;
        c17219l.f33424l = i;
        if (i == ((Object[]) c17219l.f33427l).length) {
            c17219l.m4288interface();
        }
        ((Object[]) c17219l.f33427l)[i] = interfaceC18035l;
        abstractC0576l.firebase(enumC4737lAdmob.f9763l);
        if (abstractC0576l.advert() == 4) {
            AbstractC0576l.tapsense(abstractC0576l, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = enumC4737lAdmob.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C6125l(this.crashlytics, enumC4737lAdmob, abstractC0576l, interfaceC18035l, this.admob);
        }
        return (this.amazon == enumC4737lAdmob && abstractC8237l.yandex.purchase) ? this : new C6125l(this.crashlytics, enumC4737lAdmob, abstractC0576l, interfaceC18035l, this.admob);
    }

    @Override // defpackage.InterfaceC17487l
    public final AbstractC9914l firebase() {
        return new appmetrica(this.crashlytics.yandex, this.purchase).premium();
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final long license() {
        return this.purchase.smaato();
    }

    @Override // defpackage.InterfaceC14988l
    public final C13975l loadAd() {
        return this.billing;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0137, please report this as an issue */
    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final Object mopub(InterfaceC16588l interfaceC16588l) {
        AbstractC8237l abstractC8237l = this.crashlytics;
        AbstractC0576l abstractC0576l = this.purchase;
        C17219l c17219l = (C17219l) abstractC0576l.f1975l;
        try {
            if (!(interfaceC16588l instanceof AbstractC13151l)) {
                return interfaceC16588l.loadAd(this);
            }
            C17752l c17752l = abstractC8237l.yandex;
            String strLoadAd = AbstractC9592l.loadAd(abstractC8237l, ((AbstractC13151l) interfaceC16588l).purchase());
            String strAd = abstractC0576l.ad(strLoadAd, this.subs.crashlytics);
            if (strAd != null) {
                try {
                    InterfaceC16588l interfaceC16588lCrashlytics = AbstractC1762l.crashlytics((AbstractC13151l) interfaceC16588l, this, strAd);
                    C2231l c2231l = new C2231l();
                    c2231l.f4910l = strLoadAd;
                    this.admob = c2231l;
                    return interfaceC16588lCrashlytics.loadAd(this);
                } catch (C14747l e) {
                    String strM3325goto = AbstractC12024l.m3325goto(AbstractC12024l.m3351while(e.getMessage(), '\n'), ".");
                    String message = e.getMessage();
                    String strSubstring = "";
                    int iM3321extends = AbstractC12024l.m3321extends(message, '\n', 0, 6);
                    if (iM3321extends != -1) {
                        strSubstring = message.substring(iM3321extends + 1, message.length());
                    }
                    AbstractC0576l.tapsense(abstractC0576l, strM3325goto, 0, strSubstring, 2);
                    throw null;
                }
            }
            C17752l c17752l2 = abstractC8237l.yandex;
            String strLoadAd2 = AbstractC9592l.loadAd(abstractC8237l, ((AbstractC13151l) interfaceC16588l).purchase());
            AbstractC9914l abstractC9914lFirebase = firebase();
            String strYandex = ((AbstractC13151l) interfaceC16588l).purchase().yandex();
            if (abstractC9914lFirebase instanceof C18010l) {
                C18010l c18010l = (C18010l) abstractC9914lFirebase;
                AbstractC9914l abstractC9914l = (AbstractC9914l) c18010l.get(strLoadAd2);
                try {
                    return AbstractC17551l.firebase(abstractC8237l, strLoadAd2, c18010l, AbstractC1762l.crashlytics((AbstractC13151l) interfaceC16588l, this, abstractC9914l != null ? AbstractC8358l.purchase(AbstractC8358l.admob(abstractC9914l)) : null));
                } catch (C14747l e2) {
                    throw new C5114l(AbstractC2238l.crashlytics(-1, e2.getMessage(), null, null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(c18010l.toString(), -1).toString() : null));
                }
            }
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(C18010l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lFirebase.getClass()).license());
            sb.append(" as the serialized body of ");
            sb.append(strYandex);
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), c17219l.m4289private(), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lFirebase.toString(), -1).toString() : null));
            if (AbstractC12024l.appmetrica(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new C9088l(e.getMessage() + " at path: " + c17219l.m4289private(), e, e.f18671l, e.f18670l);
        } catch (C9088l e3) {
            if (AbstractC12024l.appmetrica(e3.getMessage(), "at path", false)) {
                throw e3;
            }
            throw new C9088l(e3.getMessage() + " at path: " + c17219l.m4289private(), e3, e3.f18671l, e3.f18670l);
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean pro() {
        C16387l c16387l = this.isPro;
        return ((c16387l != null ? c16387l.loadAd : false) || this.purchase.inmobi(true)) ? false : true;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final boolean purchase() {
        boolean z;
        boolean z2;
        AbstractC0576l abstractC0576l = this.purchase;
        int iPremium = abstractC0576l.premium();
        if (iPremium == abstractC0576l.license().length()) {
            AbstractC0576l.tapsense(abstractC0576l, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC0576l.license().charAt(iPremium) == '\"') {
            iPremium++;
            z = true;
        } else {
            z = false;
        }
        int iSignatures = abstractC0576l.signatures(iPremium);
        if (iSignatures >= abstractC0576l.license().length() || iSignatures == -1) {
            AbstractC0576l.tapsense(abstractC0576l, "EOF", 0, null, 6);
            throw null;
        }
        int i = iSignatures + 1;
        int iCharAt = abstractC0576l.license().charAt(iSignatures) | ' ';
        if (iCharAt == 102) {
            abstractC0576l.billing(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                AbstractC0576l.tapsense(abstractC0576l, "Expected valid boolean literal prefix, but had '" + abstractC0576l.metrica() + '\'', 0, null, 6);
                throw null;
            }
            abstractC0576l.billing(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (abstractC0576l.f1972l == abstractC0576l.license().length()) {
            AbstractC0576l.tapsense(abstractC0576l, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC0576l.license().charAt(abstractC0576l.f1972l) == '\"') {
            abstractC0576l.f1972l++;
            return z2;
        }
        AbstractC0576l.tapsense(abstractC0576l, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final byte signatures() {
        AbstractC0576l abstractC0576l = this.purchase;
        long jSmaato = abstractC0576l.smaato();
        byte b = (byte) jSmaato;
        if (jSmaato == b) {
            return b;
        }
        AbstractC0576l.tapsense(abstractC0576l, "Failed to parse byte for input '" + jSmaato + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final String tapsense() {
        boolean z = this.subs.crashlytics;
        AbstractC0576l abstractC0576l = this.purchase;
        return z ? abstractC0576l.startapp() : abstractC0576l.remoteconfig();
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    /* JADX INFO: renamed from: throws */
    public final double mo677throws() {
        AbstractC0576l abstractC0576l = this.purchase;
        String strMetrica = abstractC0576l.metrica();
        try {
            double d = Double.parseDouble(strMetrica);
            if (this.crashlytics.yandex.subs || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            AbstractC0576l.tapsense(abstractC0576l, AbstractC2238l.subs(Double.valueOf(d), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC0576l.tapsense(abstractC0576l, AbstractC14814l.smaato('\'', "Failed to parse type 'double' for input '", strMetrica), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final int vip() {
        AbstractC0576l abstractC0576l = this.purchase;
        long jSmaato = abstractC0576l.smaato();
        int i = (int) jSmaato;
        if (jSmaato == i) {
            return i;
        }
        AbstractC0576l.tapsense(abstractC0576l, "Failed to parse int for input '" + jSmaato + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC14988l
    public final void yandex(InterfaceC18035l interfaceC18035l) {
        int iMopub = interfaceC18035l.mopub();
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (iMopub == 0 && AbstractC3644l.crashlytics(abstractC8237l, interfaceC18035l)) {
            while (admob(interfaceC18035l) != -1) {
            }
        }
        AbstractC0576l abstractC0576l = this.purchase;
        if (abstractC0576l.appmetrica()) {
            C17752l c17752l = abstractC8237l.yandex;
            AbstractC2238l.purchase(abstractC0576l, "");
            throw null;
        }
        abstractC0576l.firebase(this.amazon.f9762l);
        C17219l c17219l = (C17219l) abstractC0576l.f1975l;
        int i = c17219l.f33424l;
        int[] iArr = (int[]) c17219l.f33426l;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c17219l.f33424l = i - 1;
        }
        int i2 = c17219l.f33424l;
        if (i2 != -1) {
            c17219l.f33424l = i2 - 1;
        }
    }

    @Override // defpackage.AbstractC0775l, defpackage.InterfaceC10726l
    public final void startapp() {
    }
}
