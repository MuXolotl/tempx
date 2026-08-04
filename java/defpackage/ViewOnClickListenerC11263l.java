package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lُۗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC11263l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Method f22695l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f22696l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final View f22697l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Context f22698l;

    public ViewOnClickListenerC11263l(View view, String str) {
        this.f22697l = view;
        this.f22696l = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f22695l != null) {
            break;
        }
        View view2 = this.f22697l;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f22696l;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbIsVip = AbstractC5020l.isVip("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbIsVip.append(view2.getClass());
                sbIsVip.append(str);
                throw new IllegalStateException(sbIsVip.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f22695l = method;
                    this.f22698l = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f22695l.invoke(this.f22698l, view);
        } catch (IllegalAccessException e) {
            C4875l.remoteconfig("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            C4875l.remoteconfig("Could not execute method for android:onClick", e2);
        }
    }
}
