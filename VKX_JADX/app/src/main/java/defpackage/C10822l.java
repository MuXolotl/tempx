package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10822l implements InterfaceC18162l {
    public static final C10822l amazon;
    public static final C10822l crashlytics;
    public static final C10822l purchase;
    public final C8688l loadAd = new C8688l(new C7646l(14, this));
    public final C9911l yandex;

    static {
        C9911l c9911l = new C9911l();
        C5746l c5746l = C5746l.f12138l;
        c9911l.amazon(c5746l);
        Unit unit = Unit.INSTANCE;
        c9911l.yandex = true;
        new C10822l(c9911l);
        C9911l c9911l2 = new C9911l();
        c9911l2.isPro();
        Unit unit2 = Unit.INSTANCE;
        c9911l2.yandex = true;
        new C10822l(c9911l2);
        C9911l c9911l3 = new C9911l();
        c9911l3.isPro();
        c9911l3.amazon(c5746l);
        Unit unit3 = Unit.INSTANCE;
        c9911l3.yandex = true;
        new C10822l(c9911l3);
        C9911l c9911l4 = new C9911l();
        c9911l4.isPro();
        c9911l4.amazon(c5746l);
        c9911l4.remoteconfig();
        Unit unit4 = Unit.INSTANCE;
        c9911l4.yandex = true;
        new C10822l(c9911l4);
        C9911l c9911l5 = new C9911l();
        c9911l5.amazon(c5746l);
        C13594l c13594l = C13594l.crashlytics;
        c9911l5.admob(c13594l);
        EnumC5714l enumC5714l = EnumC5714l.f12095l;
        c9911l5.mopub(enumC5714l);
        Unit unit5 = Unit.INSTANCE;
        c9911l5.yandex = true;
        new C10822l(c9911l5);
        C9911l c9911l6 = new C9911l();
        c9911l6.isPro();
        c9911l6.amazon(c5746l);
        c9911l6.admob(c13594l);
        c9911l6.billing();
        c9911l6.mopub(EnumC5714l.f12094l);
        c9911l6.yandex();
        c9911l6.crashlytics();
        c9911l6.remoteconfig();
        c9911l6.subs();
        Unit unit6 = Unit.INSTANCE;
        c9911l6.yandex = true;
        new C10822l(c9911l6);
        C9911l c9911l7 = new C9911l();
        c9911l7.amazon(EnumC1382l.f3520l);
        Unit unit7 = Unit.INSTANCE;
        c9911l7.yandex = true;
        crashlytics = new C10822l(c9911l7);
        C9911l c9911l8 = new C9911l();
        c9911l8.amazon(EnumC1382l.f3516l);
        Unit unit8 = Unit.INSTANCE;
        c9911l8.yandex = true;
        new C10822l(c9911l8);
        C9911l c9911l9 = new C9911l();
        c9911l9.admob(c13594l);
        c9911l9.mopub(enumC5714l);
        Unit unit9 = Unit.INSTANCE;
        c9911l9.yandex = true;
        amazon = new C10822l(c9911l9);
        C9911l c9911l10 = new C9911l();
        c9911l10.loadAd();
        c9911l10.admob(C13594l.loadAd);
        c9911l10.amazon(EnumC1382l.f3516l);
        Unit unit10 = Unit.INSTANCE;
        c9911l10.yandex = true;
        purchase = new C10822l(c9911l10);
        C9911l c9911l11 = new C9911l();
        c9911l11.smaato();
        c9911l11.amazon(EnumC1382l.f3516l);
        Unit unit11 = Unit.INSTANCE;
        c9911l11.yandex = true;
        new C10822l(c9911l11);
    }

    public C10822l(C9911l c9911l) {
        this.yandex = c9911l;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f A[RETURN] */
    public static int Signature(InterfaceC5436l interfaceC5436l) {
        if (interfaceC5436l instanceof InterfaceC17477l) {
            if (((InterfaceC17477l) interfaceC5436l).mo752l() == 2) {
                return 4;
            }
            return 1;
        }
        InterfaceC8371l interfaceC8371lSignature = interfaceC5436l.Signature();
        InterfaceC17477l interfaceC17477l = interfaceC8371lSignature instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC8371lSignature : null;
        if (interfaceC17477l != null && (interfaceC5436l instanceof InterfaceC0207l)) {
            InterfaceC0207l interfaceC0207l = (InterfaceC0207l) interfaceC5436l;
            if (!interfaceC0207l.license().isEmpty() && interfaceC17477l.startapp() != 1) {
                return 3;
            }
            if (interfaceC17477l.mo752l() == 2 && !AbstractC8576l.yandex(interfaceC0207l.admob(), AbstractC6004l.yandex)) {
                if (interfaceC0207l.startapp() == 4) {
                    return 4;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static void m2982class(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static boolean m2983finally(AbstractC18041l abstractC18041l) {
        if (!AbstractC10000l.vip(abstractC18041l)) {
            return false;
        }
        List listInmobi = abstractC18041l.inmobi();
        if (listInmobi != null && listInmobi.isEmpty()) {
            return true;
        }
        Iterator it = listInmobi.iterator();
        while (it.hasNext()) {
            if (((AbstractC4946l) it.next()).crashlytics()) {
                return false;
            }
        }
        return true;
    }

    public static final void vip(C10822l c10822l, InterfaceC10696l interfaceC10696l, StringBuilder sb) {
        boolean zAdcel = c10822l.adcel();
        C9911l c9911l = c10822l.yandex;
        if (!zAdcel) {
            C17838l c17838l = c9911l.mopub;
            InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
            InterfaceC13922l interfaceC13922l = interfaceC13922lArr[5];
            if (!((Boolean) c17838l.yandex).booleanValue()) {
                c10822l.premium(sb, interfaceC10696l.mo1478l());
                if (c10822l.startapp().contains(EnumC1382l.ANNOTATIONS)) {
                    c10822l.ad(sb, interfaceC10696l, null);
                    C15249l c15249lMo2966l = interfaceC10696l.mo2966l();
                    if (c15249lMo2966l != null) {
                        c10822l.ad(sb, c15249lMo2966l, EnumC7936l.FIELD);
                    }
                    C15249l c15249lMo2967l = interfaceC10696l.mo2967l();
                    if (c15249lMo2967l != null) {
                        c10822l.ad(sb, c15249lMo2967l, EnumC7936l.PROPERTY_DELEGATE_FIELD);
                    }
                    C17838l c17838l2 = c9911l.f20170synchronized;
                    InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[32];
                    if (((EnumC3401l) c17838l2.yandex) == EnumC3401l.f7248l) {
                        C11425l c11425lCrashlytics = interfaceC10696l.crashlytics();
                        if (c11425lCrashlytics != null) {
                            c10822l.ad(sb, c11425lCrashlytics, EnumC7936l.PROPERTY_GETTER);
                        }
                        C1710l c1710lAmazon = interfaceC10696l.amazon();
                        if (c1710lAmazon != null) {
                            c10822l.ad(sb, c1710lAmazon, EnumC7936l.PROPERTY_SETTER);
                            c10822l.ad(sb, (C17538l) AbstractC16901l.m4208abstract(c1710lAmazon.mo1007finally()), EnumC7936l.SETTER_PARAMETER);
                        }
                    }
                }
                c10822l.m2995instanceof(interfaceC10696l.admob(), sb);
                c10822l.m2990extends(sb, c10822l.startapp().contains(EnumC1382l.CONST) && interfaceC10696l.mo1492synchronized(), "const");
                c10822l.m3009volatile(interfaceC10696l, sb);
                c10822l.m3000private(interfaceC10696l, sb);
                c10822l.m2985case(interfaceC10696l, sb);
                c10822l.m2990extends(sb, c10822l.startapp().contains(EnumC1382l.LATEINIT) && interfaceC10696l.mo3251l(), "lateinit");
                c10822l.m3003strictfp(interfaceC10696l, sb);
            }
            c10822l.m3004super(interfaceC10696l, sb, false);
            c10822l.m2993goto(sb, interfaceC10696l.getTypeParameters(), true);
            C7073l c7073lMo1479return = interfaceC10696l.mo1479return();
            if (c7073lMo1479return != null) {
                c10822l.ad(sb, c7073lMo1479return, EnumC7936l.RECEIVER);
                sb.append(c10822l.m3008throws(c7073lMo1479return.yandex(), false));
                sb.append(".");
            }
        }
        c10822l.m3007throw(interfaceC10696l, sb, true);
        sb.append(": ");
        sb.append(c10822l.m2996interface(interfaceC10696l.yandex()));
        c10822l.m2987continue(interfaceC10696l, sb);
        c10822l.m2999package(interfaceC10696l, sb);
        c10822l.m3001public(sb, interfaceC10696l.getTypeParameters());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2984abstract(StringBuilder sb, List list, boolean z) {
        boolean z2;
        C17838l c17838l = this.yandex.inmobi;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[29];
        int iOrdinal = ((EnumC5714l) c17838l.yandex).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    C18725l.billing();
                    return;
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = list.size();
        subscription().getClass();
        sb.append("(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            C17538l c17538l = (C17538l) it.next();
            subscription().getClass();
            m2994import(c17538l, z2, sb, false);
            subscription().getClass();
            if (i != size - 1) {
                sb.append(", ");
            }
            i = i2;
        }
        subscription().getClass();
        sb.append(")");
    }

    public final void ad(StringBuilder sb, InterfaceC2853l interfaceC2853l, EnumC7936l enumC7936l) {
        Set setFirebase;
        if (startapp().contains(EnumC1382l.ANNOTATIONS)) {
            boolean z = interfaceC2853l instanceof AbstractC18041l;
            C9911l c9911l = this.yandex;
            if (z) {
                setFirebase = c9911l.firebase();
            } else {
                C17838l c17838l = c9911l.f20164native;
                InterfaceC13922l interfaceC13922l = C9911l.f20154final[35];
                setFirebase = (Set) c17838l.yandex;
            }
            C17838l c17838l2 = c9911l.f20161extends;
            InterfaceC13922l interfaceC13922l2 = C9911l.f20154final[37];
            Function1 function1 = (Function1) c17838l2.yandex;
            for (InterfaceC1910l interfaceC1910l : interfaceC2853l.getAnnotations()) {
                if (!AbstractC16901l.inmobi(setFirebase, interfaceC1910l.mopub()) && !AbstractC8576l.yandex(interfaceC1910l.mopub(), AbstractC3333l.ads) && (function1 == null || ((Boolean) function1.invoke(interfaceC1910l)).booleanValue())) {
                    sb.append(pro(interfaceC1910l, enumC7936l));
                    C17838l c17838l3 = c9911l.f20173volatile;
                    InterfaceC13922l interfaceC13922l3 = C9911l.f20154final[34];
                    if (((Boolean) c17838l3.yandex).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final boolean adcel() {
        C17838l c17838l = this.yandex.billing;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[4];
        return ((Boolean) c17838l.yandex).booleanValue();
    }

    @Override // defpackage.InterfaceC18162l
    public final void admob(C13594l c13594l) {
        this.yandex.admob(c13594l);
    }

    public final EnumC12530l ads() {
        C17838l c17838l = this.yandex.appmetrica;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[28];
        return (EnumC12530l) c17838l.yandex;
    }

    @Override // defpackage.InterfaceC18162l
    public final void amazon(Set set) {
        this.yandex.amazon(set);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    public final void applovin(StringBuilder sb, AbstractC15211l abstractC15211l) {
        C17838l c17838l;
        ad(sb, abstractC15211l, null);
        if (AbstractC11748l.subs(abstractC15211l)) {
            boolean z = abstractC15211l instanceof C14487l;
            C9911l c9911l = this.yandex;
            if (z && ((C14487l) abstractC15211l).f28366l.f11152l) {
                C17838l c17838l2 = c9911l.f20163interface;
                InterfaceC13922l interfaceC13922l = C9911l.f20154final[47];
                if (((Boolean) c17838l2.yandex).booleanValue()) {
                    C8741l c8741l = C8741l.yandex;
                    if (z) {
                        boolean z2 = ((C14487l) abstractC15211l).f28366l.f11152l;
                    }
                    sb.append(appmetrica(((C5260l) abstractC15211l.mo1339native()).f11341l[0]));
                } else {
                    if (z) {
                        c17838l = c9911l.f20159default;
                        InterfaceC13922l interfaceC13922l2 = C9911l.f20154final[49];
                        if (((Boolean) c17838l.yandex).booleanValue()) {
                            sb.append(abstractC15211l.mo1339native().toString());
                        } else {
                            sb.append(((C14487l) abstractC15211l).f28363l);
                        }
                    } else {
                        sb.append(abstractC15211l.mo1339native().toString());
                    }
                    sb.append(m3002static(abstractC15211l.inmobi()));
                }
            } else {
                if (z) {
                    c17838l = c9911l.f20159default;
                    InterfaceC13922l interfaceC13922l3 = C9911l.f20154final[49];
                    if (((Boolean) c17838l.yandex).booleanValue()) {
                        sb.append(((C14487l) abstractC15211l).f28363l);
                    } else {
                        sb.append(abstractC15211l.mo1339native().toString());
                    }
                } else {
                    sb.append(abstractC15211l.mo1339native().toString());
                }
                sb.append(m3002static(abstractC15211l.inmobi()));
            }
        } else {
            InterfaceC1925l interfaceC1925lMo1339native = abstractC15211l.mo1339native();
            InterfaceC15234l interfaceC15234lPro = abstractC15211l.mo1339native().pro();
            C0554l c0554lYandex = AbstractC17653l.yandex(abstractC15211l, interfaceC15234lPro instanceof InterfaceC10607l ? (InterfaceC10607l) interfaceC15234lPro : null, 0);
            if (c0554lYandex == null) {
                sb.append(m2988default(interfaceC1925lMo1339native));
                sb.append(m3002static(abstractC15211l.inmobi()));
            } else {
                m3005switch(sb, c0554lYandex);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (abstractC15211l.mo1342throw()) {
            sb.append("?");
        }
        if (abstractC15211l instanceof C15110l) {
            sb.append(" & Any");
        }
    }

    public final String appmetrica(String str) {
        int iOrdinal = ads().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return AbstractC15560l.Signature("<font color=red><b>", str, "</b></font>");
        }
        C18725l.billing();
        return null;
    }

    @Override // defpackage.InterfaceC18162l
    public final void billing() {
        this.yandex.billing();
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m2985case(InterfaceC0207l interfaceC0207l, StringBuilder sb) {
        if (startapp().contains(EnumC1382l.OVERRIDE) && !interfaceC0207l.license().isEmpty()) {
            C17838l c17838l = this.yandex.premium;
            InterfaceC13922l interfaceC13922l = C9911l.f20154final[26];
            if (((EnumC1957l) c17838l.yandex) != EnumC1957l.f4457l) {
                m2990extends(sb, true, "override");
                if (tapsense()) {
                    sb.append("/*");
                    sb.append(interfaceC0207l.license().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m2986catch(StringBuilder sb, AbstractC18041l abstractC18041l) throws IOException {
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        Cabstract cabstract = abstractC14318lMo3847class instanceof Cabstract ? (Cabstract) abstractC14318lMo3847class : null;
        if (cabstract == null) {
            m2989else(sb, abstractC18041l);
            return;
        }
        AbstractC15211l abstractC15211l = cabstract.f0l;
        AbstractC15211l abstractC15211l2 = cabstract.f1l;
        C9911l c9911l = this.yandex;
        C17838l c17838l = c9911l.f20155case;
        InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[42];
        boolean zBooleanValue = ((Boolean) c17838l.yandex).booleanValue();
        C5025l c5025l = EnumC12530l.f24691l;
        if (zBooleanValue) {
            m2989else(sb, abstractC15211l2);
            C17838l c17838l2 = c9911l.f20169switch;
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[43];
            if (((Boolean) c17838l2.yandex).booleanValue()) {
                if (ads() == c5025l) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                m2989else(sb, abstractC15211l);
                sb.append(" */");
                if (ads() == c5025l) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m2989else(sb, abstractC15211l);
        C17838l c17838l3 = c9911l.f20160else;
        InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr[41];
        if (((Boolean) c17838l3.yandex).booleanValue()) {
            if (ads() == c5025l) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            m2989else(sb, abstractC15211l2);
            sb.append(" */");
            if (ads() == c5025l) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m2987continue(InterfaceC0207l interfaceC0207l, StringBuilder sb) {
        C7073l c7073lMo1479return;
        C17838l c17838l = this.yandex.f20172throws;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[30];
        if (((Boolean) c17838l.yandex).booleanValue() && (c7073lMo1479return = interfaceC0207l.mo1479return()) != null) {
            sb.append(" on ");
            sb.append(m2996interface(c7073lMo1479return.yandex()));
        }
    }

    @Override // defpackage.InterfaceC18162l
    public final void crashlytics() {
        this.yandex.crashlytics();
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final String m2988default(InterfaceC1925l interfaceC1925l) {
        InterfaceC15234l interfaceC15234lPro = interfaceC1925l.pro();
        if (!(interfaceC15234lPro instanceof InterfaceC16902l) && !(interfaceC15234lPro instanceof InterfaceC17477l) && !(interfaceC15234lPro instanceof C9522l)) {
            if (interfaceC15234lPro == null) {
                return interfaceC1925l instanceof C11794l ? ((C11794l) interfaceC1925l).crashlytics(C2100l.f4714l) : interfaceC1925l.toString();
            }
            C11983l.advert(interfaceC15234lPro.getClass(), "Unexpected classifier: ");
            return null;
        }
        if (C8741l.purchase(interfaceC15234lPro)) {
            return interfaceC15234lPro.metrica().toString();
        }
        C17838l c17838l = this.yandex.loadAd;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[0];
        return ((C13594l) c17838l.yandex).loadAd(interfaceC15234lPro, this);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b1  */
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m2989else(StringBuilder sb, AbstractC18041l abstractC18041l) throws IOException {
        AbstractC1514l abstractC1514lMopub;
        String strMetrica;
        AbstractC1514l abstractC1514lMopub2;
        boolean z;
        C9911l c9911l = this.yandex;
        if ((abstractC18041l instanceof C15013l) && c9911l.vip()) {
            C2278l c2278l = ((C15013l) abstractC18041l).f29530l;
            if (c2278l.f18562l == EnumC12766l.f25152l || c2278l.f18562l == EnumC12766l.f25151l) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        if (abstractC14318lMo3847class instanceof AbstractC4317l) {
            sb.append(((AbstractC4317l) abstractC14318lMo3847class).mo688l(this, this));
            return;
        }
        if (!(abstractC14318lMo3847class instanceof AbstractC15211l)) {
            C18725l.billing();
            return;
        }
        AbstractC15211l abstractC15211l = (AbstractC15211l) abstractC14318lMo3847class;
        if (abstractC15211l.equals(AbstractC12008l.loadAd) || abstractC15211l.mo1339native() == AbstractC12008l.yandex.f28364l) {
            sb.append("???");
            return;
        }
        InterfaceC1925l interfaceC1925lMo1339native = abstractC15211l.mo1339native();
        int i = 0;
        if ((interfaceC1925lMo1339native instanceof C5260l) && ((C5260l) interfaceC1925lMo1339native).f11342l == EnumC5123l.f11137l) {
            C17838l c17838l = c9911l.tapsense;
            InterfaceC13922l interfaceC13922l = C9911l.f20154final[18];
            if (((Boolean) c17838l.yandex).booleanValue()) {
                sb.append(appmetrica(((C5260l) abstractC15211l.mo1339native()).f11341l[0]));
                return;
            } else {
                sb.append("???");
                return;
            }
        }
        if (AbstractC11748l.subs(abstractC15211l)) {
            applovin(sb, abstractC15211l);
            return;
        }
        if (!m2983finally(abstractC15211l)) {
            applovin(sb, abstractC15211l);
            return;
        }
        int length = sb.length();
        ((C10822l) this.loadAd.getValue()).ad(sb, abstractC15211l, null);
        boolean z2 = sb.length() != length;
        AbstractC18041l abstractC18041lAdmob = AbstractC10000l.admob(abstractC15211l);
        List listBilling = AbstractC10000l.billing(abstractC15211l);
        InterfaceC15234l interfaceC15234lPro = abstractC15211l.mo1339native().pro();
        if (interfaceC15234lPro != null && (interfaceC15234lPro instanceof InterfaceC17477l) && AbstractC16860l.m4205strictfp(interfaceC15234lPro)) {
            int i2 = AbstractC3759l.yandex;
            abstractC1514lMopub = AbstractC10000l.mopub(AbstractC11125l.billing(interfaceC15234lPro));
        } else {
            abstractC1514lMopub = null;
        }
        boolean zYandex = AbstractC8576l.yandex(abstractC1514lMopub, C9392l.amazon);
        boolean zMo1342throw = abstractC15211l.mo1342throw();
        boolean z3 = zMo1342throw || (z2 && abstractC18041lAdmob != null);
        if (z3) {
            if (zYandex) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    AbstractC8576l.remoteconfig(AbstractC12024l.m3320else(sb));
                    if (sb.charAt(AbstractC12024l.m3350volatile(sb) - 1) != ')') {
                        sb.insert(AbstractC12024l.m3350volatile(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        m2990extends(sb, zYandex, "suspend");
        if (!listBilling.isEmpty()) {
            sb.append("context(");
            Iterator it = listBilling.subList(0, AbstractC14055l.smaato(listBilling)).iterator();
            while (it.hasNext()) {
                m2986catch(sb, (AbstractC18041l) it.next());
                sb.append(", ");
            }
            m2986catch(sb, (AbstractC18041l) AbstractC16901l.m4214continue(listBilling));
            sb.append(") ");
        }
        if (abstractC18041lAdmob != null) {
            if (!m2983finally(abstractC18041lAdmob) || abstractC18041lAdmob.mo1342throw()) {
                InterfaceC15234l interfaceC15234lPro2 = abstractC18041lAdmob.mo1339native().pro();
                if (interfaceC15234lPro2 != null && (interfaceC15234lPro2 instanceof InterfaceC17477l) && AbstractC16860l.m4205strictfp(interfaceC15234lPro2)) {
                    int i3 = AbstractC3759l.yandex;
                    abstractC1514lMopub2 = AbstractC10000l.mopub(AbstractC11125l.billing(interfaceC15234lPro2));
                } else {
                    abstractC1514lMopub2 = null;
                }
                if (AbstractC8576l.yandex(abstractC1514lMopub2, C9392l.amazon) || !abstractC18041lAdmob.getAnnotations().isEmpty() || (abstractC18041lAdmob instanceof C15110l)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                sb.append("(");
            }
            m2986catch(sb, abstractC18041lAdmob);
            if (z) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!AbstractC10000l.vip(abstractC15211l) || abstractC15211l.getAnnotations().loadAd(AbstractC3333l.startapp) == null || abstractC15211l.inmobi().size() > 1) {
            int i4 = 0;
            for (AbstractC4946l abstractC4946l : AbstractC10000l.subs(abstractC15211l)) {
                int i5 = i4 + 1;
                if (i4 > 0) {
                    sb.append(", ");
                }
                C17838l c17838l2 = c9911l.f20157class;
                InterfaceC13922l interfaceC13922l2 = C9911l.f20154final[45];
                C3498l c3498lPurchase = ((Boolean) c17838l2.yandex).booleanValue() ? AbstractC10000l.purchase(abstractC4946l.loadAd()) : null;
                if (c3498lPurchase != null) {
                    sb.append(m2992for(c3498lPurchase, false));
                    sb.append(": ");
                }
                StringBuilder sb2 = new StringBuilder();
                AbstractC16901l.m4216else(Collections.singletonList(abstractC4946l), sb2, ", ", null, null, new C14474l(this, i), 60);
                sb.append(sb2.toString());
                i4 = i5;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = ads().ordinal();
        if (iOrdinal == 0) {
            strMetrica = metrica("->");
        } else {
            if (iOrdinal != 1) {
                C18725l.billing();
                return;
            }
            strMetrica = "&rarr;";
        }
        sb.append(strMetrica);
        sb.append(" ");
        AbstractC10000l.vip(abstractC15211l);
        m2986catch(sb, ((AbstractC4946l) AbstractC16901l.m4214continue(abstractC15211l.inmobi())).loadAd());
        if (z3) {
            sb.append(")");
        }
        if (zMo1342throw) {
            sb.append("?");
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m2990extends(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m3006synchronized(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m2991final(InterfaceC16902l interfaceC16902l, StringBuilder sb, boolean z) {
        String str;
        if (z) {
            sb.append(metrica("<"));
        }
        if (tapsense()) {
            sb.append("/*");
            sb.append(interfaceC16902l.getIndex());
            sb.append("*/ ");
        }
        m2990extends(sb, interfaceC16902l.mo2180extends(), "reified");
        int iMo2182l = interfaceC16902l.mo2182l();
        boolean z2 = true;
        if (iMo2182l == 1) {
            str = "";
        } else if (iMo2182l == 2) {
            str = "in";
        } else {
            if (iMo2182l != 3) {
                throw null;
            }
            str = "out";
        }
        m2990extends(sb, str.length() > 0, str);
        ad(sb, interfaceC16902l, null);
        m3007throw(interfaceC16902l, sb, z);
        int size = interfaceC16902l.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC18041l abstractC18041l = (AbstractC18041l) interfaceC16902l.getUpperBounds().iterator().next();
            if (abstractC18041l == null) {
                AbstractC16860l.yandex(141);
                throw null;
            }
            if (!AbstractC16860l.ad(abstractC18041l) || !abstractC18041l.mo1342throw()) {
                sb.append(" : ");
                sb.append(m2996interface(abstractC18041l));
            }
        } else if (z) {
            for (AbstractC18041l abstractC18041l2 : interfaceC16902l.getUpperBounds()) {
                if (abstractC18041l2 == null) {
                    AbstractC16860l.yandex(141);
                    throw null;
                }
                if (!AbstractC16860l.ad(abstractC18041l2) || !abstractC18041l2.mo1342throw()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(m2996interface(abstractC18041l2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(metrica(">"));
        }
    }

    @Override // defpackage.InterfaceC18162l
    public final Set firebase() {
        return this.yandex.firebase();
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final String m2992for(C3498l c3498l, boolean z) {
        String strMetrica = metrica(AbstractC3324l.billing(c3498l));
        C17838l c17838l = this.yandex.f20167static;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[48];
        return (((Boolean) c17838l.yandex).booleanValue() && ads() == EnumC12530l.f24691l && z) ? AbstractC15560l.Signature("<b>", strMetrica, "</b>") : strMetrica;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m2993goto(StringBuilder sb, List list, boolean z) {
        C17838l c17838l = this.yandex.pro;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[21];
        if (((Boolean) c17838l.yandex).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(metrica("<"));
        m2998new(sb, list);
        sb.append(metrica(">"));
        if (z) {
            sb.append(" ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2994import(C17538l c17538l, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(m3006synchronized("value-parameter"));
            sb.append(" ");
        }
        if (tapsense()) {
            sb.append("/*");
            sb.append(c17538l.f34146l);
            sb.append("*/ ");
        }
        ad(sb, c17538l, null);
        m2990extends(sb, c17538l.f34150l, "crossinline");
        m2990extends(sb, c17538l.f34148l, "noinline");
        C9911l c9911l = this.yandex;
        C17838l c17838l = c9911l.ads;
        InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[16];
        boolean z4 = false;
        if (((Boolean) c17838l.yandex).booleanValue()) {
            InterfaceC11661l interfaceC11661lM4402l = c17538l.m4402l();
            C5786l c5786l = interfaceC11661lM4402l instanceof C5786l ? (C5786l) interfaceC11661lM4402l : null;
            if (c5786l == null || !c5786l.f12195l) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            C17838l c17838l2 = c9911l.subscription;
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[17];
            m2990extends(sb, ((Boolean) c17838l2.yandex).booleanValue(), "actual");
        }
        AbstractC18041l abstractC18041lYandex = c17538l.yandex();
        AbstractC18041l abstractC18041l = c17538l.f34151l;
        AbstractC18041l abstractC18041l2 = abstractC18041l == null ? abstractC18041lYandex : abstractC18041l;
        m2990extends(sb, abstractC18041l != null, "vararg");
        if (z3 || (z2 && !adcel())) {
            m3004super(c17538l, sb, z3);
        }
        if (z) {
            m3007throw(c17538l, sb, z2);
            sb.append(": ");
        }
        sb.append(m2996interface(abstractC18041l2));
        m2999package(c17538l, sb);
        if (tapsense() && abstractC18041l != null) {
            sb.append(" /*");
            sb.append(m2996interface(abstractC18041lYandex));
            sb.append("*/");
        }
        C17838l c17838l3 = c9911l.isVip;
        InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr[24];
        if (((Function1) c17838l3.yandex) != null) {
            if (c9911l.vip() ? c17538l.m4403l() : AbstractC3759l.yandex(c17538l)) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb2 = new StringBuilder(" = ");
            C17838l c17838l4 = c9911l.isVip;
            InterfaceC13922l interfaceC13922l4 = interfaceC13922lArr[24];
            sb2.append((String) ((Function1) c17838l4.yandex).invoke(c17538l));
            sb.append(sb2.toString());
        }
    }

    public final String inmobi(String str, String str2, AbstractC16860l abstractC16860l) {
        int i = 0;
        if (AbstractC3324l.isPro(str, str2)) {
            return AbstractC16648l.isVip(str2, "(", false) ? AbstractC15560l.Signature("(", str, ")!") : str.concat("!");
        }
        int i2 = 1;
        String strMopub = AbstractC3324l.mopub(str, str2, new C11499l(this, abstractC16860l, i), new C11499l(this, abstractC16860l, i2), new C17847l(i2, this, C10822l.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 12));
        if (strMopub != null) {
            return strMopub;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final boolean m2995instanceof(C6561l c6561l, StringBuilder sb) {
        if (!startapp().contains(EnumC1382l.VISIBILITY)) {
            return false;
        }
        C9911l c9911l = this.yandex;
        C17838l c17838l = c9911l.vip;
        InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[12];
        if (((Boolean) c17838l.yandex).booleanValue()) {
            c6561l = AbstractC6004l.mopub(c6561l.yandex.subscription());
        }
        C17838l c17838l2 = c9911l.metrica;
        InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[13];
        if (!((Boolean) c17838l2.yandex).booleanValue() && AbstractC8576l.yandex(c6561l, AbstractC6004l.isPro)) {
            return false;
        }
        sb.append(m3006synchronized(c6561l.yandex.mopub()));
        sb.append(" ");
        return true;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final String m2996interface(AbstractC18041l abstractC18041l) {
        StringBuilder sb = new StringBuilder();
        C17838l c17838l = this.yandex.advert;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[23];
        m2986catch(sb, (AbstractC18041l) ((Function1) c17838l.yandex).invoke(abstractC18041l));
        return sb.toString();
    }

    @Override // defpackage.InterfaceC18162l
    public final void isPro() {
        this.yandex.isPro();
    }

    public final void isVip(InterfaceC10607l interfaceC10607l, StringBuilder sb) {
        List listIsVip = interfaceC10607l.isVip();
        List parameters = interfaceC10607l.metrica().getParameters();
        if (tapsense() && interfaceC10607l.subscription() && parameters.size() > listIsVip.size()) {
            sb.append(" /*captured type parameters: ");
            m2998new(sb, parameters.subList(listIsVip.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String license(InterfaceC8371l interfaceC8371l) {
        InterfaceC8371l interfaceC8371lSignature;
        String str;
        StringBuilder sb = new StringBuilder();
        interfaceC8371l.mo1008import(new C10975l(9, this), sb);
        C9911l c9911l = this.yandex;
        C17838l c17838l = c9911l.crashlytics;
        InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[1];
        if (((Boolean) c17838l.yandex).booleanValue() && !(interfaceC8371l instanceof InterfaceC9921l) && !(interfaceC8371l instanceof C10486l) && (interfaceC8371lSignature = interfaceC8371l.Signature()) != null && !(interfaceC8371lSignature instanceof InterfaceC11865l)) {
            sb.append(" ");
            int iOrdinal = ads().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    C18725l.billing();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C16781l c16781lBilling = AbstractC11125l.billing(interfaceC8371lSignature);
            sb.append(c16781lBilling.crashlytics() ? "root package" : metrica(AbstractC3324l.admob(C16781l.billing(c16781lBilling))));
            C17838l c17838l2 = c9911l.amazon;
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[2];
            if (((Boolean) c17838l2.yandex).booleanValue() && (interfaceC8371lSignature instanceof InterfaceC9921l) && (interfaceC8371l instanceof InterfaceC10233l)) {
                ((InterfaceC10233l) interfaceC8371l).billing().getClass();
            }
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC18162l
    public final void loadAd() {
        this.yandex.loadAd();
    }

    public final String metrica(String str) {
        return ads().yandex(str);
    }

    @Override // defpackage.InterfaceC18162l
    public final void mopub(EnumC5714l enumC5714l) {
        this.yandex.mopub(enumC5714l);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m2997native(int i, int i2, StringBuilder sb) {
        String str;
        C17838l c17838l = this.yandex.startapp;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[14];
        if (((Boolean) c17838l.yandex).booleanValue() || i != i2) {
            boolean zContains = startapp().contains(EnumC1382l.MODALITY);
            if (i == 1) {
                str = "FINAL";
            } else if (i == 2) {
                str = "SEALED";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            m2990extends(sb, zContains, AbstractC15901l.isPro(str));
        }
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m2998new(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m2991final((InterfaceC16902l) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m2999package(InterfaceC11764l interfaceC11764l, StringBuilder sb) {
        AbstractC0757l abstractC0757lMo3252super;
        String strSignatures;
        C17838l c17838l = this.yandex.Signature;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[19];
        if (!((Boolean) c17838l.yandex).booleanValue() || (abstractC0757lMo3252super = interfaceC11764l.mo3252super()) == null || (strSignatures = signatures(abstractC0757lMo3252super)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(metrica(strSignatures));
    }

    public final void premium(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            sb.append(m3008throws(((C7073l) it.next()).yandex(), true));
            if (i == AbstractC14055l.smaato(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m3000private(InterfaceC0207l interfaceC0207l, StringBuilder sb) {
        if (AbstractC11125l.adcel(interfaceC0207l) && interfaceC0207l.startapp() == 1) {
            return;
        }
        C17838l c17838l = this.yandex.premium;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[26];
        if (((EnumC1957l) c17838l.yandex) == EnumC1957l.f4458l && interfaceC0207l.startapp() == 3 && !interfaceC0207l.license().isEmpty()) {
            return;
        }
        m2997native(interfaceC0207l.startapp(), Signature(interfaceC0207l), sb);
    }

    public final String pro(InterfaceC1910l interfaceC1910l, EnumC7936l enumC7936l) throws IOException {
        C5786l c5786lMo751final;
        List listMo1007finally;
        C9911l c9911l = this.yandex;
        C17838l c17838l = c9911l.f20162for;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC7936l != null) {
            sb.append(enumC7936l.f16538l + ':');
        }
        AbstractC18041l abstractC18041lYandex = interfaceC1910l.yandex();
        sb.append(m2996interface(abstractC18041lYandex));
        InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[38];
        if (((EnumC2437l) c17838l.yandex).f5215l) {
            Map mapAdmob = interfaceC1910l.admob();
            C17838l c17838l2 = c9911l.f20168strictfp;
            InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[33];
            List list = null;
            InterfaceC17477l interfaceC17477lAmazon = ((Boolean) c17838l2.yandex).booleanValue() ? AbstractC3759l.amazon(interfaceC1910l) : null;
            if (interfaceC17477lAmazon != null && (c5786lMo751final = interfaceC17477lAmazon.mo751final()) != null && (listMo1007finally = c5786lMo751final.mo1007finally()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo1007finally) {
                    if (((C17538l) obj).m4403l()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C17538l) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = C2580l.f5619l;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapAdmob.containsKey((C3498l) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C3498l) it2.next()).loadAd() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapAdmob.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                C3498l c3498l = (C3498l) entry.getKey();
                AbstractC0757l abstractC0757l = (AbstractC0757l) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c3498l.loadAd());
                sb2.append(" = ");
                sb2.append(!list.contains(c3498l) ? signatures(abstractC0757l) : "...");
                arrayList5.add(sb2.toString());
            }
            List listM4219finally = AbstractC16901l.m4219finally(AbstractC16901l.m4232new(arrayList4, arrayList5));
            InterfaceC13922l interfaceC13922l3 = C9911l.f20154final[38];
            if (((EnumC2437l) c17838l.yandex).f5214l || !listM4219finally.isEmpty()) {
                AbstractC16901l.m4216else(listM4219finally, sb, ", ", "(", ")", null, 112);
            }
        }
        if (tapsense() && (AbstractC11748l.subs(abstractC18041lYandex) || (abstractC18041lYandex.mo1339native().pro() instanceof C8153l))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m3001public(StringBuilder sb, List list) {
        C17838l c17838l = this.yandex.pro;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[21];
        if (((Boolean) c17838l.yandex).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) it.next();
            Iterator it2 = AbstractC16901l.m4233package(1, interfaceC16902l.getUpperBounds()).iterator();
            while (it2.hasNext()) {
                arrayList.add(m2992for(interfaceC16902l.getName(), false) + " : " + m2996interface((AbstractC18041l) it2.next()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m3006synchronized("where"));
        sb.append(" ");
        AbstractC16901l.m4216else(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // defpackage.InterfaceC18162l
    public final void purchase(LinkedHashSet linkedHashSet) {
        this.yandex.purchase(linkedHashSet);
    }

    @Override // defpackage.InterfaceC18162l
    public final void remoteconfig() {
        this.yandex.remoteconfig();
    }

    public final String signatures(AbstractC0757l abstractC0757l) {
        C17838l c17838l = this.yandex.license;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[20];
        Function1 function1 = (Function1) c17838l.yandex;
        if (function1 != null) {
            return (String) function1.invoke(abstractC0757l);
        }
        if (abstractC0757l instanceof C14005l) {
            Iterable iterable = (Iterable) ((C14005l) abstractC0757l).yandex;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strSignatures = signatures((AbstractC0757l) it.next());
                if (strSignatures != null) {
                    arrayList.add(strSignatures);
                }
            }
            return AbstractC16901l.m4210case(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC0757l instanceof C18438l) {
            return AbstractC12024l.m3334new(pro((InterfaceC1910l) ((C18438l) abstractC0757l).yandex, null), "@");
        }
        if (!(abstractC0757l instanceof C16634l)) {
            return abstractC0757l.toString();
        }
        AbstractC8154l abstractC8154l = (AbstractC8154l) ((C16634l) abstractC0757l).yandex;
        if (abstractC8154l instanceof C4180l) {
            return ((C4180l) abstractC8154l).yandex + "::class";
        }
        if (!(abstractC8154l instanceof C12744l)) {
            C18725l.billing();
            return null;
        }
        C14700l c14700l = ((C12744l) abstractC8154l).yandex;
        String strSmaato = c14700l.yandex.yandex().yandex.yandex;
        int i = c14700l.loadAd;
        for (int i2 = 0; i2 < i; i2++) {
            strSmaato = AbstractC14814l.smaato('>', "kotlin.Array<", strSmaato);
        }
        return AbstractC12900l.firebase(strSmaato, "::class");
    }

    @Override // defpackage.InterfaceC18162l
    public final void smaato() {
        this.yandex.smaato();
    }

    public final Set startapp() {
        C17838l c17838l = this.yandex.purchase;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[3];
        return (Set) c17838l.yandex;
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final String m3002static(List list) throws IOException {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(metrica("<"));
        AbstractC16901l.m4216else(list, sb, ", ", null, null, new C14474l(this, 0), 60);
        sb.append(metrica(">"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final void m3003strictfp(InterfaceC0207l interfaceC0207l, StringBuilder sb) {
        String str;
        if (startapp().contains(EnumC1382l.MEMBER_KIND) && tapsense() && interfaceC0207l.mo367while() != 1) {
            sb.append("/*");
            int iMo367while = interfaceC0207l.mo367while();
            if (iMo367while == 1) {
                str = "DECLARATION";
            } else if (iMo367while == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iMo367while == 3) {
                str = "DELEGATION";
            } else {
                if (iMo367while != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(AbstractC15901l.isPro(str));
            sb.append("*/ ");
        }
    }

    @Override // defpackage.InterfaceC18162l
    public final void subs() {
        this.yandex.subs();
    }

    public final C0769l subscription() {
        C17838l c17838l = this.yandex.applovin;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[27];
        return (C0769l) c17838l.yandex;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m3004super(InterfaceC11764l interfaceC11764l, StringBuilder sb, boolean z) {
        if (z || !(interfaceC11764l instanceof C17538l)) {
            sb.append(m3006synchronized(interfaceC11764l.mo3250const() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m3005switch(StringBuilder sb, C0554l c0554l) {
        C0554l c0554l2 = (C0554l) c0554l.f1956l;
        InterfaceC10607l interfaceC10607l = (InterfaceC10607l) c0554l.f1958l;
        if (c0554l2 != null) {
            m3005switch(sb, c0554l2);
            sb.append('.');
            sb.append(m2992for(interfaceC10607l.getName(), false));
        } else {
            sb.append(m2988default(interfaceC10607l.metrica()));
        }
        sb.append(m3002static((List) c0554l.f1957l));
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final String m3006synchronized(String str) {
        int iOrdinal = ads().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                C18725l.billing();
                return null;
            }
            C17838l c17838l = this.yandex.f20167static;
            InterfaceC13922l interfaceC13922l = C9911l.f20154final[48];
            if (!((Boolean) c17838l.yandex).booleanValue()) {
                return AbstractC15560l.Signature("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final boolean tapsense() {
        C17838l c17838l = this.yandex.isPro;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[8];
        return ((Boolean) c17838l.yandex).booleanValue();
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m3007throw(InterfaceC8371l interfaceC8371l, StringBuilder sb, boolean z) {
        sb.append(m2992for(interfaceC8371l.getName(), z));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final String m3008throws(AbstractC18041l abstractC18041l, boolean z) {
        String strM2996interface = m2996interface(abstractC18041l);
        return ((!m2983finally(abstractC18041l) || AbstractC12008l.purchase(abstractC18041l)) && !(abstractC18041l instanceof C15110l) && (!z || abstractC18041l.getAnnotations().isEmpty())) ? strM2996interface : AbstractC14814l.smaato(')', "(", strM2996interface);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m3009volatile(InterfaceC5436l interfaceC5436l, StringBuilder sb) {
        m2990extends(sb, interfaceC5436l.vip(), "external");
        boolean z = false;
        m2990extends(sb, startapp().contains(EnumC1382l.EXPECT) && interfaceC5436l.mo750case(), "expect");
        if (startapp().contains(EnumC1382l.ACTUAL) && interfaceC5436l.mo754l()) {
            z = true;
        }
        m2990extends(sb, z, "actual");
    }

    @Override // defpackage.InterfaceC18162l
    public final void yandex() {
        this.yandex.yandex();
    }
}
