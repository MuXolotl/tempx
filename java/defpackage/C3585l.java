package defpackage;

import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realm_timestamp_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٟؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C3585l implements InterfaceC16451l, InterfaceC8115l, InterfaceC9746l, InterfaceC17172l, InterfaceC17443l, InterfaceC7456l, InterfaceC1666l, InterfaceC17020l, InterfaceC3538l, InterfaceC6848l, InterfaceC16120l, InterfaceC11772l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Object f7509l = new Object();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C16191l f7510l = new C16191l(1);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f7511l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7512l;

    public C3585l(int i) {
        InterfaceC15805l interfaceC15805l;
        this.f7512l = i;
        switch (i) {
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f7511l = new C11427l(this);
                    return;
                } else {
                    this.f7511l = new C15238l(this);
                    return;
                }
            case 5:
                this.f7511l = new AtomicReference(null);
                return;
            case 7:
                C5104l c5104lCrashlytics = C5104l.crashlytics();
                this.f7511l = c5104lCrashlytics;
                C6916l c6916l = InterfaceC15273l.f29872l;
                Class cls = (Class) c5104lCrashlytics.smaato(c6916l, null);
                if (cls != null && !cls.equals(C5762l.class)) {
                    C1759l.smaato("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                c5104lCrashlytics.mopub(c6916l, C5762l.class);
                C6916l c6916l2 = InterfaceC15273l.f29871l;
                if (c5104lCrashlytics.smaato(c6916l2, null) == null) {
                    c5104lCrashlytics.mopub(c6916l2, C5762l.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 11:
                this.f7511l = new ConcurrentHashMap(16);
                return;
            case 16:
                this.f7511l = new C10975l(14);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.f7511l = new Bundle();
                return;
            case 23:
                this.f7511l = new C12534l();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f7511l = new C18476l();
                return;
            default:
                Class cls2 = AbstractC16910l.yandex;
                try {
                    interfaceC15805l = (InterfaceC15805l) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    break;
                } catch (Exception unused) {
                    interfaceC15805l = f7510l;
                }
                InterfaceC15805l[] interfaceC15805lArr = {C16191l.loadAd, interfaceC15805l};
                C18109l c18109l = new C18109l();
                c18109l.yandex = interfaceC15805lArr;
                Charset charset = AbstractC4579l.yandex;
                this.f7511l = c18109l;
                return;
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static String m1355package(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    public static C2041l pro(AbstractC5295l abstractC5295l, List list) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        boolean z4 = false;
        if (list != null && list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((AbstractC6896l) it.next()) instanceof C9731l) {
                z = true;
                break;
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AbstractC6896l abstractC6896l = (AbstractC6896l) it2.next();
                    if ((abstractC6896l instanceof C0527l) || AbstractC5641l.admob(abstractC6896l)) {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
            }
        } else {
            z2 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    AbstractC6896l abstractC6896l2 = (AbstractC6896l) it3.next();
                    if ((abstractC6896l2 instanceof C0527l) || (abstractC6896l2 instanceof C9585l) || AbstractC5641l.admob(abstractC6896l2)) {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
            }
        } else {
            z3 = false;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                if (AbstractC5641l.admob((AbstractC6896l) it4.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        int iOrdinal = abstractC5295l.yandex().ordinal();
        EnumC15475l enumC15475l = EnumC15475l.f30275l;
        EnumC15475l enumC15475l2 = EnumC15475l.f30276l;
        if (iOrdinal == 0) {
            string = enumC15475l + " or " + enumC15475l2;
            if (z2) {
                string = null;
            }
        } else if (iOrdinal == 1) {
            string = enumC15475l + " or " + enumC15475l2 + " or " + EnumC15475l.f30277l;
            if (z3) {
                string = null;
            }
        } else {
            if (iOrdinal == 2) {
                C18725l.loadAd();
                return null;
            }
            if (iOrdinal == 3) {
                string = EnumC15475l.f30272l.toString();
                if (z) {
                    string = null;
                }
            } else {
                if (iOrdinal != 4) {
                    C18725l.billing();
                    return null;
                }
                string = enumC15475l2.toString();
                if (z4) {
                    string = null;
                }
            }
        }
        if (string != null) {
            return new C2041l(string, abstractC5295l);
        }
        return null;
    }

    public InterfaceC5965l Signature(C1869l c1869l, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            InterfaceC5965l interfaceC5965lSignature = Signature(c1869l, arrayList, i2, AbstractC16901l.m4218final(arrayList.get(i), list));
            return interfaceC5965lSignature instanceof C1999l ? interfaceC5965lSignature : Signature(c1869l, arrayList, i2, list);
        }
        LinkedHashSet linkedHashSetMopub = AbstractC9905l.mopub(c1869l.amazon, list);
        AbstractC5088l.yandex("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + linkedHashSetMopub + ", useCases = " + c1869l.billing);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(linkedHashSetMopub, 10));
        Iterator it = linkedHashSetMopub.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AbstractC5295l) it.next()).yandex());
        }
        for (EnumC4775l enumC4775l : AbstractC16901l.m4245throws(arrayList2)) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : linkedHashSetMopub) {
                if (((AbstractC5295l) obj).yandex() == enumC4775l) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList3.size() > 1) {
                return C2158l.yandex;
            }
        }
        int i3 = 0;
        if (((InterfaceC15879l) this.f7511l).pro(new C5008l(i3, linkedHashSetMopub), c1869l)) {
            return new C1999l(new C5008l(i3, linkedHashSetMopub));
        }
        return C2158l.yandex;
    }

    public void ad(String str, String str2) {
        C18476l c18476l = (C18476l) this.f7511l;
        C17423l.vip(c18476l, str, str.length(), 8);
        C17423l.vip(c18476l, ": ", 2, 8);
        C17423l.vip(c18476l, str2, str2.length(), 8);
        c18476l.m4562synchronized((byte) 13);
        c18476l.m4562synchronized((byte) 10);
    }

    public void adcel() {
        C18476l c18476l = (C18476l) this.f7511l;
        c18476l.m4562synchronized((byte) 13);
        c18476l.m4562synchronized((byte) 10);
    }

    @Override // defpackage.InterfaceC6848l
    public C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        ((C12534l) this.f7511l).admob(c9902l, f, c4565l);
        return c9902l;
    }

    public C15685l ads(int i) {
        return null;
    }

    public void advert() {
        View view = (View) this.f7511l;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.InterfaceC17172l
    public void amazon(AbstractC15422l abstractC15422l) {
        ThreadFactoryC17493l threadFactoryC17493l = new ThreadFactoryC17493l("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC17493l);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC10613l(this, abstractC15422l, threadPoolExecutor, 15));
    }

    public void applovin() {
        int i;
        int i2 = 0;
        while (true) {
            C18449l[] c18449lArr = (C18449l[]) this.f7511l;
            if (i2 >= c18449lArr.length) {
                return;
            }
            C18449l c18449l = c18449lArr[i2];
            int[] iArr = (int[]) c18449l.f36010l;
            int[] iArrMetrica = AbstractC14024l.metrica(0, iArr.length, iArr);
            int i3 = 0;
            for (int i4 = 128; i4 > 0; i4 >>>= 1) {
                for (int i5 = 0; i5 < 256; i5 = i + i4) {
                    i3++;
                    int i6 = AbstractC0593l.yandex[i3];
                    i = i5;
                    while (i < i5 + i4) {
                        int i7 = i + i4;
                        int iCrashlytics = AbstractC9549l.crashlytics(((long) i6) * ((long) iArrMetrica[i7]));
                        iArrMetrica[i7] = iArrMetrica[i] - iCrashlytics;
                        iArrMetrica[i] = iArrMetrica[i] + iCrashlytics;
                        i++;
                    }
                }
            }
            c18449l.f36010l = iArrMetrica;
            i2++;
        }
    }

    public void appmetrica(String str, String str2) {
        C11154l c11154l = MediaMetadataCompat.f28l;
        if (!c11154l.containsKey(str) || ((Integer) c11154l.get(str)).intValue() == 1) {
            ((Bundle) this.f7511l).putCharSequence(str, str2);
        } else {
            C8339l.metrica(AbstractC15560l.Signature("The ", str, " key cannot be used to put a String"));
        }
    }

    @Override // defpackage.InterfaceC11772l
    public C11815l billing() {
        return (C11815l) this.f7511l;
    }

    @Override // defpackage.InterfaceC11772l
    public C13247l crashlytics() throws Throwable {
        IOException iOException = null;
        while (!((C11815l) this.f7511l).firebase.f34637l) {
            try {
                InterfaceC7476l interfaceC7476lLoadAd = ((C11815l) this.f7511l).loadAd();
                if (!interfaceC7476lLoadAd.yandex()) {
                    C3329l c3329lAmazon = interfaceC7476lLoadAd.amazon();
                    if (c3329lAmazon.loadAd == null && c3329lAmazon.crashlytics == null) {
                        c3329lAmazon = interfaceC7476lLoadAd.mopub();
                    }
                    InterfaceC7476l interfaceC7476l = c3329lAmazon.loadAd;
                    Throwable th = c3329lAmazon.crashlytics;
                    if (th != null) {
                        throw th;
                    }
                    if (interfaceC7476l != null) {
                        ((C11815l) this.f7511l).startapp.addFirst(interfaceC7476l);
                    }
                }
                return interfaceC7476lLoadAd.crashlytics();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    AbstractC11718l.yandex(iOException, e);
                }
                if (!((C11815l) this.f7511l).yandex(null)) {
                    throw iOException;
                }
            }
        }
        C18262l.metrica("Canceled");
        return null;
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        C15815l c15815l = (C15815l) this.f7511l;
        AbstractC5641l.purchase("The result can only set once!", c15815l.f31053l == null);
        c15815l.f31053l = c5807l;
        return "FutureChain[" + c15815l + "]";
    }

    public realm_value_t firebase(byte[] bArr) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(bArr == null ? 0 : 4);
        if (bArr != null) {
            realm_binary_t realm_binary_tVar = new realm_binary_t(realmcJNI.new_realm_binary_t(), true);
            realmcJNI.realm_binary_t_data_set(realm_binary_tVar.yandex, realm_binary_tVar, bArr);
            realmcJNI.realm_binary_t_size_set(realm_binary_tVar.yandex, realm_binary_tVar, bArr.length);
            realmcJNI.realm_value_t_binary_set(realm_value_tVar.yandex, realm_value_tVar, realm_binary_tVar.yandex, realm_binary_tVar);
        }
        ((LinkedHashSet) ((C10975l) this.f7511l).f22121l).add(realm_value_tVar);
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        String packageName = ((Context) ((InterfaceC15897l) this.f7511l).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        C6541l.subs("Cannot return null from a non-@Nullable @Provides method");
        return null;
    }

    public realm_value_t inmobi(C1332l c1332l) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(c1332l == null ? 0 : 10);
        if (c1332l != null) {
            long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realm_value_tVar.billing(new realm_link_t(realmcJNI.realm_object_as_link(ptr$cinterop_release), true));
        }
        return realm_value_tVar;
    }

    public realm_value_t isPro(Boolean bool) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(bool == null ? 0 : 2);
        if (bool != null) {
            realmcJNI.realm_value_t__boolean_set(realm_value_tVar.yandex, realm_value_tVar, bool.booleanValue());
        }
        return realm_value_tVar;
    }

    public realm_value_t isVip(Long l) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(l == null ? 0 : 1);
        if (l != null) {
            realmcJNI.realm_value_t_integer_set(realm_value_tVar.yandex, realm_value_tVar, l.longValue());
        }
        return realm_value_tVar;
    }

    public synchronized C2494l license() {
        return ((C5501l) this.f7511l).m1814l();
    }

    @Override // defpackage.InterfaceC17020l
    public ByteBuffer loadAd() {
        return (ByteBuffer) this.f7511l;
    }

    @Override // defpackage.InterfaceC16451l
    public void metrica(String str, Bundle bundle) {
        C3323l c3323l = (C3323l) this.f7511l;
        if (c3323l != null) {
            try {
                String str2 = "$A$:" + m1355package(str, bundle);
                C17044l c17044l = c3323l.yandex;
                ((ExecutorC4850l) c17044l.metrica.f1958l).yandex(new RunnableC0016l(c17044l, System.currentTimeMillis() - c17044l.amazon, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public realm_value_t m1356native(InterfaceC11386l interfaceC11386l) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(interfaceC11386l == null ? 0 : 5);
        if (interfaceC11386l != null) {
            realm_timestamp_t realm_timestamp_tVar = new realm_timestamp_t(realmcJNI.new_realm_timestamp_t(), true);
            realmcJNI.realm_timestamp_t_seconds_set(realm_timestamp_tVar.yandex, realm_timestamp_tVar, interfaceC11386l.yandex());
            realmcJNI.realm_timestamp_t_nanoseconds_set(realm_timestamp_tVar.yandex, realm_timestamp_tVar, interfaceC11386l.loadAd());
            realmcJNI.realm_value_t_timestamp_set(realm_value_tVar.yandex, realm_value_tVar, realm_timestamp_tVar.yandex, realm_timestamp_tVar);
        }
        return realm_value_tVar;
    }

    public boolean premium(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.InterfaceC1666l
    public Object purchase(Object obj, Object obj2) {
        return ((InterfaceC17302l) this.f7511l).apply(obj2);
    }

    public realm_value_t remoteconfig(C15062l c15062l) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(c15062l == null ? 0 : 8);
        if (c15062l != null) {
            realm_decimal128_t realm_decimal128_tVar = new realm_decimal128_t(realmcJNI.new_realm_decimal128_t(), true);
            C3662l c3662l = c15062l.f29593l;
            realmcJNI.realm_decimal128_t_w_set(realm_decimal128_tVar.yandex, realm_decimal128_tVar, Arrays.copyOf(new long[]{c3662l.loadAd, c3662l.yandex}, 2));
            realmcJNI.realm_value_t_decimal128_set(realm_value_tVar.yandex, realm_value_tVar, realm_decimal128_tVar.yandex, realm_decimal128_tVar);
        }
        return realm_value_tVar;
    }

    public realm_value_t signatures() {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(0);
        return realm_value_tVar;
    }

    public C15685l smaato(int i) {
        return null;
    }

    public realm_value_t startapp(Double d) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(d == null ? 0 : 7);
        if (d != null) {
            realmcJNI.realm_value_t_dnum_set(realm_value_tVar.yandex, realm_value_tVar, d.doubleValue());
        }
        return realm_value_tVar;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public void mo1357strictfp() {
        View viewFindViewById;
        View view = (View) this.f7511l;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC17827l(viewFindViewById, 1));
    }

    public Object subs(String str, AbstractC0283l abstractC0283l) {
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10999l.firebase(AbstractC17278l.yandex, new C7641l(str, (AppActivity) this.f7511l, null, 6), abstractC0283l);
    }

    public realm_value_t subscription(Float f) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(f == null ? 0 : 6);
        if (f != null) {
            realmcJNI.realm_value_t_fnum_set(realm_value_tVar.yandex, realm_value_tVar, f.floatValue());
        }
        return realm_value_tVar;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public C16565l m1358synchronized(Object obj) {
        AbstractC12225l.crashlytics();
        return AbstractC11064l.purchase(new C15263l(this, obj, 14));
    }

    public void tapsense() {
        for (Object obj : (LinkedHashSet) ((C10975l) this.f7511l).f22121l) {
            if (obj instanceof realm_value_t) {
                realm_value_t realm_value_tVar = (realm_value_t) obj;
                int i = AbstractC9795l.yandex;
                realmcJNI.realm_value_t_cleanup(realm_value_tVar.yandex, realm_value_tVar);
            } else if (obj instanceof C12601l) {
                realm_query_arg_t realm_query_arg_tVar = ((C12601l) obj).loadAd;
                int i2 = AbstractC9795l.yandex;
                realmcJNI.delete_queryArgArray(realm_query_arg_t.yandex(realm_query_arg_tVar), realm_query_arg_tVar);
            } else if (obj instanceof C17892l) {
                realm_value_t realm_value_tVar2 = (realm_value_t) ((C17892l) obj).yandex.f28907l;
                int i3 = AbstractC9795l.yandex;
                realmcJNI.delete_valueArray(realm_value_t.loadAd(realm_value_tVar2), realm_value_tVar2);
            }
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m1359throws(String str, CharSequence charSequence, int i) {
        C18476l c18476l = (C18476l) this.f7511l;
        C17423l.vip(c18476l, str, 0, 14);
        c18476l.m4562synchronized((byte) 32);
        C17423l.vip(c18476l, String.valueOf(i), 0, 14);
        c18476l.m4562synchronized((byte) 32);
        C17423l.vip(c18476l, charSequence, 0, 14);
        c18476l.m4562synchronized((byte) 13);
        c18476l.m4562synchronized((byte) 10);
    }

    public String toString() {
        switch (this.f7512l) {
            case 22:
                C18449l[] c18449lArr = (C18449l[]) this.f7511l;
                String strConcat = "\n[";
                for (int i = 0; i < c18449lArr.length; i++) {
                    strConcat = strConcat + "Inner Matrix " + i + " " + c18449lArr[i].toString();
                    if (i != c18449lArr.length - 1) {
                        strConcat = strConcat.concat(",\n");
                    }
                }
                return strConcat.concat("]");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9746l
    public C3823l vip(Object obj) {
        C6871l c6871l = (C6871l) obj;
        C18595l c18595l = (C18595l) this.f7511l;
        if (c6871l == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return AbstractC4311l.mopub(null);
        }
        C17503l c17503l = (C17503l) c18595l.f36316l;
        C17503l.yandex(c17503l);
        c17503l.remoteconfig.adcel(null, (ExecutorC4850l) c17503l.purchase.f1958l);
        c17503l.adcel.amazon(null);
        return AbstractC4311l.mopub(null);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public realm_value_t m1360volatile(String str) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.mopub(str == null ? 0 : 3);
        if (str != null) {
            realmcJNI.realm_value_t_string_set(realm_value_tVar.yandex, realm_value_tVar, str);
        }
        ((LinkedHashSet) ((C10975l) this.f7511l).f22121l).add(realm_value_tVar);
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC8115l
    public void yandex(C3323l c3323l) {
        this.f7511l = c3323l;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    public void mopub(int i, C15685l c15685l, String str, Bundle bundle) {
    }

    public /* synthetic */ C3585l(int i, boolean z) {
        this.f7512l = i;
    }

    public C3585l(C16827l c16827l) {
        this.f7512l = 22;
        int i = c16827l.crashlytics;
        this.f7511l = new C18449l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C18449l[]) this.f7511l)[i2] = new C18449l(c16827l);
        }
    }

    public /* synthetic */ C3585l(int i, Object obj) {
        this.f7512l = i;
        this.f7511l = obj;
    }

    public C3585l(C12714l c12714l) {
        this.f7512l = 1;
        Context context = (Context) c12714l.f25074l;
        String str = (String) c12714l.f25075l;
        String str2 = (String) c12714l.f25072l;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f7511l = (C5501l) c12714l.f25073l;
            return;
        }
        C8339l.metrica("keysetName cannot be null");
        throw null;
    }

    public C3585l(Context context) {
        this.f7512l = 12;
        this.f7511l = context.getApplicationContext();
    }

    public C3585l(ThreadFactoryC10406l threadFactoryC10406l) {
        this.f7512l = 28;
        this.f7511l = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryC10406l);
    }

    public C3585l(MediaMetadataCompat mediaMetadataCompat) {
        this.f7512l = 19;
        Bundle bundle = new Bundle(mediaMetadataCompat.f30l);
        this.f7511l = bundle;
        C0554l.appmetrica(bundle);
    }
}
