package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٌَؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10175l extends AbstractC1281l implements InterfaceC4884l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final InterfaceC4884l f20709l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f20710l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C6561l f20711l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f20712l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public boolean f20713l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f20714l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public AbstractC18041l f20715l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f20716l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public boolean f20717l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f20718l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f20719l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final int f20720l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public Collection f20721l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C7073l f20722l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f20723l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public InterfaceC4884l f20724l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public volatile C0340l f20725l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f20726l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f20727l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f20728l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C7073l f20729l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f20730l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public Map f20731l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f20732l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f20733l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10175l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        super(interfaceC8371l, interfaceC3841l, c3498l, interfaceC5706l);
        if (interfaceC8371l == null) {
            m2895l(0);
            throw null;
        }
        if (interfaceC3841l == null) {
            m2895l(1);
            throw null;
        }
        if (c3498l == null) {
            m2895l(2);
            throw null;
        }
        if (i == 0) {
            m2895l(3);
            throw null;
        }
        if (interfaceC5706l == null) {
            m2895l(4);
            throw null;
        }
        this.f20711l = AbstractC6004l.subs;
        this.f20730l = false;
        this.f20723l = false;
        this.f20716l = false;
        this.f20719l = false;
        this.f20732l = false;
        this.f20718l = false;
        this.f20714l = false;
        this.f20713l = false;
        this.f20710l = false;
        this.f20733l = true;
        this.f20717l = false;
        this.f20721l = null;
        this.f20725l = null;
        this.f20724l = null;
        this.f20731l = null;
        this.f20709l = interfaceC4884l == null ? this : interfaceC4884l;
        this.f20720l = i;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public static ArrayList m2894l(InterfaceC4884l interfaceC4884l, List list, C2201l c2201l, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            m2895l(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17538l c17538l = (C17538l) it.next();
            AbstractC18041l abstractC18041lAdmob = c2201l.admob(2, c17538l.yandex());
            AbstractC18041l abstractC18041l = c17538l.f34151l;
            AbstractC18041l abstractC18041lAdmob2 = abstractC18041l == null ? null : c2201l.admob(2, abstractC18041l);
            if (abstractC18041lAdmob == null) {
                return null;
            }
            if ((abstractC18041lAdmob != c17538l.yandex() || abstractC18041l != abstractC18041lAdmob2) && zArr != null) {
                zArr[0] = true;
            }
            C4735l c4735l = c17538l instanceof C0572l ? new C4735l((List) ((C0572l) c17538l).f1970l.getValue()) : null;
            C17538l c17538l2 = z ? null : c17538l;
            int i = c17538l.f34146l;
            InterfaceC3841l annotations = c17538l.getAnnotations();
            C3498l name = c17538l.getName();
            boolean zM4403l = c17538l.m4403l();
            boolean z3 = c17538l.f34150l;
            boolean z4 = c17538l.f34148l;
            InterfaceC5706l interfaceC5706lBilling = z2 ? c17538l.billing() : InterfaceC5706l.f12087l;
            arrayList.add(c4735l == null ? new C17538l(interfaceC4884l, c17538l2, i, annotations, name, abstractC18041lAdmob, zM4403l, z3, z4, abstractC18041lAdmob2, interfaceC5706lBilling) : new C0572l(interfaceC4884l, c17538l2, i, annotations, name, abstractC18041lAdmob, zM4403l, z3, z4, abstractC18041lAdmob2, interfaceC5706lBilling, c4735l));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m2895l(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 31:
                objArr[0] = "substitutor";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[1] = "copy";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[2] = "newCopyBuilder";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 23:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.InterfaceC10389l
    public final C6561l admob() {
        C6561l c6561l = this.f20711l;
        if (c6561l != null) {
            return c6561l;
        }
        m2895l(16);
        throw null;
    }

    public Object applovin(C0941l c0941l) {
        Map map = this.f20731l;
        if (map == null) {
            return null;
        }
        return map.get(c0941l);
    }

    @Override // defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: break */
    public final InterfaceC4884l mo1472break() {
        return this.f20724l;
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: case */
    public final boolean mo750case() {
        return this.f20718l;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: finally */
    public final List mo1007finally() {
        List list = this.f20712l;
        if (list != null) {
            return list;
        }
        m2895l(19);
        throw null;
    }

    public boolean firebase() {
        return this.f20710l;
    }

    /* JADX INFO: renamed from: for */
    public boolean mo1473for() {
        return this.f20717l;
    }

    @Override // defpackage.InterfaceC11661l
    public final List getTypeParameters() {
        List list = this.f20728l;
        if (list != null) {
            return list;
        }
        C11983l.ad(this, "typeParameters == null for ");
        return null;
    }

    /* JADX INFO: renamed from: import */
    public Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.tapsense(this, obj);
    }

    /* JADX INFO: renamed from: interface */
    public boolean mo679interface() {
        return this.f20732l;
    }

    @Override // defpackage.InterfaceC10900l
    public InterfaceC4884l isPro(C2201l c2201l) {
        if (c2201l == null) {
            m2895l(22);
            throw null;
        }
        if (c2201l.yandex.purchase()) {
            return this;
        }
        C18220l c18220lM2898l = m2898l(c2201l);
        c18220lM2898l.f35682l = mo864l();
        c18220lM2898l.f35681l = true;
        c18220lM2898l.f35690l = true;
        return c18220lM2898l.f35675l.mo768l(c18220lM2898l);
    }

    public Collection license() {
        C0340l c0340l = this.f20725l;
        if (c0340l != null) {
            this.f20721l = (Collection) c0340l.invoke();
            this.f20725l = null;
        }
        Collection collection = this.f20721l;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        m2895l(14);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [lؗٔٝ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public InterfaceC4884l mo864l() {
        InterfaceC4884l interfaceC4884lMo864l;
        InterfaceC4884l interfaceC4884l = this.f20709l;
        ?? r1 = this;
        if (interfaceC4884l != this) {
            interfaceC4884lMo864l = interfaceC4884l.mo864l();
        }
        if (r1 != 0) {
            r1 = interfaceC4884lMo864l;
            return r1;
        }
        r1 = interfaceC4884lMo864l;
        m2895l(20);
        throw null;
    }

    @Override // defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final boolean mo1474l() {
        return this.f20714l;
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public void mo2896l(C7073l c7073l, C7073l c7073l2, List list, List list2, List list3, AbstractC18041l abstractC18041l, int i, C6561l c6561l) {
        if (list == null) {
            m2895l(5);
            throw null;
        }
        if (list2 == null) {
            m2895l(6);
            throw null;
        }
        if (list3 == null) {
            m2895l(7);
            throw null;
        }
        if (c6561l == null) {
            m2895l(8);
            throw null;
        }
        this.f20728l = AbstractC16901l.m4213const(list2);
        this.f20712l = AbstractC16901l.m4213const(list3);
        this.f20715l = abstractC18041l;
        this.f20726l = i;
        this.f20711l = c6561l;
        this.f20722l = c7073l;
        this.f20729l = c7073l2;
        this.f20727l = list;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) list2.get(i2);
            if (interfaceC16902l.getIndex() != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append(interfaceC16902l);
                int index = interfaceC16902l.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i3 = 0; i3 < list3.size(); i3++) {
            C17538l c17538l = (C17538l) list3.get(i3);
            if (c17538l.f34146l != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c17538l);
                int i4 = c17538l.f34146l;
                sb2.append("index is ");
                sb2.append(i4);
                sb2.append(" but position is ");
                sb2.append(i3);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    @Override // defpackage.InterfaceC4884l
    /* JADX INFO: renamed from: lؙؔؑ */
    public final boolean mo1475l() {
        return this.f20713l;
    }

    /* JADX INFO: renamed from: lؖٔؓ */
    public abstract AbstractC10175l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l);

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: lؖٙؖ, reason: merged with bridge method [inline-methods] */
    public C17134l mo366strictfp(InterfaceC8371l interfaceC8371l, int i, C6561l c6561l) {
        return (C17134l) m2899l(interfaceC8371l, i, c6561l);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x021a  */
    /* JADX WARN: Code duplicated, block: B:106:0x021f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0240  */
    /* JADX WARN: Code duplicated, block: B:116:0x0244  */
    /* JADX WARN: Code duplicated, block: B:118:0x0247  */
    /* JADX WARN: Code duplicated, block: B:120:0x024f  */
    /* JADX WARN: Code duplicated, block: B:129:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0210  */
    /* JADX INFO: renamed from: lؘۦۧ */
    public AbstractC10175l mo768l(C18220l c18220l) throws C12948l {
        InterfaceC3841l annotations;
        char c;
        C7073l c7073l;
        C7073l c7073l2;
        C7073l c7073l3;
        C7073l c7073l4;
        ArrayList arrayListM2894l;
        AbstractC18041l abstractC18041lAdmob;
        char c2;
        boolean z;
        Boolean bool;
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap;
        Map map;
        InterfaceC4884l interfaceC4884l;
        C0340l c0340l;
        C7073l c7073lIsPro;
        char c3;
        AbstractC18041l abstractC18041lAdmob2;
        char c4;
        boolean[] zArr = new boolean[1];
        char c5 = 0;
        if (c18220l.f35678l != null) {
            annotations = getAnnotations();
            InterfaceC3841l interfaceC3841l = c18220l.f35678l;
            if (annotations.isEmpty()) {
                annotations = interfaceC3841l;
            } else if (!interfaceC3841l.isEmpty()) {
                annotations = new C2172l(new InterfaceC3841l[]{annotations, interfaceC3841l});
            }
        } else {
            annotations = getAnnotations();
        }
        InterfaceC3841l interfaceC3841l2 = annotations;
        InterfaceC8371l interfaceC8371l = c18220l.f35676l;
        InterfaceC4884l interfaceC4884l2 = c18220l.f35682l;
        int i = c18220l.f35686l;
        C3498l c3498l = c18220l.f35684l;
        InterfaceC5706l interfaceC5706lBilling = c18220l.f35681l ? ((AbstractC1281l) (interfaceC4884l2 != null ? interfaceC4884l2 : mo864l())).billing() : InterfaceC5706l.f12087l;
        if (interfaceC5706lBilling == null) {
            m2895l(27);
            throw null;
        }
        AbstractC10175l abstractC10175lMo680l = mo680l(i, interfaceC3841l2, interfaceC8371l, interfaceC4884l2, c3498l, interfaceC5706lBilling);
        List typeParameters = c18220l.f35689l;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C2201l c2201lIsPro = AbstractC6363l.isPro(typeParameters, c18220l.f35677l, abstractC10175lMo680l, arrayList, zArr);
        if (c2201lIsPro != null) {
            ArrayList arrayList2 = new ArrayList();
            if (c18220l.f35673l.isEmpty()) {
                c = c5;
                c7073l = c18220l.f35685l;
                if (c7073l != null) {
                    abstractC18041lAdmob2 = c2201lIsPro.admob(2, c7073l.yandex());
                    if (abstractC18041lAdmob2 != null) {
                        c18220l.f35685l.m2169l();
                        C7073l c7073l5 = new C7073l(abstractC10175lMo680l, new C17630l(abstractC10175lMo680l, abstractC18041lAdmob2), c18220l.f35685l.getAnnotations());
                        boolean z2 = zArr[c];
                        if (abstractC18041lAdmob2 != c18220l.f35685l.yandex()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z2 ? 1 : 0);
                        c7073l2 = c7073l5;
                    }
                } else {
                    c7073l2 = null;
                }
                c7073l3 = c18220l.f35680l;
                if (c7073l3 != null) {
                    c7073lIsPro = c7073l3.isPro(c2201lIsPro);
                    if (c7073lIsPro != null) {
                        boolean z3 = zArr[c];
                        if (c7073lIsPro != c18220l.f35680l) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z3 ? 1 : 0) | c3;
                        c7073l4 = c7073lIsPro;
                    }
                } else {
                    c7073l4 = null;
                }
                arrayListM2894l = m2894l(abstractC10175lMo680l, c18220l.f35670l, c2201lIsPro, c18220l.f35674l, c18220l.f35681l, zArr);
                if (arrayListM2894l != null) {
                    boolean z4 = zArr[c];
                    if (abstractC18041lAdmob != c18220l.f35687l) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z4 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0) {
                    }
                    abstractC10175lMo680l.mo2896l(c7073l2, c7073l4, arrayList2, arrayList, arrayListM2894l, abstractC18041lAdmob, c18220l.f35669l, c18220l.f35683l);
                    abstractC10175lMo680l.f20730l = this.f20730l;
                    abstractC10175lMo680l.f20723l = this.f20723l;
                    abstractC10175lMo680l.f20716l = this.f20716l;
                    abstractC10175lMo680l.f20719l = this.f20719l;
                    abstractC10175lMo680l.f20732l = this.f20732l;
                    abstractC10175lMo680l.f20710l = this.f20710l;
                    abstractC10175lMo680l.f20718l = this.f20718l;
                    abstractC10175lMo680l.mo1504l(this.f20733l);
                    abstractC10175lMo680l.f20714l = c18220l.f35679l;
                    abstractC10175lMo680l.f20713l = c18220l.f35672l;
                    bool = c18220l.f35667l;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.f20717l;
                    }
                    abstractC10175lMo680l.mo1503l(zBooleanValue);
                    if (c18220l.f35671l.isEmpty()) {
                        linkedHashMap = c18220l.f35671l;
                        map = this.f20731l;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            abstractC10175lMo680l.f20731l = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            abstractC10175lMo680l.f20731l = linkedHashMap;
                        }
                    } else {
                        linkedHashMap = c18220l.f35671l;
                        map = this.f20731l;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            abstractC10175lMo680l.f20731l = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            abstractC10175lMo680l.f20731l = linkedHashMap;
                        }
                    }
                    if (c18220l.f35688l) {
                        interfaceC4884l = this.f20724l;
                        if (interfaceC4884l == null) {
                            interfaceC4884l = this;
                        }
                        abstractC10175lMo680l.f20724l = interfaceC4884l.isPro(c2201lIsPro);
                    } else {
                        interfaceC4884l = this.f20724l;
                        if (interfaceC4884l == null) {
                            interfaceC4884l = this;
                        }
                        abstractC10175lMo680l.f20724l = interfaceC4884l.isPro(c2201lIsPro);
                    }
                    if (c18220l.f35668l) {
                        if (c18220l.f35677l.purchase()) {
                            c0340l = this.f20725l;
                            if (c0340l != null) {
                                abstractC10175lMo680l.f20725l = c0340l;
                                return abstractC10175lMo680l;
                            }
                            abstractC10175lMo680l.mo365l(license());
                            return abstractC10175lMo680l;
                        }
                        abstractC10175lMo680l.f20725l = new C0340l(this, c2201lIsPro, 20);
                    }
                    return abstractC10175lMo680l;
                }
            } else {
                int i2 = 0;
                for (C7073l c7073l6 : c18220l.f35673l) {
                    AbstractC18041l abstractC18041lAdmob3 = c2201lIsPro.admob(2, c7073l6.yandex());
                    if (abstractC18041lAdmob3 != null) {
                        char c6 = c5;
                        int i3 = i2 + 1;
                        arrayList2.add(AbstractC6689l.purchase(abstractC10175lMo680l, abstractC18041lAdmob3, ((C6653l) c7073l6.m2169l()).m2061l(), c7073l6.getAnnotations(), i2));
                        zArr[c6] = (zArr[c6] ? 1 : 0) | (abstractC18041lAdmob3 != c7073l6.yandex() ? (char) 1 : c6);
                        c5 = c6;
                        i2 = i3;
                    }
                }
                c = c5;
                c7073l = c18220l.f35685l;
                if (c7073l != null) {
                    abstractC18041lAdmob2 = c2201lIsPro.admob(2, c7073l.yandex());
                    if (abstractC18041lAdmob2 != null) {
                        c18220l.f35685l.m2169l();
                        C7073l c7073l7 = new C7073l(abstractC10175lMo680l, new C17630l(abstractC10175lMo680l, abstractC18041lAdmob2), c18220l.f35685l.getAnnotations());
                        boolean z5 = zArr[c];
                        if (abstractC18041lAdmob2 != c18220l.f35685l.yandex()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z5 ? 1 : 0);
                        c7073l2 = c7073l7;
                    }
                } else {
                    c7073l2 = null;
                }
                c7073l3 = c18220l.f35680l;
                if (c7073l3 != null) {
                    c7073lIsPro = c7073l3.isPro(c2201lIsPro);
                    if (c7073lIsPro != null) {
                        boolean z6 = zArr[c];
                        if (c7073lIsPro != c18220l.f35680l) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z6 ? 1 : 0) | c3;
                        c7073l4 = c7073lIsPro;
                    }
                } else {
                    c7073l4 = null;
                }
                arrayListM2894l = m2894l(abstractC10175lMo680l, c18220l.f35670l, c2201lIsPro, c18220l.f35674l, c18220l.f35681l, zArr);
                if (arrayListM2894l != null && (abstractC18041lAdmob = c2201lIsPro.admob(3, c18220l.f35687l)) != null) {
                    boolean z7 = zArr[c];
                    if (abstractC18041lAdmob != c18220l.f35687l) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z7 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0 && c18220l.f35690l) {
                        return this;
                    }
                    abstractC10175lMo680l.mo2896l(c7073l2, c7073l4, arrayList2, arrayList, arrayListM2894l, abstractC18041lAdmob, c18220l.f35669l, c18220l.f35683l);
                    abstractC10175lMo680l.f20730l = this.f20730l;
                    abstractC10175lMo680l.f20723l = this.f20723l;
                    abstractC10175lMo680l.f20716l = this.f20716l;
                    abstractC10175lMo680l.f20719l = this.f20719l;
                    abstractC10175lMo680l.f20732l = this.f20732l;
                    abstractC10175lMo680l.f20710l = this.f20710l;
                    abstractC10175lMo680l.f20718l = this.f20718l;
                    abstractC10175lMo680l.mo1504l(this.f20733l);
                    abstractC10175lMo680l.f20714l = c18220l.f35679l;
                    abstractC10175lMo680l.f20713l = c18220l.f35672l;
                    bool = c18220l.f35667l;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.f20717l;
                    }
                    abstractC10175lMo680l.mo1503l(zBooleanValue);
                    if (c18220l.f35671l.isEmpty() || this.f20731l != null) {
                        linkedHashMap = c18220l.f35671l;
                        map = this.f20731l;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            abstractC10175lMo680l.f20731l = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            abstractC10175lMo680l.f20731l = linkedHashMap;
                        }
                    }
                    if (c18220l.f35688l || this.f20724l != null) {
                        interfaceC4884l = this.f20724l;
                        if (interfaceC4884l == null) {
                            interfaceC4884l = this;
                        }
                        abstractC10175lMo680l.f20724l = interfaceC4884l.isPro(c2201lIsPro);
                    }
                    if (c18220l.f35668l && !mo864l().license().isEmpty()) {
                        if (c18220l.f35677l.purchase()) {
                            c0340l = this.f20725l;
                            if (c0340l != null) {
                                abstractC10175lMo680l.f20725l = c0340l;
                                return abstractC10175lMo680l;
                            }
                            abstractC10175lMo680l.mo365l(license());
                            return abstractC10175lMo680l;
                        }
                        abstractC10175lMo680l.f20725l = new C0340l(this, c2201lIsPro, 20);
                    }
                    return abstractC10175lMo680l;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void m2897l(C0941l c0941l, Object obj) {
        if (this.f20731l == null) {
            this.f20731l = new LinkedHashMap();
        }
        this.f20731l.put(c0941l, obj);
    }

    /* JADX INFO: renamed from: lٍؚۖ */
    public InterfaceC17729l mo1457l() {
        return m2898l(C2201l.loadAd);
    }

    /* JADX INFO: renamed from: lؚۥۚ */
    public void mo1503l(boolean z) {
        this.f20717l = z;
    }

    /* JADX INFO: renamed from: lًٍّ */
    public void mo1504l(boolean z) {
        this.f20733l = z;
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final C18220l m2898l(C2201l c2201l) {
        if (c2201l != null) {
            return new C18220l(this, c2201l.yandex, Signature(), startapp(), admob(), mo367while(), mo1007finally(), mo1478l(), this.f20722l, smaato());
        }
        m2895l(24);
        throw null;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final InterfaceC4884l m2899l(InterfaceC8371l interfaceC8371l, int i, C6561l c6561l) {
        InterfaceC4884l interfaceC4884lBuild = mo1457l().license(interfaceC8371l).isVip(i).remoteconfig(c6561l).amazon(2).metrica().build();
        if (interfaceC4884lBuild != null) {
            return interfaceC4884lBuild;
        }
        m2895l(26);
        throw null;
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final void m2900l(AbstractC15211l abstractC15211l) {
        if (abstractC15211l != null) {
            this.f20715l = abstractC15211l;
        } else {
            m2895l(11);
            throw null;
        }
    }

    /* JADX INFO: renamed from: lؚْٟ */
    public void mo365l(Collection collection) {
        if (collection == null) {
            m2895l(17);
            throw null;
        }
        this.f20721l = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC4884l) it.next()).mo1475l()) {
                this.f20713l = true;
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC5436l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final boolean mo754l() {
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: lَٖؔ */
    public final List mo1478l() {
        List list = this.f20727l;
        if (list != null) {
            return list;
        }
        m2895l(13);
        throw null;
    }

    public boolean purchase() {
        return this.f20719l;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: return */
    public final C7073l mo1479return() {
        return this.f20722l;
    }

    @Override // defpackage.InterfaceC4884l
    public final boolean signatures() {
        if (this.f20723l) {
            return true;
        }
        Iterator it = mo864l().license().iterator();
        while (it.hasNext()) {
            if (((InterfaceC4884l) it.next()).signatures()) {
                return true;
            }
        }
        return false;
    }

    public AbstractC18041l smaato() {
        return this.f20715l;
    }

    @Override // defpackage.InterfaceC5436l
    public final int startapp() {
        int i = this.f20726l;
        if (i != 0) {
            return i;
        }
        m2895l(15);
        throw null;
    }

    @Override // defpackage.InterfaceC4884l
    public final boolean tapsense() {
        if (this.f20730l) {
            return true;
        }
        Iterator it = mo864l().license().iterator();
        while (it.hasNext()) {
            if (((InterfaceC4884l) it.next()).tapsense()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC11661l
    /* JADX INFO: renamed from: transient */
    public final C7073l mo1480transient() {
        return this.f20729l;
    }

    public boolean vip() {
        return this.f20716l;
    }

    @Override // defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: while */
    public final int mo367while() {
        int i = this.f20720l;
        if (i != 0) {
            return i;
        }
        m2895l(21);
        throw null;
    }
}
