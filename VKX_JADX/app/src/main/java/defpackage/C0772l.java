package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؒؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0772l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C0772l f2336l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C0772l f2337l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C0772l f2338l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C0772l f2339l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C0772l f2340l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C0772l f2341l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C0772l f2342l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C0772l f2343l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C0772l f2344l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C0772l f2345l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C0772l f2346l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C0772l f2347l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C0772l f2348l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C0772l f2349l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C0772l f2350l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C0772l f2351l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f2352l;

    static {
        int i = 2;
        f2337l = new C0772l(i, 0);
        f2345l = new C0772l(i, 1);
        f2344l = new C0772l(i, 2);
        f2348l = new C0772l(i, 3);
        f2338l = new C0772l(i, 4);
        f2339l = new C0772l(i, 5);
        f2347l = new C0772l(i, 6);
        f2342l = new C0772l(i, 7);
        f2349l = new C0772l(i, 8);
        f2346l = new C0772l(i, 9);
        f2336l = new C0772l(i, 10);
        f2350l = new C0772l(i, 11);
        f2343l = new C0772l(i, 12);
        f2340l = new C0772l(i, 13);
        f2341l = new C0772l(i, 14);
        f2351l = new C0772l(i, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0772l(int i, int i2) {
        super(i);
        this.f2352l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC14328l interfaceC14328l;
        switch (this.f2352l) {
            case 0:
                return (Unit) obj;
            case 1:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 3:
                return (Unit) obj;
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                C6402l c6402l = (C6402l) obj;
                int i = ((C6402l) obj2).yandex;
                return c6402l;
            case 6:
                return (InterfaceC6347l) obj;
            case 7:
                return (String) obj;
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 9:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 10:
                return (String) obj;
            case 11:
                if (obj == null && obj2 == null) {
                    return null;
                }
                C18725l.loadAd();
                return null;
            case 12:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 13:
                C7629l c7629l = (C7629l) obj;
                C7629l c7629l2 = (C7629l) obj2;
                if (c7629l == null || (str = c7629l.yandex) == null) {
                    str = c7629l2.yandex;
                }
                if (c7629l == null || (interfaceC14328l = c7629l.loadAd) == null) {
                    interfaceC14328l = c7629l2.loadAd;
                }
                return new C7629l(str, interfaceC14328l);
            case 14:
                return obj == null ? obj2 : obj;
            default:
                C18666l c18666l = (C18666l) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                C6264l c6264l = ((C18666l) obj).amazon;
                C4707l c4707l = AbstractC0424l.Signature;
                Object objMopub = c6264l.f13225l.mopub(c4707l);
                if (objMopub == null) {
                    objMopub = objValueOf;
                }
                float fFloatValue = ((Number) objMopub).floatValue();
                Object objMopub2 = c18666l.amazon.f13225l.mopub(c4707l);
                if (objMopub2 != null) {
                    objValueOf = objMopub2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
