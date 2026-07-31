package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؙۨ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C6921l implements InterfaceC15102l, InterfaceC0112l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f14493l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f14494l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14495l;

    public C6921l(Context context, C7542l c7542l) {
        boolean z = true;
        this.f14495l = 1;
        this.f14494l = Build.VERSION.SDK_INT >= 34 && AbstractC5917l.smaato(context) != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer numLoadAd = c7542l != null ? c7542l.loadAd() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = zHasSystemFeature && (numLoadAd == null || numLoadAd.intValue() == 1);
        if (!zHasSystemFeature2 || (numLoadAd != null && numLoadAd.intValue() != 0)) {
            z = false;
        }
        this.f14493l = new C1609l(z2, z);
    }

    public static boolean firebase(Set set, C7542l c7542l) {
        try {
            c7542l.crashlytics(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void Signature(String str) {
        ((InterfaceC17475l) this.f14493l).mo1722synchronized(str);
    }

    public void ad(Object obj, InterfaceC0896l interfaceC0896l) {
        HashMap map = (HashMap) this.f14493l;
        if (map.containsKey(obj)) {
            C8936l.subs(AbstractC15560l.subscription(obj, "Another instance is already associated with the key: "));
            return;
        }
        map.put(obj, interfaceC0896l);
        if (this.f14494l) {
            interfaceC0896l.onDestroy();
        }
    }

    public void adcel(int i) {
        ((InterfaceC17475l) this.f14493l).writeLong(i);
    }

    public void admob() {
        if (this.f14494l) {
            return;
        }
        this.f14494l = true;
        Iterator it = AbstractC16901l.m4213const(((HashMap) this.f14493l).values()).iterator();
        while (it.hasNext()) {
            ((InterfaceC0896l) it.next()).onDestroy();
        }
    }

    public void ads(long j) {
        ((InterfaceC17475l) this.f14493l).writeLong(j);
    }

    @Override // defpackage.InterfaceC6984l
    public List advert(String str) {
        List listAdvert = ((InterfaceC0112l) this.f14493l).advert(AbstractC2208l.purchase(str, false));
        if (listAdvert == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listAdvert, 10));
        Iterator it = listAdvert.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2208l.amazon(0, 0, 11, (String) it.next()));
        }
        return arrayList;
    }

    public void amazon(int... iArr) {
        for (int i : iArr) {
            loadAd(i);
        }
    }

    public boolean billing() {
        return this.f14494l;
    }

    @Override // defpackage.InterfaceC0112l
    public InterfaceC14665l build() {
        return AbstractC11064l.amazon((InterfaceC0112l) this.f14493l);
    }

    @Override // defpackage.InterfaceC6984l
    /* JADX INFO: renamed from: class */
    public void mo199class(String str, List list) {
        InterfaceC0112l interfaceC0112l = (InterfaceC0112l) this.f14493l;
        String strPurchase = AbstractC2208l.purchase(str, false);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2208l.purchase((String) it.next(), true));
        }
        interfaceC0112l.mo199class(strPurchase, arrayList);
    }

    @Override // defpackage.InterfaceC6984l
    public void clear() {
        ((InterfaceC0112l) this.f14493l).clear();
    }

    @Override // defpackage.InterfaceC6984l
    public boolean contains(String str) {
        return ((InterfaceC0112l) this.f14493l).contains(AbstractC2208l.purchase(str, false));
    }

    public void crashlytics(C4094l c4094l) {
        for (int i = 0; i < c4094l.yandex.size(); i++) {
            loadAd(c4094l.loadAd(i));
        }
    }

    @Override // defpackage.InterfaceC6984l
    public boolean isEmpty() {
        return ((InterfaceC0112l) this.f14493l).isEmpty();
    }

    public int isPro() {
        int iBitLength = (((C6963l) this.f14493l).f14630l.bitLength() + 7) / 8;
        return this.f14494l ? iBitLength : iBitLength - 1;
    }

    public BigInteger license(BigInteger bigInteger) {
        String str;
        C6963l c6963l = (C6963l) this.f14493l;
        if (c6963l instanceof C6554l) {
            C6554l c6554l = (C6554l) c6963l;
            BigInteger bigInteger2 = c6554l.f13683l;
            if (bigInteger2 != null || AbstractC8151l.crashlytics("org.bouncycastle.rsa.no_lenstra_check")) {
                BigInteger bigInteger3 = c6554l.f13679l;
                BigInteger bigInteger4 = c6554l.f13680l;
                BigInteger bigInteger5 = c6554l.f13682l;
                BigInteger bigInteger6 = c6554l.f13681l;
                BigInteger bigInteger7 = c6554l.f13684l;
                BigInteger bigIntegerModPow = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
                BigInteger bigIntegerModPow2 = bigInteger.remainder(bigInteger4).modPow(bigInteger6, bigInteger4);
                BigInteger bigIntegerAdd = bigIntegerModPow.subtract(bigIntegerModPow2).multiply(bigInteger7).mod(bigInteger3).multiply(bigInteger4).add(bigIntegerModPow2);
                if (bigInteger2 == null || bigIntegerAdd.modPow(bigInteger2, c6554l.f14630l).equals(bigInteger)) {
                    return bigIntegerAdd;
                }
            } else {
                str = ((C6963l) this.f14493l).f14629l == null ? "null exponent, should \"org.bouncycastle.rsa.no_lenstra_check\" be enabled?" : "RSA engine faulty decryption/signing detected";
            }
            C8339l.smaato(str);
            return null;
        }
        C6963l c6963l2 = (C6963l) this.f14493l;
        return bigInteger.modPow(c6963l2.f14629l, c6963l2.f14630l);
    }

    public void loadAd(int i) {
        AbstractC12442l.subscription(!this.f14494l);
        ((SparseBooleanArray) this.f14493l).append(i, true);
    }

    @Override // defpackage.InterfaceC6984l
    /* JADX INFO: renamed from: lؙ۟ٙ */
    public void mo214l(String str, String str2) {
        ((InterfaceC0112l) this.f14493l).mo214l(AbstractC2208l.purchase(str, false), AbstractC2208l.purchase(str2, true));
    }

    public void metrica(byte b) {
        ((InterfaceC17475l) this.f14493l).writeLong(b);
    }

    @Override // defpackage.InterfaceC6984l
    public Set mopub() {
        return ((AbstractC17722l) AbstractC11064l.amazon((InterfaceC0112l) this.f14493l)).mopub();
    }

    @Override // defpackage.InterfaceC6984l
    public Set names() {
        Set setNames = ((InterfaceC0112l) this.f14493l).names();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(setNames, 10));
        Iterator it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC2208l.amazon(0, 0, 15, (String) it.next()));
        }
        return AbstractC16901l.m4229l(arrayList);
    }

    public void premium(C2974l c2974l) throws C18281l {
        C1609l c1609l = (C1609l) this.f14493l;
        if (this.f14494l) {
            AbstractC5088l.yandex("CameraValidator", "Virtual device with " + c2974l.amazon().size() + " cameras. Skipping validation.");
            return;
        }
        AbstractC5088l.yandex("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (c1609l.yandex) {
            try {
                C7542l.crashlytics.crashlytics(c2974l.amazon());
            } catch (RuntimeException e) {
                e = e;
                AbstractC5088l.Signature("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (c1609l.loadAd) {
            try {
                C7542l.loadAd.crashlytics(c2974l.amazon());
            } catch (RuntimeException e2) {
                AbstractC5088l.Signature("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new C18281l(c2974l.amazon().size(), e);
        }
    }

    @Override // defpackage.InterfaceC6984l
    public boolean pro() {
        return this.f14494l;
    }

    public C4094l purchase() {
        AbstractC12442l.subscription(!this.f14494l);
        this.f14494l = true;
        return new C4094l((SparseBooleanArray) this.f14493l);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean remoteconfig(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            C11983l.crashlytics();
            return false;
        }
        if (((C17334l) this.f14493l) == null) {
            return billing();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C6921l c6921l = AbstractC11407l.yandex;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case 16:
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return billing();
        }
        return false;
    }

    public boolean smaato(LinkedHashSet linkedHashSet, Set set) {
        C1609l c1609l = (C1609l) this.f14493l;
        if (!this.f14494l) {
            boolean z = c1609l.yandex;
            boolean z2 = c1609l.loadAd;
            if (z || z2) {
                boolean zFirebase = firebase(linkedHashSet, C7542l.crashlytics);
                boolean zFirebase2 = firebase(linkedHashSet, C7542l.loadAd);
                Set set2 = set;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C12130l) it.next()).yandex());
                }
                Set setM4229l = AbstractC16901l.m4229l(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (!setM4229l.contains(((InterfaceC18690l) obj).adcel().mopub())) {
                        arrayList2.add(obj);
                    }
                }
                Set setM4229l2 = AbstractC16901l.m4229l(arrayList2);
                boolean zFirebase3 = firebase(setM4229l2, C7542l.crashlytics);
                boolean zFirebase4 = firebase(setM4229l2, C7542l.loadAd);
                boolean z3 = c1609l.yandex && zFirebase && !zFirebase3;
                boolean z4 = z2 && zFirebase2 && !zFirebase4;
                if (z3 || z4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void startapp(char c) {
        ((InterfaceC17475l) this.f14493l).premium(c);
    }

    public int subs() {
        int iBitLength = (((C6963l) this.f14493l).f14630l.bitLength() + 7) / 8;
        return this.f14494l ? iBitLength - 1 : iBitLength;
    }

    public void subscription(String str) {
        ((InterfaceC17475l) this.f14493l).mo1723throw(str);
    }

    public void tapsense(short s) {
        ((InterfaceC17475l) this.f14493l).writeLong(s);
    }

    public String toString() {
        switch (this.f14495l) {
            case 6:
                return this.f14494l ? "FALL_THROUGH" : String.valueOf(this.f14493l);
            case 10:
                StringBuilder sb = new StringBuilder();
                sb.append((int) ((((long[]) this.f14493l)[1] >>> 56) & 63));
                sb.append(" first: ");
                sb.append((((long[]) this.f14493l)[1] & 4611686018427387904L) != 0);
                sb.append(", final: ");
                sb.append((((long[]) this.f14493l)[1] & Long.MIN_VALUE) != 0);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void vip() {
        this.f14494l = false;
    }

    @Override // defpackage.InterfaceC15102l
    public void yandex(C14362l c14362l, int i) {
        StringBuilder sb = (StringBuilder) this.f14493l;
        if (this.f14494l) {
            this.f14494l = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public void isVip() {
    }

    public void signatures() {
    }

    public /* synthetic */ C6921l(Object obj, int i, boolean z) {
        this.f14495l = i;
        this.f14493l = obj;
        this.f14494l = true;
    }

    public /* synthetic */ C6921l(Object obj, boolean z, int i) {
        this.f14495l = i;
        this.f14493l = obj;
        this.f14494l = z;
    }

    public C6921l(int i) {
        this.f14495l = i;
        switch (i) {
            case 5:
                this.f14493l = new SparseBooleanArray();
                break;
            default:
                this.f14493l = new HashMap();
                break;
        }
    }

    public C6921l(InterfaceC0112l interfaceC0112l) {
        this.f14495l = 13;
        this.f14493l = interfaceC0112l;
        this.f14494l = interfaceC0112l.pro();
    }

    public C6921l(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this.f14495l = 7;
        C17735l c17735l = AbstractC18532l.yandex;
        if (AbstractC18532l.yandex.loadAd(LowMemoryQuirk.class) != null) {
            new ExecutorC7870l(executor);
        }
        this.f14493l = c17735l;
        this.f14494l = c17735l.yandex(IncorrectJpegMetadataQuirk.class);
    }

    public /* synthetic */ C6921l(int i, Object obj) {
        this.f14495l = i;
        this.f14493l = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6921l(C17334l c17334l, boolean z) {
        this(11, c17334l);
        this.f14495l = 11;
        this.f14494l = z;
    }
}
