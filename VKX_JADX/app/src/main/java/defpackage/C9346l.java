package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9346l extends AbstractC14330l {
    public final /* synthetic */ C5501l billing;
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9346l(C4479l c4479l, String str, C5501l c5501l, Bundle bundle) {
        super(str);
        this.purchase = 2;
        this.billing = c5501l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.AbstractC14330l
    public final void amazon(Object obj) {
        int i = this.purchase;
        Object arrayList = 0;
        C5501l c5501l = this.billing;
        switch (i) {
            case 0:
                List<C11119l> list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (C11119l c11119l : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        c11119l.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                } else if (Build.VERSION.SDK_INT < 24) {
                    arrayList = Collections.EMPTY_LIST;
                }
                c5501l.m1818l(arrayList);
                break;
            case 1:
                C11119l c11119l2 = (C11119l) obj;
                if (c11119l2 == null) {
                    c5501l.m1818l(null);
                } else {
                    Parcel parcelObtain2 = Parcel.obtain();
                    c11119l2.writeToParcel(parcelObtain2, 0);
                    c5501l.m1818l(parcelObtain2);
                }
                break;
            default:
                List<C11119l> list2 = (List) obj;
                if (list2 == null) {
                    c5501l.m1818l(null);
                } else {
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (C11119l c11119l3 : list2) {
                        Parcel parcelObtain3 = Parcel.obtain();
                        c11119l3.writeToParcel(parcelObtain3, 0);
                        arrayList2.add(parcelObtain3);
                    }
                    c5501l.m1818l(arrayList2);
                }
                break;
        }
    }

    @Override // defpackage.AbstractC14330l
    public final void yandex() {
        int i = this.purchase;
        C5501l c5501l = this.billing;
        switch (i) {
            case 0:
                ((MediaBrowserService.Result) c5501l.f11764l).detach();
                break;
            case 1:
                ((MediaBrowserService.Result) c5501l.f11764l).detach();
                break;
            default:
                ((MediaBrowserService.Result) c5501l.f11764l).detach();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9346l(String str, C5501l c5501l, int i) {
        super(str);
        this.purchase = i;
        this.billing = c5501l;
    }
}
