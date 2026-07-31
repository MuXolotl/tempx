package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؘؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5406l {
    public static final C5406l yandex = new C5406l();

    /* JADX WARN: Code duplicated, block: B:69:0x0127 A[LOOP:0: B:67:0x0121->B:69:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0179  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object crashlytics(C2427l c2427l, AbstractC0283l abstractC0283l) {
        C3987l c3987l;
        C7108l c7108l;
        Throwable th;
        Object c18435l;
        C12759l c12759l;
        int i;
        ArrayList arrayList;
        int i2;
        C2427l c2427l2 = c2427l;
        if (abstractC0283l instanceof C3987l) {
            c3987l = (C3987l) abstractC0283l;
            int i3 = c3987l.f8190l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3987l.f8190l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3987l = new C3987l(this, abstractC0283l);
            }
        } else {
            c3987l = new C3987l(this, abstractC0283l);
        }
        C3987l c3987l2 = c3987l;
        Object objPurchase = c3987l2.f8189l;
        int i4 = c3987l2.f8190l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objPurchase);
            C11470l c11470l = c2427l2.billing;
            Bundle bundle = c11470l.crashlytics;
            if (bundle != null) {
                bundle.getString("");
            }
            ArrayList arrayList2 = AbstractC18569l.yandex;
            Bundle bundle2 = c11470l.crashlytics;
            String string = bundle2 != null ? bundle2.getString("bruhcollective.itaysonlab.vkx.auto.TRACK_SOURCE_CTX", "") : null;
            if (string == null) {
                string = "";
            }
            Bundle bundle3 = c11470l.crashlytics;
            String string2 = bundle3 != null ? bundle3.getString("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", "") : null;
            c7108l = new C7108l(string, string2 != null ? string2 : "");
            try {
                C17539l c17539l = C17539l.yandex;
                String str = c2427l2.yandex;
                C13305l c13305l = new C13305l(str != null ? new C11392l(str) : C4618l.yandex, 0L, null, false, false, false, 126);
                c3987l2.f8192l = c2427l2;
                c3987l2.f8191l = c7108l;
                c3987l2.f8194l = null;
                c3987l2.f8188l = 0;
                c3987l2.f8190l = 1;
                objPurchase = c17539l.purchase(c7108l, c13305l, c3987l2);
                if (objPurchase == enumC9342l) {
                }
            } catch (Throwable th2) {
                th = th2;
                c18435l = new C18435l(th);
            }
            return enumC9342l;
        }
        if (i4 == 1) {
            C7108l c7108l2 = c3987l2.f8191l;
            C2427l c2427l3 = c3987l2.f8192l;
            try {
                AbstractC2829l.crashlytics(objPurchase);
                c7108l = c7108l2;
                c2427l2 = c2427l3;
            } catch (Throwable th3) {
                th = th3;
                c7108l = c7108l2;
                c2427l2 = c2427l3;
                c18435l = new C18435l(th);
            }
        } else {
            if (i4 == 2) {
                i = c3987l2.f8188l;
                c12759l = c3987l2.f8194l;
                AbstractC2829l.crashlytics(objPurchase);
                List<String> list = c12759l.loadAd;
                arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                for (String str2 : list) {
                    C0935l c0935l = new C0935l();
                    C9258l c9258l = AbstractC1186l.f3181l;
                    C13708l c13708l = C13708l.f26763l;
                    List list2 = Collections.EMPTY_LIST;
                    C13708l c13708l2 = C13708l.f26763l;
                    C2410l c2410l = new C2410l();
                    C11470l c11470l2 = C11470l.amazon;
                    str2.getClass();
                    arrayList.add(new C2427l(str2, new C9202l(c0935l), null, new C7828l(c2410l), C3852l.f7980private, c11470l2));
                }
                Function1 c10351l = new C10351l(26);
                c3987l2.f8192l = null;
                c3987l2.f8191l = null;
                c3987l2.f8194l = null;
                c3987l2.f8188l = i;
                c3987l2.f8190l = 3;
                objPurchase = yandex(arrayList, c10351l);
                if (objPurchase != enumC9342l) {
                    i2 = i;
                }
                return enumC9342l;
            }
            if (i4 != 3) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = c3987l2.f8188l;
            AbstractC2829l.crashlytics(objPurchase);
        }
        return new C9896l(i2, 0L, (List) objPurchase);
        c18435l = (C12759l) objPurchase;
        C7108l c7108l3 = c7108l;
        if (C1171l.yandex(c18435l) != null) {
            return new C9896l(0, 0L, C2580l.f5619l);
        }
        C12759l c12759l2 = (C12759l) c18435l;
        int iIndexOf = c12759l2.loadAd.indexOf(c2427l2.yandex);
        int i5 = iIndexOf < 0 ? 0 : iIndexOf;
        ArrayList arrayList3 = AbstractC18569l.yandex;
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        AbstractC18643l abstractC18643l = (AbstractC18643l) c12759l2.yandex.get(c2427l2.yandex);
        c3987l2.f8192l = null;
        c3987l2.f8191l = null;
        c3987l2.f8194l = c12759l2;
        c3987l2.f8188l = i5;
        c3987l2.f8190l = 2;
        if (c16076l.metrica(c7108l3, c12759l2, i5, abstractC18643l, c3987l2) != enumC9342l) {
            c12759l = c12759l2;
            i = i5;
            List<String> list3 = c12759l.loadAd;
            arrayList = new ArrayList(AbstractC14055l.billing(list3, 10));
            while (r0.hasNext()) {
                C0935l c0935l2 = new C0935l();
                C9258l c9258l2 = AbstractC1186l.f3181l;
                C13708l c13708l3 = C13708l.f26763l;
                List list4 = Collections.EMPTY_LIST;
                C13708l c13708l4 = C13708l.f26763l;
                C2410l c2410l2 = new C2410l();
                C11470l c11470l3 = C11470l.amazon;
                str2.getClass();
                arrayList.add(new C2427l(str2, new C9202l(c0935l2), null, new C7828l(c2410l2), C3852l.f7980private, c11470l3));
            }
            Function1 c10351l2 = new C10351l(26);
            c3987l2.f8192l = null;
            c3987l2.f8191l = null;
            c3987l2.f8194l = null;
            c3987l2.f8188l = i;
            c3987l2.f8190l = 3;
            objPurchase = yandex(arrayList, c10351l2);
            if (objPurchase != enumC9342l) {
                i2 = i;
                return new C9896l(i2, 0L, (List) objPurchase);
            }
        }
        return enumC9342l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0210  */
    /* JADX WARN: Code duplicated, block: B:79:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x0170  */
    /* JADX WARN: Code duplicated, block: B:88:0x017a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x019c  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b6 A[LOOP:0: B:94:0x01b0->B:96:0x01b6, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0203, code lost:
    
        if (r2 == r15) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [lؘؓۨ] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v1 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(defpackage.C2427l r26, defpackage.AbstractC0283l r27) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5406l.loadAd(lؔؗ۟, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    public final ArrayList yandex(List list, Function1 function1) {
        C10019l c10019lAdcel;
        String str;
        Uri uriBuild;
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10507l c10507l = (C10507l) function1.invoke(((C2427l) it.next()).yandex);
            C2427l c2427lLoadAd = null;
            c2427lLoadAd = null;
            if (c10507l != null) {
                AbstractC18643l abstractC18643l = c10507l.loadAd;
                if (abstractC18643l instanceof AudioTrack) {
                    String strMopub = AbstractC16676l.mopub((AudioTrack) abstractC18643l);
                    C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                    CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{strMopub}, 1))) : null;
                    if (cachedTrack == null || !cachedTrack.appmetrica()) {
                        c10019lAdcel = abstractC18643l.adcel();
                        str = c10019lAdcel.crashlytics;
                        if (str == null) {
                            C18659l c18659l = C18659l.yandex;
                            uriBuild = new Uri.Builder().scheme("vkx").appendPath(c10019lAdcel.yandex).appendPath(c10019lAdcel.loadAd).build();
                        } else {
                            str2 = str.length() > 0 ? str : null;
                            if (str2 != null || (uriBuild = Uri.parse(str2)) == null) {
                                C18659l c18659l2 = C18659l.yandex;
                                uriBuild = new Uri.Builder().scheme("vkx").appendPath(c10019lAdcel.yandex).appendPath(c10019lAdcel.loadAd).build();
                            }
                        }
                        c2427lLoadAd = AbstractC2133l.loadAd(c10507l, uriBuild, abstractC18643l.tapsense());
                    } else {
                        String strPremium = cachedTrack.premium();
                        if (strPremium != null) {
                            c2427lLoadAd = AbstractC2133l.loadAd(c10507l, Uri.fromFile(AbstractC0825l.subs(cachedTrack.inmobi() ? 3 : 1, strPremium).toFile()), cachedTrack.inmobi() ? "audio/mpeg" : "application/x-mpegURL");
                        }
                    }
                } else {
                    c10019lAdcel = abstractC18643l.adcel();
                    str = c10019lAdcel.crashlytics;
                    if (str == null) {
                        C18659l c18659l3 = C18659l.yandex;
                        uriBuild = new Uri.Builder().scheme("vkx").appendPath(c10019lAdcel.yandex).appendPath(c10019lAdcel.loadAd).build();
                    } else {
                        if (str.length() > 0) {
                        }
                        if (str2 != null) {
                            C18659l c18659l4 = C18659l.yandex;
                            uriBuild = new Uri.Builder().scheme("vkx").appendPath(c10019lAdcel.yandex).appendPath(c10019lAdcel.loadAd).build();
                        } else {
                            C18659l c18659l5 = C18659l.yandex;
                            uriBuild = new Uri.Builder().scheme("vkx").appendPath(c10019lAdcel.yandex).appendPath(c10019lAdcel.loadAd).build();
                        }
                    }
                    c2427lLoadAd = AbstractC2133l.loadAd(c10507l, uriBuild, abstractC18643l.tapsense());
                }
            }
            if (c2427lLoadAd != null) {
                arrayList.add(c2427lLoadAd);
            }
        }
        return arrayList;
    }
}
