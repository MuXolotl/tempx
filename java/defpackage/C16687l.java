package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٖ۠ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16687l extends AbstractC15719l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f32706l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final ArrayList f32707l;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16687l(InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, boolean z, int i, C3498l c3498l, int i2, C16412l c16412l) {
        C1461l c1461l = C1461l.f3652l;
        if (interfaceC8371l == null) {
            m4193l(19);
            throw null;
        }
        if (interfaceC3841l == null) {
            m4193l(20);
            throw null;
        }
        if (i == 0) {
            m4193l(21);
            throw null;
        }
        if (c3498l == null) {
            m4193l(22);
            throw null;
        }
        if (c16412l == null) {
            m4193l(25);
            throw null;
        }
        super(c16412l, interfaceC8371l, interfaceC3841l, c3498l, i, z, i2, c1461l);
        this.f32707l = new ArrayList(1);
        this.f32706l = false;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public static C16687l m4191l(InterfaceC8371l interfaceC8371l, InterfaceC3841l interfaceC3841l, boolean z, int i, C3498l c3498l, int i2, C16412l c16412l) {
        if (interfaceC8371l == null) {
            m4193l(6);
            throw null;
        }
        if (interfaceC3841l == null) {
            m4193l(7);
            throw null;
        }
        if (i == 0) {
            m4193l(8);
            throw null;
        }
        if (c3498l == null) {
            m4193l(9);
            throw null;
        }
        if (c16412l == null) {
            m4193l(11);
            throw null;
        }
        if (i != 0) {
            return new C16687l(interfaceC8371l, interfaceC3841l, z, i, c3498l, i2, c16412l);
        }
        m4193l(14);
        throw null;
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public static C16687l m4192l(AbstractC10170l abstractC10170l, int i, C3498l c3498l, int i2, C16412l c16412l) {
        C3199l c3199l = C2782l.f6058l;
        if (i == 0) {
            m4193l(2);
            throw null;
        }
        if (c16412l == null) {
            m4193l(4);
            throw null;
        }
        C16687l c16687lM4191l = m4191l(abstractC10170l, c3199l, false, i, c3498l, i2, c16412l);
        AbstractC15211l abstractC15211lMetrica = AbstractC3759l.purchase(abstractC10170l).metrica();
        if (c16687lM4191l.f32706l) {
            C8339l.smaato("Type parameter descriptor is already initialized: ".concat(c16687lM4191l.m4194l()));
            return null;
        }
        if (!AbstractC11748l.subs(abstractC15211lMetrica)) {
            c16687lM4191l.f32707l.add(abstractC15211lMetrica);
        }
        if (c16687lM4191l.f32706l) {
            C8339l.smaato("Type parameter descriptor is already initialized: ".concat(c16687lM4191l.m4194l()));
            return null;
        }
        c16687lM4191l.f32706l = true;
        return c16687lM4191l;
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public static /* synthetic */ void m4193l(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "bound";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[2] = "<init>";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[2] = "addUpperBound";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC15719l
    /* JADX INFO: renamed from: lؖٙؖ */
    public final List mo3513l() {
        if (!this.f32706l) {
            C8339l.smaato("Type parameter descriptor is not initialized: ".concat(m4194l()));
            return null;
        }
        ArrayList arrayList = this.f32707l;
        if (arrayList != null) {
            return arrayList;
        }
        m4193l(28);
        throw null;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final String m4194l() {
        return getName() + " declared in " + AbstractC11125l.billing(Signature());
    }
}
