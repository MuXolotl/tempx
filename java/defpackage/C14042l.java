package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍٓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14042l implements InterfaceC14058l {
    public final String amazon;
    public final Set billing;
    public final Context crashlytics;
    public final Function3 loadAd;
    public final C8688l purchase;
    public final Function2 yandex;

    public C14042l(Function0 function0, Set set, Function2 function2, Function3 function3, Context context, String str) {
        this.yandex = function2;
        this.loadAd = function3;
        this.crashlytics = context;
        this.amazon = str;
        this.purchase = new C8688l(function0);
        this.billing = set == AbstractC11824l.yandex ? null : AbstractC16901l.m4227l(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC14058l
    public final Object crashlytics(InterfaceC14029l interfaceC14029l, Object obj) {
        C9408l c9408l;
        if (interfaceC14029l instanceof C9408l) {
            c9408l = (C9408l) interfaceC14029l;
            int i = c9408l.f19252l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9408l.f19252l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9408l = new C9408l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c9408l = new C9408l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objInvoke = c9408l.f19251l;
        int i2 = c9408l.f19252l;
        boolean z = true;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objInvoke);
            c9408l.f19252l = 1;
            objInvoke = this.yandex.invoke(obj, c9408l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInvoke == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        C8688l c8688l = this.purchase;
        Set set = this.billing;
        if (set != null) {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) c8688l.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        } else if (((SharedPreferences) c8688l.getValue()).getAll().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC14058l
    public final Object loadAd(Object obj, C11797l c11797l) {
        return this.loadAd.invoke(new C17213l((SharedPreferences) this.purchase.getValue(), this.billing), obj, c11797l);
    }

    @Override // defpackage.InterfaceC14058l
    public final Unit yandex() throws IOException {
        Context context;
        String str;
        C8688l c8688l = this.purchase;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) c8688l.getValue()).edit();
        Set set = this.billing;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            C18262l.metrica("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (((SharedPreferences) c8688l.getValue()).getAll().isEmpty() && (context = this.crashlytics) != null && (str = this.amazon) != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC11965l.isPro(context, str);
            } else {
                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                File file2 = new File(file.getPath() + ".bak");
                file.delete();
                file2.delete();
            }
        }
        if (set != null) {
            set.clear();
        }
        return Unit.INSTANCE;
    }

    public C14042l(Function0 function0, Set set, Function3 function3, int i) {
        this(function0, (i & 2) != 0 ? AbstractC11824l.yandex : set, new C0071l(2, null, 8), function3, null, null);
    }
}
