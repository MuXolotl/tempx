package defpackage;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lؕٛؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3496l {
    public static final C3496l yandex = new C3496l();
    public static final C11897l loadAd = AbstractC15439l.yandex("eq2_migrated_to_eq3");

    /* JADX WARN: Code duplicated, block: B:77:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r15v13 */
    public final Object yandex(InterfaceC15829l interfaceC15829l, InterfaceC1246l interfaceC1246l, AbstractC0283l abstractC0283l) throws Throwable {
        C8840l c8840l;
        InterfaceC15829l interfaceC15829l2;
        Object objAmazon;
        String str;
        InterfaceC14029l interfaceC14029l;
        SharedPreferences sharedPreferences;
        ?? r15;
        if (abstractC0283l instanceof C8840l) {
            c8840l = (C8840l) abstractC0283l;
            int i = c8840l.f18168l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8840l.f18168l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8840l = new C8840l(this, abstractC0283l);
            }
        } else {
            c8840l = new C8840l(this, abstractC0283l);
        }
        Object obj = c8840l.f18169l;
        int i2 = c8840l.f18168l;
        String str2 = "eq2_bassboost_strength";
        C11897l c11897l = loadAd;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 != 0) {
            if (i2 == 1) {
                InterfaceC15829l interfaceC15829l3 = c8840l.f18170l;
                AbstractC2829l.crashlytics(obj);
                objAmazon = obj;
                interfaceC15829l2 = interfaceC15829l3;
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                str = "eq2_bassboost_strength";
                interfaceC14029l = null;
            }
            sharedPreferences = AbstractC13273l.billing;
            if (sharedPreferences != null) {
                r15 = sharedPreferences;
            } else {
                r15 = interfaceC14029l;
            }
            SharedPreferences.Editor editorEdit = r15.edit();
            editorEdit.remove("eq2_dsp_useLimiter");
            editorEdit.remove("eq2_dsp_useGain");
            editorEdit.remove("eq2_dsp_gain2");
            editorEdit.remove("eq2_virtualizer_enabled");
            editorEdit.remove("eq2_virtualizer_strength");
            editorEdit.remove("eq2_reverb_preset_enabled");
            editorEdit.remove("eq2_reverb_preset_index");
            editorEdit.remove("eq2_bassboost_enabled");
            editorEdit.remove(str);
            editorEdit.apply();
            c11897l.loadAd(Boolean.TRUE);
            return Unit.INSTANCE;
        }
        AbstractC2829l.crashlytics(obj);
        if (((Boolean) c11897l.yandex()).booleanValue()) {
            return Unit.INSTANCE;
        }
        interfaceC15829l2 = interfaceC15829l;
        c8840l.f18170l = interfaceC15829l2;
        c8840l.f18168l = 1;
        objAmazon = ((C13434l) interfaceC1246l).amazon(c8840l);
        if (objAmazon == enumC9342l) {
            return enumC9342l;
        }
        C11359l c11359l = (C11359l) objAmazon;
        String str3 = c11359l.yandex;
        String str4 = c11359l.loadAd;
        List list = c11359l.amazon;
        InterfaceC15829l interfaceC15829l4 = interfaceC15829l2;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            arrayList.add(new C2882l(((Number) next).intValue(), (float) ((Number) c11359l.purchase.get(i3)).doubleValue()));
            c11359l = c11359l;
            c8840l = c8840l;
            i3 = i4;
            it = it;
            str2 = str2;
        }
        C8840l c8840l2 = c8840l;
        String str5 = str2;
        C3554l c3554l = new C3554l(str3, str4, arrayList);
        C18454l c18454l = C18454l.f36052l;
        C18364l c18364lYandex = C18454l.yandex();
        C1887l c1887lAmazon = C18454l.amazon();
        SharedPreferences sharedPreferences2 = AbstractC13273l.billing;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        C1887l c1887lLoadAd = C1887l.loadAd(c1887lAmazon, sharedPreferences2.getBoolean("eq2_dsp_useLimiter", false), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 126);
        SharedPreferences sharedPreferences3 = AbstractC13273l.billing;
        if (sharedPreferences3 == null) {
            sharedPreferences3 = null;
        }
        boolean z = !sharedPreferences3.getBoolean("eq2_dsp_useGain", false);
        SharedPreferences sharedPreferences4 = AbstractC13273l.billing;
        if (sharedPreferences4 == null) {
            sharedPreferences4 = null;
        }
        float f = sharedPreferences4.getFloat("eq2_dsp_gain2", 0.0f);
        SharedPreferences sharedPreferences5 = AbstractC13273l.billing;
        if (sharedPreferences5 == null) {
            sharedPreferences5 = null;
        }
        C7315l c7315l = new C7315l(z, f, sharedPreferences5.getFloat("eq2_dsp_gain2", 0.0f), 32);
        SharedPreferences sharedPreferences6 = AbstractC13273l.billing;
        if (sharedPreferences6 == null) {
            sharedPreferences6 = null;
        }
        boolean z2 = sharedPreferences6.getBoolean("eq2_virtualizer_enabled", false);
        SharedPreferences sharedPreferences7 = AbstractC13273l.billing;
        if (sharedPreferences7 == null) {
            sharedPreferences7 = null;
        }
        C15744l c15744l = new C15744l(sharedPreferences7.getInt("eq2_virtualizer_strength", 0) / 100, 4, z2);
        SharedPreferences sharedPreferences8 = AbstractC13273l.billing;
        if (sharedPreferences8 == null) {
            sharedPreferences8 = null;
        }
        boolean z3 = sharedPreferences8.getBoolean("eq2_reverb_preset_enabled", false);
        SharedPreferences sharedPreferences9 = AbstractC13273l.billing;
        if (sharedPreferences9 == null) {
            sharedPreferences9 = null;
        }
        C15744l c15744l2 = new C15744l(sharedPreferences9.getInt("eq2_reverb_preset_index", 0), 4, z3);
        SharedPreferences sharedPreferences10 = AbstractC13273l.billing;
        if (sharedPreferences10 == null) {
            sharedPreferences10 = null;
        }
        boolean z4 = sharedPreferences10.getBoolean("eq2_bassboost_enabled", false);
        SharedPreferences sharedPreferences11 = AbstractC13273l.billing;
        str = str5;
        interfaceC14029l = null;
        C14951l c14951l = new C14951l(new C3597l(c3554l, c18364lYandex, c1887lLoadAd, c7315l, c15744l, new C15744l((sharedPreferences11 != null ? sharedPreferences11 : null).getInt(str, 0) / 100, 4, z4), c15744l2, null, null, 130118), interfaceC14029l, 20);
        c8840l2.f18170l = null;
        c8840l2.f18168l = 2;
        if (interfaceC15829l4.loadAd(c14951l, c8840l2) == enumC9342l) {
            return enumC9342l;
        }
        sharedPreferences = AbstractC13273l.billing;
        if (sharedPreferences != null) {
            r15 = sharedPreferences;
        } else {
            r15 = interfaceC14029l;
        }
        SharedPreferences.Editor editorEdit2 = r15.edit();
        editorEdit2.remove("eq2_dsp_useLimiter");
        editorEdit2.remove("eq2_dsp_useGain");
        editorEdit2.remove("eq2_dsp_gain2");
        editorEdit2.remove("eq2_virtualizer_enabled");
        editorEdit2.remove("eq2_virtualizer_strength");
        editorEdit2.remove("eq2_reverb_preset_enabled");
        editorEdit2.remove("eq2_reverb_preset_index");
        editorEdit2.remove("eq2_bassboost_enabled");
        editorEdit2.remove(str);
        editorEdit2.apply();
        c11897l.loadAd(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
