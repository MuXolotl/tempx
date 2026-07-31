package defpackage;

import android.graphics.Color;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function3;
import org.json.JSONObject;

/* JADX INFO: renamed from: lؚٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17334l implements InterfaceC3509l, InterfaceC12702l, InterfaceC14555l, InterfaceC5152l, InterfaceC16230l, InterfaceC13540l, InterfaceC8396l, InterfaceC6632l, InterfaceC1076l, InterfaceC5404l, InterfaceC12101l, InterfaceC17030l, InterfaceC0248l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33665l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C17334l f33651l = new C17334l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C17334l f33645l = new C17334l(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C17334l f33657l = new C17334l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C17334l f33656l = new C17334l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C17334l f33660l = new C17334l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C17334l f33646l = new C17334l(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C17334l f33649l = new C17334l(7);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C17334l f33659l = new C17334l(8);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C17334l f33654l = new C17334l(9);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C17334l f33661l = new C17334l(10);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C17334l f33658l = new C17334l(11);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C17334l f33644l = new C17334l(12);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C17334l f33662l = new C17334l(13);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C17334l f33655l = new C17334l(14);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C17334l f33650l = new C17334l(15);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C17334l f33653l = new C17334l(16);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C17334l f33663l = new C17334l(17);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C17334l f33652l = new C17334l(18);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C17334l f33648l = new C17334l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C17334l f33647l = new C17334l(20);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C17334l f33643l = new C17334l(21);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C17334l f33664l = new C17334l(22);

    public /* synthetic */ C17334l(int i) {
        this.f33665l = i;
    }

    /* JADX INFO: renamed from: lؚْٟ, reason: contains not printable characters */
    public static void m4311l(Object obj) {
        throw new C3150l("This method should not be called on " + obj + " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue");
    }

    /* JADX INFO: renamed from: lْٓؒ, reason: contains not printable characters */
    public static C6871l m4312l(C15655l c15655l) {
        return new C6871l(System.currentTimeMillis() + 3600000, new C14513l(8, 20, (byte) 0), new C10458l(2, true, false, false), 10.0d, 1.2d, 60);
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final C5628l m4313transient(C17334l c17334l, String str) {
        C5628l c5628l = new C5628l(str);
        C5628l.amazon.put(str, c5628l);
        return c5628l;
    }

    @Override // defpackage.InterfaceC5404l
    public void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        int i2 = 0;
        if (enumC9931l == EnumC9931l.f20223l) {
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int length = iArr.length;
            int i5 = i - i3;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i8;
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: abstract */
    public boolean mo1158abstract(InterfaceC0583l interfaceC0583l) {
        InterfaceC0583l interfaceC0583lMo1163const = mo1163const(interfaceC0583l);
        return (interfaceC0583lMo1163const != null ? mo1213return(interfaceC0583lMo1163const) : null) != null;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean ad(InterfaceC0583l interfaceC0583l) {
        return mo1209package(interfaceC0583l) instanceof InterfaceC1388l;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean admob(InterfaceC13340l interfaceC13340l) {
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC13789l ads(InterfaceC0218l interfaceC0218l) {
        return (InterfaceC13789l) ((C8291l) interfaceC0218l).yandex.loadAd;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0218l advert(InterfaceC0583l interfaceC0583l, int i) {
        if (i < 0 || i >= mopub(interfaceC0583l)) {
            return null;
        }
        return mo1199l(interfaceC0583l, i);
    }

    @Override // defpackage.InterfaceC5404l
    public /* synthetic */ float amazon() {
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC14555l
    public Collection appmetrica(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1388l) {
            List listYandex = ((InterfaceC1388l) interfaceC2224l).yandex();
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
            Iterator it = listYandex.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC13789l) ((InterfaceC13012l) it.next()));
            }
            return arrayList;
        }
        if (interfaceC2224l instanceof AbstractC11726l) {
            List upperBounds = ((AbstractC11726l) interfaceC2224l).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(upperBounds, 10));
            Iterator it2 = upperBounds.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC13789l) ((InterfaceC13012l) it2.next()));
            }
            return arrayList2;
        }
        if (!(interfaceC2224l instanceof C9788l)) {
            StringBuilder sbSignature = AbstractC14814l.Signature("Unsupported type constructor: ", interfaceC2224l, " (");
            sbSignature.append(interfaceC2224l.getClass().getName());
            sbSignature.append(')');
            throw new IllegalStateException(sbSignature.toString().toString());
        }
        ArrayList arrayList3 = ((C9788l) interfaceC2224l).f19959l;
        if (arrayList3 == null) {
            arrayList3 = null;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add((InterfaceC13789l) ((InterfaceC13012l) it3.next()));
        }
        return arrayList4;
    }

    @Override // defpackage.InterfaceC17030l
    public long billing(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = AbstractC7789l.yandex;
            return jFloatToRawIntBits;
        }
        float fYandex = AbstractC8513l.yandex(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fYandex)) << 32) | (((long) Float.floatToRawIntBits(fYandex)) & 4294967295L);
        int i2 = AbstractC7789l.yandex;
        return jFloatToRawIntBits2;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: break */
    public boolean mo1159break(InterfaceC2224l interfaceC2224l) {
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: catch */
    public Collection mo1161catch(InterfaceC0583l interfaceC0583l) {
        m4311l(interfaceC0583l);
        throw null;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: class */
    public InterfaceC0583l mo1162class(InterfaceC13789l interfaceC13789l) {
        AbstractC6786l abstractC6786lMo1765catch;
        InterfaceC5272l interfaceC5272lMo1166finally = mo1166finally(interfaceC13789l);
        return (interfaceC5272lMo1166finally == null || (abstractC6786lMo1765catch = ((AbstractC6786l) interfaceC5272lMo1166finally).mo1765catch()) == null) ? mo1163const(interfaceC13789l) : abstractC6786lMo1765catch;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: const */
    public InterfaceC0583l mo1163const(InterfaceC13789l interfaceC13789l) {
        if (mo1166finally(interfaceC13789l) != null) {
            return null;
        }
        return (InterfaceC0583l) interfaceC13789l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        Function3 function3 = (Function3) abstractC5563l;
        C13975l c13975l = C13308l.loadAd;
        C17535l c17535l = (C17535l) c16864l.f32917l.billing(AbstractC14576l.yandex);
        InterfaceC14029l interfaceC14029l = null;
        Object objBilling = c17535l != null ? c17535l.billing(C13308l.crashlytics) : null;
        if (objBilling != null) {
            ((C13308l) objBilling).yandex.add(new C12207l(function3, c16864l, interfaceC14029l, 7));
            return;
        }
        StringBuilder sb = new StringBuilder("Plugin ");
        sb.append(c13975l);
        C11911l c11911l = C13308l.crashlytics;
        sb.append(" is not installed. Consider using `install(");
        sb.append(c11911l);
        sb.append(")` in client config first.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.InterfaceC6632l
    public C15683l crashlytics(Class cls) {
        if (!AbstractC0288l.class.isAssignableFrom(cls)) {
            C8339l.metrica("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (C15683l) AbstractC0288l.vip(cls.asSubclass(AbstractC0288l.class)).subscription(3);
        } catch (Exception e) {
            C18073l.Signature("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC12702l
    /* JADX INFO: renamed from: default */
    public Object mo1290default(AbstractC9542l abstractC9542l, float f) {
        switch (this.f33665l) {
            case 2:
                boolean z = abstractC9542l.mo1287synchronized() == 1;
                if (z) {
                    abstractC9542l.yandex();
                }
                double dSignatures = abstractC9542l.signatures();
                double dSignatures2 = abstractC9542l.signatures();
                double dSignatures3 = abstractC9542l.signatures();
                double dSignatures4 = abstractC9542l.mo1287synchronized() == 7 ? abstractC9542l.signatures() : 1.0d;
                if (z) {
                    abstractC9542l.mopub();
                }
                if (dSignatures <= 1.0d && dSignatures2 <= 1.0d && dSignatures3 <= 1.0d) {
                    dSignatures *= 255.0d;
                    dSignatures2 *= 255.0d;
                    dSignatures3 *= 255.0d;
                    if (dSignatures4 <= 1.0d) {
                        dSignatures4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dSignatures4, (int) dSignatures, (int) dSignatures2, (int) dSignatures3));
            case 3:
            default:
                return AbstractC14878l.loadAd(abstractC9542l, f);
            case 4:
                return Float.valueOf(AbstractC14878l.amazon(abstractC9542l) * f);
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: else */
    public InterfaceC13789l mo1164else(InterfaceC13789l interfaceC13789l) {
        m4311l(interfaceC13789l);
        throw null;
    }

    @Override // defpackage.InterfaceC0248l
    /* JADX INFO: renamed from: extends */
    public C6871l mo368extends(C15655l c15655l, JSONObject jSONObject) {
        return m4312l(c15655l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: final */
    public InterfaceC0218l mo1165final(InterfaceC13789l interfaceC13789l) {
        m4311l(interfaceC13789l);
        throw null;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: finally */
    public InterfaceC5272l mo1166finally(InterfaceC13789l interfaceC13789l) {
        if (!(interfaceC13789l instanceof AbstractC6786l) || ((AbstractC6786l) interfaceC13789l).mo1767extends() == null) {
            return null;
        }
        return (InterfaceC5272l) interfaceC13789l;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0583l firebase(InterfaceC5272l interfaceC5272l) {
        return ((AbstractC6786l) interfaceC5272l).mo1765catch();
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: for */
    public boolean mo1167for(InterfaceC0583l interfaceC0583l) {
        mo1209package(interfaceC0583l);
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: goto */
    public /* bridge */ boolean mo1168goto(InterfaceC0583l interfaceC0583l, InterfaceC0583l interfaceC0583l2) {
        return false;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public boolean m4314implements(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: import */
    public boolean mo1169import(InterfaceC2224l interfaceC2224l, InterfaceC2224l interfaceC2224l2) {
        return interfaceC2224l.equals(interfaceC2224l2);
    }

    @Override // defpackage.InterfaceC14555l
    public boolean inmobi(InterfaceC2224l interfaceC2224l) {
        return !(interfaceC2224l instanceof C9788l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: instanceof */
    public /* bridge */ boolean mo1170instanceof(InterfaceC13789l interfaceC13789l) {
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: interface */
    public InterfaceC13340l mo1171interface(InterfaceC6913l interfaceC6913l) {
        if (interfaceC6913l instanceof InterfaceC13340l) {
            return (InterfaceC13340l) interfaceC6913l;
        }
        return null;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0583l isPro(InterfaceC0583l interfaceC0583l) {
        return ((AbstractC6786l) interfaceC0583l).mo1771throw(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC14555l
    public int isVip(InterfaceC13199l interfaceC13199l) {
        int iInmobi = AbstractC5020l.inmobi(((AbstractC11726l) interfaceC13199l).amazon());
        if (iInmobi == 0) {
            return 3;
        }
        if (iInmobi == 1) {
            return 1;
        }
        if (iInmobi == 2) {
            return 2;
        }
        C18725l.billing();
        return 0;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean license(InterfaceC2224l interfaceC2224l) {
        return interfaceC2224l instanceof InterfaceC1388l;
    }

    @Override // defpackage.InterfaceC6632l
    public boolean loadAd(Class cls) {
        return AbstractC0288l.class.isAssignableFrom(cls);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؚۣؒ */
    public boolean mo1173l(InterfaceC13789l interfaceC13789l) {
        return ((InterfaceC13012l) interfaceC13789l).Signature();
    }

    /* JADX INFO: renamed from: lۣؒٞ, reason: contains not printable characters */
    public synchronized C5628l m4315l(String str) {
        C5628l c5628l;
        String strConcat;
        try {
            LinkedHashMap linkedHashMap = C5628l.amazon;
            c5628l = (C5628l) linkedHashMap.get(str);
            if (c5628l == null) {
                if (AbstractC16648l.isVip(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = AbstractC16648l.isVip(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                c5628l = (C5628l) linkedHashMap.get(strConcat);
                if (c5628l == null) {
                    c5628l = new C5628l(str);
                }
                linkedHashMap.put(str, c5628l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5628l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؒۢۜ */
    public InterfaceC6440l mo1174l(InterfaceC0583l interfaceC0583l) {
        return (InterfaceC6440l) interfaceC0583l;
    }

    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public void m4316l(String str) {
        if (m4314implements(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؔٙؕ */
    public boolean mo1178l(InterfaceC2224l interfaceC2224l) {
        EnumC9790l enumC9790l;
        if (interfaceC2224l instanceof C5160l) {
            C5160l c5160l = (C5160l) interfaceC2224l;
            Class cls = c5160l.f11212l;
            C9095l c9095lM1729instanceof = c5160l.m1729instanceof();
            if (c9095lM1729instanceof != null) {
                C10038l c10038l = AbstractC15547l.loadAd;
                InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[7];
                enumC9790l = (EnumC9790l) c10038l.m2845finally(c9095lM1729instanceof);
                if (enumC9790l == null) {
                    if (!cls.isAnnotation() || cls.isEnum()) {
                        enumC9790l = EnumC9790l.FINAL;
                    } else {
                        C12014l c12014l = AbstractC7477l.loadAd;
                        Boolean bool = null;
                        if (c12014l == null) {
                            try {
                                c12014l = new C12014l(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 16);
                            } catch (NoSuchMethodException unused) {
                                c12014l = new C12014l(bool, bool, bool, bool, 16);
                            }
                            AbstractC7477l.loadAd = c12014l;
                        }
                        Method method = (Method) c12014l.f23941l;
                        if (AbstractC8576l.yandex(method != null ? (Boolean) method.invoke(cls, null) : null, Boolean.TRUE)) {
                            enumC9790l = EnumC9790l.SEALED;
                        } else if (Modifier.isAbstract(cls.getModifiers())) {
                            enumC9790l = EnumC9790l.ABSTRACT;
                        } else {
                            enumC9790l = !Modifier.isFinal(cls.getModifiers()) ? EnumC9790l.OPEN : EnumC9790l.FINAL;
                        }
                    }
                }
            } else if (cls.isAnnotation()) {
                enumC9790l = EnumC9790l.FINAL;
            } else {
                enumC9790l = EnumC9790l.FINAL;
            }
            if (enumC9790l == EnumC9790l.FINAL && c5160l.m1728import() != EnumC18401l.ENUM_CLASS && c5160l.m1728import() != EnumC18401l.ENUM_ENTRY && c5160l.m1728import() != EnumC18401l.ANNOTATION_CLASS) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: lؘِٞ, reason: contains not printable characters */
    public void m4317l(String str, Exception exc) {
        if (m4314implements(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public boolean mo1186l(InterfaceC13340l interfaceC13340l) {
        return false;
    }

    /* JADX INFO: renamed from: lؘْؒ, reason: contains not printable characters */
    public void m4318l(String str) {
        if (m4314implements(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public boolean mo1192l(InterfaceC13789l interfaceC13789l) {
        return !AbstractC8576l.yandex(mo1209package(signatures(interfaceC13789l)), mo1209package(mo1162class(interfaceC13789l)));
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lٕؓٗ */
    public InterfaceC13789l mo1195l(InterfaceC13789l interfaceC13789l) {
        m4311l(interfaceC13789l);
        throw null;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lَٖؔ */
    public InterfaceC0218l mo1197l(InterfaceC6440l interfaceC6440l, int i) {
        if (interfaceC6440l instanceof InterfaceC6913l) {
            return mo1199l((InterfaceC13789l) interfaceC6440l, i);
        }
        if (interfaceC6440l instanceof C8469l) {
            return (InterfaceC0218l) ((C8469l) interfaceC6440l).get(i);
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC6440l);
        C11983l.adcel(sb, AbstractC18202l.yandex.loadAd(interfaceC6440l.getClass()));
        return null;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lَٖؕ */
    public InterfaceC0218l mo1199l(InterfaceC13789l interfaceC13789l, int i) {
        return new C8291l((C0861l) ((InterfaceC13012l) interfaceC13789l).mo1617throws().get(i));
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: lؙٗٙ */
    public boolean mo1203l(InterfaceC2224l interfaceC2224l) {
        return interfaceC2224l.equals(C8488l.f17542l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public boolean mo1205l(InterfaceC2224l interfaceC2224l) {
        return interfaceC2224l.equals(AbstractC18202l.yandex.loadAd(Object.class));
    }

    @Override // defpackage.InterfaceC14555l
    public int metrica(InterfaceC6440l interfaceC6440l) {
        if (interfaceC6440l instanceof InterfaceC0583l) {
            return mopub((InterfaceC13789l) interfaceC6440l);
        }
        if (interfaceC6440l instanceof C8469l) {
            return ((C8469l) interfaceC6440l).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC6440l);
        C11983l.adcel(sb, AbstractC18202l.yandex.loadAd(interfaceC6440l.getClass()));
        return 0;
    }

    @Override // defpackage.InterfaceC14555l
    public int mopub(InterfaceC13789l interfaceC13789l) {
        return ((InterfaceC13012l) interfaceC13789l).mo1617throws().size();
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: new */
    public InterfaceC0218l mo1208new(InterfaceC1633l interfaceC1633l) {
        return new C8291l(((C9788l) interfaceC1633l).f19960l);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: package */
    public InterfaceC2224l mo1209package(InterfaceC0583l interfaceC0583l) {
        Class<?> componentType;
        if (interfaceC0583l instanceof C5898l) {
            return ((C5898l) interfaceC0583l).f12436l;
        }
        AbstractC6786l abstractC6786l = (AbstractC6786l) interfaceC0583l;
        if (abstractC6786l.premium()) {
            return C8488l.f17542l;
        }
        InterfaceC1122l interfaceC1122lMo1616package = abstractC6786l.mo1616package();
        C5160l c5160l = interfaceC1122lMo1616package instanceof C5160l ? (C5160l) interfaceC1122lMo1616package : null;
        if (c5160l != null && (componentType = c5160l.f11212l.getComponentType()) != null && !componentType.isPrimitive()) {
            return (InterfaceC2224l) AbstractC18202l.yandex.loadAd(Object[].class);
        }
        InterfaceC1122l interfaceC1122lRemoteconfig = abstractC6786l.remoteconfig();
        if (interfaceC1122lRemoteconfig == null) {
            interfaceC1122lRemoteconfig = abstractC6786l.mo1616package();
        }
        return (InterfaceC2224l) interfaceC1122lRemoteconfig;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC13789l premium(InterfaceC13340l interfaceC13340l) {
        return (InterfaceC13789l) ((C5898l) interfaceC13340l).f12437l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: private */
    public boolean mo1210private(InterfaceC0583l interfaceC0583l) {
        return m4319while(interfaceC0583l) != null;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean pro(InterfaceC0583l interfaceC0583l) {
        if (!mo1219this(interfaceC0583l).equals(C8488l.f17542l)) {
            return false;
        }
        m4311l(interfaceC0583l);
        throw null;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: protected */
    public InterfaceC0583l mo1211protected(InterfaceC0583l interfaceC0583l) {
        List listMo1617throws;
        int i;
        InterfaceC13012l interfaceC13012l = (InterfaceC13012l) interfaceC0583l;
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        InterfaceC1388l interfaceC1388l = interfaceC1122lMo1616package instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122lMo1616package : null;
        if (interfaceC1388l != null && ((listMo1617throws = interfaceC13012l.mo1617throws()) == null || !listMo1617throws.isEmpty())) {
            Iterator it = listMo1617throws.iterator();
            while (it.hasNext()) {
                if (((C0861l) it.next()).yandex != 1) {
                    List listYandex = C9552l.yandex(interfaceC1388l);
                    if (listYandex.size() != listMo1617throws.size()) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listMo1617throws, 10));
                    Iterator it2 = listMo1617throws.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C0861l c0861lSmaato = (C0861l) it2.next();
                        int i2 = c0861lSmaato.yandex;
                        if (i2 != 1) {
                            InterfaceC13012l interfaceC13012l2 = c0861lSmaato.loadAd;
                            if (i2 != 2) {
                                interfaceC13012l2 = null;
                            }
                            C0861l c0861l = C0861l.crashlytics;
                            c0861lSmaato = AbstractC12953l.smaato(new C5898l(interfaceC13012l2, new C9788l(c0861lSmaato), false));
                        }
                        arrayList.add(c0861lSmaato);
                    }
                    C6702l c6702l = C6702l.loadAd;
                    C6702l c6702l2 = new C6702l(AbstractC8676l.subscription(AbstractC16901l.m4226l(arrayList, C9552l.yandex(interfaceC1388l))));
                    int size = listMo1617throws.size();
                    for (i = 0; i < size; i++) {
                        C0861l c0861l2 = (C0861l) listMo1617throws.get(i);
                        if (c0861l2.yandex != 1) {
                            List upperBounds = ((AbstractC11726l) listYandex.get(i)).getUpperBounds();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(c6702l2.yandex(1, (InterfaceC13012l) it3.next()).loadAd);
                            }
                            if (c0861l2.yandex == 3) {
                                arrayList2.add(c0861l2.loadAd);
                            }
                            ((C5898l) ((C0861l) arrayList.get(i)).loadAd).f12436l.f19959l = arrayList2;
                        }
                    }
                    boolean zSignature = interfaceC13012l.Signature();
                    List annotations = interfaceC13012l.getAnnotations();
                    boolean z = interfaceC13012l instanceof AbstractC6786l;
                    AbstractC6786l abstractC6786l = z ? (AbstractC6786l) interfaceC13012l : null;
                    InterfaceC13012l interfaceC13012lSubs = abstractC6786l != null ? abstractC6786l.subs() : null;
                    AbstractC6786l abstractC6786l2 = z ? (AbstractC6786l) interfaceC13012l : null;
                    return new C13267l(interfaceC1388l, arrayList, zSignature, annotations, interfaceC13012lSubs, false, false, false, abstractC6786l2 != null ? abstractC6786l2.remoteconfig() : null, null);
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean purchase(InterfaceC13199l interfaceC13199l, InterfaceC2224l interfaceC2224l) {
        m4311l(interfaceC13199l);
        throw null;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean remoteconfig(InterfaceC0583l interfaceC0583l) {
        AbstractC18041l abstractC18041l;
        if (!(interfaceC0583l instanceof AbstractC6786l) || !(((AbstractC6786l) interfaceC0583l).mo1616package() instanceof C18551l)) {
            C5380l c5380l = interfaceC0583l instanceof C5380l ? (C5380l) interfaceC0583l : null;
            if (c5380l == null || (abstractC18041l = c5380l.f11513l) == null || !AbstractC11748l.subs(abstractC18041l)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: return */
    public InterfaceC13340l mo1213return(InterfaceC0583l interfaceC0583l) {
        InterfaceC14361l interfaceC14361lM4319while = m4319while(interfaceC0583l);
        if (interfaceC14361lM4319while == null) {
            return mo1171interface((InterfaceC6913l) interfaceC0583l);
        }
        m4311l(interfaceC14361lM4319while);
        throw null;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0583l signatures(InterfaceC13789l interfaceC13789l) {
        AbstractC6786l abstractC6786lMo1767extends;
        InterfaceC5272l interfaceC5272lMo1166finally = mo1166finally(interfaceC13789l);
        return (interfaceC5272lMo1166finally == null || (abstractC6786lMo1767extends = ((AbstractC6786l) interfaceC5272lMo1166finally).mo1767extends()) == null) ? mo1163const(interfaceC13789l) : abstractC6786lMo1767extends;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC0583l smaato(InterfaceC5272l interfaceC5272l) {
        return ((AbstractC6786l) interfaceC5272l).mo1767extends();
    }

    @Override // defpackage.InterfaceC14555l
    public int startapp(InterfaceC0218l interfaceC0218l) {
        int i = ((C8291l) interfaceC0218l).yandex.yandex;
        if (i == 0) {
            return 2;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return 3;
        }
        if (iInmobi == 1) {
            return 1;
        }
        if (iInmobi == 2) {
            return 2;
        }
        C18725l.billing();
        return 0;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: static */
    public InterfaceC13789l mo1214static(ArrayList arrayList) {
        m4311l(this);
        throw null;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: strictfp */
    public boolean mo1215strictfp(InterfaceC13789l interfaceC13789l) {
        return ((InterfaceC13012l) signatures(interfaceC13789l)).Signature() != ((InterfaceC13012l) mo1162class(interfaceC13789l)).Signature();
    }

    @Override // defpackage.InterfaceC14555l
    public boolean subscription(InterfaceC2224l interfaceC2224l) {
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: super */
    public InterfaceC13199l mo1216super(InterfaceC2224l interfaceC2224l, int i) {
        return (C9243l) C9552l.yandex((InterfaceC1388l) interfaceC2224l).get(i);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: switch */
    public int mo1217switch(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1388l) {
            return C9552l.yandex((InterfaceC1388l) interfaceC2224l).size();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: synchronized */
    public int mo1218synchronized(InterfaceC13340l interfaceC13340l) {
        return 1;
    }

    @Override // defpackage.InterfaceC14555l
    public InterfaceC1633l tapsense(InterfaceC13340l interfaceC13340l) {
        return ((C5898l) interfaceC13340l).f12436l;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: this */
    public InterfaceC2224l mo1219this(InterfaceC13789l interfaceC13789l) {
        InterfaceC0583l interfaceC0583lMo1163const = mo1163const(interfaceC13789l);
        if (interfaceC0583lMo1163const == null) {
            interfaceC0583lMo1163const = signatures(interfaceC13789l);
        }
        return mo1209package(interfaceC0583lMo1163const);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: throw */
    public AbstractC12027l mo1220throw(InterfaceC0583l interfaceC0583l) {
        C6702l c6702l = C6702l.loadAd;
        return new C11818l(AbstractC9843l.billing((InterfaceC13012l) interfaceC0583l));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C10737l c10737l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C4895l c4895l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C16235l c16235l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        int i = this.f33665l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C10737l) {
                    c10737l = (C10737l) abstractC0283l;
                    int i2 = c10737l.f21735l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10737l.f21735l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10737l = new C10737l(this, abstractC0283l);
                    }
                } else {
                    c10737l = new C10737l(this, abstractC0283l);
                }
                Object objYandex = c10737l.f21736l;
                int i3 = c10737l.f21735l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C3346l.class)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c10737l.f21735l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c10737l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C4895l) {
                    c4895l = (C4895l) abstractC0283l;
                    int i4 = c4895l.f9985l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4895l.f9985l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4895l = new C4895l(this, abstractC0283l);
                    }
                } else {
                    c4895l = new C4895l(this, abstractC0283l);
                }
                Object objYandex2 = c4895l.f9986l;
                int i5 = c4895l.f9985l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C18292l.class)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c4895l.f9985l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c4895l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C16235l) {
                    c16235l = (C16235l) abstractC0283l;
                    int i6 = c16235l.f31775l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c16235l.f31775l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c16235l = new C16235l(this, abstractC0283l);
                    }
                } else {
                    c16235l = new C16235l(this, abstractC0283l);
                }
                Object objYandex3 = c16235l.f31776l;
                int i7 = c16235l.f31775l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C7906l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c16235l.f31775l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c16235l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f33665l) {
            case 1:
                return "<unknown>";
            case 16:
                return "{}";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "Arrangement#End";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1076l
    /* JADX INFO: renamed from: try */
    public boolean mo248try(MenuC4984l menuC4984l) {
        return false;
    }

    @Override // defpackage.InterfaceC14555l
    public boolean vip(InterfaceC0218l interfaceC0218l) {
        C0861l c0861l = ((C8291l) interfaceC0218l).yandex;
        C0861l c0861l2 = C0861l.crashlytics;
        return AbstractC8576l.yandex(c0861l, C0861l.crashlytics);
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: volatile */
    public boolean mo1223volatile(InterfaceC13789l interfaceC13789l) {
        InterfaceC0583l interfaceC0583lMo1163const = mo1163const(interfaceC13789l);
        return (interfaceC0583lMo1163const != null ? m4319while(interfaceC0583lMo1163const) : null) != null;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public InterfaceC14361l m4319while(InterfaceC0583l interfaceC0583l) {
        if ((interfaceC0583l instanceof AbstractC6786l) && ((AbstractC6786l) interfaceC0583l).pro()) {
            return (InterfaceC14361l) interfaceC0583l;
        }
        return null;
    }

    @Override // defpackage.InterfaceC14555l
    public void adcel(InterfaceC13789l interfaceC13789l) {
    }

    @Override // defpackage.InterfaceC12101l
    public long applovin(long j) {
        return j;
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: case */
    public void mo1160case(InterfaceC0583l interfaceC0583l) {
    }

    @Override // defpackage.InterfaceC14555l
    /* JADX INFO: renamed from: public */
    public void mo1212public(InterfaceC0583l interfaceC0583l) {
    }

    @Override // defpackage.InterfaceC1076l
    public void yandex(MenuC4984l menuC4984l, boolean z) {
    }
}
