package defpackage;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.isPro;
import com.google.android.gms.cast.MediaInfo;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؘؙؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C5501l implements InterfaceC5457l, InterfaceC1076l, InterfaceC15866l, InterfaceC15283l, InterfaceC16920l, InterfaceC10466l, InterfaceC2232l, InterfaceC18266l, InterfaceC7456l, InterfaceC10153l, InterfaceC15177l, InterfaceC14209l, InterfaceC17061l, InterfaceC14606l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile C5501l f11763l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f11764l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11765l;

    public C5501l(int i) {
        this.f11765l = i;
        switch (i) {
            case 1:
                this.f11764l = new AtomicReference(null);
                break;
            case 8:
                this.f11764l = new C18480l(8);
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f11764l = new LinkedHashSet();
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f11764l = new ArrayList(9);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f11764l = new SparseArray();
                break;
            default:
                this.f11764l = new Charset[]{AbstractC12379l.loadAd, AbstractC12379l.billing, AbstractC12379l.amazon, AbstractC12379l.crashlytics};
                break;
        }
    }

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public static C5501l m1808l() {
        if (f11763l == null) {
            synchronized (C5501l.class) {
                try {
                    if (f11763l == null) {
                        f11763l = new C5501l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11763l;
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Set Signature(C6916l c6916l) {
        return AbstractC4338l.billing(this, c6916l);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Object adcel(C6916l c6916l) {
        return AbstractC4338l.firebase(this, c6916l);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Object advert(C6916l c6916l, EnumC10534l enumC10534l) {
        return AbstractC4338l.remoteconfig(this, c6916l, enumC10534l);
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        ((RunnableC2289l) this.f11764l).run();
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public void m1809break(Object obj) {
        ArrayList arrayList = (ArrayList) this.f11764l;
        if (obj != null) {
            arrayList.add(obj);
        } else {
            C6541l.subs("Set contributions cannot be null");
        }
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: class */
    public /* synthetic */ EnumC10534l mo860class(C6916l c6916l) {
        return AbstractC4338l.purchase(this, c6916l);
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public InterfaceC2851l m1810const(InterfaceC1388l interfaceC1388l) {
        C2336l c2336l = AbstractC18202l.yandex;
        if (interfaceC1388l.equals(c2336l.loadAd(InterfaceC11343l.class))) {
            return new C1097l();
        }
        if (interfaceC1388l.equals(c2336l.loadAd(DynamicMutableRealmObject.class))) {
            return new C11097l();
        }
        return interfaceC1388l.equals(c2336l.loadAd(C12555l.class)) ? new C11097l() : (InterfaceC2851l) m1826while(interfaceC1388l).billing();
    }

    @Override // defpackage.InterfaceC7456l
    /* JADX INFO: renamed from: default */
    public Object mo672default(C5807l c5807l) {
        C13745l c13745l = (C13745l) this.f11764l;
        AbstractC5641l.purchase("The result can only set once!", c13745l.f26839l == null);
        c13745l.f26839l = c5807l;
        return "ListFuture[" + this + "]";
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        try {
            return ((C2283l) this.f11764l).doFinal(bArr, 0);
        } catch (C10352l e) {
            C8936l.subs(e);
            return 0;
        }
    }

    @Override // defpackage.InterfaceC17061l
    /* JADX INFO: renamed from: else */
    public int mo1317else() {
        isPro ispro = (isPro) this.f11764l;
        return ispro.metrica - ispro.m143package();
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        C14184l c14184l = (C14184l) ((C14461l) this.f11764l).f28328l;
        C3314l c3314l = C3314l.yandex;
        return C3314l.yandex(c14184l);
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return ((C2283l) this.f11764l).yandex.getAlgorithmName().concat("-GMAC");
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return 16;
    }

    @Override // defpackage.InterfaceC5457l
    public String getValue(int i) {
        return !mo1044goto(i) ? "" : ((Charset[]) this.f11764l)[i].name();
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public boolean mo1044goto(int i) {
        return i >= 0 && i <= 3;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public synchronized void m1811implements(C13003l c13003l) {
        ((LinkedHashSet) this.f11764l).remove(c13003l);
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica("GMAC requires ParametersWithIV");
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        byte[] bArr = c0272l.f1273l;
        ((C2283l) this.f11764l).init(true, new remoteconfig((C13886l) c0272l.f1272l, 128, bArr, null));
    }

    @Override // defpackage.InterfaceC17944l
    public void inmobi(C5131l c5131l) {
        subs().inmobi(c5131l);
    }

    @Override // defpackage.InterfaceC17061l
    public int isPro(View view) {
        return isPro.inmobi(view) - ((ViewGroup.MarginLayoutParams) ((C13036l) view.getLayoutParams())).topMargin;
    }

    @Override // defpackage.InterfaceC15283l
    public AbstractC8831l isVip(ByteArrayInputStream byteArrayInputStream) {
        C2396l c2396l = (C2396l) this.f11764l;
        int iBitLength = (c2396l.f5158l.bitLength() + 7) / 8;
        byte[] bArr = new byte[iBitLength];
        AbstractC7016l.amazon(byteArrayInputStream, bArr, 0, iBitLength);
        return new C7438l(new BigInteger(1, bArr), c2396l);
    }

    /* JADX INFO: renamed from: lؚۣؒ, reason: contains not printable characters */
    public void m1812l() {
        C10617l c10617l = (C10617l) this.f11764l;
        int i = c10617l.f21559l - 1;
        c10617l.f21559l = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (C8915l c8915l : c10617l.f21542l) {
            c8915l.pro();
            i2 += c8915l.f18336l.yandex;
        }
        C11916l[] c11916lArr = new C11916l[i2];
        int i3 = 0;
        for (C8915l c8915l2 : c10617l.f21542l) {
            c8915l2.pro();
            int i4 = c8915l2.f18336l.yandex;
            int i5 = 0;
            while (i5 < i4) {
                c8915l2.pro();
                c11916lArr[i3] = c8915l2.f18336l.yandex(i5);
                i5++;
                i3++;
            }
        }
        c10617l.f21548l = new C8750l(c11916lArr);
        c10617l.f21549l.crashlytics(c10617l);
    }

    /* JADX INFO: renamed from: lؒۢۜ, reason: contains not printable characters */
    public InterfaceC17477l m1813l(C12875l c12875l) {
        C16760l c16760l;
        C2312l c2312lCrashlytics = c12875l.crashlytics();
        Class<?> declaringClass = c12875l.yandex.getDeclaringClass();
        C12875l c12875l2 = declaringClass != null ? new C12875l(declaringClass) : null;
        if (c12875l2 != null) {
            InterfaceC17477l interfaceC17477lM1813l = m1813l(c12875l2);
            InterfaceC7637l interfaceC7637lMo2893l = interfaceC17477lM1813l != null ? interfaceC17477lM1813l.mo2893l() : null;
            InterfaceC15234l interfaceC15234lPurchase = interfaceC7637lMo2893l != null ? interfaceC7637lMo2893l.purchase(c12875l.purchase(), EnumC11300l.f22775l) : null;
            if (interfaceC15234lPurchase instanceof InterfaceC17477l) {
                return (InterfaceC17477l) interfaceC15234lPurchase;
            }
        } else if (c2312lCrashlytics != null && (c16760l = (C16760l) AbstractC16901l.m4217extends(((C15610l) this.f11764l).yandex(c2312lCrashlytics.loadAd()))) != null) {
            C7676l c7676l = c16760l.f32767l.amazon;
            c7676l.getClass();
            return c7676l.license(c12875l.purchase(), c12875l);
        }
        return null;
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public synchronized C2494l m1814l() {
        return C2494l.m1152l((C8082l) ((C2150l) this.f11764l).yandex());
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؗۨؑ */
    public void mo1665l(C3498l c3498l, Object obj) {
        C14537l c14537l = (C14537l) this.f11764l;
        String strLoadAd = c3498l.loadAd();
        if ("k".equals(strLoadAd)) {
            if (obj instanceof Integer) {
                EnumC4474l enumC4474l = (EnumC4474l) EnumC4474l.f9099l.get((Integer) obj);
                if (enumC4474l == null) {
                    enumC4474l = EnumC4474l.UNKNOWN;
                }
                c14537l.f28469l = enumC4474l;
                return;
            }
            return;
        }
        if ("mv".equals(strLoadAd)) {
            if (obj instanceof int[]) {
                c14537l.f28472l = (int[]) obj;
            }
        } else {
            if ("xs".equals(strLoadAd)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    c14537l.f28471l = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strLoadAd)) {
                "pn".equals(strLoadAd);
            } else if (obj instanceof Integer) {
                c14537l.f28468l = ((Integer) obj).intValue();
            }
        }
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public void m1815l(long j) {
        long jLoadAd = C1794l.loadAd(j);
        byte b = 0;
        if (!C12735l.yandex(jLoadAd, 0L)) {
            if (C12735l.yandex(jLoadAd, 4294967296L)) {
                b = 1;
            } else if (C12735l.yandex(jLoadAd, 8589934592L)) {
                b = 2;
            }
        }
        m1824return(b);
        if (C12735l.yandex(C1794l.loadAd(j), 0L)) {
            return;
        }
        m1822l(C1794l.crashlytics(j));
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lٌّۡ */
    public InterfaceC12997l mo1667l(C3498l c3498l) {
        String strLoadAd = c3498l.loadAd();
        if ("d1".equals(strLoadAd)) {
            return new C9348l(this, 0);
        }
        if ("d2".equals(strLoadAd)) {
            return new C9348l(this, 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public C5501l m1816l(C5501l c5501l) {
        int[] iArr = (int[]) this.f11764l;
        int length = iArr.length;
        int[] iArr2 = (int[]) c5501l.f11764l;
        if (length - iArr2.length < 0) {
            return this;
        }
        int i = iArr[0];
        int[] iArr3 = AbstractC8422l.loadAd;
        int i2 = iArr3[i] - iArr3[iArr2[0]];
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        int length2 = iArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            iArrCopyOf[i4] = AbstractC8422l.yandex(AbstractC8422l.loadAd[iArr2[i3]] + i2) ^ iArrCopyOf[i4];
            i3++;
            i4++;
        }
        return new C5501l(iArrCopyOf, 0).m1816l(c5501l);
    }

    /* JADX INFO: renamed from: lْ٘ۚ, reason: contains not printable characters */
    public C13568l m1817l(C10111l c10111l) {
        return new C13568l(c10111l, (C16864l) this.f11764l, 18);
    }

    /* JADX INFO: renamed from: lٍٔ۠, reason: contains not printable characters */
    public void m1818l(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f11764l;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public Charset m1819l(int i) {
        if (mo1044goto(i)) {
            return ((Charset[]) this.f11764l)[i];
        }
        throw new NoSuchElementException("id=" + Integer.toString(i));
    }

    /* JADX INFO: renamed from: lَٖؕ, reason: contains not printable characters */
    public C5207l m1820l(InterfaceC7457l interfaceC7457l, InterfaceC13922l interfaceC13922l) {
        InterfaceC1388l interfaceC1388l = (InterfaceC1388l) this.f11764l;
        if (!AbstractC15011l.subs(interfaceC7457l)) {
            C8339l.smaato("Unmanaged objects don't support backlinks.");
            return null;
        }
        C1332l f500l = ((InterfaceC2851l) interfaceC7457l).getF3035l();
        C0717l c0717l = (C0717l) f500l.f3424l.amazon.get(interfaceC13922l);
        if (c0717l == null) {
            C8339l.metrica(AbstractC14814l.ads("Target property '", interfaceC13922l.getName(), "' not defined in '", AbstractC18202l.yandex.loadAd(interfaceC7457l.getClass()).license(), "'."));
            return null;
        }
        String str = c0717l.isPro;
        if (str.length() == 0) {
            C8339l.metrica(AbstractC15560l.Signature("Target property '", interfaceC13922l.getName(), "' is not a backlink property."));
            return null;
        }
        C2330l c2330lCrashlytics = f500l.f3419l.mo1847l().crashlytics(c0717l.subs);
        InterfaceC1388l interfaceC1388l2 = c2330lCrashlytics.subs;
        if (!interfaceC1388l.equals(interfaceC1388l2)) {
            C8339l.metrica(AbstractC14814l.ads("Target property type '", interfaceC1388l2.license(), "' does not match backlink type '", interfaceC1388l.license(), "'."));
            return null;
        }
        long j = ((C0717l) c2330lCrashlytics.purchase.get(str)).amazon;
        long j2 = c2330lCrashlytics.loadAd;
        long ptr$cinterop_release = f500l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C5207l(new C15825l(f500l.f3419l, new LongPointerWrapper(realmcJNI.realm_get_backlinks(ptr$cinterop_release, j2, j), false, 2, null), j2, interfaceC1388l, f500l.f3423l));
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public String m1821l(String str) {
        List listAdvert = ((C12210l) this.f11764l).f24270l.advert(str);
        if (listAdvert == null) {
            listAdvert = C2580l.f5619l;
        }
        return (String) AbstractC16901l.m4217extends(listAdvert);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: l٘ٗ۟ */
    public InterfaceC14209l mo1668l(C3624l c3624l, C3498l c3498l) {
        return null;
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public void m1822l(float f) {
        ((Parcel) this.f11764l).writeFloat(f);
    }

    @Override // defpackage.InterfaceC15177l
    /* JADX INFO: renamed from: l٘ۦۢ */
    public C2434l mo1235l() {
        throw null;
    }

    @Override // defpackage.InterfaceC17061l
    /* JADX INFO: renamed from: new */
    public View mo1318new(int i) {
        return ((isPro) this.f11764l).Signature(i);
    }

    @Override // defpackage.InterfaceC17061l
    public int premium() {
        return ((isPro) this.f11764l).m148volatile();
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public C13328l m1823protected() {
        C13328l c13328l = (C13328l) this.f11764l;
        if (c13328l.f26162l == null) {
            C8339l.metrica("media cannot be null.");
            return null;
        }
        if (!Double.isNaN(c13328l.f26164l) && c13328l.f26164l < 0.0d) {
            C8339l.metrica("startTime cannot be negative or NaN.");
            return null;
        }
        if (Double.isNaN(c13328l.f26163l)) {
            C8339l.metrica("playbackDuration cannot be NaN.");
            return null;
        }
        if (!Double.isNaN(c13328l.f26166l) && c13328l.f26166l >= 0.0d) {
            return c13328l;
        }
        C8339l.metrica("preloadTime cannot be negative or Nan.");
        return null;
    }

    @Override // defpackage.InterfaceC17061l
    /* JADX INFO: renamed from: public */
    public int mo1319public(View view) {
        return isPro.advert(view) + ((ViewGroup.MarginLayoutParams) ((C13036l) view.getLayoutParams())).bottomMargin;
    }

    @Override // defpackage.InterfaceC16920l
    public C15263l purchase(C15079l c15079l) {
        return ((C18480l) this.f11764l).Signature(c15079l);
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        ((C2283l) this.f11764l).firebase(true);
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public void m1824return(byte b) {
        ((Parcel) this.f11764l).writeByte(b);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Object smaato(C6916l c6916l, Object obj) {
        return AbstractC4338l.smaato(this, c6916l, obj);
    }

    @Override // defpackage.InterfaceC17944l
    public /* synthetic */ Set startapp() {
        return AbstractC4338l.isPro(this);
    }

    @Override // defpackage.InterfaceC17944l
    /* JADX INFO: renamed from: strictfp */
    public /* synthetic */ boolean mo861strictfp(C6916l c6916l) {
        return AbstractC4338l.crashlytics(this, c6916l);
    }

    @Override // defpackage.InterfaceC15866l
    public InterfaceC17944l subs() {
        return (InterfaceC17944l) this.f11764l;
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: synchronized */
    public void mo1670synchronized(C17778l c17778l, C18389l c18389l) {
        ((C1090l) this.f11764l).smaato(c18389l);
    }

    @Override // defpackage.InterfaceC10153l
    /* JADX INFO: renamed from: throw */
    public void mo1671throw(IOException iOException) {
        ((C1090l) this.f11764l).remoteconfig(iOException);
    }

    @Override // defpackage.InterfaceC18266l
    /* JADX INFO: renamed from: throws */
    public void mo614throws(InterfaceC3128l interfaceC3128l) {
        C10617l c10617l = (C10617l) this.f11764l;
        c10617l.f21549l.mo614throws(c10617l);
    }

    public String toString() {
        switch (this.f11765l) {
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return String.valueOf((C1693l) this.f11764l);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public void m1825transient(String str, String str2, boolean z) {
        if (z) {
            String[] strArr = AbstractC10588l.yandex;
            for (int i = 0; i < 2; i++) {
                if (AbstractC16648l.license(strArr[i], str, true)) {
                    throw new C14612l(str);
                }
            }
        }
        AbstractC10588l.yandex(str);
        AbstractC10588l.loadAd(str2);
        ((C12210l) this.f11764l).f24270l.mo214l(str, str2);
    }

    @Override // defpackage.InterfaceC1076l
    /* JADX INFO: renamed from: try */
    public boolean mo248try(MenuC4984l menuC4984l) {
        Window.Callback callback = ((LayoutInflaterFactory2C14405l) this.f11764l).f28203l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC4984l);
        return true;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        C2283l c2283l = (C2283l) this.f11764l;
        c2283l.crashlytics();
        byte[] bArr = c2283l.Signature;
        int i = c2283l.license;
        bArr[i] = b;
        int i2 = i + 1;
        c2283l.license = i2;
        if (i2 == 16) {
            c2283l.billing(c2283l.metrica, bArr);
            c2283l.license = 0;
            c2283l.pro += 16;
        }
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public InterfaceC13226l m1826while(InterfaceC1388l interfaceC1388l) {
        InterfaceC13226l interfaceC13226l = (InterfaceC13226l) ((C12125l) this.f11764l).purchase.get(interfaceC1388l);
        if (interfaceC13226l != null) {
            return interfaceC13226l;
        }
        C8936l.isPro(interfaceC1388l, " not part of this configuration schema");
        return null;
    }

    @Override // defpackage.InterfaceC1076l
    public void yandex(MenuC4984l menuC4984l, boolean z) {
        ((LayoutInflaterFactory2C14405l) this.f11764l).tapsense(menuC4984l);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: abstract */
    public void mo1662abstract() {
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        ((C2283l) this.f11764l).yandex(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lؘۛؕ */
    public void mo1666l(C3498l c3498l, C14700l c14700l) {
    }

    public /* synthetic */ C5501l(int i, boolean z) {
        this.f11765l = i;
    }

    public C5501l(MediaInfo mediaInfo) {
        this.f11765l = 17;
        C13328l c13328l = new C13328l(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f11764l = c13328l;
        } else {
            C8339l.metrica("media cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC14209l
    /* JADX INFO: renamed from: lًؑٝ */
    public void mo1664l(C3498l c3498l, C3624l c3624l, C3498l c3498l2) {
    }

    public C5501l(JSONObject jSONObject) {
        this.f11765l = 17;
        this.f11764l = new C13328l(jSONObject);
    }

    public C5501l(int[] iArr, int i) {
        this.f11765l = 21;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (iArr[i2] != 0) {
                break;
            } else {
                i2++;
            }
        }
        i2 = i2 < 0 ? 0 : i2;
        int length2 = (iArr.length - i2) + i;
        int[] iArr2 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr2[i3] = 0;
        }
        this.f11764l = iArr2;
        int length3 = iArr.length - i2;
        for (int i4 = 0; i4 < length3; i4++) {
            iArr2[i4] = iArr[i2 + i4];
        }
    }

    public C5501l(InputStream inputStream) {
        this.f11765l = 20;
        EnumC6690l enumC6690l = EnumC6690l.f14038l;
        C1461l c1461l = C1461l.f3665l;
        if (inputStream != null) {
            AbstractC17551l.crashlytics = c1461l;
            int iInmobi = AbstractC5020l.inmobi(2);
            if (iInmobi == 0) {
                this.f11764l = new C7449l(inputStream);
                return;
            } else if (iInmobi == 1) {
                this.f11764l = new C2696l(inputStream);
                return;
            } else {
                C18073l.license("unsupported format detected, this should be impossible: ".concat("EXT_M3U"));
                throw null;
            }
        }
        C8339l.metrica("inputStream is null");
        throw null;
    }

    public /* synthetic */ C5501l(int i, Object obj) {
        this.f11765l = i;
        this.f11764l = obj;
    }
}
