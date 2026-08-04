package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;

/* JADX INFO: renamed from: lٕٖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16002l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f31380l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31381l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ long f31382l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f31383l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final /* synthetic */ C17986l f31384l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f31385l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f31386l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f31387l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16002l(boolean z, int i, long j, ArrayList arrayList, C17986l c17986l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f31381l = z;
        this.f31385l = i;
        this.f31382l = j;
        this.f31387l = arrayList;
        this.f31384l = c17986l;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0043 -> B:19:0x0044). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i;
        int i2;
        EnumC9342l enumC9342l;
        int i3;
        Integer num;
        int iIntValue;
        int i4 = this.f31380l;
        int i5 = this.f31385l;
        boolean z = this.f31381l;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(obj);
            int i6 = 1500;
            if (!z && i5 < 1500 && i5 != 0) {
                i6 = i5;
            }
            i = i6;
            i2 = 0;
            C16534l c16534l = new C16534l(this.f31382l, i2, i, (Integer) null, (String) null);
            this.f31383l = i2;
            this.f31386l = i;
            this.f31380l = 1;
            obj = c16534l.subs(this);
            enumC9342l = EnumC9342l.f19165l;
            if (obj == enumC9342l) {
                return enumC9342l;
            }
            i3 = i2;
        } else {
            if (i4 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = this.f31386l;
            i3 = this.f31383l;
            AbstractC2829l.crashlytics(obj);
            i = i7;
        }
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
        List list = (List) vKResponseWithItems.yandex;
        if (list == null) {
            list = C2580l.f5619l;
        }
        ArrayList arrayList = this.f31387l;
        arrayList.addAll(list);
        i2 = i3 + i;
        int i8 = C17986l.f35164l;
        C17986l c17986l = this.f31384l;
        C15308l c15308l = c17986l.f35171l;
        C15308l c15308l2 = c17986l.f35170l;
        if (c15308l.admob() == 0) {
            num = vKResponseWithItems.loadAd;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c17986l.f35171l.subs(iIntValue);
        }
        c15308l2.subs(list.size() + c15308l2.admob());
        if (list.size() >= i || (!z && i5 > 0 && arrayList.size() >= i5)) {
            if (z) {
                Collections.reverse(arrayList);
            }
            return Unit.INSTANCE;
        }
        C16534l c16534l2 = new C16534l(this.f31382l, i2, i, (Integer) null, (String) null);
        this.f31383l = i2;
        this.f31386l = i;
        this.f31380l = 1;
        obj = c16534l2.subs(this);
        enumC9342l = EnumC9342l.f19165l;
        if (obj == enumC9342l) {
            return enumC9342l;
        }
        i3 = i2;
        VKResponseWithItems vKResponseWithItems2 = (VKResponseWithItems) obj;
        List list2 = (List) vKResponseWithItems2.yandex;
        if (list2 == null) {
            list2 = C2580l.f5619l;
        }
        ArrayList arrayList2 = this.f31387l;
        arrayList2.addAll(list2);
        i2 = i3 + i;
        int i9 = C17986l.f35164l;
        C17986l c17986l2 = this.f31384l;
        C15308l c15308l3 = c17986l2.f35171l;
        C15308l c15308l4 = c17986l2.f35170l;
        if (c15308l3.admob() == 0) {
            num = vKResponseWithItems2.loadAd;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c17986l2.f35171l.subs(iIntValue);
        }
        c15308l4.subs(list2.size() + c15308l4.admob());
        if (list2.size() >= i) {
        }
        if (z) {
            Collections.reverse(arrayList2);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C16002l(this.f31381l, this.f31385l, this.f31382l, this.f31387l, this.f31384l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16002l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
