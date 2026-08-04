package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٕۥۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16054l extends AbstractC12707l implements InterfaceC0308l {
    public List admob = new ArrayList();
    public int firebase;
    public Matrix isPro;
    public String smaato;
    public Boolean subs;

    @Override // defpackage.InterfaceC0308l
    public final List getChildren() {
        return this.admob;
    }

    @Override // defpackage.InterfaceC0308l
    public final void purchase(AbstractC15046l abstractC15046l) throws C16376l {
        if (abstractC15046l instanceof C6999l) {
            this.admob.add(abstractC15046l);
            return;
        }
        throw new C16376l("Gradient elements cannot contain " + abstractC15046l + " elements.");
    }
}
