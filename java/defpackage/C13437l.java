package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْٗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C13437l extends AbstractC9792l implements InterfaceC10696l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public C15249l f26354l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C7073l f26355l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final InterfaceC10696l f26356l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f26357l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C7073l f26358l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public List f26359l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C9004l f26360l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final boolean f26361l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public C11425l f26362l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final boolean f26363l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f26364l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public C1710l f26365l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f26366l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final boolean f26367l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public C15249l f26368l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Collection f26369l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Function0 f26370l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C6561l f26371l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f26372l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final boolean f26373l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public ArrayList f26374l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13437l(InterfaceC8371l interfaceC8371l, InterfaceC10696l interfaceC10696l, InterfaceC3841l interfaceC3841l, int i, C6561l c6561l, boolean z, C3498l c3498l, int i2, InterfaceC5706l interfaceC5706l, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(interfaceC8371l, interfaceC3841l, c3498l, null, interfaceC5706l);
        if (interfaceC8371l == null) {
            m3644l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m3644l(1);
            throw null;
        }
        if (i == 0) {
            m3644l(2);
            throw null;
        }
        if (c6561l == null) {
            m3644l(3);
            throw null;
        }
        if (c3498l == null) {
            m3644l(4);
            throw null;
        }
        if (i2 == 0) {
            m3644l(5);
            throw null;
        }
        if (interfaceC5706l == null) {
            m3644l(6);
            throw null;
        }
        this.f26357l = z;
        this.f26369l = null;
        this.f26359l = Collections.EMPTY_LIST;
        this.f26366l = i;
        this.f26371l = c6561l;
        this.f26356l = interfaceC10696l == null ? this : interfaceC10696l;
        this.f26372l = i2;
        this.f26367l = z2;
        this.f26361l = z3;
        this.f26364l = z4;
        this.f26373l = z5;
        this.f26363l = z6;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public static C13437l m3642l(InterfaceC8371l interfaceC8371l, int i, boolean z, C3498l c3498l, int i2, InterfaceC5706l interfaceC5706l) {
        C3199l c3199l = C2782l.f6058l;
        C6561l c6561l = AbstractC6004l.purchase;
        if (interfaceC8371l == null) {
            m3644l(7);
            throw null;
        }
        if (i == 0) {
            m3644l(9);
            throw null;
        }
        if (c3498l == null) {
            m3644l(11);
            throw null;
        }
        if (i2 == 0) {
            m3644l(12);
            throw null;
        }
        if (interfaceC5706l != null) {
            return new C13437l(interfaceC8371l, null, c3199l, i, c6561l, z, c3498l, i2, interfaceC5706l, false, false, false, false, false);
        }
        m3644l(13);
        throw null;
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public static InterfaceC4884l m3643l(C2201l c2201l, InterfaceC10138l interfaceC10138l) {
        if (interfaceC10138l == null) {
            m3644l(31);
            throw null;
        }
        InterfaceC4884l interfaceC4884l = ((AbstractC4042l) interfaceC10138l).f8324l;
        if (interfaceC4884l != null) {
            return interfaceC4884l.isPro(c2201l);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m3644l(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "outType";
                break;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "typeParameters";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "originalSubstitutor";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[0] = "newModality";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[0] = "newVisibility";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                objArr[0] = "newName";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    objArr[1] = "getModality";
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    objArr[1] = "getVisibility";
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "substitute";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.InterfaceC10389l
    public final C6561l admob() {
        C6561l c6561l = this.f26371l;
        if (c6561l != null) {
            return c6561l;
        }
        m3644l(25);
        throw null;
    }

    @Override // defpackage.InterfaceC10696l
    public final C1710l amazon() {
        return this.f26365l;
    }

    public Object applovin(C0941l c0941l) {
        return null;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return this.f26364l;
    }

    @Override // defpackage.InterfaceC11764l
    /* JADX INFO: renamed from: const */
    public final boolean mo3250const() {
        return this.f26357l;
    }

    @Override // defpackage.InterfaceC10696l
    /* JADX INFO: renamed from: continue */
    public final boolean mo2965continue() {
        return this.f26363l;
    }

    @Override // defpackage.InterfaceC10696l
    public final C11425l crashlytics() {
        return this.f26362l;
    }

    @Override // defpackage.AbstractC9792l, defpackage.InterfaceC11661l
    public final List getTypeParameters() {
        ArrayList arrayList = this.f26374l;
        if (arrayList != null) {
            return arrayList;
        }
        C11983l.ad(this, "typeParameters == null for ");
        return null;
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.subscription(this, obj);
    }

    @Override // defpackage.InterfaceC10900l
    public final InterfaceC10696l isPro(C2201l c2201l) {
        if (c2201l == null) {
            m3644l(27);
            throw null;
        }
        AbstractC10794l abstractC10794l = c2201l.yandex;
        if (abstractC10794l.purchase()) {
            return this;
        }
        C8276l c8276l = new C8276l(this);
        c8276l.billing = abstractC10794l;
        c8276l.amazon = mo864l();
        return c8276l.loadAd();
    }

    @Override // defpackage.InterfaceC11661l
    public final Collection license() {
        Collection collection = this.f26369l;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        m3644l(41);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [lَۥٛ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC10696l mo864l() {
        InterfaceC10696l interfaceC10696lMo864l;
        InterfaceC10696l interfaceC10696l = this.f26356l;
        ?? r1 = this;
        if (interfaceC10696l != this) {
            interfaceC10696lMo864l = interfaceC10696l.mo864l();
        }
        if (r1 != 0) {
            r1 = interfaceC10696lMo864l;
            return r1;
        }
        r1 = interfaceC10696lMo864l;
        m3644l(38);
        throw null;
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m3645l(C9004l c9004l, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f26370l = function0;
        if (c9004l == null) {
            c9004l = (C9004l) function0.invoke();
        }
        this.f26360l = c9004l;
    }

    /* JADX INFO: renamed from: lؖٔؓ */
    public C13437l mo1004l(InterfaceC8371l interfaceC8371l, int i, C6561l c6561l, InterfaceC10696l interfaceC10696l, int i2, C3498l c3498l) {
        if (interfaceC8371l == null) {
            m3644l(32);
            throw null;
        }
        if (i == 0) {
            m3644l(33);
            throw null;
        }
        if (c6561l == null) {
            m3644l(34);
            throw null;
        }
        if (i2 == 0) {
            m3644l(35);
            throw null;
        }
        if (c3498l == null) {
            m3644l(36);
            throw null;
        }
        return new C13437l(interfaceC8371l, interfaceC10696l, getAnnotations(), i, c6561l, this.f26357l, c3498l, i2, InterfaceC5706l.f12087l, this.f26367l, mo1492synchronized(), this.f26364l, vip(), this.f26363l);
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void m3646l(AbstractC18041l abstractC18041l, List list, C7073l c7073l, C7073l c7073l2, List list2) {
        if (abstractC18041l == null) {
            m3644l(17);
            throw null;
        }
        if (list == null) {
            m3644l(18);
            throw null;
        }
        if (list2 == null) {
            m3644l(19);
            throw null;
        }
        this.f19969l = abstractC18041l;
        this.f26374l = new ArrayList(list);
        this.f26355l = c7073l2;
        this.f26358l = c7073l;
        this.f26359l = list2;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final void m3647l(C11425l c11425l, C1710l c1710l, C15249l c15249l, C15249l c15249l2) {
        this.f26362l = c11425l;
        this.f26365l = c1710l;
        this.f26368l = c15249l;
        this.f26354l = c15249l2;
    }

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C13437l mo366strictfp(InterfaceC8371l interfaceC8371l, int i, C6561l c6561l) throws C12948l {
        C8276l c8276l = new C8276l(this);
        if (interfaceC8371l == null) {
            C8276l.yandex(0);
            throw null;
        }
        c8276l.yandex = interfaceC8371l;
        c8276l.amazon = null;
        if (i == 0) {
            C8276l.yandex(6);
            throw null;
        }
        c8276l.loadAd = i;
        c8276l.crashlytics = c6561l;
        c8276l.purchase = 2;
        c8276l.mopub = false;
        C13437l c13437lLoadAd = c8276l.loadAd();
        if (c13437lLoadAd != null) {
            return c13437lLoadAd;
        }
        m3644l(42);
        throw null;
    }

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: lؚْٟ */
    public final void mo365l(Collection collection) {
        if (collection != null) {
            this.f26369l = collection;
        } else {
            m3644l(40);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.AbstractC9792l, defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: lَٖؔ */
    public final List mo1478l() {
        List list = this.f26359l;
        if (list != null) {
            return list;
        }
        m3644l(22);
        throw null;
    }

    @Override // defpackage.InterfaceC11764l
    /* JADX INFO: renamed from: lَٖؕ */
    public final boolean mo3251l() {
        return this.f26367l;
    }

    @Override // defpackage.InterfaceC10696l
    /* JADX INFO: renamed from: lؙٗٙ */
    public final C15249l mo2966l() {
        return this.f26368l;
    }

    @Override // defpackage.InterfaceC10696l
    /* JADX INFO: renamed from: l٘ٚۥ */
    public final C15249l mo2967l() {
        return this.f26354l;
    }

    @Override // defpackage.InterfaceC10696l
    public final ArrayList premium() {
        ArrayList arrayList = new ArrayList(2);
        C11425l c11425l = this.f26362l;
        if (c11425l != null) {
            arrayList.add(c11425l);
        }
        C1710l c1710l = this.f26365l;
        if (c1710l != null) {
            arrayList.add(c1710l);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC9792l, defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: return */
    public final C7073l mo1479return() {
        return this.f26355l;
    }

    @Override // defpackage.AbstractC9792l, defpackage.InterfaceC11661l
    public final AbstractC18041l smaato() {
        AbstractC18041l abstractC18041lYandex = yandex();
        if (abstractC18041lYandex != null) {
            return abstractC18041lYandex;
        }
        m3644l(23);
        throw null;
    }

    @Override // defpackage.InterfaceC5436l
    public final int startapp() {
        int i = this.f26366l;
        if (i != 0) {
            return i;
        }
        m3644l(24);
        throw null;
    }

    @Override // defpackage.InterfaceC11764l
    /* JADX INFO: renamed from: super */
    public final AbstractC0757l mo3252super() {
        C9004l c9004l = this.f26360l;
        if (c9004l != null) {
            return (AbstractC0757l) c9004l.invoke();
        }
        return null;
    }

    /* JADX INFO: renamed from: synchronized */
    public boolean mo1492synchronized() {
        return this.f26361l;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: transient */
    public final C7073l mo1480transient() {
        return this.f26358l;
    }

    public boolean vip() {
        return this.f26373l;
    }

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: while */
    public final int mo367while() {
        int i = this.f26372l;
        if (i != 0) {
            return i;
        }
        m3644l(39);
        throw null;
    }

    /* JADX INFO: renamed from: lًَۙ */
    public void mo1491l(AbstractC18041l abstractC18041l) {
    }
}
