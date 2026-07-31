package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٜؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5818l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12260l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C5818l f12240l = new C5818l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C5818l f12233l = new C5818l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C5818l f12249l = new C5818l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C5818l f12248l = new C5818l(3);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C5818l f12254l = new C5818l(4);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C5818l f12234l = new C5818l(5);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C5818l f12237l = new C5818l(6);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C5818l f12253l = new C5818l(7);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C5818l f12246l = new C5818l(8);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C5818l f12255l = new C5818l(9);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C5818l f12252l = new C5818l(10);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C5818l f12232l = new C5818l(11);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C5818l f12256l = new C5818l(12);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C5818l f12247l = new C5818l(13);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C5818l f12238l = new C5818l(14);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C5818l f12242l = new C5818l(15);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C5818l f12258l = new C5818l(16);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C5818l f12241l = new C5818l(17);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C5818l f12236l = new C5818l(18);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C5818l f12235l = new C5818l(19);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C5818l f12231l = new C5818l(20);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C5818l f12259l = new C5818l(21);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C5818l f12239l = new C5818l(22);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C5818l f12245l = new C5818l(23);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C5818l f12251l = new C5818l(24);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final C5818l f12230l = new C5818l(25);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final C5818l f12244l = new C5818l(26);

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final C5818l f12250l = new C5818l(27);

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final C5818l f12257l = new C5818l(28);

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final C5818l f12243l = new C5818l(29);

    public /* synthetic */ C5818l(int i) {
        this.f12260l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        Class<?> declaringClass;
        int i = this.f12260l;
        C2580l c2580l = C2580l.f5619l;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 0:
                ((C10877l) obj).getClass();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                } else {
                    string = value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString();
                }
                return AbstractC11043l.admob('=', str, string);
            case 2:
                EnumC14173l enumC14173lLoadAd = AbstractC16955l.yandex.loadAd(((C18583l) obj).yandex);
                return Boolean.valueOf(enumC14173lLoadAd == EnumC14173l.COPY || enumC14173lLoadAd == EnumC14173l.CUT);
            case 3:
                int i3 = AbstractC12132l.smaato;
                return Boolean.valueOf(AbstractC16901l.inmobi(AbstractC8899l.billing, AbstractC17860l.crashlytics((InterfaceC0207l) obj)));
            case 4:
                InterfaceC0207l interfaceC0207l = (InterfaceC0207l) obj;
                if (interfaceC0207l instanceof InterfaceC4884l) {
                    int i4 = AbstractC12132l.smaato;
                    if (AbstractC16901l.inmobi(AbstractC8899l.billing, AbstractC17860l.crashlytics(interfaceC0207l))) {
                        z = true;
                    }
                } else {
                    int i5 = AbstractC12132l.smaato;
                }
                return Boolean.valueOf(z);
            case 5:
                C3797l c3797l = AbstractC1749l.yandex;
                return new C5160l((Class) obj);
            case 6:
                C3797l c3797l2 = AbstractC1749l.yandex;
                return new C9539l((Class) obj);
            case 7:
                return AbstractC6427l.purchase((C5160l) AbstractC1749l.yandex.premium((Class) obj), c2580l, false, c2580l, null);
            case 8:
                return AbstractC6427l.purchase((C5160l) AbstractC1749l.yandex.premium((Class) obj), c2580l, true, c2580l, null);
            case 9:
                C3797l c3797l3 = AbstractC1749l.yandex;
                return new ConcurrentHashMap();
            case 10:
                InterfaceC1388l interfaceC1388l = (InterfaceC1388l) obj;
                if (!interfaceC1388l.subscription() || (declaringClass = ((InterfaceC13937l) interfaceC1388l).mo1730private().getDeclaringClass()) == null) {
                    return null;
                }
                return AbstractC18202l.yandex.loadAd(declaringClass);
            case 11:
                return ((InterfaceC1388l) obj).getTypeParameters();
            case 12:
                return Boolean.valueOf(((AbstractC14318l) obj).mo1339native() instanceof InterfaceC5291l);
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                return Boolean.valueOf(AbstractC1788l.crashlytics((InterfaceC0207l) obj));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C17798l(i2, (InterfaceC3841l) obj);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Object objM2409native = AbstractC8669l.m2409native(((TypeVariable) obj).getBounds());
                if (objM2409native instanceof TypeVariable) {
                    return (TypeVariable) objM2409native;
                }
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Class cls = (Class) obj;
                if (Modifier.isStatic(cls.getModifiers())) {
                    return null;
                }
                return cls.getDeclaringClass();
            case 20:
                return AbstractC8669l.ads(((Class) obj).getTypeParameters());
            case 21:
                Type ownerType = ((ParameterizedType) obj).getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 22:
                return AbstractC8669l.m2415super(((ParameterizedType) obj).getActualTypeArguments());
            case 23:
                return ((C4258l) obj).purchase;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C4258l) obj).crashlytics;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Boolean.valueOf(AbstractC4654l.admob(((Character) obj).charValue()));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue >= 0 && cCharValue < 256) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Boolean.valueOf(AbstractC4654l.billing(((Character) obj).charValue()));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Boolean.valueOf(AbstractC4654l.billing(((Character) obj).charValue()));
            default:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
        }
    }
}
