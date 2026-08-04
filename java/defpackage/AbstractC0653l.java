package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import org.xml.sax.Attributes;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lَؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0653l {
    public static StringBuilder Signature(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ String ad(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "FIT";
        }
        return "FILL";
    }

    public static String adcel(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static final void admob(int i, View view, ViewGroup viewGroup) {
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (C13734l.m3727volatile(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iInmobi == 1) {
            if (C13734l.m3727volatile(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (C13734l.m3727volatile(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iInmobi == 2) {
            if (C13734l.m3727volatile(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iInmobi != 3) {
            return;
        }
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static String ads(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ String advert(int i) {
        if (i == 1) {
            return "FUNCTION";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FIELD_IN_JAVA_CLASS";
        }
        return "PROPERTY";
    }

    public static void amazon(InterfaceC18742l interfaceC18742l, Function2 function2) {
        for (Map.Entry entry : interfaceC18742l.mopub()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static C14493l billing(InterfaceC17215l interfaceC17215l, byte[] bArr, int i) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        interfaceC17215l.startapp(bArr, 0, i, C8807l.crashlytics, new C4568l(7, c16971lMetrica));
        return new C14493l(c16971lMetrica.mopub());
    }

    public static void crashlytics(InterfaceC2435l interfaceC2435l) {
        interfaceC2435l.remoteconfig().mo1844l();
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC2435l.yandex()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_clear(ptr$cinterop_release);
        interfaceC2435l.crashlytics(interfaceC2435l.admob() + 1);
    }

    public static int firebase(int i, int i2, int i3) {
        return (AbstractC5020l.inmobi(i) + i2) * i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object isPro(C2836l c2836l, C16864l c16864l, AbstractC18643l abstractC18643l, AbstractC0283l abstractC0283l) {
        C18489l c18489l;
        String strAds;
        String string;
        Object objAmazon;
        if (abstractC0283l instanceof C18489l) {
            c18489l = (C18489l) abstractC0283l;
            int i = c18489l.f36111l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18489l.f36111l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18489l = new C18489l(c2836l, abstractC0283l);
            }
        } else {
            c18489l = new C18489l(c2836l, abstractC0283l);
        }
        Object obj = c18489l.f36110l;
        int i2 = c18489l.f36111l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C11155l c11155l = AbstractC3317l.yandex;
            boolean z = abstractC18643l instanceof AudioTrack;
            List list = C2580l.f5619l;
            if (z) {
                AudioTrack audioTrack = (AudioTrack) abstractC18643l;
                String str = audioTrack.amazon;
                List list2 = audioTrack.startapp;
                if (list2 != null) {
                    list = list2;
                }
                if (list.isEmpty()) {
                    strAds = audioTrack.yandex + ' ' + str;
                } else {
                    strAds = ((MainArtist) AbstractC16901l.m4231native(list)).crashlytics + ' ' + str;
                }
            } else if (abstractC18643l instanceof UmaTrack) {
                UmaTrack umaTrack = (UmaTrack) abstractC18643l;
                String str2 = umaTrack.loadAd;
                List list3 = umaTrack.admob;
                if (list3 != null) {
                    list = list3;
                }
                if (list.isEmpty()) {
                    strAds = umaTrack.crashlytics + ' ' + str2;
                } else {
                    strAds = ((UmaArtist) AbstractC16901l.m4231native(list)).loadAd + ' ' + str2;
                }
            } else {
                String strSmaato = abstractC18643l.getYandex();
                if (strSmaato.length() <= 0) {
                    strSmaato = null;
                }
                if (strSmaato != null) {
                    StringBuilder sbAdvert = AbstractC5020l.advert(strSmaato, " - ");
                    sbAdvert.append(abstractC18643l.getLoadAd());
                    strAds = sbAdvert.toString();
                } else {
                    strAds = abstractC18643l.getLoadAd();
                }
            }
            string = AbstractC12024l.m3330l(strAds).toString();
            c18489l.f36113l = c2836l;
            c18489l.f36112l = c16864l;
            c18489l.f36115l = abstractC18643l;
            c18489l.f36109l = string;
            c18489l.f36111l = 1;
            objAmazon = c2836l.amazon(c16864l, abstractC18643l, string, c18489l);
            if (objAmazon != enumC9342l) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(obj);
                return obj;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str3 = c18489l.f36109l;
        abstractC18643l = c18489l.f36115l;
        c16864l = c18489l.f36112l;
        C2836l c2836l2 = c18489l.f36113l;
        AbstractC2829l.crashlytics(obj);
        string = str3;
        c2836l = c2836l2;
        objAmazon = obj;
        InterfaceC0582l interfaceC0582l = (InterfaceC0582l) objAmazon;
        if (!(interfaceC0582l instanceof C6143l) && !(interfaceC0582l instanceof C16016l)) {
            objAmazon = null;
        }
        InterfaceC0582l interfaceC0582l2 = (InterfaceC0582l) objAmazon;
        if (interfaceC0582l2 != null) {
            return interfaceC0582l2;
        }
        String strReplaceAll = AbstractC3317l.loadAd.f22430l.matcher(AbstractC3317l.yandex.f22430l.matcher(string).replaceAll("")).replaceAll("");
        c18489l.f36113l = null;
        c18489l.f36112l = null;
        c18489l.f36115l = null;
        c18489l.f36109l = null;
        c18489l.f36111l = 2;
        Object objAmazon2 = c2836l.amazon(c16864l, abstractC18643l, strReplaceAll, c18489l);
        return objAmazon2 == enumC9342l ? enumC9342l : objAmazon2;
    }

    public static /* synthetic */ int isVip(String str) {
        if (str == null) {
            C6541l.subs("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        C8339l.metrica("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }

    public static void license(C18449l c18449l, long j) {
        c18449l.m4555synchronized().ads();
        c18449l.m4534abstract(j);
    }

    public static boolean loadAd(InterfaceC2435l interfaceC2435l, Collection collection, int i, Map map) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC2435l.Signature(it.next(), i, map)) {
                z = true;
            }
        }
        return z;
    }

    public static String metrica(C2336l c2336l, Class cls, StringBuilder sb) {
        sb.append(c2336l.loadAd(cls));
        return sb.toString();
    }

    public static boolean mopub(InterfaceC2435l interfaceC2435l, Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= interfaceC2435l.remove(it.next());
        }
        return zRemove;
    }

    public static InterfaceC17242l pro(C14632l c14632l, InterfaceC17242l interfaceC17242l, C8832l c8832l, InterfaceC9085l interfaceC9085l) {
        InterfaceC5575l.yandex.getClass();
        C9144l c9144l = AbstractC17863l.loadAd;
        c14632l.getClass();
        return AbstractC17541l.loadAd(interfaceC17242l, new C1950l(c8832l, interfaceC9085l.yandex(), c14632l, c9144l, 1));
    }

    public static boolean purchase(InterfaceC0042l interfaceC0042l) {
        return interfaceC0042l.purchase() == 2;
    }

    public static long remoteconfig(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static int smaato(Attributes attributes, int i) {
        return EnumC14410l.yandex(attributes.getLocalName(i)).ordinal();
    }

    public static String startapp(Class cls, String str) {
        return str + cls;
    }

    public static /* synthetic */ boolean subs(InterfaceC0389l interfaceC0389l) {
        return interfaceC0389l.crashlytics(null);
    }

    public static String subscription(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static String tapsense(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static String vip(int i, String str) {
        return str + i;
    }

    public static boolean yandex(InterfaceC2435l interfaceC2435l, Collection collection, int i, Map map) {
        interfaceC2435l.remoteconfig().mo1844l();
        boolean zSubscription = interfaceC2435l.subscription(collection, i, map);
        interfaceC2435l.crashlytics(interfaceC2435l.admob() + 1);
        return zSubscription;
    }
}
