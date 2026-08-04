package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lْٖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16370l implements InterfaceC17487l, InterfaceC10726l, InterfaceC14988l {
    public final String amazon;
    public final AbstractC8237l crashlytics;
    public boolean loadAd;
    public final C17752l purchase;
    public final ArrayList yandex = new ArrayList();

    public AbstractC16370l(AbstractC8237l abstractC8237l, String str) {
        this.crashlytics = abstractC8237l;
        this.amazon = str;
        this.purchase = abstractC8237l.yandex;
    }

    @Override // defpackage.InterfaceC10726l
    public final int Signature(InterfaceC18035l interfaceC18035l) {
        String str = (String) m4166interface();
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        String strYandex = interfaceC18035l.yandex();
        boolean z = abstractC9914lMo267package instanceof AbstractC18121l;
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (z) {
            return AbstractC3644l.loadAd(interfaceC18035l, abstractC8237l, ((AbstractC18121l) abstractC9914lMo267package).amazon(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C2336l c2336l = AbstractC18202l.yandex;
        sb.append(c2336l.loadAd(AbstractC18121l.class).license());
        sb.append(", but had ");
        sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb, " as the serialized body of ", strYandex), m4161default(str), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
    }

    @Override // defpackage.InterfaceC14988l
    public final Object ad(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        this.yandex.add(m4160continue(interfaceC18035l, i));
        Object objMopub = (interfaceC16588l.purchase().crashlytics() || pro()) ? mopub(interfaceC16588l) : null;
        if (!this.loadAd) {
            m4166interface();
        }
        this.loadAd = false;
        return objMopub;
    }

    @Override // defpackage.InterfaceC10726l
    public final InterfaceC10726l adcel(InterfaceC18035l interfaceC18035l) {
        if (AbstractC16901l.m4212class(this.yandex) != null) {
            return m4165for(m4166interface(), interfaceC18035l);
        }
        return new C4263l(this.crashlytics, mo264class(), this.amazon).adcel(interfaceC18035l);
    }

    @Override // defpackage.InterfaceC14988l
    public final Object ads(InterfaceC18035l interfaceC18035l, int i, InterfaceC16588l interfaceC16588l, Object obj) {
        this.yandex.add(m4160continue(interfaceC18035l, i));
        Object objMopub = mopub(interfaceC16588l);
        if (!this.loadAd) {
            m4166interface();
        }
        this.loadAd = false;
        return objMopub;
    }

    @Override // defpackage.InterfaceC17487l
    public final AbstractC8237l advert() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC14988l
    public final InterfaceC10726l amazon(C4495l c4495l, int i) {
        return m4165for(m4160continue(c4495l, i), c4495l.isPro(i));
    }

    @Override // defpackage.InterfaceC10726l
    public final short applovin() {
        return m4162else(m4166interface());
    }

    @Override // defpackage.InterfaceC10726l
    public final float appmetrica() {
        return m4163extends(m4166interface());
    }

    @Override // defpackage.InterfaceC10726l
    public final char billing() {
        return m4167native(m4166interface());
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final String m4158case(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        boolean z = abstractC9914lMo267package instanceof AbstractC18121l;
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of string");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        if (!(abstractC18121l instanceof C16192l)) {
            throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC15560l.Signature("Expected string value for a non-null key '", str, "', got null literal instead"), m4161default(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(m4171synchronized().toString(), -1).toString() : null));
        }
        C16192l c16192l = (C16192l) abstractC18121l;
        if (c16192l.f31681l || abstractC8237l.yandex.crashlytics) {
            return c16192l.f31680l;
        }
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC15560l.Signature("String literal for value of key '", str, "' should be quoted"), m4161default(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(m4171synchronized().toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final long m4159catch(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        if (abstractC9914lMo267package instanceof AbstractC18121l) {
            AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
            try {
                return AbstractC8358l.subs(abstractC18121l);
            } catch (IllegalArgumentException unused) {
                m4164final(abstractC18121l, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C2336l c2336l = AbstractC18202l.yandex;
        sb.append(c2336l.loadAd(AbstractC18121l.class).license());
        sb.append(", but had ");
        sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
        sb.append(" as the serialized body of long");
        throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, this.crashlytics.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: class */
    public abstract AbstractC9914l mo264class();

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final String m4160continue(InterfaceC18035l interfaceC18035l, int i) {
        String strMo268switch = mo268switch(interfaceC18035l, i);
        return strMo268switch;
    }

    @Override // defpackage.InterfaceC10726l
    public InterfaceC14988l crashlytics(InterfaceC18035l interfaceC18035l) {
        AbstractC9914l abstractC9914lM4171synchronized = m4171synchronized();
        AbstractC2021l abstractC2021lBilling = interfaceC18035l.billing();
        boolean zYandex = AbstractC8576l.yandex(abstractC2021lBilling, C9164l.amazon);
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (zYandex || (abstractC2021lBilling instanceof C0196l)) {
            String strYandex = interfaceC18035l.yandex();
            if (abstractC9914lM4171synchronized instanceof C18427l) {
                return new C3696l(abstractC8237l, (C18427l) abstractC9914lM4171synchronized);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(C18427l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lM4171synchronized.getClass()).license());
            throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb, " as the serialized body of ", strYandex), m4169static(), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lM4171synchronized.toString(), -1).toString() : null));
        }
        if (!AbstractC8576l.yandex(abstractC2021lBilling, C2861l.amazon)) {
            String strYandex2 = interfaceC18035l.yandex();
            if (abstractC9914lM4171synchronized instanceof C18010l) {
                return new C0065l(abstractC8237l, (C18010l) abstractC9914lM4171synchronized, this.amazon, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            C2336l c2336l2 = AbstractC18202l.yandex;
            sb2.append(c2336l2.loadAd(C18010l.class).license());
            sb2.append(", but had ");
            sb2.append(c2336l2.loadAd(abstractC9914lM4171synchronized.getClass()).license());
            throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb2, " as the serialized body of ", strYandex2), m4169static(), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lM4171synchronized.toString(), -1).toString() : null));
        }
        InterfaceC18035l interfaceC18035lYandex = AbstractC17541l.yandex(interfaceC18035l.isPro(0), abstractC8237l.loadAd);
        AbstractC2021l abstractC2021lBilling2 = interfaceC18035lYandex.billing();
        if ((abstractC2021lBilling2 instanceof C15358l) || AbstractC8576l.yandex(abstractC2021lBilling2, C2374l.amazon)) {
            String strYandex3 = interfaceC18035l.yandex();
            if (abstractC9914lM4171synchronized instanceof C18010l) {
                return new C16545l(abstractC8237l, (C18010l) abstractC9914lM4171synchronized);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            C2336l c2336l3 = AbstractC18202l.yandex;
            sb3.append(c2336l3.loadAd(C18010l.class).license());
            sb3.append(", but had ");
            sb3.append(c2336l3.loadAd(abstractC9914lM4171synchronized.getClass()).license());
            throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb3, " as the serialized body of ", strYandex3), m4169static(), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lM4171synchronized.toString(), -1).toString() : null));
        }
        if (!abstractC8237l.yandex.amazon) {
            throw AbstractC2238l.yandex(interfaceC18035lYandex);
        }
        String strYandex4 = interfaceC18035l.yandex();
        if (abstractC9914lM4171synchronized instanceof C18427l) {
            return new C3696l(abstractC8237l, (C18427l) abstractC9914lM4171synchronized);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C2336l c2336l4 = AbstractC18202l.yandex;
        sb4.append(c2336l4.loadAd(C18427l.class).license());
        sb4.append(", but had ");
        sb4.append(c2336l4.loadAd(abstractC9914lM4171synchronized.getClass()).license());
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb4, " as the serialized body of ", strYandex4), m4169static(), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lM4171synchronized.toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final String m4161default(String str) {
        return m4169static() + '.' + str;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final short m4162else(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        if (!(abstractC9914lMo267package instanceof AbstractC18121l)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of short");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, this.crashlytics.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        try {
            long jSubs = AbstractC8358l.subs(abstractC18121l);
            Short shValueOf = (-32768 > jSubs || jSubs > 32767) ? null : Short.valueOf((short) jSubs);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m4164final(abstractC18121l, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m4164final(abstractC18121l, "short", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final float m4163extends(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        boolean z = abstractC9914lMo267package instanceof AbstractC18121l;
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of float");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        try {
            C11474l c11474l = AbstractC8358l.yandex;
            float f = Float.parseFloat(abstractC18121l.amazon());
            if (abstractC8237l.yandex.subs || Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC2238l.subs(Float.valueOf(f), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(m4171synchronized().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            m4164final(abstractC18121l, "float", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m4164final(AbstractC18121l abstractC18121l, String str, String str2) {
        throw new C5114l(AbstractC2238l.crashlytics(-1, "Failed to parse literal '" + abstractC18121l + "' as " + (AbstractC16648l.isVip(str, "i", false) ? "an " : "a ").concat(str) + " value", m4161default(str2), null, this.crashlytics.yandex.smaato ? AbstractC2238l.mopub(m4171synchronized().toString(), -1).toString() : null));
    }

    @Override // defpackage.InterfaceC17487l
    public final AbstractC9914l firebase() {
        return m4171synchronized();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final InterfaceC10726l m4165for(Object obj, InterfaceC18035l interfaceC18035l) {
        String str = (String) obj;
        if (!AbstractC5345l.yandex(interfaceC18035l)) {
            this.yandex.add(str);
            return this;
        }
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        String strYandex = interfaceC18035l.yandex();
        boolean z = abstractC9914lMo267package instanceof AbstractC18121l;
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (z) {
            return new C11413l(AbstractC1789l.yandex(abstractC8237l, ((AbstractC18121l) abstractC9914lMo267package).amazon()), abstractC8237l);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C2336l c2336l = AbstractC18202l.yandex;
        sb.append(c2336l.loadAd(AbstractC18121l.class).license());
        sb.append(", but had ");
        sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb, " as the serialized body of ", strYandex), m4161default(str), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
    }

    @Override // defpackage.InterfaceC14988l
    public final long inmobi(InterfaceC18035l interfaceC18035l, int i) {
        return m4159catch(m4160continue(interfaceC18035l, i));
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final Object m4166interface() {
        ArrayList arrayList = this.yandex;
        Object objRemove = arrayList.remove(AbstractC14055l.smaato(arrayList));
        this.loadAd = true;
        return objRemove;
    }

    @Override // defpackage.InterfaceC14988l
    public final float isPro(C4495l c4495l, int i) {
        return m4163extends(m4160continue(c4495l, i));
    }

    @Override // defpackage.InterfaceC14988l
    public final boolean isVip(InterfaceC18035l interfaceC18035l, int i) {
        return m4170strictfp(m4160continue(interfaceC18035l, i));
    }

    @Override // defpackage.InterfaceC10726l
    public final long license() {
        return m4159catch(m4166interface());
    }

    @Override // defpackage.InterfaceC14988l
    public final C13975l loadAd() {
        return this.crashlytics.loadAd;
    }

    @Override // defpackage.InterfaceC14988l
    public final short metrica(C4495l c4495l, int i) {
        return m4162else(m4160continue(c4495l, i));
    }

    @Override // defpackage.InterfaceC10726l
    public final Object mopub(InterfaceC16588l interfaceC16588l) {
        if (!(interfaceC16588l instanceof AbstractC13151l)) {
            return interfaceC16588l.loadAd(this);
        }
        AbstractC8237l abstractC8237l = this.crashlytics;
        C17752l c17752l = abstractC8237l.yandex;
        AbstractC13151l abstractC13151l = (AbstractC13151l) interfaceC16588l;
        String strLoadAd = AbstractC9592l.loadAd(abstractC8237l, abstractC13151l.purchase());
        AbstractC9914l abstractC9914lM4171synchronized = m4171synchronized();
        String strYandex = abstractC13151l.purchase().yandex();
        if (abstractC9914lM4171synchronized instanceof C18010l) {
            C18010l c18010l = (C18010l) abstractC9914lM4171synchronized;
            AbstractC9914l abstractC9914l = (AbstractC9914l) c18010l.get(strLoadAd);
            try {
                return AbstractC17551l.firebase(abstractC8237l, strLoadAd, c18010l, AbstractC1762l.crashlytics((AbstractC13151l) interfaceC16588l, this, abstractC9914l != null ? AbstractC8358l.purchase(AbstractC8358l.admob(abstractC9914l)) : null));
            } catch (C14747l e) {
                throw new C5114l(AbstractC2238l.crashlytics(-1, e.getMessage(), null, null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(c18010l.toString(), -1).toString() : null));
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C2336l c2336l = AbstractC18202l.yandex;
        sb.append(c2336l.loadAd(C18010l.class).license());
        sb.append(", but had ");
        sb.append(c2336l.loadAd(abstractC9914lM4171synchronized.getClass()).license());
        throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC0653l.ads(sb, " as the serialized body of ", strYandex), m4169static(), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lM4171synchronized.toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final char m4167native(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        if (!(abstractC9914lMo267package instanceof AbstractC18121l)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of char");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, this.crashlytics.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        try {
            String strAmazon = abstractC18121l.amazon();
            int length = strAmazon.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strAmazon.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m4164final(abstractC18121l, "char", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: package */
    public abstract AbstractC9914l mo267package(String str);

    @Override // defpackage.InterfaceC14988l
    public final double premium(InterfaceC18035l interfaceC18035l, int i) {
        return m4168private(m4160continue(interfaceC18035l, i));
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final double m4168private(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        boolean z = abstractC9914lMo267package instanceof AbstractC18121l;
        AbstractC8237l abstractC8237l = this.crashlytics;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of double");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        try {
            C11474l c11474l = AbstractC8358l.yandex;
            double d = Double.parseDouble(abstractC18121l.amazon());
            if (abstractC8237l.yandex.subs || Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            throw new C5114l(AbstractC2238l.crashlytics(-1, AbstractC2238l.subs(Double.valueOf(d), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", abstractC8237l.yandex.smaato ? AbstractC2238l.mopub(m4171synchronized().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            m4164final(abstractC18121l, "double", str);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC10726l
    public boolean pro() {
        return !(m4171synchronized() instanceof C5544l);
    }

    @Override // defpackage.InterfaceC10726l
    public final boolean purchase() {
        return m4170strictfp(m4166interface());
    }

    @Override // defpackage.InterfaceC14988l
    public final String remoteconfig(InterfaceC18035l interfaceC18035l, int i) {
        return m4158case(m4160continue(interfaceC18035l, i));
    }

    @Override // defpackage.InterfaceC10726l
    public final byte signatures() {
        return m4173volatile(m4166interface());
    }

    @Override // defpackage.InterfaceC14988l
    public final byte smaato(C4495l c4495l, int i) {
        return m4173volatile(m4160continue(c4495l, i));
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final String m4169static() {
        ArrayList arrayList = this.yandex;
        return arrayList.isEmpty() ? "$" : AbstractC16901l.m4210case(arrayList, ".", "$.", null, null, 60);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m4170strictfp(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        if (!(abstractC9914lMo267package instanceof AbstractC18121l)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of boolean");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, this.crashlytics.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        try {
            Boolean boolAmazon = AbstractC8358l.amazon(abstractC18121l);
            if (boolAmazon != null) {
                return boolAmazon.booleanValue();
            }
            m4164final(abstractC18121l, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m4164final(abstractC18121l, "boolean", str);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14988l
    public final char subs(C4495l c4495l, int i) {
        return m4167native(m4160continue(c4495l, i));
    }

    @Override // defpackage.InterfaceC14988l
    public final int subscription(InterfaceC18035l interfaceC18035l, int i) {
        return m4172throw(m4160continue(interfaceC18035l, i));
    }

    /* JADX INFO: renamed from: switch */
    public String mo268switch(InterfaceC18035l interfaceC18035l, int i) {
        return interfaceC18035l.admob(i);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final AbstractC9914l m4171synchronized() {
        AbstractC9914l abstractC9914lMo267package;
        String str = (String) AbstractC16901l.m4212class(this.yandex);
        return (str == null || (abstractC9914lMo267package = mo267package(str)) == null) ? mo264class() : abstractC9914lMo267package;
    }

    @Override // defpackage.InterfaceC10726l
    public final String tapsense() {
        return m4158case(m4166interface());
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final int m4172throw(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        if (!(abstractC9914lMo267package instanceof AbstractC18121l)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of int");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, this.crashlytics.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        try {
            long jSubs = AbstractC8358l.subs(abstractC18121l);
            Integer numValueOf = (-2147483648L > jSubs || jSubs > 2147483647L) ? null : Integer.valueOf((int) jSubs);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            m4164final(abstractC18121l, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m4164final(abstractC18121l, "int", str);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC10726l
    /* JADX INFO: renamed from: throws */
    public final double mo677throws() {
        return m4168private(m4166interface());
    }

    @Override // defpackage.InterfaceC10726l
    public final int vip() {
        return m4172throw(m4166interface());
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final byte m4173volatile(Object obj) {
        String str = (String) obj;
        AbstractC9914l abstractC9914lMo267package = mo267package(str);
        if (!(abstractC9914lMo267package instanceof AbstractC18121l)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C2336l c2336l = AbstractC18202l.yandex;
            sb.append(c2336l.loadAd(AbstractC18121l.class).license());
            sb.append(", but had ");
            sb.append(c2336l.loadAd(abstractC9914lMo267package.getClass()).license());
            sb.append(" as the serialized body of byte");
            throw new C5114l(AbstractC2238l.crashlytics(-1, sb.toString(), m4161default(str), null, this.crashlytics.yandex.smaato ? AbstractC2238l.mopub(abstractC9914lMo267package.toString(), -1).toString() : null));
        }
        AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914lMo267package;
        try {
            long jSubs = AbstractC8358l.subs(abstractC18121l);
            Byte bValueOf = (-128 > jSubs || jSubs > 127) ? null : Byte.valueOf((byte) jSubs);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m4164final(abstractC18121l, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m4164final(abstractC18121l, "byte", str);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC10726l
    public final void startapp() {
    }

    public void yandex(InterfaceC18035l interfaceC18035l) {
    }
}
