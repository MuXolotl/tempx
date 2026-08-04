package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16571l extends AbstractC6144l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f32530l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f32531l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ Object f32532l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32533l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f32534l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Iterator f32535l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ int f32536l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f32537l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f32538l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16571l(int i, int i2, Iterator it, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f32536l = i;
        this.f32533l = i2;
        this.f32538l = it;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0082 A[SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        C9740l c9740l;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        C9740l c9740l2;
        Object next2;
        boolean z;
        int i8;
        Object[] array;
        C11129l c11129l = (C11129l) this.f32532l;
        int i9 = this.f32531l;
        int i10 = this.f32533l;
        boolean z2 = true;
        int i11 = this.f32536l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i9 == 0) {
            AbstractC2829l.crashlytics(obj);
            int i12 = i11 <= 1024 ? i11 : 1024;
            i = i10 - i11;
            Iterator it3 = this.f32538l;
            if (i >= 0) {
                arrayList = new ArrayList(i12);
                i4 = i12;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i11) {
                            this.f32532l = c11129l;
                            this.f32530l = arrayList;
                            this.f32535l = it2;
                            this.f32534l = i4;
                            this.f32537l = i;
                            this.f32531l = 1;
                            c11129l.amazon(this, arrayList);
                            return enumC9342l;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f32532l = null;
                    this.f32530l = null;
                    this.f32535l = null;
                    this.f32534l = i4;
                    this.f32537l = i;
                    this.f32531l = 2;
                    c11129l.amazon(this, arrayList);
                    return enumC9342l;
                }
            } else {
                C9740l c9740l3 = new C9740l(0, new Object[i12]);
                i2 = i12;
                i3 = i;
                it = it3;
                c9740l = c9740l3;
                while (true) {
                    i6 = c9740l.f19881l;
                    objArr = c9740l.f19882l;
                    if (it.hasNext()) {
                        i7 = i2;
                        c9740l2 = c9740l;
                        break;
                    }
                    next2 = it.next();
                    z = z2;
                    if (c9740l.pro() != i6) {
                        C8339l.smaato("ring buffer is full");
                        return null;
                    }
                    int i13 = c9740l.f19880l;
                    int i14 = c9740l.f19883l;
                    objArr[(i13 + i14) % i6] = next2;
                    c9740l.f19883l = i14 + 1;
                    if (c9740l.pro() != i6) {
                        if (c9740l.f19883l < i11) {
                            ArrayList arrayList2 = new ArrayList(c9740l);
                            this.f32532l = c11129l;
                            this.f32530l = c9740l;
                            this.f32535l = it;
                            this.f32534l = i2;
                            this.f32537l = i3;
                            this.f32531l = 3;
                            c11129l.amazon(this, arrayList2);
                            return enumC9342l;
                        }
                        i8 = i6 + (i6 >> 1) + 1;
                        if (i8 > i11) {
                            i8 = i11;
                        }
                        if (c9740l.f19880l == 0) {
                            array = Arrays.copyOf(objArr, i8);
                        } else {
                            array = c9740l.toArray(new Object[i8]);
                        }
                        c9740l = new C9740l(c9740l.f19883l, array);
                    }
                    z2 = z;
                }
                if (c9740l2.f19883l > i10) {
                    ArrayList arrayList3 = new ArrayList(c9740l2);
                    this.f32532l = c11129l;
                    this.f32530l = c9740l2;
                    this.f32535l = null;
                    this.f32534l = i7;
                    this.f32537l = i3;
                    this.f32531l = 4;
                    c11129l.amazon(this, arrayList3);
                    return enumC9342l;
                }
                if (!c9740l2.isEmpty()) {
                    this.f32532l = null;
                    this.f32530l = null;
                    this.f32535l = null;
                    this.f32534l = i7;
                    this.f32537l = i3;
                    this.f32531l = 5;
                    c11129l.amazon(this, c9740l2);
                    return enumC9342l;
                }
            }
        } else if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i3 = this.f32537l;
                    i2 = this.f32534l;
                    it = this.f32535l;
                    c9740l = (C9740l) this.f32530l;
                    AbstractC2829l.crashlytics(obj);
                    c9740l.ad(i10);
                    while (true) {
                        i6 = c9740l.f19881l;
                        objArr = c9740l.f19882l;
                        if (it.hasNext()) {
                            i7 = i2;
                            c9740l2 = c9740l;
                            break;
                        }
                        next2 = it.next();
                        z = z2;
                        if (c9740l.pro() != i6) {
                            C8339l.smaato("ring buffer is full");
                            return null;
                        }
                        int i15 = c9740l.f19880l;
                        int i16 = c9740l.f19883l;
                        objArr[(i15 + i16) % i6] = next2;
                        c9740l.f19883l = i16 + 1;
                        if (c9740l.pro() != i6) {
                            if (c9740l.f19883l < i11) {
                                ArrayList arrayList4 = new ArrayList(c9740l);
                                this.f32532l = c11129l;
                                this.f32530l = c9740l;
                                this.f32535l = it;
                                this.f32534l = i2;
                                this.f32537l = i3;
                                this.f32531l = 3;
                                c11129l.amazon(this, arrayList4);
                                return enumC9342l;
                            }
                            i8 = i6 + (i6 >> 1) + 1;
                            if (i8 > i11) {
                                i8 = i11;
                            }
                            if (c9740l.f19880l == 0) {
                                array = Arrays.copyOf(objArr, i8);
                            } else {
                                array = c9740l.toArray(new Object[i8]);
                            }
                            c9740l = new C9740l(c9740l.f19883l, array);
                        }
                        z2 = z;
                    }
                } else if (i9 == 4) {
                    i3 = this.f32537l;
                    i7 = this.f32534l;
                    c9740l2 = (C9740l) this.f32530l;
                    AbstractC2829l.crashlytics(obj);
                    c9740l2.ad(i10);
                } else {
                    if (i9 != 5) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (c9740l2.f19883l > i10) {
                    ArrayList arrayList5 = new ArrayList(c9740l2);
                    this.f32532l = c11129l;
                    this.f32530l = c9740l2;
                    this.f32535l = null;
                    this.f32534l = i7;
                    this.f32537l = i3;
                    this.f32531l = 4;
                    c11129l.amazon(this, arrayList5);
                    return enumC9342l;
                }
                if (!c9740l2.isEmpty()) {
                    this.f32532l = null;
                    this.f32530l = null;
                    this.f32535l = null;
                    this.f32534l = i7;
                    this.f32537l = i3;
                    this.f32531l = 5;
                    c11129l.amazon(this, c9740l2);
                    return enumC9342l;
                }
            }
            AbstractC2829l.crashlytics(obj);
        } else {
            i5 = this.f32537l;
            i4 = this.f32534l;
            it2 = this.f32535l;
            AbstractC2829l.crashlytics(obj);
            arrayList = new ArrayList(i11);
            i = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i11) {
                        this.f32532l = c11129l;
                        this.f32530l = arrayList;
                        this.f32535l = it2;
                        this.f32534l = i4;
                        this.f32537l = i;
                        this.f32531l = 1;
                        c11129l.amazon(this, arrayList);
                        return enumC9342l;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f32532l = null;
                this.f32530l = null;
                this.f32535l = null;
                this.f32534l = i4;
                this.f32537l = i;
                this.f32531l = 2;
                c11129l.amazon(this, arrayList);
                return enumC9342l;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C16571l c16571l = new C16571l(this.f32536l, this.f32533l, this.f32538l, interfaceC14029l);
        c16571l.f32532l = obj;
        return c16571l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16571l) ads((InterfaceC14029l) obj2, (C11129l) obj)).Signature(Unit.INSTANCE);
    }
}
