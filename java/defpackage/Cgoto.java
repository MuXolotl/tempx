package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: goto, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Cgoto implements InterfaceC16011l, InterfaceC2853l, InterfaceC15782l, InterfaceC15241l, InterfaceC8699l, InterfaceC6984l, InterfaceC17182l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f833l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f834l;

    public Cgoto(int i) {
        this.f834l = i;
        switch (i) {
            case 6:
                this.f833l = new C6829l();
                break;
            case 9:
                this.f833l = new HashMap();
                break;
            case 10:
                C16977l c16977l = AbstractC6903l.yandex;
                this.f833l = new C16977l();
                break;
            case 11:
                this.f833l = AbstractC3030l.loadAd;
                break;
            case 13:
                this.f833l = new C11349l();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f833l = new ConcurrentHashMap();
                break;
            default:
                C10094l c10094l = new C10094l();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c10094l.pro = AbstractC11432l.loadAd(0L, timeUnit);
                c10094l.ad = AbstractC11432l.loadAd(0L, timeUnit);
                c10094l.isVip = AbstractC11432l.loadAd(0L, timeUnit);
                c10094l.advert = AbstractC11432l.loadAd(0L, timeUnit);
                this.f833l = new C11610l(c10094l);
                break;
        }
    }

    /* JADX INFO: renamed from: lٌّۡ, reason: contains not printable characters */
    public static /* synthetic */ void m196l(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m197l(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public C18450l mo198abstract() {
        throw null;
    }

    @Override // defpackage.InterfaceC6984l
    public List advert(String str) {
        return (List) ((Map) this.f833l).get(str);
    }

    @Override // defpackage.InterfaceC15241l
    public int appmetrica(String str, String str2) {
        return mo232l(str, str2, (C6829l) this.f833l);
    }

    @Override // defpackage.InterfaceC6984l
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void mo199class(String str, List list) {
        List listM204l = m204l(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo210l((String) it.next());
        }
        AbstractC3984l.license(listM204l, list);
    }

    @Override // defpackage.InterfaceC6984l
    public void clear() {
        ((Map) this.f833l).clear();
    }

    @Override // defpackage.InterfaceC6984l
    public boolean contains(String str) {
        return ((Map) this.f833l).containsKey(str);
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public C8118l mo200else() {
        throw null;
    }

    public boolean equals(Object obj) {
        switch (this.f834l) {
            case 0:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.InterfaceC2853l
    public InterfaceC3841l getAnnotations() {
        InterfaceC3841l interfaceC3841l = (InterfaceC3841l) this.f833l;
        if (interfaceC3841l != null) {
            return interfaceC3841l;
        }
        m196l(1);
        throw null;
    }

    @Override // defpackage.InterfaceC6984l
    public boolean isEmpty() {
        return ((Map) this.f833l).isEmpty();
    }

    /* JADX INFO: renamed from: lؑؓۙ, reason: contains not printable characters */
    public abstract int mo201l();

    /* JADX INFO: renamed from: lًؑٝ, reason: contains not printable characters */
    public void m202l(String str, List list) {
        List list2 = (List) ((Map) this.f833l).get(str);
        Set setM4229l = list2 != null ? AbstractC16901l.m4229l(list2) : C5746l.f12138l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!setM4229l.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        mo199class(str, arrayList);
    }

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public boolean mo203l() {
        return !(this instanceof C9011l);
    }

    /* JADX INFO: renamed from: lؑۨٝ, reason: contains not printable characters */
    public List m204l(String str) {
        Map map = (Map) this.f833l;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo208l(str);
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public void m205l(String str) {
        ((Map) this.f833l).remove(str);
    }

    /* JADX INFO: renamed from: lؓۚ۟ */
    public Ccase mo9l(C11327l c11327l) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    /* JADX INFO: renamed from: lٕؓۡ, reason: contains not printable characters */
    public List m206l(C17385l c17385l, int i, long j) {
        C16977l c16977l = (C16977l) this.f833l;
        List list = (List) c16977l.loadAd(i);
        if (list != null) {
            return list;
        }
        List listYandex = c17385l.yandex(i);
        int size = listYandex.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC6357l) listYandex.get(i2)).adcel(j));
        }
        c16977l.subs(i, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public abstract InterfaceC9146l mo207l(int i, int i2, int i3, long j);

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lٍؘؘ, reason: contains not printable characters */
    public List mo209l() {
        return (List) this.f833l;
    }

    /* JADX INFO: renamed from: lؙؕؕ, reason: contains not printable characters */
    public void mo211l() {
        C17923l c17923l = ((C17417l) this.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
    }

    /* JADX INFO: renamed from: lؙؗٗ, reason: contains not printable characters */
    public String mo212l() {
        return null;
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public Context mo213l() {
        throw null;
    }

    @Override // defpackage.InterfaceC6984l
    /* JADX INFO: renamed from: lؙ۟ٙ, reason: contains not printable characters */
    public void mo214l(String str, String str2) {
        mo210l(str2);
        m204l(str).add(str2);
    }

    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public Ccase m215l(byte[] bArr) throws IOException {
        Ccase ccaseAdvert = Ccase.advert(bArr);
        m230l(ccaseAdvert);
        return ccaseAdvert;
    }

    /* JADX INFO: renamed from: lًَٙ, reason: contains not printable characters */
    public Object m216l(Object obj) {
        synchronized (((HashMap) this.f833l)) {
            try {
                if (((HashMap) this.f833l).containsKey(obj)) {
                    return ((HashMap) this.f833l).get(obj);
                }
                Object objMo219l = mo219l(obj);
                ((HashMap) this.f833l).put(obj, objMo219l);
                return objMo219l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lٍٙؐ, reason: contains not printable characters */
    public String m217l(String str) {
        List listAdvert = advert(str);
        if (listAdvert != null) {
            return (String) AbstractC16901l.m4217extends(listAdvert);
        }
        return null;
    }

    /* JADX INFO: renamed from: lٍ۟ۨ, reason: contains not printable characters */
    public Object m218l(InterfaceC0330l interfaceC0330l, AbstractC1068l abstractC1068l) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f833l;
        Object obj = concurrentHashMap.get(interfaceC0330l);
        if (obj != null) {
            return obj;
        }
        Object objMo220l = mo220l();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC0330l, objMo220l);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iMopub = abstractC1068l.mopub();
        for (int i = 0; i < iMopub; i++) {
            if (AbstractC13814l.billing.equals(abstractC1068l.admob(i))) {
                abstractC1068l.subs(i);
            }
        }
        return objMo220l;
    }

    /* JADX INFO: renamed from: lٍۤٙ, reason: contains not printable characters */
    public abstract Object mo219l(Object obj);

    /* JADX INFO: renamed from: lَٜؑ, reason: contains not printable characters */
    public abstract Object mo220l();

    /* JADX INFO: renamed from: lُٔۨ */
    public Ccase mo10l(Cclass cclass) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public Object mo221l(C13954l c13954l) {
        throw new IllegalStateException("Override provideCustomOfflineResponse first!");
    }

    /* JADX INFO: renamed from: lْؕ۠, reason: contains not printable characters */
    public Ccase m222l(Cfinal cfinal, boolean z) {
        AbstractC9027l.loadAd(cfinal);
        Ccase ccaseApplovin = cfinal.applovin(z, this);
        m230l(ccaseApplovin);
        return ccaseApplovin;
    }

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public void m223l(String str, String str2) {
        mo210l(str2);
        List listM204l = m204l(str);
        listM204l.clear();
        listM204l.add(str2);
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public C17923l mo224l() {
        throw null;
    }

    /* JADX INFO: renamed from: lؘْٔ, reason: contains not printable characters */
    public abstract void mo225l(C2434l c2434l);

    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public abstract AbstractC8189l mo226l();

    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public AbstractC14412l mo227l() {
        return new C7511l();
    }

    /* JADX INFO: renamed from: lٕۗٞ, reason: contains not printable characters */
    public abstract boolean mo228l();

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public abstract void mo229l(C10038l c10038l);

    /* JADX INFO: renamed from: lٖۡٓ, reason: contains not printable characters */
    public void m230l(Ccase ccase) {
        if (((Class) this.f833l).isInstance(ccase)) {
            return;
        }
        C8339l.smaato("unexpected object: ".concat(ccase.getClass().getName()));
    }

    @Override // defpackage.InterfaceC15782l
    /* JADX INFO: renamed from: lٖۥۡ, reason: contains not printable characters */
    public boolean mo231l() {
        List list = (List) this.f833l;
        return list.isEmpty() || (list.size() == 1 && ((C4529l) list.get(0)).crashlytics());
    }

    /* JADX INFO: renamed from: l٘ٗ۟, reason: contains not printable characters */
    public abstract int mo232l(String str, String str2, C6829l c6829l);

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public void m233l(InterfaceC18742l interfaceC18742l) {
        interfaceC18742l.isVip(new C3403l(this, 0));
    }

    @Override // defpackage.InterfaceC6984l
    public Set mopub() {
        return DesugarCollections.unmodifiableSet(((Map) this.f833l).entrySet());
    }

    @Override // defpackage.InterfaceC6984l
    public Set names() {
        return ((Map) this.f833l).keySet();
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public C6162l mo234package() {
        throw null;
    }

    @Override // defpackage.InterfaceC6984l
    public boolean pro() {
        return true;
    }

    @Override // defpackage.InterfaceC8699l
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public int mo235static(char[] cArr, int i, int i2) {
        int i3;
        Character ch = (Character) this.f833l;
        if (ch != null) {
            cArr[i] = ch.charValue();
            this.f833l = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !mo228l()) {
            int iMo201l = mo201l();
            if (iMo201l <= 65535) {
                cArr[i + i3] = (char) iMo201l;
                i3++;
            } else {
                char c = (char) ((iMo201l >>> 10) + 55232);
                char c2 = (char) ((iMo201l & 1023) + 56320);
                cArr[i + i3] = c;
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c2;
                    i3 += 2;
                } else {
                    this.f833l = Character.valueOf(c2);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    public String toString() {
        switch (this.f834l) {
            case 4:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f833l;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC16011l
    public AbstractC18041l yandex() {
        AbstractC18041l abstractC18041l = (AbstractC18041l) this.f833l;
        if (abstractC18041l != null) {
            return abstractC18041l;
        }
        m197l(1);
        throw null;
    }

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public void mo208l(String str) {
    }

    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    public void mo210l(String str) {
    }

    public /* synthetic */ Cgoto(int i, boolean z) {
        this.f834l = i;
    }

    public Cgoto(C17417l c17417l) {
        this.f834l = 16;
        AbstractC1051l.subs(c17417l);
        this.f833l = c17417l;
    }

    public Cgoto(OutputStream outputStream) {
        this.f834l = 15;
        EnumC6690l enumC6690l = EnumC6690l.f14038l;
        try {
            this.f833l = new C7972l(27, new OutputStreamWriter(outputStream, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public /* synthetic */ Cgoto(int i, Object obj) {
        this.f834l = i;
        this.f833l = obj;
    }

    public Cgoto(InterfaceC3841l interfaceC3841l) {
        this.f834l = 2;
        if (interfaceC3841l != null) {
            this.f833l = interfaceC3841l;
        } else {
            m196l(0);
            throw null;
        }
    }

    public Cgoto(AbstractC18041l abstractC18041l) {
        this.f834l = 1;
        if (abstractC18041l != null) {
            this.f833l = abstractC18041l;
        } else {
            m197l(0);
            throw null;
        }
    }

    public Cgoto(MediaCodecInfo mediaCodecInfo, String str) throws C8104l {
        this.f834l = 7;
        try {
            this.f833l = mediaCodecInfo.getCapabilitiesForType(str);
        } catch (RuntimeException e) {
            throw new C8104l("Unable to get CodecCapabilities for mime: ".concat(str), e);
        }
    }
}
