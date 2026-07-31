package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۣٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9912l implements InterfaceC2165l, InterfaceC12684l, InterfaceC11893l, InterfaceC6642l, InterfaceC9762l, InterfaceC9765l, InterfaceC12202l, InterfaceC15244l, InterfaceC10377l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static C9912l f20177l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20182l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C9912l f20174l = new C9912l(16);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C9912l f20179l = new C9912l(17);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C9912l f20178l = new C9912l(19);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C9912l f20181l = new C9912l(20);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C9912l f20175l = new C9912l(21);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C9912l f20176l = new C9912l(22);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C9912l f20180l = new C9912l(23);

    public /* synthetic */ C9912l(int i) {
        this.f20182l = i;
    }

    public static AbstractC4946l admob(InterfaceC16902l interfaceC16902l, C9188l c9188l, AbstractC18041l abstractC18041l) {
        boolean z;
        if (!c9188l.crashlytics) {
            c9188l = c9188l.loadAd(1);
        }
        int iInmobi = AbstractC5020l.inmobi(c9188l.loadAd);
        if (iInmobi != 0 && iInmobi != 1) {
            if (iInmobi == 2) {
                return new C10636l(1, abstractC18041l);
            }
            C18725l.billing();
            return null;
        }
        int iMo2182l = interfaceC16902l.mo2182l();
        if (iMo2182l == 1) {
            z = true;
        } else if (iMo2182l != 2) {
            if (iMo2182l != 3) {
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return !abstractC18041l.mo1339native().getParameters().isEmpty() ? new C10636l(3, abstractC18041l) : AbstractC12008l.firebase(interfaceC16902l, c9188l);
        }
        return new C10636l(1, AbstractC3759l.purchase(interfaceC16902l).vip());
    }

    public static final int yandex(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 4) {
            return 4;
        }
        return i7 + 1;
    }

    @Override // defpackage.InterfaceC10377l
    public void adcel(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
    }

    @Override // defpackage.InterfaceC12684l
    public int billing(byte[] bArr) throws C10352l {
        switch (this.f20182l) {
            case 3:
                int length = bArr.length;
                int i = -1;
                int i2 = -1;
                while (true) {
                    length--;
                    if (length < 0) {
                        if (i >= 0) {
                            return bArr.length - i;
                        }
                        C11467l.remoteconfig("pad block corrupted");
                        return 0;
                    }
                    int i3 = bArr[length] & 255;
                    i ^= ((((i3 ^ 128) - 1) >> 31) & i2) & (length ^ i);
                    i2 &= (i3 - 1) >> 31;
                }
                break;
            default:
                byte b = bArr[bArr.length - 1];
                int i4 = b & 255;
                int length2 = bArr.length - i4;
                int i5 = ((i4 - 1) | length2) >> 31;
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    i5 |= (bArr[i6] ^ b) & (~((i6 - length2) >> 31));
                }
                if (i5 == 0) {
                    return i4;
                }
                C11467l.remoteconfig("pad block corrupted");
                return 0;
        }
    }

    @Override // defpackage.InterfaceC12684l
    public int crashlytics(int i, byte[] bArr) {
        switch (this.f20182l) {
            case 3:
                int length = bArr.length - i;
                bArr[i] = -128;
                while (true) {
                    i++;
                    if (i >= bArr.length) {
                        return length;
                    }
                    bArr[i] = 0;
                }
                break;
            default:
                byte length2 = (byte) (bArr.length - i);
                while (i < bArr.length) {
                    bArr[i] = length2;
                    i++;
                }
                return length2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    @Override // defpackage.InterfaceC6642l
    public boolean firebase(Object obj, Object obj2) {
        C1256l c1256l = (C1256l) obj;
        C1256l c1256l2 = (C1256l) obj2;
        if (c1256l == null || c1256l2 == null) {
            if ((c1256l == null) ^ (c1256l2 == null)) {
                return false;
            }
            return true;
        }
        if (c1256l.purchase == c1256l2.purchase && c1256l.billing == c1256l2.billing && c1256l.loadAd == c1256l2.loadAd && AbstractC8576l.yandex(c1256l.crashlytics, c1256l2.crashlytics) && C15519l.loadAd(c1256l.amazon, c1256l2.amazon)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC11893l
    public AbstractC4350l isPro(InterfaceC1388l interfaceC1388l, C3806l c3806l) {
        switch (this.f20182l) {
            case 5:
                break;
        }
        return mopub(((InterfaceC13937l) interfaceC1388l).mo1730private(), c3806l);
    }

    @Override // defpackage.InterfaceC2165l
    public Object loadAd(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01da  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0212  */
    /* JADX WARN: Code duplicated, block: B:109:0x0216  */
    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:117:0x0228  */
    /* JADX WARN: Code duplicated, block: B:118:0x022d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0258 A[LOOP:2: B:120:0x0252->B:122:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x027b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0281  */
    /* JADX WARN: Code duplicated, block: B:128:0x028a  */
    /* JADX WARN: Code duplicated, block: B:130:0x028d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0297 A[EDGE_INSN: B:132:0x0297->B:139:0x02b7 BREAK  A[LOOP:5: B:134:0x029d->B:203:?]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0299  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:165:0x0301  */
    /* JADX WARN: Code duplicated, block: B:169:0x0316  */
    /* JADX WARN: Code duplicated, block: B:171:0x031e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0322  */
    /* JADX WARN: Code duplicated, block: B:178:0x033f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[LOOP:5: B:134:0x029d->B:203:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0166  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [lؔۘؒ, lٍؘِ] */
    /* JADX WARN: Type inference failed for: r27v0, types: [lٍۣٜ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [lٍؑ, lًۤؑ, lٍؘِ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [lٌّؒ] */
    /* JADX WARN: Type inference failed for: r6v40 */
    public ArrayList metrica(C10038l c10038l, Collection collection) {
        InterfaceC3841l annotations;
        AbstractC18041l abstractC18041lYandex;
        C14708l c14708l;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        InterfaceC10696l interfaceC10696l;
        EnumC7061l enumC7061l;
        C16750l c16750l;
        InterfaceC8731l interfaceC8731l;
        ArrayList arrayList3;
        Iterator it;
        AbstractC18041l abstractC18041lSubs;
        boolean z2;
        C8195l c8195l;
        ArrayList arrayList4;
        int i;
        int i2;
        AbstractC18041l abstractC18041lYandex2;
        C7073l c7073lMo1479return;
        C7073l c7073lMo1479return2;
        boolean zCrashlytics;
        List listMo1007finally;
        Iterator it2;
        boolean z3;
        C16750l c16750l2;
        C10038l c10038lAdmob;
        List list;
        C11425l c11425l;
        C12844l c12844l = C12844l.f25253l;
        Collection<??> collection2 = collection;
        ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(collection2, 10));
        for (?? Mo1490l : collection2) {
            if (Mo1490l instanceof InterfaceC8731l) {
                boolean z4 = true;
                if (Mo1490l.mo367while() != 2 || Mo1490l.mo864l().license().size() != 1) {
                    InterfaceC15234l interfaceC15234lMopub = AbstractC13106l.mopub(Mo1490l);
                    int i3 = 0;
                    if (interfaceC15234lMopub == null) {
                        annotations = ((Cgoto) Mo1490l).getAnnotations();
                    } else {
                        C18174l c18174l = interfaceC15234lMopub instanceof C18174l ? (C18174l) interfaceC15234lMopub : null;
                        List list2 = c18174l != null ? (List) c18174l.f35600l.getValue() : null;
                        if (list2 == null || list2.isEmpty()) {
                            annotations = ((Cgoto) Mo1490l).getAnnotations();
                        } else {
                            ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList6.add(new C6727l(c10038l, (C8673l) it3.next(), true));
                            }
                            ArrayList arrayListM4238static = AbstractC16901l.m4238static(((Cgoto) Mo1490l).getAnnotations(), arrayList6);
                            annotations = arrayListM4238static.isEmpty() ? C2782l.f6058l : new C2172l(i3, arrayListM4238static);
                        }
                    }
                    C10038l c10038lAdmob2 = AbstractC14460l.admob(c10038l, annotations);
                    ?? r11 = (!(Mo1490l instanceof C4099l) || (c11425l = ((C13437l) Mo1490l).f26362l) == null || c11425l.f8330l) ? Mo1490l : c11425l;
                    C7073l c7073lMo1479return3 = Mo1490l.mo1479return();
                    EnumC7061l enumC7061l2 = EnumC7061l.VALUE_PARAMETER;
                    if (c7073lMo1479return3 != null) {
                        InterfaceC4884l interfaceC4884l = r11 instanceof InterfaceC4884l ? (InterfaceC4884l) r11 : null;
                        C17538l c17538l = interfaceC4884l != null ? (C17538l) interfaceC4884l.applovin(C12113l.f24088l) : null;
                        abstractC18041lYandex = vip((InterfaceC8731l) Mo1490l, c17538l, false, c17538l != null ? AbstractC14460l.admob(c10038lAdmob2, c17538l.getAnnotations()) : c10038lAdmob2, enumC7061l2, null, false, C12844l.f25276l);
                    } else {
                        abstractC18041lYandex = null;
                    }
                    C12113l c12113l = Mo1490l instanceof C12113l ? (C12113l) Mo1490l : null;
                    if (c12113l != null) {
                        InterfaceC17477l interfaceC17477l = (InterfaceC17477l) c12113l.Signature();
                        String strLoadAd = AbstractC17860l.loadAd(c12113l, 3);
                        String str = C4632l.yandex;
                        C3624l c3624lAdmob = C4632l.admob(AbstractC3759l.mopub(interfaceC17477l).yandex);
                        c14708l = (C14708l) AbstractC14490l.amazon.get(AbstractC11043l.admob('.', c3624lAdmob != null ? C8353l.purchase(c3624lAdmob) : C0516l.yandex(interfaceC17477l, C18450l.f36014l), strLoadAd));
                        if (c14708l != null) {
                            String str2 = c14708l.crashlytics;
                            if (str2 != null && !AbstractC16648l.isVip(str2, "2.", false)) {
                                C8339l.smaato("Check failed.");
                                return null;
                            }
                            if (str2 != null) {
                                c14708l = c14708l.amazon;
                            }
                        } else {
                            c14708l = null;
                        }
                    } else {
                        c14708l = null;
                    }
                    if (c14708l != null) {
                        c14708l.loadAd.size();
                        ((C12113l) Mo1490l).mo1007finally().size();
                    }
                    if (((C6238l) ((C7757l) c10038l.f20463l).license.f17795l).invoke(AbstractC4753l.yandex) == EnumC5244l.f11320l) {
                        if ((Mo1490l instanceof InterfaceC4884l) && AbstractC8576l.yandex(Mo1490l.applovin(C12113l.f24089l), Boolean.TRUE)) {
                            z = true;
                        }
                        List<C17538l> listMo1007finally2 = r11.mo1007finally();
                        arrayList = new ArrayList(AbstractC14055l.billing(listMo1007finally2, 10));
                        for (C17538l c17538l2 : listMo1007finally2) {
                            if (c14708l != null || (list = c14708l.loadAd) == null) {
                                c16750l2 = null;
                            } else {
                                c16750l2 = (C16750l) AbstractC16901l.m4220for(c17538l2.f34146l, list);
                            }
                            C17330l c17330l = new C17330l(9, c17538l2);
                            InterfaceC8731l interfaceC8731l2 = (InterfaceC8731l) Mo1490l;
                            if (c17538l2 != null) {
                                c10038lAdmob = AbstractC14460l.admob(c10038lAdmob2, c17538l2.getAnnotations());
                            } else {
                                c10038lAdmob = c10038lAdmob2;
                            }
                            ArrayList arrayList7 = arrayList;
                            arrayList7.add(vip(interfaceC8731l2, c17538l2, false, c10038lAdmob, enumC7061l2, c16750l2, z, c17330l));
                            arrayList = arrayList7;
                        }
                        arrayList2 = arrayList;
                        if (Mo1490l instanceof InterfaceC10696l) {
                            interfaceC10696l = (InterfaceC10696l) Mo1490l;
                        } else {
                            interfaceC10696l = null;
                        }
                        if (interfaceC10696l == null && AbstractC6710l.admob(interfaceC10696l)) {
                            enumC7061l = EnumC7061l.FIELD;
                        } else {
                            enumC7061l = EnumC7061l.METHOD_RETURN_TYPE;
                        }
                        EnumC7061l enumC7061l3 = enumC7061l;
                        if (c14708l != null) {
                            c16750l = c14708l.yandex;
                        } else {
                            c16750l = null;
                        }
                        interfaceC8731l = (InterfaceC8731l) Mo1490l;
                        C4619l c4619l = new C4619l((InterfaceC2853l) r11, true, c10038lAdmob2, enumC7061l3, false);
                        AbstractC18041l abstractC18041lSmaato = interfaceC8731l.smaato();
                        Collection collectionLicense = interfaceC8731l.license();
                        arrayList3 = new ArrayList(AbstractC14055l.billing(collectionLicense, 10));
                        it = collectionLicense.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((InterfaceC0207l) it.next()).smaato());
                        }
                        abstractC18041lSubs = subs(c4619l, abstractC18041lSmaato, arrayList3, c16750l, false);
                        if (AbstractC12008l.crashlytics(Mo1490l.smaato(), c12844l, null)) {
                            z2 = true;
                        } else {
                            c7073lMo1479return2 = Mo1490l.mo1479return();
                            if (c7073lMo1479return2 != null) {
                                zCrashlytics = AbstractC12008l.crashlytics(c7073lMo1479return2.yandex(), c12844l, null);
                            } else {
                                zCrashlytics = false;
                            }
                            if (zCrashlytics) {
                                z2 = true;
                            } else {
                                listMo1007finally = Mo1490l.mo1007finally();
                                if (listMo1007finally.isEmpty()) {
                                    z3 = false;
                                    break;
                                }
                                it2 = listMo1007finally.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    if (AbstractC12008l.crashlytics(((C17538l) it2.next()).yandex(), c12844l, null)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (z3) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                        }
                        if (z2) {
                            c8195l = new C8195l(AbstractC10547l.yandex, new C11065l());
                        } else {
                            c8195l = null;
                        }
                        if (abstractC18041lYandex == null || abstractC18041lSubs != null) {
                            if (abstractC18041lYandex == null) {
                                c7073lMo1479return = Mo1490l.mo1479return();
                                if (c7073lMo1479return != null) {
                                    abstractC18041lYandex = c7073lMo1479return.yandex();
                                } else {
                                    abstractC18041lYandex = null;
                                }
                            }
                            arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                            i = 0;
                            for (Object obj : arrayList2) {
                                i2 = i + 1;
                                if (i >= 0) {
                                    AbstractC14055l.subscription();
                                    throw null;
                                }
                                abstractC18041lYandex2 = (AbstractC18041l) obj;
                                if (abstractC18041lYandex2 == null) {
                                    abstractC18041lYandex2 = ((C17538l) Mo1490l.mo1007finally().get(i)).yandex();
                                }
                                arrayList4.add(abstractC18041lYandex2);
                                i = i2;
                            }
                            if (abstractC18041lSubs == null) {
                                abstractC18041lSubs = Mo1490l.smaato();
                            }
                            Mo1490l = interfaceC8731l.mo1490l(abstractC18041lYandex, arrayList4, abstractC18041lSubs, c8195l);
                        } else {
                            if (arrayList2.isEmpty()) {
                                z4 = false;
                                break;
                            }
                            Iterator it4 = arrayList2.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                            } while (!(((AbstractC18041l) it4.next()) != null));
                            if (z4 || c8195l != null) {
                                if (abstractC18041lYandex == null) {
                                    c7073lMo1479return = Mo1490l.mo1479return();
                                    if (c7073lMo1479return != null) {
                                        abstractC18041lYandex = c7073lMo1479return.yandex();
                                    } else {
                                        abstractC18041lYandex = null;
                                    }
                                }
                                arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                                i = 0;
                                while (r7.hasNext()) {
                                    i2 = i + 1;
                                    if (i >= 0) {
                                        AbstractC14055l.subscription();
                                        throw null;
                                    }
                                    abstractC18041lYandex2 = (AbstractC18041l) obj;
                                    if (abstractC18041lYandex2 == null) {
                                        abstractC18041lYandex2 = ((C17538l) Mo1490l.mo1007finally().get(i)).yandex();
                                    }
                                    arrayList4.add(abstractC18041lYandex2);
                                    i = i2;
                                }
                                if (abstractC18041lSubs == null) {
                                    abstractC18041lSubs = Mo1490l.smaato();
                                }
                                Mo1490l = interfaceC8731l.mo1490l(abstractC18041lYandex, arrayList4, abstractC18041lSubs, c8195l);
                            }
                        }
                    } else {
                        ((C7757l) c10038lAdmob2.f20463l).tapsense.getClass();
                    }
                    z = false;
                    List<C17538l> listMo1007finally3 = r11.mo1007finally();
                    arrayList = new ArrayList(AbstractC14055l.billing(listMo1007finally3, 10));
                    while (r12.hasNext()) {
                        if (c14708l != null) {
                            c16750l2 = null;
                        } else {
                            c16750l2 = null;
                        }
                        C17330l c17330l2 = new C17330l(9, c17538l2);
                        InterfaceC8731l interfaceC8731l3 = (InterfaceC8731l) Mo1490l;
                        if (c17538l2 != null) {
                            c10038lAdmob = AbstractC14460l.admob(c10038lAdmob2, c17538l2.getAnnotations());
                        } else {
                            c10038lAdmob = c10038lAdmob2;
                        }
                        ArrayList arrayList8 = arrayList;
                        arrayList8.add(vip(interfaceC8731l3, c17538l2, false, c10038lAdmob, enumC7061l2, c16750l2, z, c17330l2));
                        arrayList = arrayList8;
                    }
                    arrayList2 = arrayList;
                    if (Mo1490l instanceof InterfaceC10696l) {
                        interfaceC10696l = (InterfaceC10696l) Mo1490l;
                    } else {
                        interfaceC10696l = null;
                    }
                    if (interfaceC10696l == null) {
                        enumC7061l = EnumC7061l.METHOD_RETURN_TYPE;
                    } else {
                        enumC7061l = EnumC7061l.METHOD_RETURN_TYPE;
                    }
                    EnumC7061l enumC7061l4 = enumC7061l;
                    if (c14708l != null) {
                        c16750l = c14708l.yandex;
                    } else {
                        c16750l = null;
                    }
                    interfaceC8731l = (InterfaceC8731l) Mo1490l;
                    C4619l c4619l2 = new C4619l((InterfaceC2853l) r11, true, c10038lAdmob2, enumC7061l4, false);
                    AbstractC18041l abstractC18041lSmaato2 = interfaceC8731l.smaato();
                    Collection collectionLicense2 = interfaceC8731l.license();
                    arrayList3 = new ArrayList(AbstractC14055l.billing(collectionLicense2, 10));
                    it = collectionLicense2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((InterfaceC0207l) it.next()).smaato());
                    }
                    abstractC18041lSubs = subs(c4619l2, abstractC18041lSmaato2, arrayList3, c16750l, false);
                    if (AbstractC12008l.crashlytics(Mo1490l.smaato(), c12844l, null)) {
                        z2 = true;
                    } else {
                        c7073lMo1479return2 = Mo1490l.mo1479return();
                        if (c7073lMo1479return2 != null) {
                            zCrashlytics = AbstractC12008l.crashlytics(c7073lMo1479return2.yandex(), c12844l, null);
                        } else {
                            zCrashlytics = false;
                        }
                        if (zCrashlytics) {
                            listMo1007finally = Mo1490l.mo1007finally();
                            if (listMo1007finally.isEmpty()) {
                                z3 = false;
                                break;
                            }
                            it2 = listMo1007finally.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    z3 = false;
                                    break;
                                }
                                if (AbstractC12008l.crashlytics(((C17538l) it2.next()).yandex(), c12844l, null)) {
                                    z3 = true;
                                    break;
                                }
                            }
                            if (z3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        c8195l = new C8195l(AbstractC10547l.yandex, new C11065l());
                    } else {
                        c8195l = null;
                    }
                    if (abstractC18041lYandex == null) {
                        if (abstractC18041lYandex == null) {
                            c7073lMo1479return = Mo1490l.mo1479return();
                            if (c7073lMo1479return != null) {
                                abstractC18041lYandex = c7073lMo1479return.yandex();
                            } else {
                                abstractC18041lYandex = null;
                            }
                        }
                        arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                        i = 0;
                        while (r7.hasNext()) {
                            i2 = i + 1;
                            if (i >= 0) {
                                AbstractC14055l.subscription();
                                throw null;
                            }
                            abstractC18041lYandex2 = (AbstractC18041l) obj;
                            if (abstractC18041lYandex2 == null) {
                                abstractC18041lYandex2 = ((C17538l) Mo1490l.mo1007finally().get(i)).yandex();
                            }
                            arrayList4.add(abstractC18041lYandex2);
                            i = i2;
                        }
                        if (abstractC18041lSubs == null) {
                            abstractC18041lSubs = Mo1490l.smaato();
                        }
                        Mo1490l = interfaceC8731l.mo1490l(abstractC18041lYandex, arrayList4, abstractC18041lSubs, c8195l);
                    } else {
                        if (abstractC18041lYandex == null) {
                            c7073lMo1479return = Mo1490l.mo1479return();
                            if (c7073lMo1479return != null) {
                                abstractC18041lYandex = c7073lMo1479return.yandex();
                            } else {
                                abstractC18041lYandex = null;
                            }
                        }
                        arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                        i = 0;
                        while (r7.hasNext()) {
                            i2 = i + 1;
                            if (i >= 0) {
                                AbstractC14055l.subscription();
                                throw null;
                            }
                            abstractC18041lYandex2 = (AbstractC18041l) obj;
                            if (abstractC18041lYandex2 == null) {
                                abstractC18041lYandex2 = ((C17538l) Mo1490l.mo1007finally().get(i)).yandex();
                            }
                            arrayList4.add(abstractC18041lYandex2);
                            i = i2;
                        }
                        if (abstractC18041lSubs == null) {
                            abstractC18041lSubs = Mo1490l.smaato();
                        }
                        Mo1490l = interfaceC8731l.mo1490l(abstractC18041lYandex, arrayList4, abstractC18041lSubs, c8195l);
                    }
                }
            }
            arrayList5.add(Mo1490l);
        }
        return arrayList5;
    }

    public AbstractC4350l mopub(Class cls, C3806l c3806l) {
        switch (this.f20182l) {
            case 5:
                return new C8011l();
            default:
                return purchase(cls);
        }
    }

    public AbstractC4350l purchase(Class cls) {
        switch (this.f20182l) {
            case 5:
                return new C8011l();
            default:
                return AbstractC16655l.yandex(cls);
        }
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        synchronized (AbstractC2920l.class) {
            AbstractC2920l.billing(new C5187l());
        }
        return new C17334l(0);
    }

    @Override // defpackage.InterfaceC12684l
    public void smaato(SecureRandom secureRandom) {
        int i = this.f20182l;
    }

    @Override // defpackage.InterfaceC9762l
    public void startapp(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:110:0x0223  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:114:0x0240  */
    /* JADX WARN: Code duplicated, block: B:116:0x0246  */
    /* JADX WARN: Code duplicated, block: B:118:0x024d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0254  */
    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0264  */
    /* JADX WARN: Code duplicated, block: B:126:0x0276  */
    /* JADX WARN: Code duplicated, block: B:130:0x0288  */
    /* JADX WARN: Code duplicated, block: B:132:0x028c  */
    /* JADX WARN: Code duplicated, block: B:141:0x029e  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:148:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:171:0x0300  */
    /* JADX WARN: Code duplicated, block: B:172:0x0305  */
    /* JADX WARN: Code duplicated, block: B:180:0x0315  */
    /* JADX WARN: Code duplicated, block: B:187:0x032a  */
    /* JADX WARN: Code duplicated, block: B:190:0x032e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0333  */
    /* JADX WARN: Code duplicated, block: B:197:0x033e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x0340 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x0343  */
    /* JADX WARN: Code duplicated, block: B:203:0x034e  */
    /* JADX WARN: Code duplicated, block: B:205:0x0354  */
    /* JADX WARN: Code duplicated, block: B:208:0x0359  */
    /* JADX WARN: Code duplicated, block: B:209:0x0360  */
    /* JADX WARN: Code duplicated, block: B:211:0x0364  */
    /* JADX WARN: Code duplicated, block: B:212:0x036b  */
    /* JADX WARN: Code duplicated, block: B:214:0x036f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0374  */
    /* JADX WARN: Code duplicated, block: B:218:0x037a  */
    /* JADX WARN: Code duplicated, block: B:220:0x037e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0385  */
    /* JADX WARN: Code duplicated, block: B:257:0x0400  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0107  */
    /* JADX WARN: Code duplicated, block: B:410:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x01f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0110  */
    /* JADX WARN: Code duplicated, block: B:420:0x02a2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x014b  */
    /* JADX WARN: Code duplicated, block: B:61:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01af  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e1  */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC18041l subs(C4619l c4619l, AbstractC18041l abstractC18041l, List list, C16750l c16750l, boolean z) {
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        C2580l c2580l;
        Iterable iterableM4238static;
        InterfaceC16902l interfaceC16902lSignature;
        boolean z5;
        C12178l c12178l;
        Iterator it;
        C6639l c6639l;
        boolean zHasNext;
        Iterable iterable;
        EnumC5244l enumC5244l;
        InterfaceC2853l interfaceC2853l;
        EnumC10151l enumC10151l;
        EnumC10151l enumC10151l2;
        C12178l c12178l2;
        C3768l c3768l;
        Iterator it2;
        C6639l c6639l2;
        C10038l c10038l;
        EnumC10249l enumC10249l;
        C6639l c6639l3;
        C6639l c6639l4;
        C6639l c6639l5;
        EnumC10249l enumC10249l2;
        boolean z6;
        C6639l c6639lYandex;
        C9217l c9217l;
        EnumC10249l enumC10249l3;
        EnumC10151l enumC10151l3;
        boolean z7;
        boolean z8;
        Object obj;
        Object obj2;
        boolean z9;
        EnumC10249l enumC10249l4;
        Enum r4;
        C6639l c6639lStartapp;
        EnumC10249l enumC10249l5;
        C6639l c6639lYandex2;
        C6639l c6639lStartapp2;
        Object obj3;
        EnumC10151l enumC10151l4;
        boolean z10;
        boolean z11;
        Object next;
        C6639l c6639lBilling;
        Object objAdmob;
        EnumC5244l enumC5244lMopub;
        C6639l c6639lBilling2;
        EnumC10249l enumC10249l6;
        C6639l c6639lYandex3;
        EnumC10249l enumC10249l7;
        C6639l c6639l6;
        EnumC10249l enumC10249l8;
        boolean z12;
        Object obj4;
        C2312l c2312lMopub;
        EnumC10151l enumC10151l5;
        C6639l c6639l7;
        boolean z13;
        Iterable iterable2;
        InterfaceC3841l annotations;
        AbstractC15211l abstractC15211lMopub;
        InterfaceC1925l interfaceC1925lM3542import;
        AbstractC4317l abstractC4317lBilling;
        EnumC10249l enumC10249l9;
        InterfaceC2853l interfaceC2853l2;
        boolean z14;
        EnumC10151l enumC10151l6;
        Object c9217l2;
        InterfaceC13789l interfaceC13789l;
        EnumC10249l enumC10249lIsVip;
        Object obj5;
        boolean z15;
        C15110l c15110lPurchase;
        int iIsPro;
        InterfaceC2853l interfaceC2853l3 = (InterfaceC2853l) c4619l.f9373l;
        C10038l c10038l2 = (C10038l) c4619l.f9372l;
        boolean z16 = c4619l.f9370l;
        ArrayList arrayListM1568throw = c4619l.m1568throw(abstractC18041l);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(c4619l.m1568throw((InterfaceC13789l) it3.next()));
        }
        if (!z16 || list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z2 = false;
                break;
            }
            if (!((C5215l) ((C7757l) c10038l2.f20463l).Signature).yandex(abstractC18041l, (AbstractC18041l) ((InterfaceC13789l) it4.next()))) {
                z2 = true;
                break;
            }
        }
        int size = arrayListM1568throw.size();
        C9217l[] c9217lArr = new C9217l[size];
        int i = 0;
        while (i < size) {
            InterfaceC1220l interfaceC1220lCrashlytics = AbstractC9968l.crashlytics(3, new C14301l(c4619l, arrayListM1568throw, i, 2));
            C9217l c9217l3 = C9217l.billing;
            if (i <= 0 || !z2) {
                C1850l c1850l = (C1850l) arrayListM1568throw.get(i);
                C8622l c8622l = (C8622l) interfaceC1220lCrashlytics.getValue();
                InterfaceC13789l interfaceC13789l2 = c1850l.yandex;
                InterfaceC13199l interfaceC13199l = c1850l.crashlytics;
                z3 = z16;
                EnumC10151l enumC10151l7 = EnumC10151l.f20668l;
                EnumC10151l enumC10151l8 = EnumC10151l.f20669l;
                arrayList = arrayList2;
                EnumC10249l enumC10249l10 = EnumC10249l.f20873l;
                EnumC10249l enumC10249l11 = EnumC10249l.f20872l;
                EnumC10249l enumC10249l12 = EnumC10249l.f20871l;
                EnumC10249l enumC10249l13 = null;
                if (interfaceC13789l2 != null) {
                    if (interfaceC13199l == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c2580l = C2580l.f5619l;
                    if (interfaceC13789l2 != null) {
                        iterableM4238static = ((AbstractC18041l) interfaceC13789l2).getAnnotations();
                    } else {
                        iterableM4238static = c2580l;
                    }
                    if (interfaceC13789l2 == null) {
                        interfaceC16902lSignature = null;
                    } else {
                        abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l2);
                        if (abstractC15211lMopub == null && ((abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l2)) == null || (abstractC15211lMopub = AbstractC13095l.m3532case(abstractC4317lBilling)) == null)) {
                            abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l2);
                        }
                        interfaceC1925lM3542import = AbstractC13095l.m3542import(abstractC15211lMopub);
                        if (interfaceC1925lM3542import != null) {
                            interfaceC16902lSignature = AbstractC13095l.Signature(interfaceC1925lM3542import);
                        } else {
                            interfaceC16902lSignature = null;
                        }
                    }
                    if (((EnumC7061l) c4619l.f9374l) == EnumC7061l.TYPE_PARAMETER_BOUNDS) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        if (!z5) {
                            ((C7757l) c10038l2.f20463l).tapsense.getClass();
                        }
                        if (interfaceC2853l3 != null || (annotations = interfaceC2853l3.getAnnotations()) == null) {
                            iterable2 = c2580l;
                        } else {
                            iterable2 = annotations;
                        }
                        iterableM4238static = AbstractC16901l.m4238static(iterable2, iterableM4238static);
                    }
                    c12178l = ((C7757l) c10038l2.f20463l).adcel;
                    c12178l.getClass();
                    it = iterableM4238static.iterator();
                    c6639l = null;
                    while (true) {
                        zHasNext = it.hasNext();
                        iterable = iterableM4238static;
                        enumC5244l = EnumC5244l.f11322l;
                        if (zHasNext) {
                            interfaceC2853l = interfaceC2853l3;
                            enumC10151l = enumC10151l7;
                            enumC10151l2 = enumC10151l8;
                            break;
                        }
                        enumC10151l = enumC10151l7;
                        c2312lMopub = ((InterfaceC1910l) it.next()).mopub();
                        if (c2312lMopub == null) {
                            interfaceC2853l = interfaceC2853l3;
                            enumC10151l2 = enumC10151l8;
                        } else {
                            enumC10151l2 = enumC10151l8;
                            if (AbstractC6587l.vip.contains(c2312lMopub)) {
                                enumC10151l5 = enumC10151l2;
                            } else if (AbstractC6587l.metrica.contains(c2312lMopub)) {
                                enumC10151l5 = enumC10151l;
                            } else {
                                interfaceC2853l = interfaceC2853l3;
                            }
                            interfaceC2853l = interfaceC2853l3;
                            EnumC5244l enumC5244l2 = (EnumC5244l) ((C6238l) c12178l.yandex.f17795l).invoke(c2312lMopub);
                            enumC5244l2.getClass();
                            c6639l7 = (enumC5244l2 == enumC5244l || enumC5244l2.yandex()) ? null : new C6639l(enumC10151l5, enumC5244l2.yandex());
                            if (c6639l == null) {
                                c6639l = c6639l7;
                            } else {
                                boolean z17 = c6639l.loadAd;
                                if (c6639l7 != null && !c6639l7.equals(c6639l) && (!(z13 = c6639l7.loadAd) || z17)) {
                                    if (z13 || !z17) {
                                        c6639l = null;
                                        break;
                                    }
                                    c6639l = c6639l7;
                                }
                            }
                            enumC10151l8 = enumC10151l2;
                            iterableM4238static = iterable;
                            enumC10151l7 = enumC10151l;
                            interfaceC2853l3 = interfaceC2853l;
                        }
                        if (c6639l == null) {
                            c6639l = c6639l7;
                        } else {
                            boolean z18 = c6639l.loadAd;
                            if (c6639l7 != null) {
                                continue;
                            }
                        }
                        enumC10151l8 = enumC10151l2;
                        iterableM4238static = iterable;
                        enumC10151l7 = enumC10151l;
                        interfaceC2853l3 = interfaceC2853l;
                    }
                    c12178l2 = ((C7757l) c10038l2.f20463l).adcel;
                    c3768l = new C3768l(c4619l, c1850l, 0);
                    c12178l2.getClass();
                    it2 = iterable.iterator();
                    c6639l2 = null;
                    while (true) {
                        if (it2.hasNext()) {
                            c10038l = c10038l2;
                            enumC10249l = enumC10249l13;
                            c6639l3 = c6639l2;
                            break;
                        }
                        next = it2.next();
                        c10038l = c10038l2;
                        c6639lBilling = c12178l2.billing(next, ((Boolean) c3768l.invoke(next)).booleanValue());
                        if (c6639lBilling != null) {
                            enumC10249l7 = enumC10249l13;
                            obj4 = c6639lBilling;
                        } else {
                            objAdmob = c12178l2.admob(next);
                            if (objAdmob == null) {
                                c3768l = c3768l;
                            } else {
                                enumC5244lMopub = c12178l2.mopub(next);
                                if (enumC5244lMopub == null) {
                                    enumC5244lMopub = ((C13807l) c12178l2.yandex.f17792l).yandex;
                                }
                                if (enumC5244lMopub == enumC5244l) {
                                    EnumC10249l enumC10249l14 = enumC10249l13;
                                    enumC10249l7 = enumC10249l14;
                                    obj4 = enumC10249l14;
                                } else {
                                    c3768l = c3768l;
                                    c6639lBilling2 = c12178l2.billing(objAdmob, ((Boolean) c3768l.invoke(objAdmob)).booleanValue());
                                    if (c6639lBilling2 != null) {
                                        boolean zYandex = enumC5244lMopub.yandex();
                                        enumC10249l6 = enumC10249l13;
                                        c6639lYandex3 = C6639l.yandex(c6639lBilling2, enumC10249l6, zYandex, 1);
                                    }
                                }
                                if (c6639l2 == null) {
                                    c6639l6 = c6639lYandex3;
                                    enumC10249l8 = enumC10249l6;
                                    c6639l2 = c6639l6;
                                } else {
                                    c6639l6 = c6639lYandex3;
                                    enumC10249l8 = enumC10249l6;
                                    boolean z19 = c6639l2.loadAd;
                                    if (c6639l6 != 0 && !c6639l6.equals(c6639l2) && (!(z12 = c6639l6.loadAd) || z19)) {
                                        if (z12 || !z19) {
                                            c6639l3 = enumC10249l8;
                                            enumC10249l = enumC10249l8;
                                            break;
                                        }
                                        c6639l6 = c6639lYandex3;
                                        enumC10249l8 = enumC10249l6;
                                        c6639l2 = c6639l6;
                                    }
                                }
                                c3768l = c3768l;
                                c12178l2 = c12178l2;
                                c10038l2 = c10038l;
                                enumC10249l13 = enumC10249l8;
                                c6639l2 = c6639l2;
                            }
                            EnumC10249l enumC10249l15 = enumC10249l13;
                            c6639l6 = enumC10249l15;
                            enumC10249l8 = enumC10249l15;
                            if (c6639l2 == null) {
                                c6639l6 = c6639lYandex3;
                                enumC10249l8 = enumC10249l6;
                                c6639l2 = c6639l6;
                            } else {
                                c6639l6 = c6639lYandex3;
                                enumC10249l8 = enumC10249l6;
                                boolean z110 = c6639l2.loadAd;
                                if (c6639l6 != 0) {
                                    continue;
                                }
                            }
                            c3768l = c3768l;
                            c12178l2 = c12178l2;
                            c10038l2 = c10038l;
                            enumC10249l13 = enumC10249l8;
                            c6639l2 = c6639l2;
                        }
                        c6639l6 = obj4;
                        enumC10249l8 = enumC10249l7;
                        if (c6639l2 == null) {
                            c6639l6 = c6639lYandex3;
                            enumC10249l8 = enumC10249l6;
                            c6639l2 = c6639l6;
                        } else {
                            c6639l6 = c6639lYandex3;
                            enumC10249l8 = enumC10249l6;
                            boolean z111 = c6639l2.loadAd;
                            if (c6639l6 != 0) {
                                continue;
                            }
                        }
                        c3768l = c3768l;
                        c12178l2 = c12178l2;
                        c10038l2 = c10038l;
                        enumC10249l13 = enumC10249l8;
                        c6639l2 = c6639l2;
                    }
                    if (c6639l3 != 0) {
                        obj3 = c6639l3.yandex;
                        EnumC10249l enumC10249l16 = (EnumC10249l) obj3;
                        if (c6639l != null) {
                            enumC10151l4 = (EnumC10151l) c6639l.yandex;
                        } else {
                            enumC10151l4 = enumC10249l;
                        }
                        if (obj3 == enumC10249l12 || interfaceC16902lSignature == null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        boolean z20 = c6639l3.loadAd;
                        if (c6639l == null && c6639l.loadAd) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c9217l = new C9217l(enumC10249l16, enumC10151l4, z10, z20, z11);
                    } else {
                        if (interfaceC16902lSignature != null) {
                            c6639lStartapp2 = c4619l.startapp(interfaceC16902lSignature);
                        } else {
                            c6639l4 = enumC10249l;
                        }
                        if (c6639l4 != 0) {
                            c6639lYandex2 = C6639l.yandex(c6639l4, enumC10249l12, false, 2);
                        } else if (c8622l != null) {
                            c6639l5 = c8622l.yandex;
                        } else {
                            c6639l5 = enumC10249l;
                        }
                        if (c6639l4 != 0) {
                            enumC10249l5 = (EnumC10249l) c6639l4.yandex;
                        } else {
                            enumC10249l2 = enumC10249l;
                        }
                        if (enumC10249l2 == enumC10249l12 && (interfaceC16902lSignature == null || c8622l == null || !c8622l.crashlytics)) {
                            z6 = false;
                        } else {
                            c6639l4 = c6639lStartapp2;
                            c6639l5 = c6639lYandex2;
                            c6639l4 = c6639lStartapp2;
                            c6639l5 = c6639lYandex2;
                            enumC10249l2 = enumC10249l5;
                            z6 = true;
                        }
                        if (interfaceC13199l != null || (c6639lStartapp = c4619l.startapp(interfaceC13199l)) == null) {
                            c6639lYandex = enumC10249l;
                        } else if (c6639lStartapp.yandex == enumC10249l11) {
                            c6639lYandex = c6639lStartapp;
                            c6639lYandex = C6639l.yandex(c6639lStartapp, enumC10249l10, false, 2);
                        }
                        if (c6639lYandex != 0) {
                            obj = c6639lYandex.yandex;
                            if (c6639l5 == 0) {
                                c6639l5 = c6639lYandex;
                            } else {
                                obj2 = c6639l5.yandex;
                                boolean z21 = c6639l5.loadAd;
                                z9 = c6639lYandex.loadAd;
                                if (z9 || z21) {
                                    if (z9 && z21) {
                                        c6639l5 = c6639lYandex;
                                    } else {
                                        enumC10249l4 = (EnumC10249l) obj;
                                        r4 = (Enum) obj2;
                                        if (enumC10249l4.compareTo(r4) >= 0 && enumC10249l4.compareTo(r4) > 0) {
                                            c6639l5 = c6639lYandex;
                                        }
                                    }
                                }
                            }
                        }
                        if (c6639l5 != 0) {
                            enumC10249l3 = (EnumC10249l) c6639l5.yandex;
                        } else {
                            enumC10249l3 = enumC10249l;
                        }
                        if (c6639l != null) {
                            enumC10151l3 = (EnumC10151l) c6639l.yandex;
                        } else {
                            enumC10151l3 = enumC10249l;
                        }
                        if (c6639l5 != 0) {
                            z7 = true;
                            boolean z22 = c6639l5.loadAd;
                            if (c6639l == null && c6639l.loadAd == z7) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            c9217l = new C9217l(enumC10249l3, enumC10151l3, z6, z22, z8);
                        } else {
                            z7 = true;
                        }
                        if (c6639l == null) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        c9217l = new C9217l(enumC10249l3, enumC10151l3, z6, z22, z8);
                    }
                    c9217l3 = c9217l;
                    enumC10249l9 = enumC10249l;
                } else {
                    if (interfaceC13199l == null) {
                        iIsPro = 0;
                    } else {
                        if (!(interfaceC13199l instanceof InterfaceC16902l)) {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(interfaceC13199l);
                            sb.append(", ");
                            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13199l.getClass(), sb));
                            return null;
                        }
                        iIsPro = AbstractC17457l.isPro(((InterfaceC16902l) interfaceC13199l).mo2182l());
                    }
                    if (iIsPro == 1) {
                        interfaceC2853l = interfaceC2853l3;
                        c10038l = c10038l2;
                        enumC10151l = enumC10151l7;
                        enumC10151l2 = enumC10151l8;
                        enumC10249l9 = null;
                    } else {
                        if (interfaceC13199l == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c2580l = C2580l.f5619l;
                        if (interfaceC13789l2 != null) {
                            iterableM4238static = ((AbstractC18041l) interfaceC13789l2).getAnnotations();
                        } else {
                            iterableM4238static = c2580l;
                        }
                        if (interfaceC13789l2 == null) {
                            interfaceC16902lSignature = null;
                        } else {
                            abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l2);
                            if (abstractC15211lMopub == null) {
                                abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l2);
                            }
                            interfaceC1925lM3542import = AbstractC13095l.m3542import(abstractC15211lMopub);
                            if (interfaceC1925lM3542import != null) {
                                interfaceC16902lSignature = AbstractC13095l.Signature(interfaceC1925lM3542import);
                            } else {
                                interfaceC16902lSignature = null;
                            }
                        }
                        if (((EnumC7061l) c4619l.f9374l) == EnumC7061l.TYPE_PARAMETER_BOUNDS) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z4) {
                            if (!z5) {
                                ((C7757l) c10038l2.f20463l).tapsense.getClass();
                            }
                            if (interfaceC2853l3 != null) {
                                iterable2 = c2580l;
                            } else {
                                iterable2 = c2580l;
                            }
                            iterableM4238static = AbstractC16901l.m4238static(iterable2, iterableM4238static);
                        }
                        c12178l = ((C7757l) c10038l2.f20463l).adcel;
                        c12178l.getClass();
                        it = iterableM4238static.iterator();
                        c6639l = null;
                        while (true) {
                            zHasNext = it.hasNext();
                            iterable = iterableM4238static;
                            enumC5244l = EnumC5244l.f11322l;
                            if (zHasNext) {
                                interfaceC2853l = interfaceC2853l3;
                                enumC10151l = enumC10151l7;
                                enumC10151l2 = enumC10151l8;
                                break;
                            }
                            enumC10151l = enumC10151l7;
                            c2312lMopub = ((InterfaceC1910l) it.next()).mopub();
                            if (c2312lMopub == null) {
                                interfaceC2853l = interfaceC2853l3;
                                enumC10151l2 = enumC10151l8;
                            } else {
                                enumC10151l2 = enumC10151l8;
                                if (AbstractC6587l.vip.contains(c2312lMopub)) {
                                    enumC10151l5 = enumC10151l2;
                                } else if (AbstractC6587l.metrica.contains(c2312lMopub)) {
                                    enumC10151l5 = enumC10151l;
                                } else {
                                    interfaceC2853l = interfaceC2853l3;
                                }
                                interfaceC2853l = interfaceC2853l3;
                                EnumC5244l enumC5244l3 = (EnumC5244l) ((C6238l) c12178l.yandex.f17795l).invoke(c2312lMopub);
                                enumC5244l3.getClass();
                                if (enumC5244l3 == enumC5244l) {
                                }
                                if (c6639l == null) {
                                    c6639l = c6639l7;
                                } else {
                                    boolean z112 = c6639l.loadAd;
                                    if (c6639l7 != null) {
                                        continue;
                                    }
                                }
                                enumC10151l8 = enumC10151l2;
                                iterableM4238static = iterable;
                                enumC10151l7 = enumC10151l;
                                interfaceC2853l3 = interfaceC2853l;
                            }
                            if (c6639l == null) {
                                c6639l = c6639l7;
                            } else {
                                boolean z113 = c6639l.loadAd;
                                if (c6639l7 != null) {
                                    continue;
                                }
                            }
                            enumC10151l8 = enumC10151l2;
                            iterableM4238static = iterable;
                            enumC10151l7 = enumC10151l;
                            interfaceC2853l3 = interfaceC2853l;
                        }
                        c12178l2 = ((C7757l) c10038l2.f20463l).adcel;
                        c3768l = new C3768l(c4619l, c1850l, 0);
                        c12178l2.getClass();
                        it2 = iterable.iterator();
                        c6639l2 = null;
                        while (true) {
                            if (it2.hasNext()) {
                                c10038l = c10038l2;
                                enumC10249l = enumC10249l13;
                                c6639l3 = c6639l2;
                                break;
                            }
                            next = it2.next();
                            c10038l = c10038l2;
                            c6639lBilling = c12178l2.billing(next, ((Boolean) c3768l.invoke(next)).booleanValue());
                            if (c6639lBilling != null) {
                                enumC10249l7 = enumC10249l13;
                                obj4 = c6639lBilling;
                            } else {
                                objAdmob = c12178l2.admob(next);
                                if (objAdmob == null) {
                                    c3768l = c3768l;
                                } else {
                                    enumC5244lMopub = c12178l2.mopub(next);
                                    if (enumC5244lMopub == null) {
                                        enumC5244lMopub = ((C13807l) c12178l2.yandex.f17792l).yandex;
                                    }
                                    if (enumC5244lMopub == enumC5244l) {
                                        EnumC10249l enumC10249l17 = enumC10249l13;
                                        enumC10249l7 = enumC10249l17;
                                        obj4 = enumC10249l17;
                                    } else {
                                        c3768l = c3768l;
                                        c6639lBilling2 = c12178l2.billing(objAdmob, ((Boolean) c3768l.invoke(objAdmob)).booleanValue());
                                        if (c6639lBilling2 != null) {
                                            boolean zYandex2 = enumC5244lMopub.yandex();
                                            enumC10249l6 = enumC10249l13;
                                            c6639lYandex3 = C6639l.yandex(c6639lBilling2, enumC10249l6, zYandex2, 1);
                                        }
                                    }
                                    if (c6639l2 == null) {
                                        c6639l6 = c6639lYandex3;
                                        enumC10249l8 = enumC10249l6;
                                        c6639l2 = c6639l6;
                                    } else {
                                        c6639l6 = c6639lYandex3;
                                        enumC10249l8 = enumC10249l6;
                                        boolean z114 = c6639l2.loadAd;
                                        if (c6639l6 != 0) {
                                            continue;
                                        }
                                    }
                                    c3768l = c3768l;
                                    c12178l2 = c12178l2;
                                    c10038l2 = c10038l;
                                    enumC10249l13 = enumC10249l8;
                                    c6639l2 = c6639l2;
                                }
                                EnumC10249l enumC10249l18 = enumC10249l13;
                                c6639l6 = enumC10249l18;
                                enumC10249l8 = enumC10249l18;
                                if (c6639l2 == null) {
                                    c6639l6 = c6639lYandex3;
                                    enumC10249l8 = enumC10249l6;
                                    c6639l2 = c6639l6;
                                } else {
                                    c6639l6 = c6639lYandex3;
                                    enumC10249l8 = enumC10249l6;
                                    boolean z115 = c6639l2.loadAd;
                                    if (c6639l6 != 0) {
                                        continue;
                                    }
                                }
                                c3768l = c3768l;
                                c12178l2 = c12178l2;
                                c10038l2 = c10038l;
                                enumC10249l13 = enumC10249l8;
                                c6639l2 = c6639l2;
                            }
                            c6639l6 = obj4;
                            enumC10249l8 = enumC10249l7;
                            if (c6639l2 == null) {
                                c6639l6 = c6639lYandex3;
                                enumC10249l8 = enumC10249l6;
                                c6639l2 = c6639l6;
                            } else {
                                c6639l6 = c6639lYandex3;
                                enumC10249l8 = enumC10249l6;
                                boolean z116 = c6639l2.loadAd;
                                if (c6639l6 != 0) {
                                    continue;
                                }
                            }
                            c3768l = c3768l;
                            c12178l2 = c12178l2;
                            c10038l2 = c10038l;
                            enumC10249l13 = enumC10249l8;
                            c6639l2 = c6639l2;
                        }
                        if (c6639l3 != 0) {
                            obj3 = c6639l3.yandex;
                            EnumC10249l enumC10249l19 = (EnumC10249l) obj3;
                            if (c6639l != null) {
                                enumC10151l4 = (EnumC10151l) c6639l.yandex;
                            } else {
                                enumC10151l4 = enumC10249l;
                            }
                            if (obj3 == enumC10249l12) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean z23 = c6639l3.loadAd;
                            if (c6639l == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                            }
                            c9217l = new C9217l(enumC10249l19, enumC10151l4, z10, z23, z11);
                        } else {
                            if (interfaceC16902lSignature != null) {
                                c6639lStartapp2 = c4619l.startapp(interfaceC16902lSignature);
                            } else {
                                c6639l4 = enumC10249l;
                            }
                            if (c6639l4 != 0) {
                                c6639lYandex2 = C6639l.yandex(c6639l4, enumC10249l12, false, 2);
                            } else if (c8622l != null) {
                                c6639l5 = c8622l.yandex;
                            } else {
                                c6639l5 = enumC10249l;
                            }
                            if (c6639l4 != 0) {
                                enumC10249l5 = (EnumC10249l) c6639l4.yandex;
                            } else {
                                enumC10249l2 = enumC10249l;
                            }
                            if (enumC10249l2 == enumC10249l12) {
                                c6639l4 = c6639lStartapp2;
                                c6639l5 = c6639lYandex2;
                                c6639l4 = c6639lStartapp2;
                                c6639l5 = c6639lYandex2;
                                enumC10249l2 = enumC10249l5;
                                z6 = true;
                            } else {
                                c6639l4 = c6639lStartapp2;
                                c6639l5 = c6639lYandex2;
                                c6639l4 = c6639lStartapp2;
                                c6639l5 = c6639lYandex2;
                                enumC10249l2 = enumC10249l5;
                                z6 = true;
                            }
                            if (interfaceC13199l != null) {
                                c6639lYandex = enumC10249l;
                            } else {
                                c6639lYandex = enumC10249l;
                            }
                            if (c6639lYandex != 0) {
                                obj = c6639lYandex.yandex;
                                if (c6639l5 == 0) {
                                    c6639l5 = c6639lYandex;
                                } else {
                                    obj2 = c6639l5.yandex;
                                    boolean z24 = c6639l5.loadAd;
                                    z9 = c6639lYandex.loadAd;
                                    if (z9) {
                                        if (z9) {
                                            enumC10249l4 = (EnumC10249l) obj;
                                            r4 = (Enum) obj2;
                                            if (enumC10249l4.compareTo(r4) >= 0) {
                                                c6639l5 = c6639lYandex;
                                            }
                                        } else {
                                            enumC10249l4 = (EnumC10249l) obj;
                                            r4 = (Enum) obj2;
                                            if (enumC10249l4.compareTo(r4) >= 0) {
                                                c6639l5 = c6639lYandex;
                                            }
                                        }
                                    } else if (z9) {
                                        enumC10249l4 = (EnumC10249l) obj;
                                        r4 = (Enum) obj2;
                                        if (enumC10249l4.compareTo(r4) >= 0) {
                                            c6639l5 = c6639lYandex;
                                        }
                                    } else {
                                        enumC10249l4 = (EnumC10249l) obj;
                                        r4 = (Enum) obj2;
                                        if (enumC10249l4.compareTo(r4) >= 0) {
                                            c6639l5 = c6639lYandex;
                                        }
                                    }
                                }
                            }
                            if (c6639l5 != 0) {
                                enumC10249l3 = (EnumC10249l) c6639l5.yandex;
                            } else {
                                enumC10249l3 = enumC10249l;
                            }
                            if (c6639l != null) {
                                enumC10151l3 = (EnumC10151l) c6639l.yandex;
                            } else {
                                enumC10151l3 = enumC10249l;
                            }
                            if (c6639l5 != 0) {
                                z7 = true;
                                if (c6639l5.loadAd) {
                                }
                                if (c6639l == null) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                c9217l = new C9217l(enumC10249l3, enumC10151l3, z6, z22, z8);
                            } else {
                                z7 = true;
                            }
                            if (c6639l == null) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            c9217l = new C9217l(enumC10249l3, enumC10151l3, z6, z22, z8);
                        }
                        c9217l3 = c9217l;
                        enumC10249l9 = enumC10249l;
                    }
                }
                boolean z25 = c9217l3.amazon;
                ArrayList<C9217l> arrayList3 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    C1850l c1850l2 = (C1850l) AbstractC16901l.m4220for(i, (List) it5.next());
                    if (c1850l2 == null || (interfaceC13789l = c1850l2.yandex) == null) {
                        c9217l2 = enumC10249l9;
                    } else {
                        EnumC10249l enumC10249lIsVip2 = C4619l.isVip(interfaceC13789l);
                        if (enumC10249lIsVip2 == null) {
                            AbstractC18041l abstractC18041lAmazon = AbstractC5170l.amazon((AbstractC18041l) interfaceC13789l);
                            enumC10249lIsVip = abstractC18041lAmazon != null ? C4619l.isVip(abstractC18041lAmazon) : enumC10249l9;
                        } else {
                            enumC10249lIsVip = enumC10249lIsVip2;
                        }
                        EnumC10151l enumC10151lAdvert = C4619l.advert(interfaceC13789l);
                        EnumC10151l enumC10151lAdvert2 = C4619l.advert(interfaceC13789l);
                        Object objAdvert = enumC10151lAdvert2;
                        if (enumC10151lAdvert2 == null) {
                            AbstractC18041l abstractC18041lAmazon2 = AbstractC5170l.amazon((AbstractC18041l) interfaceC13789l);
                            objAdvert = abstractC18041lAmazon2 != null ? C4619l.advert(abstractC18041lAmazon2) : enumC10249l9;
                        }
                        AbstractC15211l abstractC15211lMopub2 = AbstractC13095l.mopub(interfaceC13789l);
                        if (abstractC15211lMopub2 != null) {
                            c15110lPurchase = AbstractC13095l.purchase(abstractC15211lMopub2);
                        } else {
                            obj5 = enumC10249l9;
                        }
                        if (obj5 != null) {
                            obj5 = c15110lPurchase;
                            obj5 = c15110lPurchase;
                            obj5 = c15110lPurchase;
                            z15 = true;
                        } else {
                            obj5 = c15110lPurchase;
                            if (((AbstractC18041l) interfaceC13789l).mo3847class() instanceof C7530l) {
                                obj5 = c15110lPurchase;
                                obj5 = c15110lPurchase;
                                obj5 = c15110lPurchase;
                                z15 = true;
                            } else {
                                obj5 = c15110lPurchase;
                                z15 = false;
                            }
                        }
                        c9217l2 = new C9217l(enumC10249lIsVip, enumC10151lAdvert, z15, enumC10249lIsVip != enumC10249lIsVip2, objAdvert != enumC10151lAdvert);
                    }
                    if (c9217l2 != null) {
                        arrayList3.add(c9217l2);
                    }
                }
                boolean z26 = i == 0 && z3;
                interfaceC2853l2 = interfaceC2853l;
                boolean z27 = i == 0 && (interfaceC2853l2 instanceof C17538l) && ((C17538l) interfaceC2853l2).f34151l != null;
                EnumC10151l enumC10151l9 = c9217l3.loadAd;
                EnumC10249l enumC10249l20 = c9217l3.yandex;
                ArrayList arrayList4 = new ArrayList();
                for (C9217l c9217l4 : arrayList3) {
                    ArrayList arrayList5 = arrayList3;
                    EnumC10249l enumC10249l21 = c9217l4.amazon ? null : c9217l4.yandex;
                    if (enumC10249l21 != null) {
                        arrayList4.add(enumC10249l21);
                    }
                    arrayList3 = arrayList5;
                }
                ArrayList<C9217l> arrayList6 = arrayList3;
                Set setM4229l = AbstractC16901l.m4229l(arrayList4);
                EnumC10249l enumC10249l22 = z25 ? null : enumC10249l20;
                EnumC10249l enumC10249l23 = enumC10249l22 == enumC10249l10 ? enumC10249l10 : (EnumC10249l) AbstractC8441l.crashlytics(setM4229l, enumC10249l12, enumC10249l11, enumC10249l22, z26);
                if (enumC10249l23 == null) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it6 = arrayList6.iterator();
                    while (it6.hasNext()) {
                        EnumC10249l enumC10249l24 = ((C9217l) it6.next()).yandex;
                        if (enumC10249l24 != null) {
                            arrayList7.add(enumC10249l24);
                        }
                    }
                    Set setM4229l2 = AbstractC16901l.m4229l(arrayList7);
                    if (enumC10249l20 != enumC10249l10) {
                        enumC10249l10 = (EnumC10249l) AbstractC8441l.crashlytics(setM4229l2, enumC10249l12, enumC10249l11, enumC10249l20, z26);
                    }
                } else {
                    enumC10249l10 = enumC10249l23;
                }
                if (enumC10249l10 == null || z || (z27 && enumC10249l10 == enumC10249l11)) {
                    enumC10249l10 = null;
                }
                boolean z28 = enumC10249l10 != null && enumC10249l23 == null;
                if (enumC10249l10 != enumC10249l12) {
                    z14 = false;
                } else {
                    if (!(z25 == z28 && c9217l3.crashlytics)) {
                        if (!arrayList6.isEmpty()) {
                            Iterator it7 = arrayList6.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    C9217l c9217l5 = (C9217l) it7.next();
                                    if (c9217l5.amazon == z28 && c9217l5.crashlytics) {
                                    }
                                }
                            }
                        }
                        z14 = false;
                    }
                    z14 = true;
                }
                ArrayList arrayList8 = new ArrayList();
                for (C9217l c9217l6 : arrayList6) {
                    EnumC10151l enumC10151l10 = c9217l6.purchase ? null : c9217l6.loadAd;
                    if (enumC10151l10 != null) {
                        arrayList8.add(enumC10151l10);
                    }
                }
                EnumC10151l enumC10151l11 = enumC10151l2;
                EnumC10151l enumC10151l12 = enumC10151l;
                EnumC10151l enumC10151l13 = (EnumC10151l) AbstractC8441l.crashlytics(AbstractC16901l.m4229l(arrayList8), enumC10151l12, enumC10151l11, c9217l3.purchase ? null : enumC10151l9, z26);
                if (enumC10151l13 == null) {
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        EnumC10151l enumC10151l14 = ((C9217l) it8.next()).loadAd;
                        if (enumC10151l14 != null) {
                            arrayList9.add(enumC10151l14);
                        }
                    }
                    enumC10151l6 = (EnumC10151l) AbstractC8441l.crashlytics(AbstractC16901l.m4229l(arrayList9), enumC10151l12, enumC10151l11, enumC10151l9, z26);
                } else {
                    enumC10151l6 = enumC10151l13;
                }
                c9217l3 = new C9217l(enumC10249l10, enumC10151l6, z14, z28, enumC10151l6 != null && enumC10151l13 == null);
            } else {
                c10038l = c10038l2;
                z3 = z16;
                arrayList = arrayList2;
                c9217lArr = c9217lArr;
                interfaceC2853l2 = interfaceC2853l3;
            }
            c9217lArr[i] = c9217l3;
            i++;
            interfaceC2853l3 = interfaceC2853l2;
            z16 = z3;
            arrayListM1568throw = arrayListM1568throw;
            arrayList2 = arrayList;
            z2 = z2;
            size = size;
            c9217lArr = c9217lArr;
            c10038l2 = c10038l;
        }
        return (AbstractC18041l) C16222l.admob(abstractC18041l.mo3847class(), new C3768l(c16750l, c9217lArr, 1), 0, c4619l.f9369l).f28907l;
    }

    public AbstractC18041l vip(InterfaceC8731l interfaceC8731l, InterfaceC11661l interfaceC11661l, boolean z, C10038l c10038l, EnumC7061l enumC7061l, C16750l c16750l, boolean z2, Function1 function1) {
        C4619l c4619l = new C4619l((InterfaceC2853l) interfaceC11661l, z, c10038l, enumC7061l, false);
        AbstractC18041l abstractC18041l = (AbstractC18041l) function1.invoke(interfaceC8731l);
        Collection collectionLicense = interfaceC8731l.license();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collectionLicense, 10));
        Iterator it = collectionLicense.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC18041l) function1.invoke((InterfaceC0207l) it.next()));
        }
        return subs(c4619l, abstractC18041l, arrayList, c16750l, z2);
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f20182l) {
            case 16:
                return new Boolean(((Boolean) C16737l.yandex.get()).booleanValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.upload.url", 78, "https://app-measurement.com/a").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            default:
                List list2 = AbstractC5981l.yandex;
                C2156l.f4791l.get();
                return (Boolean) C18242l.yandex.yandex("measurement.rb.attribution.client2", true, 1).get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(6L, 76, "measurement.upload.retry_count").get()).longValue());
            case 20:
                List list4 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(500L, 19, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case 21:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (String) C4515l.yandex.mopub("measurement.rb.attribution.query_parameters_to_remove", 59, "").get();
            case 22:
                List list6 = AbstractC5981l.yandex;
                return (Boolean) C13001l.yandex.get();
        }
    }

    public /* synthetic */ C9912l(int i, Object obj) {
        this.f20182l = i;
    }

    private final void ads(SecureRandom secureRandom) {
    }

    private final void subscription(SecureRandom secureRandom) {
    }
}
